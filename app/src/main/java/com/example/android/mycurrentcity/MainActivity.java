package com.example.android.mycurrentcity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerCityAdapter viewPagerCityAdapter;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        viewPagerCityAdapter = new ViewPagerCityAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(viewPagerCityAdapter);
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
//        getSupportFragmentManager().beginTransaction().replace(R.id.container,new RestaurantFragment()).commit();
    }
}
