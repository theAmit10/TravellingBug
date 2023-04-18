package com.travel.travellingbug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class LanguageSelctorActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button continueButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selctor);

        intiComponent();
        clickHandlerComponents();

    }

    private void clickHandlerComponents() {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LanguageSelctorActivity.this, Profile.class);
                startActivity(intent);
            }
        });
    }

    private void intiComponent() {
        radioGroup = findViewById(R.id.radioGroup);
        continueButton = findViewById(R.id.continueButton);
    }
}