package com.LoHoon.HandongTa.Main;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyViewPager extends FragmentPagerAdapter {
    int mCount =0 ;
    public MyViewPager(FragmentManager fm, int count){
        super(fm);
        this.mCount=count;
    }
    @Override
    public Fragment getItem(int i){
        switch (i) {
            case 0: return new Tab1();
            case 1: return new Tab2();
            case 2: return new Tab3();
            default: return null;
        }
    }
    @Override
    public int getCount(){
        return this.mCount;
    }


}
