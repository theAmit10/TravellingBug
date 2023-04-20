package com.travel.travellingbug.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.travel.travellingbug.Fragment.DriverProfileAboutFragment;
import com.travel.travellingbug.Fragment.DriverProfileReviewFragment;
import com.travel.travellingbug.Fragment.PassengerPastFragment;
import com.travel.travellingbug.Fragment.PassengerPendingFragment;


public class PassengerViewPagerAdapter extends FragmentStateAdapter {

    private String[] titles = {"Pending", "Past"};


    public PassengerViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new PassengerPendingFragment();
            case 1:
                return new PassengerPastFragment();


        }
        return new PassengerPendingFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }


}
