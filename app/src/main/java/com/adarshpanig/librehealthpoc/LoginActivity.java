package com.adarshpanig.librehealthpoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        }

    public void HomePage(View view) {
        Intent intent = new Intent(LoginActivity.this,HomePage.class);
        startActivity(intent);
    }

    public void SignupPage(View view) {
    }
}
