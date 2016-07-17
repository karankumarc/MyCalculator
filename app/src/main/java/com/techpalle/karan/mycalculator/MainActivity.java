package com.techpalle.karan.mycalculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Create the memory for the activity to be displayed
        setContentView(R.layout.activity_main); //Draws the UI
    }
}
