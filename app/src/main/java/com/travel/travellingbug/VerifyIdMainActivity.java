package com.travel.travellingbug;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.travel.travellingbug.Adapter.VerifyIdMainAdapter;
import com.travel.travellingbug.Model.VerifyIdMainModel;

import java.util.ArrayList;

public class VerifyIdMainActivity extends AppCompatActivity {

    RecyclerView verifyIdMainRV;
    ArrayList<VerifyIdMainModel> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_id_main);

        settingAdapterAndLayout();
    }

    private void settingAdapterAndLayout() {

        list = new ArrayList<>();

        list.add(new VerifyIdMainModel("Passport","Face photo page"));
        list.add(new VerifyIdMainModel("Aadhaar Card","EU ID card only"));
        list.add(new VerifyIdMainModel("PAN Card","Front and Back"));
        list.add(new VerifyIdMainModel("DL No.","Front and Back"));
        list.add(new VerifyIdMainModel("RC No.","Front and Back"));

        verifyIdMainRV = findViewById(R.id.verifyIdMainRV);
        verifyIdMainRV.hasFixedSize();
        verifyIdMainRV.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false);
        VerifyIdMainAdapter verifyIdMainAdapter = new VerifyIdMainAdapter(getApplicationContext(),list);
        verifyIdMainRV.setLayoutManager(linearLayoutManager);
        verifyIdMainRV.setAdapter(verifyIdMainAdapter);
    }
}