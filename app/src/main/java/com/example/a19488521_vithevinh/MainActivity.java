package com.example.a19488521_vithevinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String topImageText, String bottomImageText) {
        FullName fullName
                = (FullName) this.getSupportFragmentManager()
                .findFragmentById(R.id.fragment_fullname);
        fullName.showText(topImageText, bottomImageText);
    }

}