package com.app.hudhud.islam;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hudhud on 3/9/16.
 */
public class SampleFragmentPagerAdapter_Bon_Betingelser extends FragmentPagerAdapter {
    final int PAGE_COUNT = 7;
    private String tabTitles[] = new String[] { "Islam", "Qiblah", "Bønindtrædelse", "At-tamjjiz-alderen", "Forpligtelsen", "Bønnens søjler", "^Awrah" };

    public SampleFragmentPagerAdapter_Bon_Betingelser(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment_Bon_Betingelser.newInstance(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
