package com.example.heresy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Success extends AppCompatActivity {

    private InterstitialAd interstitialAd;
    private final int ENTER = 201;

    ImageButton ending;ImageButton now;
    ImageView newEnding;
    ImageButton back;
    int page;
    MusicActivity mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
////////////광고///////////////
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        AdView success = findViewById(R.id.success_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        success.loadAd(adRequest);

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");



        initializeVIew();
        btnClick();

        Intent i = getIntent();
        page = i.getIntExtra("page",-1);
        System.out.println("page========"+page);

        if(page!=-1){
            startBlink();
            newEnding.setVisibility(View.VISIBLE);
            System.out.println("startssssssss");
        }else{
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
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                if(mediaPlayer!=null){
                    mediaPlayer.stopMusic();
                }

                if(interstitialAd.isLoaded()){
                    interstitialAd.show();
                }else {
                    Log.d("TAG", "로드 실패.");
                }

                finish();

            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Success.this, Endings.class);
                intent.putExtra("page",page);
                System.out.println("page ="+page);
                startActivityForResult(intent , ENTER);

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==1){
            stopBlink();
        }
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Success.this,MainActivity.class);
        if(mediaPlayer!=null){mediaPlayer.stopMusic();}
        System.out.println("PAGE 1 ============" +StartStory.getPage());
        System.out.println("VIewNUM 4 ============" +StartStory.getViewNum());
        finish();

    }

}
