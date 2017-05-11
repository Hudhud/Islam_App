package com.app.hudhud.islam;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hudhud on 3/9/16.
 */
public class SampleFragmentPagerAdapter_Bon_Afbrydelser extends FragmentPagerAdapter {
    final int PAGE_COUNT = 10;
    private String tabTitles[] = new String[] { "Tale", "Mange bevægelser", "Voldsom bevægelse", "Ekstra bevægelsessøjle", "Lege", "Spise & drikke", "Afbryde bønnen", "Afbryde bønnen (hændelse)" , "Afbryde bønnen (tøve)", "Tvivl" };

    public SampleFragmentPagerAdapter_Bon_Afbrydelser(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment_Bon_Afbrydelser.newInstance(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
