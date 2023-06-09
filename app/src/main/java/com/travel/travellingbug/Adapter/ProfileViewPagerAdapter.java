package com.travel.travellingbug.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.travel.travellingbug.Fragment.ProfileAboutFragment;
import com.travel.travellingbug.Fragment.ProfileAccountFragment;


public class ProfileViewPagerAdapter extends FragmentStateAdapter {

    private String[] titles = {"ABOUT", "ACCOUNT"};


    public ProfileViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ProfileAboutFragment();
            case 1:
                return new ProfileAccountFragment();


        }
        return new ProfileAboutFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }


}
