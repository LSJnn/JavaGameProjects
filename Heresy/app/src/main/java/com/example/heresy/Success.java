package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Success extends AppCompatActivity {

    ImageButton ending;ImageButton now;
    ImageView newEnding;
    ImageButton back;
    int page;
    MusicActivity mediaPlayer;
    static boolean enter=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        initializeVIew();
        btnClick();

        Intent i = getIntent();
        page = i.getIntExtra("page",-1);
        enter = i.getBooleanExtra("enter",false);

        if(page!=-1){
            startBlink();
        }

        if(enter){
            stopBlink();
        }


        // page 이름으로 n 엔딩나와야할 페이지 받아오면, 리스트에 저장. 목록 생성.
    }

    public void initializeVIew(){

        ending = findViewById(R.id.endingBtn);
        back = findViewById(R.id.backbtn);
        newEnding = findViewById(R.id.newEnding);
        now = findViewById(R.id.now);

    }

    public void btnClick() {

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Success.this, MainActivity.class);
                mediaPlayer = Application.getMusicActivity();
                mediaPlayer.stopMusic();
                startActivity(i);
                finish();

            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Success.this, Endings.class);
                intent.putExtra("page",page);
                System.out.println("page ="+page);
                startActivity(intent);

            }
        });

        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Success.this,Now.class);
                intent.putExtra("page",page-1);
                startActivity(intent);
            }
        });
    }

    public void startBlink(){
        Animation startAnim = AnimationUtils.loadAnimation(getApplication(),R.anim.blink_anim);
        newEnding.startAnimation(startAnim);
    }

    public void stopBlink(){
        Animation stopAnim = AnimationUtils.loadAnimation(getApplication(),R.anim.blink_stop_anim);
        newEnding.startAnimation(stopAnim);
    }

}
