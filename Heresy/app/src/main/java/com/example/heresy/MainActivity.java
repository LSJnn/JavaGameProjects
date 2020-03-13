package com.example.heresy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton start;
    ImageButton settings;
    ImageButton newgame;
    ImageButton loadgame;
    ImageButton ending;

    MediaPlayer mediaPlayer;
    mySharedPreferences mSf;

    int getViewNum;
    int getPage;

    int loadpage;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //System.out.println("main 1: "+loadpage);
        this.initializeMain();
        //System.out.println("main 2: "+loadpage);

        IsPlaying();

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


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        //Story 의 실행 결과를 전달받는 ./..Story 가 종료되면 실행되는 메소드.
        super.onActivityResult(requestCode, resultCode, data);

        /*switch (requestCode){
            case NEW_OK : //새로하기
                if(requestCode == resultCode){
                } else if(resultCode == STORY_BACK){
                    loadpage = mSf.getInt("page",0);
                }
                break;

            case LOAD :
                if(requestCode == resultCode){
                    loadpage=mSf.getInt("page",0);
                }else if(resultCode == STORY_BACK){
                    loadpage = mSf.getInt("page",0);
                }
                break;


        }*/
    }

    public void checkVIsibility() {

        if (newgame.getVisibility() == View.VISIBLE) {
            newgame.setVisibility(View.INVISIBLE);
            loadgame.setVisibility(View.INVISIBLE);
            settings.setVisibility(View.VISIBLE);
        }
    }

    //////////////////////음악///////////////////////////
    private void IsPlaying() {

        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        } else {
            onDestroy();
        }
    }

    @Override
    protected void onDestroy() {
        //앱이 정지했을 떄
        super.onDestroy();
        mediaPlayer.release();
        mediaPlayer = null;
    }


    public void initializeMain() {
        start = findViewById(R.id.start);
        settings = findViewById(R.id.settings);
        newgame = findViewById(R.id.newgame);
        loadgame = findViewById(R.id.loadgame);
        ending = findViewById(R.id.ending);

        mediaPlayer = new MediaPlayer().create(getApplicationContext(), R.raw.main_theme);
        mediaPlayer.setLooping(true);

/*        mSf = new mySharedPreferences();
        mSf.getPreferenences(this);
        //getPreferences 있ㅆ어야 어떤 파일인지 알 수 있음.
        // page의 n 값을 저장함., 이름 저장.
        loadpage=mSf.getIntR(this, "page");*/

    }

    public void setStartOnClick() {

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                newgame.setVisibility(View.VISIBLE);

                if (StartStory.getViewNum() == 0) {
                    loadgame.setVisibility(View.INVISIBLE);
                    settings.setVisibility(View.INVISIBLE);
                } else {
                    loadgame.setVisibility(View.VISIBLE);
                }


                newgame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent si = new Intent(MainActivity.this, SecondPage.class);
                        startActivity(si);
                        StartStory.setViewNum(-1);
                        StartStory.setPage(-1);//
                        System.out.println("GOOOOOOOOOOOOOOOOOo TO Second");
                        // 실행 후 돌아왔을 떄 안보이도록.
                        checkVIsibility();
                    }
                });


                loadgame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Practice.decidePos();
                        getViewNum = StartStory.getViewNum();
                        System.out.println("ViewNUm ============" + getViewNum);
                        getPage = StartStory.getPage();
                        System.out.println("PAGE ============" + getPage);

                        if (getViewNum == 1) {
                            intent = new Intent(MainActivity.this, T1_text.class);
                        } else if (getViewNum == 2) {
                            intent = new Intent(MainActivity.this, T1_text_image.class);
                        } else if (getViewNum == 3) {
                            intent = new Intent(MainActivity.this, T1_choice.class);
                        } else if (getViewNum == 4) {
                            intent = new Intent(MainActivity.this, T1_choice.class);
                        }else {
                            loadgame.setVisibility(View.INVISIBLE);
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
}

