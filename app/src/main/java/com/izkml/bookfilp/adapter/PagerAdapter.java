package com.izkml.bookfilp.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.izkml.bookfilp.ui.MyFragment;

/**
 * Created by khw on 2024/02/28
 */
public class PagerAdapter extends FragmentStateAdapter {



    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public PagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public PagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return MyFragment.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
