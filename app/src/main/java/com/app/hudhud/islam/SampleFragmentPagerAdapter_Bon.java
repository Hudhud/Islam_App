package com.app.hudhud.islam;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SampleFragmentPagerAdapter_Bon extends FragmentStateAdapter {
    final int PAGE_COUNT = 18;

    public SampleFragmentPagerAdapter_Bon(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PageFragment_Bon.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return PAGE_COUNT;
    }

}
