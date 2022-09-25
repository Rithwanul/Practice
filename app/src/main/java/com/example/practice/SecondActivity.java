package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

import com.example.practice.models.Person;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        Person data = getIntent().getParcelableExtra("data");

        Log.d("Data", "onCreate: " + data.getName() + data.getAge() + data.getId());
    }
}