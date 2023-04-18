package com.travel.travellingbug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AuthScreen extends AppCompatActivity {

    Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_screen);

        initComponent();
        componnentClickHandler();
    }

    private void componnentClickHandler() {
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AuthScreen.this, OtpVerification.class);
                startActivity(intent);
            }
        });
    }

    private void initComponent() {
        continueButton = findViewById(R.id.continueButton);
    }
}