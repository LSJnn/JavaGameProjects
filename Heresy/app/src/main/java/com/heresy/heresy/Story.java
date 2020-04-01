package com.heresy.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Story extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_defult);

        getIntent();


    }

}