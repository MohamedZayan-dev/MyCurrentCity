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

public class HistoricalFragment extends Fragment {
    ArrayList<CityInfo> cityInfos;
    CityAdapter cityAdapter;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.for_all_fragment, container, false);
        addAll();
        recyclerView = view.findViewById(R.id.recycleView);
        cityAdapter = new CityAdapter(getActivity(), cityInfos);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(cityAdapter);
        return view;
    }


    private void addAll() {
        cityInfos = new ArrayList<>();
        cityInfos.add(new CityInfo(R.drawable.tiong_museum, getString(R.string.firstHistName),
                getString(R.string.firstHistInfo), getString(R.string.firstHistSpec), getString(R.string.firstHistAddress)));
        cityInfos.add(new CityInfo(R.drawable.the_red_house, getString(R.string.secondHistName), getString(R.string.secondHistInfo)
                , getString(R.string.secondHistSpec), getString(R.string.secondHistAddress)));
        cityInfos.add(new CityInfo(R.drawable.sri_raja, getString(R.string.thirdHistName), getString(R.string.thirdHistInfo),
                getString(R.string.thirdHistSpec), getString(R.string.thirdHistAddress)));
        cityInfos.add(new CityInfo(R.drawable.old_chinese_temple, getString(R.string.fourthHistName), getString(R.string.fourthHistInfo),
                getString(R.string.fourthHistSpec), getString(R.string.fourthHistAddress)));
        cityInfos.add(new CityInfo(R.drawable.india_muslim_mosque, getString(R.string.fifthHistName), getString(R.string.fifthHistInfo)
                , "", getString(R.string.fifthHistAddress)));

    }
}
