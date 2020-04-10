package com.heresy.s_heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ErrorStory extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_defult);

        tv = findViewById(R.id.error_tv);

        tv.setText(getIntent().getStringExtra("error"));


    }

}