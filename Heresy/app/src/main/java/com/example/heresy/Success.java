package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Success extends AppCompatActivity {

    ImageButton ending;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        initializeVIew();
        btnClick();

        Intent i = getIntent();
        i.getIntExtra("page",-1);


        // page 이름으로 n 엔딩나와야할 페이지 받아오면, 리스트에 저장. 목록 생성.
    }

    public void initializeVIew(){

        ending = findViewById(R.id.endingBtn);
        back = findViewById(R.id.backbtn);

    }

    public void btnClick() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Success.this, MainActivity.class);
                finish();

            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Success.this, Endings.class);
                startActivity(intent);

            }
        });
    }

}
