package com.example.android.mycurrentcity;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerCityAdapter extends FragmentPagerAdapter {
    Context mContext;

    public ViewPagerCityAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment selectedFrag = null;
        switch (position) {
            case 0:
                selectedFrag = new RestaurantFragment();
                break;
            case 1:
                selectedFrag = new MallFragment();
                break;
            case 2:
                selectedFrag = new HistoricalFragment();
                break;
            case 3:
                selectedFrag = new OthersFragment();
                break;
        }
        return selectedFrag;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch (position) {
            case 0:
                title = mContext.getString(R.string.firstTab);
                break;
            case 1:
                title = mContext.getString(R.string.secondTab);
                break;
            case 2:
                title = mContext.getString(R.string.thirdTab);
                break;
            case 3:
                title = mContext.getString(R.string.fourthTab);
                break;
        }
        return title;
    }
}
