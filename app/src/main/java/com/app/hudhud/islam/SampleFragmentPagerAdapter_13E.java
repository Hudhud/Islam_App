package com.app.hudhud.islam;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hudhud on 2/7/16.
 */
public class SampleFragmentPagerAdapter_13E extends FragmentPagerAdapter {
    final int PAGE_COUNT = 13;
    private String tabTitles[] = new String[] { "Eksistens", "Enehed", "Evighed", "Uophørlighed", "Uafhængighed", "Magt", "Vilje", "Viden", "Hørelse", "Syn", "Liv", "Tale", "Uforlignelighed" };

    public SampleFragmentPagerAdapter_13E(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment_13E.newInstance(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}