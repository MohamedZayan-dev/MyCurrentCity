package com.example.android.mycurrentcity;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MallFragment extends Fragment {
    ArrayList<CityInfo> mallInfo;
    CityAdapter mCityAdapter;
    RecyclerView recyclerView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.for_all_fragment, container, false);

        addMalls();
        mCityAdapter = new CityAdapter(getActivity(), mallInfo);
        recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(mCityAdapter);

        return view;
    }


    private void addMalls() {
        mallInfo = new ArrayList<>();
        mallInfo.add(new CityInfo(R.drawable.midvalley_southkey, getString(R.string.firstMallName), getString(R.string.firstMallInfo),
                getString(R.string.firstMallSpeciality), getString(R.string.firstMallAddress)));
        mallInfo.add(new CityInfo(R.drawable.r_f, getString(R.string.secondMallName), getString(R.string.secondMallInfo),
                getString(R.string.secondMallSpeciality), getString(R.string.secondMallAddress)));
        mallInfo.add(new CityInfo(R.drawable.premium_outlets, getString(R.string.thirdMallName), getString(R.string.thirdMallInfo),
                getString(R.string.thirdMallSpeciality), getString(R.string.thirdMallAddress)));
        mallInfo.add(new CityInfo(R.drawable.paradigm, getString(R.string.fourthMallName), getString(R.string.fourthMallInfo),
                getString(R.string.fourthMallSpeciality), getString(R.string.fourthMallAddress)));
        mallInfo.add(new CityInfo(R.drawable.angsanajpg, getString(R.string.fifthMallName), getString(R.string.fifthMallInfo),
                getString(R.string.fifthMallSpeciality), getString(R.string.fifthMallAddress)));

    }
}
