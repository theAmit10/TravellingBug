package com.travel.travellingbug;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.travel.travellingbug.Adapter.ProfileViewPagerAdapter;

public class Profile extends AppCompatActivity {

    ViewPager2 viewPager;
    TabLayout tabLayout;
    ProfileViewPagerAdapter profileViewPagerAdapter;
    private String[] titles = {"ABOUT", "ACCOUNT"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        initComponent();
        clickHandlerComponent();
        tabLayoutController();
    }

    private void tabLayoutController() {
        profileViewPagerAdapter = new ProfileViewPagerAdapter(this);
        viewPager.setAdapter(profileViewPagerAdapter);

//        new TabLayoutMediator(tabLayout, viewPager, ((tab, position) -> tab.setIcon(tabIcons[position]))).attach();
        new TabLayoutMediator(tabLayout, viewPager, ((tab, position) -> tab.setText(titles[position]))).attach();



        tabLayout.getTabAt(0).setText("About You");
        tabLayout.getTabAt(1).setText("Account");
//        tabLayout.getTabAt(2).setText("राशि").setIcon(R.drawable.ic_baseline_sports_volleyball_24);
//        tabLayout.getTabAt(3).setText("गीता श्लोक").setIcon(R.drawable.gita_slok_icon);
    }

    private void clickHandlerComponent() {
    }

    private void initComponent() {
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

    }
}