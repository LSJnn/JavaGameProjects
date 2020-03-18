package com.example.heresy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity{

    ImageButton start;
    ImageButton newgame;
    ImageButton loadgame;
    ImageButton ending;

    int out =1;


    public static MusicActivity mediaPlayer;

    int getViewNum;
    int getPage;

    int loadpage;
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

        AdView main=findViewById(R.id.main_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        main.loadAd(adRequest);
/////////////////////////////////광고///////////////////////////////////////
        this.initializeMain();

        this.setStartOnClick();
        checkVIsibility();


        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Endings.class);
                startActivity(i);

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
        } else { // 없거나 엔딩봤을때.
            loadgame.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onDestroy() {
        //앱이 정지했을 떄
        super.onDestroy();
        if (mediaPlayer!=null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }

        tinyDB.putInt("saveP",StartStory.getPage());
        tinyDB.putInt("saveV",StartStory.getViewNum());
        System.out.println("getPage ======"+ StartStory.getPage());
    }

    //crate- start-resume-홈킴- usefhint(꺼졌다 신호.) - pause- stop-restart-start/유저에 의해 홈버튼 누르기 직전 호출. // 액티비티가 백그라운드 가기 직전 호출.


    public void initializeMain() {
        start = findViewById(R.id.start);
        newgame = findViewById(R.id.newgame);
        loadgame = findViewById(R.id.loadgame);
        ending = findViewById(R.id.ending);
        tinyDB = new TinyDB(this);
        Application.setSavePageDB(tinyDB);
       // Application.getSavePageDB().putInt("skip",0);
       // Application.getSavePageDB().putInt("ad",4);

        mediaPlayer = new MusicActivity(this);
        Application.setMusicActivity(mediaPlayer);
        out=1;
        if(tinyDB.getInt("saveP")!=0){
            getViewNum=Application.getSavePageDB().getInt("saveV");
            getPage=Application.getSavePageDB().getInt("saveP");
        }
        System.out.println("저장 ㅣ getVIewNUm ========"+getViewNum);
        System.out.println("저장 : getPage========"+getPage);


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
                        StartStory.setViewNum(-1);
                        StartStory.setPage(-1);//
                        System.out.println("outttttt="+out);//1
                        System.out.println("GOOOOOOOOOOOOOOOOOo TO Second");
                        // 실행 후 돌아왔을 떄 안보이도록.
                        startActivity(si);
                        checkVIsibility();
                    }
                });


                loadgame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       /* //Practice.decidePos();
                        getViewNum = StartStory.getViewNum();
                        System.out.println("ViewNUm ============" + getViewNum);
                        getPage = StartStory.getPage();
                        System.out.println("PAGE ============" + getPage);*/

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

                        intent.putExtra("getPage", getPage);
                        intent.putExtra("Restart",2);

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
        if(getOut() ==2){
            if(mediaPlayer!=null) {
                mediaPlayer.stopMusic();
                mediaPlayer.release();
            }
        }
        super.onPause();
        System.out.println("out ====="+out);
        System.out.println("pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if(mediaPlayer!=null){mediaPlayer.stopMusic();}
        System.out.println("restart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        mediaPlayer.playBgSleep();
        System.out.println("start");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        setOut(2);
    }


}

