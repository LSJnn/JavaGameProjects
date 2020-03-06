package com.example.heresy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class T1_text_image extends AppCompatActivity {

    ImageButton next;ImageButton back;ImageButton ending;

    ImageView ti_img1;
    TextView ti_tv1;TextView ti_tv2;TextView ti_tv3;TextView ti_tv4;

    int changeCode;
    String L; String F;
    StartStory startStory2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_txt_img);

        initializeView();

        Intent i = getIntent();
        L = i.getStringExtra("firstName");
        F = i.getStringExtra("lastName");

        startStory2 = new StartStory();
        startStory2.getTWO(ti_img1,ti_tv1,ti_tv2,ti_tv3,ti_tv4);
        startStory2.viewNumIsTWO();





        btnClick();
    }

    public void initializeView(){
        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);

        ti_img1 = findViewById(R.id.t1_ti_img1);
        ti_tv1 = findViewById(R.id.t1_tl_tv1);
        ti_tv2 = findViewById(R.id.t1_ti_tv2);
        ti_tv3 = findViewById(R.id.t1_ti_tv3);
        ti_tv4 = findViewById(R.id.t1_ti_tv4);
    }

    public void initializeLayout() {
        switch (changeCode) {
            case 1:
                setContentView(R.layout.activity_t1_text);
                break;
            case 2:
                setContentView(R.layout.activity_t1_txt_img);
                break;
            case 3:
                setContentView(R.layout.activity_t1_choice);
                break;
        }
    }

    public void btnClick() {

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                finish();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeCode = 2;
                initializeLayout();
            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_text_image.this, Endings.class);
                startActivity(intent);

            }
        });
    }

}
