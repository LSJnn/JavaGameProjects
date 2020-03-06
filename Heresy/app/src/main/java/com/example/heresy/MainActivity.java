package com.example.heresy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    final static int STORY_BACK = 20020;
    final static int NEW =13000;
    final static int NEW_OK = 13000;
    final static int LOAD = 23000;
    final static int LOAD_OK =23000;

    ImageButton start;
    ImageButton settings;
    ImageButton newgame;
    ImageButton loadgame;
    ImageButton ending;

    MediaPlayer mediaPlayer;
    mySharedPreferences mSf;

    int loadpage;
    Intent intent;
    String l;
    String f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("main 1: "+loadpage);

        this.initializeMain();
        System.out.println("main 2: "+loadpage);

        IsPlaying();
        this.setStartOnClick();

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

    public void checkVIsibility(){

            if(newgame.getVisibility()==View.VISIBLE){
                newgame.setVisibility(View.INVISIBLE);
                loadgame.setVisibility(View.INVISIBLE);
                settings.setVisibility(View.VISIBLE);
            }
        }

        //////////////////////음악///////////////////////////
    private void IsPlaying(){

        if(!mediaPlayer.isPlaying()){
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
        mediaPlayer=null;
    }

    public void initializeMain(){
        start = findViewById(R.id.start);
        settings = findViewById(R.id.settings);
        newgame = findViewById(R.id.newgame);
        loadgame = findViewById(R.id.loadgame);
        ending = findViewById(R.id.ending);

        mediaPlayer = new MediaPlayer().create(getApplicationContext(), R.raw.main_theme);
        mediaPlayer.setLooping(true);


        mSf = new mySharedPreferences();
        mSf.getPreferenences(this);
        //getPreferences 있ㅆ어야 어떤 파일인지 알 수 있음.
        // page의 n 값을 저장함., 이름 저장.

        loadpage=mSf.getIntR(this, "page");
        f = mSf.getStringR(this,"firstname");
        l = mSf.getStringR(this, "lastname");

    }

    public void setStartOnClick(){

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                newgame.setVisibility(View.VISIBLE);

                if(loadpage==0){
                    loadgame.setVisibility(View.INVISIBLE);
                    settings.setVisibility(View.INVISIBLE);
                }else{
                    loadgame.setVisibility(View.VISIBLE);
                }


                newgame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent si = new Intent(MainActivity.this, SecondPage.class);
                        startActivityForResult(si,NEW);
                        System.out.println("GOOOOOOOOOOOOOOOOOo TO Second");
                        // 실행 후 돌아왔을 떄 안보이도록.
                        checkVIsibility();
                    }
                });


                loadgame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = getIntent();
//                        loadpage = i.getExtras().getInt("STORY_BACK");
                        intent = new Intent(MainActivity.this,Story.class);
                        intent.putExtra("loadpage",loadpage);
                        intent.putExtra("firstname", f);
                        intent.putExtra("lastname", l);

                        startActivityForResult(intent,LOAD);
                        checkVIsibility();
                        //있던 페이지 넘겨줌.
                    }
                });
            }
        };
        start.setOnClickListener(onClickListener);
    }

}
