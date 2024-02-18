package com.app.hudhud.islam;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SampleFragmentPagerAdapter_Bontider extends FragmentStateAdapter {
    private static final int PAGE_COUNT = 1;

    public SampleFragmentPagerAdapter_Bontider(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PageFragment_Bontider.newInstance(position);
    }

    @Override
    public int getItemCount() {
        // Return the number of pages
        return PAGE_COUNT;
    }
}
