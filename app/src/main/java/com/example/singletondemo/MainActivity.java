package com.example.singletondemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Singleton_demo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int val =Singleton_demo.getInstance().get();
        Log.d(TAG, "onCreate: val="+ val);
        TextView tv=findViewById(R.id.tv);
        tv.setText("Value is " +Integer.toString(val));

        //increment everytime created
        Singleton_demo.getInstance().inc();
    }
}