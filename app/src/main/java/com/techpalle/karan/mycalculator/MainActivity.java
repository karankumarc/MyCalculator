package com.techpalle.karan.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    Declaration
     */
    EditText editTextFirst, editTextSecond;
    TextView textView; // = (TextView) findViewById(R.id.text_view); Causes runtime error (NullPointerException

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Create the memory for the activity to be displayed
        setContentView(R.layout.activity_main); //Draws the UI

        /* Initializing using findViewById
         */
        editTextFirst = (EditText) findViewById(R.id.edit_text_first_number);
        editTextSecond = (EditText) findViewById(R.id.edit_text_second_number);
        textView = (TextView) findViewById(R.id.text_view);
    }


    public void addTwoNumbers(View view){
        /*
        Write code to handle button click
         */
        String firstNumberString = editTextFirst.getText().toString();
        String secondNumberString = editTextSecond.getText().toString();

        /*
        Convert from String to Integers
         */
        int num1 = Integer.parseInt(firstNumberString);
        int num2 = Integer.parseInt(secondNumberString);

        int sum = num1+num2;

        /*
        Convert from Integer to String
         */
        textView.setText(""+sum);
    }
}
