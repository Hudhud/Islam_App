package com.app.hudhud.islam;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SampleFragmentPagerAdapter_Bon_Betingelser extends FragmentStateAdapter {
    final int PAGE_COUNT = 7;

    public SampleFragmentPagerAdapter_Bon_Betingelser(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PageFragment_Bon_Betingelser.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return PAGE_COUNT;
    }

}
