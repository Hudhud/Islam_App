package com.app.hudhud.islam;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hudhud on 3/2/16.
 */
public class SampleFragmentPagerAdapter_Trosbekendelsen extends FragmentPagerAdapter {
    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] { "Hvad er trosbekendelsen?", "Hvad er betydningen af trosbekendelsen"};

    public SampleFragmentPagerAdapter_Trosbekendelsen(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment_Trosbekendelse.newInstance(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}