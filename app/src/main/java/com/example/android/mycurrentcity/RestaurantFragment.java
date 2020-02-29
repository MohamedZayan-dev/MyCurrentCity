package com.example.android.mycurrentcity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    RecyclerView recyclerView;
    CityAdapter mCityAdapter;
    ArrayList<CityInfo> restaurantInfo;
    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.for_all_fragment, container, false);

        addRestaurants();
        mCityAdapter = new CityAdapter(getActivity(), restaurantInfo);
        recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(mCityAdapter);

        return view;
    }


    private void addRestaurants() {
        restaurantInfo = new ArrayList<>();
        restaurantInfo.add(new CityInfo(R.drawable.faftish, getString(R.string.firstReName), getString(R.string.firstReInfo),
                getString(R.string.firstReSpeciality), getString(R.string.firstReAddress)));
        restaurantInfo.add(new CityInfo(R.drawable.tosca, getString(R.string.secondReName), getString(R.string.secondReInfo),
                getString(R.string.secondReSpeciality), getString(R.string.secondReAddress)));
        restaurantInfo.add(new CityInfo(R.drawable.wadi_al_hana, getString(R.string.thirdReName), getString(R.string.thirdReInfo),
                getString(R.string.thirdReSpeciality), getString(R.string.thirdReAddress)));
        restaurantInfo.add(new CityInfo(R.drawable.cafe_bld, getString(R.string.fourthReName), getString(R.string.fourthReInfo),
                getString(R.string.fourthReSpecialty), getString(R.string.fourthReSpecialty)));
        restaurantInfo.add(new CityInfo(R.drawable.chez_papa, getString(R.string.fifthReName), getString(R.string.fifthReInfo),
                getString(R.string.fifthReSpeciality), getString(R.string.fifthReAddress)));
        restaurantInfo.add(new CityInfo(R.drawable.spice_grill, getString(R.string.sixthReName), getString(R.string.sixthReInfo),
                getString(R.string.sixthReSpeciality), getString(R.string.sixthReAddress)));
        restaurantInfo.add(new CityInfo(R.drawable.makan_kitchen, getString(R.string.sevenReName), getString(R.string.seventhReInfo),
                getString(R.string.seventhReSpeciality), getString(R.string.seventhReAddress)));

    }
}
