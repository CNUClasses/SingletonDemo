package com.example.singletondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Singleton_demo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int val =Singleton_demo.getInstance().get();
        Log.d(TAG, "onCreate: val="+ val);
        Singleton_demo.getInstance().inc();
    }
}