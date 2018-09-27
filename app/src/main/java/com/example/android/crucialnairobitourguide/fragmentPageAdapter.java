package com.example.android.crucialnairobitourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class fragmentPageAdapter extends FragmentPagerAdapter {

    public fragmentPageAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new HomeFragment();
        }else{
            return new AboutFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
