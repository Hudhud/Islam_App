package com.app.hudhud.islam;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SampleFragmentPagerAdapter_Fasten_Sojler extends FragmentStateAdapter {
    final int PAGE_COUNT = 2;

    public SampleFragmentPagerAdapter_Fasten_Sojler(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PageFragment_Fasten_Sojler.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return PAGE_COUNT;
    }

}
