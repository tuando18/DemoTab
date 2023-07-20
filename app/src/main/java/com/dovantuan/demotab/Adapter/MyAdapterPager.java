package com.dovantuan.demotab.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.dovantuan.demotab.Fragment.Frag01;
import com.dovantuan.demotab.Fragment.Frag02;

public class MyAdapterPager extends FragmentStateAdapter {

    int soluongpage = 3;

    public MyAdapterPager(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                return new Frag01();
            case 1:
                return new Frag02();
            default:
                return new Frag01();
        }

    }

    @Override
    public int getItemCount() {
        return soluongpage;
    }
}
