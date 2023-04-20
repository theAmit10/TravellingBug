package com.travel.travellingbug;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.travel.travellingbug.Adapter.DriverProfileViewPagerAdapter;
import com.travel.travellingbug.Adapter.PassengerViewPagerAdapter;

public class PassengerActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    TabLayout tabLayout;
    PassengerViewPagerAdapter profileViewPagerAdapter;
    private String[] titles = {"Pending", "Past"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger);

        initComponent();
        clickHandlerComponent();
        tabLayoutController();
    }

    private void tabLayoutController() {
        profileViewPagerAdapter = new PassengerViewPagerAdapter(this);
        viewPager.setAdapter(profileViewPagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager, ((tab, position) -> tab.setText(titles[position]))).attach();



        tabLayout.getTabAt(0).setText("Pending");
        tabLayout.getTabAt(1).setText("Past");

    }

    private void clickHandlerComponent() {
    }

    private void initComponent() {
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

    }
}