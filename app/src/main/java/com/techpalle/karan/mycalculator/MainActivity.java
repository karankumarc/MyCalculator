package com.techpalle.karan.mycalculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    Declaration
     */
    EditText editText;
    TextView textView; // = (TextView) findViewById(R.id.text_view); Causes runtime error (NullPointerException

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Create the memory for the activity to be displayed
        setContentView(R.layout.activity_main); //Draws the UI

        /* Initializing using findViewById
         */
        editText = (EditText) findViewById(R.id.edit_text);
        textView = (TextView) findViewById(R.id.text_view);
    }


    public void copyEditText(View view){
        /*
        Write code to handle button click
         */
        String textToBeCopied = editText.getText().toString();
        textView.setText(textToBeCopied);
    }
}
