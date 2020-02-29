package com.example.android.mycurrentcity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class OthersFragment extends Fragment {
    RecyclerView recyclerView;
    CityAdapter mCityAdapter;
    ArrayList<CityInfo> othersInfo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.for_all_fragment, container, false);

        addOthers();
        mCityAdapter = new CityAdapter(getActivity(), othersInfo);
        recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(mCityAdapter);

        return view;
    }

    ViewPager viewPager;
    TabLayout tabLayout;
    ViewPagerCityAdapter viewPagerCityAdapter;


    private void addOthers() {
        othersInfo = new ArrayList<>();
        othersInfo.add(new CityInfo(R.drawable.puteri_waterfall, getString(R.string.firstOtherName), getString(R.string.firstOtherInfo),
                "", ""));
        othersInfo.add(new CityInfo(R.drawable.melor, getString(R.string.secondOtherName), getString(R.string.secondOtherInfo),
                "", getString(R.string.secondOtherAddress)));
        othersInfo.add(new CityInfo(R.drawable.m_tinggi, getString(R.string.thirdOtherName), getString(R.string.thirdOtherInfo),
                "", ""));
        othersInfo.add(new CityInfo(R.drawable.gunung_ledang, getString(R.string.fourthOtherName), getString(R.string.fourthOtherInfo),
                "", ""));
        othersInfo.add(new CityInfo(R.drawable.gunung_arong, getString(R.string.fifthOtherName), getString(R.string.fifthOtherInfo),
                "", ""));

    }
}
