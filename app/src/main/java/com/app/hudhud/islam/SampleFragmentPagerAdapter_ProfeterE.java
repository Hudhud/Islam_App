package com.app.hudhud.islam;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SampleFragmentPagerAdapter_ProfeterE extends FragmentStateAdapter {
    final int PAGE_COUNT = 5;

    public SampleFragmentPagerAdapter_ProfeterE(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PageFragment_ProfeterE.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return PAGE_COUNT;
    }
}
