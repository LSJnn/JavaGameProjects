package com.heresy.s_heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dialouge_Own_zero extends AppCompatActivity {
    ImageButton assign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialouge__own_zero);

        getIntent();
        assign =findViewById(R.id.assign);
        assign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();//인텐트 안해도 된다봐..??
            }
        });

    }
}
