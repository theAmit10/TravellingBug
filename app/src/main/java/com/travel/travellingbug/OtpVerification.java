package com.travel.travellingbug;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OtpVerification extends AppCompatActivity {

    EditText inputOption1,inputOption2,inputOption3,inputOption4,inputOption5,inputOption6;
    Button continueButton;
    String getOtpBacked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        initComponent();
        componentClickHandler();
        numberOtpMoveNext();
    }

    private void numberOtpMoveNext() {

        inputOption1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()){
                    inputOption2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        inputOption2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()){
                    inputOption3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        inputOption3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()){
                    inputOption4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        inputOption4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()){
                    inputOption5.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        inputOption5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()){
                    inputOption6.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void componentClickHandler() {
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!inputOption1.getText().toString().trim().isEmpty() &&  !inputOption2.getText().toString().trim().isEmpty() && !inputOption3.getText().toString().trim().isEmpty() && !inputOption4.getText().toString().trim().isEmpty() && !inputOption5.getText().toString().trim().isEmpty() && !inputOption6.getText().toString().trim().isEmpty() ){

                    String enterCodeOtp = inputOption1.getText().toString().trim() +
                            inputOption2.getText().toString().trim() +
                            inputOption3.getText().toString().trim() +
                            inputOption4.getText().toString().trim() +
                            inputOption5.getText().toString().trim() +
                            inputOption6.getText().toString().trim() ;

//                    if(getOtpBacked!=null){
//                        progressBar.setVisibility(View.VISIBLE);
//                        verifyButtonClick.setVisibility(View.INVISIBLE);
//
//                        PhoneAuthCredential phoneAuthCredential = PhoneAuthProvider.getCredential(
//                                getOtpBacked, enterCodeOtp
//                        );
//
//                        FirebaseAuth.getInstance().signInWithCredential(phoneAuthCredential)
//                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                                    @Override
//                                    public void onComplete(@NonNull Task<AuthResult> task) {
//
//                                        progressBar.setVisibility(View.GONE);
//                                        verifyButtonClick.setVisibility(View.VISIBLE);
//
//                                        if(task.isSuccessful()){
////                                            getIntent().getStringExtra("mobile");
//
//                                            database.getReference().child("Users")
//                                                    .child(FirebaseAuth.getInstance().getUid())
//                                                    .setValue(getIntent().getStringExtra("mobile"));
//
//                                            String id = task.getResult().getUser().getUid();
//
//                                            Intent intent = new Intent(VerifyOtpScreen.this, MandirDummyActivity.class);
//                                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                                            startActivity(intent);
//                                        }else{
//                                            Toast.makeText(VerifyOtpScreen.this, "Enter Correct OTP ", Toast.LENGTH_SHORT).show();
//                                        }
//
//                                    }
//                                });
//
//                    }else {
//                        Toast.makeText(VerifyOtpScreen.this, "Please Check Your Internet Connection ", Toast.LENGTH_SHORT).show();
//                    }

//                    Toast.makeText(VerifyOtpScreen.this, "otp verified", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(OtpVerification.this, "please enter all number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initComponent() {
        inputOption1 = findViewById(R.id.inputOption1);
        inputOption2 = findViewById(R.id.inputOption2);
        inputOption3 = findViewById(R.id.inputOption3);
        inputOption4 = findViewById(R.id.inputOption4);
        inputOption5 = findViewById(R.id.inputOption5);
        inputOption6 = findViewById(R.id.inputOption6);
        continueButton = findViewById(R.id.continueButton);
    }
}