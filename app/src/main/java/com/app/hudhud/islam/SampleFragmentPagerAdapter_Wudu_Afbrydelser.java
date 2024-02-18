package com.app.hudhud.islam;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SampleFragmentPagerAdapter_Wudu_Afbrydelser extends FragmentStateAdapter {
    final int PAGE_COUNT = 4;

    public SampleFragmentPagerAdapter_Wudu_Afbrydelser(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PageFragment_Wudu_Afbrydelser.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return PAGE_COUNT;
    }
}
