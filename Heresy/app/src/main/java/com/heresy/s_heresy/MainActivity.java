package com.heresy.s_heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ImageButton start;
    ImageButton newgame;
    ImageButton loadgame;
    ImageButton ending;

    int out;

    public MusicActivity mediaPlayer;

    int getViewNum;
    int getPage;

    int pageToEnding;
    Intent intent;

    TinyDB tinyDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        //메인배너
        AdView main=findViewById(R.id.main_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        main.loadAd(adRequest);
        //메인배너. - 테스트 기기
        AdRequest request = new AdRequest.Builder()
                .addTestDevice("CBE5FE34B8F07928C9ABB0CA996BDA98")
                .build();
        request.isTestDevice(this);

        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration()
                .toBuilder().setTestDeviceIds(Arrays.asList("CBE5FE34B8F07928C9ABB0CA996BDA98")).build();
        MobileAds.setRequestConfiguration(requestConfiguration);

/////////////////////////////////광고///////////////////////////////////////
        initializeMain();
        setStartOnClick();

        checkVIsibility();

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Endings.class);
                i.putExtra("page",pageToEnding);
                out=1;
                startActivityForResult(i,Success.ENTER);

            }
        });

    }


    public void checkVIsibility() {

        if (newgame.getVisibility() == View.VISIBLE) {
            newgame.setVisibility(View.INVISIBLE);
            loadgame.setVisibility(View.GONE);
        }// 갔다온 후 다시 돌아왔을 때.
    }

    public void checkLoad(){

        if (0 < getViewNum && getViewNum < 5) {
            loadgame.setVisibility(View.VISIBLE);
        } else {
            loadgame.setVisibility(View.GONE);
        }
    }

    public void initializeMain() {
        tinyDB = new TinyDB(this);
        start = findViewById(R.id.start);
        newgame = findViewById(R.id.newgame);
        loadgame = findViewById(R.id.loadgame);
        ending = findViewById(R.id.ending);

        Application.setSavePageDB(tinyDB);

        mediaPlayer = new MusicActivity(this);
       // Application.setMusicActivity(mediaPlayer);
        out=0;
        //광고

        if(Application.getSavePageDB().getInt("saveP")!=0){
            //page 에 전 기록이 저장되어 있으면. // 없으면. 0.
            //현재 페이지 표시변수.
            getViewNum=Application.getSavePageDB().getInt("saveV");
            Application.getSavePageDB().getInt("saveV");
            getPage=Application.getSavePageDB().getInt("saveP");

            System.out.println("INIT저장 ㅣ getVIewNUm ========"+getViewNum);
            System.out.println("INIT저장 : getPage========"+getPage);
        }

        pageToEnding = getIntent().getIntExtra("page",-1);



    }

    public void setStartOnClick() {

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newgame.setVisibility(View.VISIBLE);
                checkLoad();

                newgame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent si = new Intent(MainActivity.this, SecondPage.class);
                        //기록 없을때.   --> 0으로 저장--> -1로 set 해줌.
                        //기록 있는데 새로 할때.--> -1로 set 해줌.
                        //영구 저장 아님.
                        StartStory.setViewNum(-1);
                        StartStory.setPage(-1);

                        System.out.println("maint to Second");
                        // 실행 후 돌아왔을 떄 안보이도록.
                        startActivity(si);
                        checkVIsibility();
                        out=1;
                    }
                });


                loadgame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (getViewNum == 1) {
                            intent = new Intent(MainActivity.this, T1_text.class);
                        } else if (getViewNum == 2) {
                            intent = new Intent(MainActivity.this, T1_text_image.class);
                        } else if (getViewNum == 3) {
                            intent = new Intent(MainActivity.this, T1_choice.class);
                        } else if (getViewNum == 4) {
                            intent = new Intent(MainActivity.this, T1_kakao.class);
                        }else {//5나 6.//0. 아예시작 안했을 떄.
                            intent = new Intent(MainActivity.this,Success.class);
                        }

                        intent.putExtra("getPage", getPage);//tinyDB.에 저장된 page 보내줌.
                        intent.putExtra("Restart",2);
                        out=1;
                        startActivity(intent);
                        checkVIsibility();

                    }
                });
            }
        }; start.setOnClickListener(onClickListener);
    }

    public void setOut(int out) {
        this.out = out;
    }

    public int getOut() {
        return out;
    }

    @Override
    protected void onPause() {
        if(out==0) {
            //화면 보호기. --> 맨 위에서 바로 onPause 로 들어감.
/*            if (mediaPlayer != null) {
                mediaPlayer.stopMusic();
            }*/
        }
            super.onPause();
        System.out.println("out ====="+out);
        System.out.println("PAUSE!!!!");
        //화면 보호기.
    }
    @Override
    protected void onDestroy() {

        System.out.println("DESYROY!!!!!!");
/*        if(mediaPlayer!=null){
            mediaPlayer.release();
        }*/
        super.onDestroy();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
/*        if(mediaPlayer!=null) {
            mediaPlayer.stopMusic();
        }*/
        System.out.println("RESTART!!! B+==========="+out);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mediaPlayer.playBgSleep();
        out=0;
        System.out.println("START!!!");

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.out.println("뒤로 가기");
    }


}

