package com.app.hudhud.islam;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * Created by hudhud on 2/7/16.
 */
public class SampleFragmentPagerAdapter_13E extends FragmentStateAdapter {
    final int PAGE_COUNT = 13;

    public SampleFragmentPagerAdapter_13E(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PageFragment_13E.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return PAGE_COUNT;
    }

}