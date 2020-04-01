package com.heresy.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Fine extends AppCompatActivity {
    public static final int ENTER = 201;

    ImageButton next;ImageButton back;ImageButton ending; ImageButton now;
    ImageView fine_img1;
    TextView fine_tv1;TextView fine_tv2;
    AdView adview; ImageView newEnding;
    StartStory startStory= new StartStory();
    MusicActivity mediaPlayer = Application.getMusicActivity();
    int home;
    TinyDB tinyDB = Application.getSavePageDB();

    int c;
    int page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fine);

        Intent i = getIntent();
        page = i.getIntExtra("page",-1);



        initializeView();

        // 엔딩으로 안 가져가도, 추가시킴.
        // page 이름으로 n 엔딩나와야할 페이지 받아오면, 리스트에 저장. 목록 생성.
        tinyDB.getListInt("endingPages").add(page);
        System.out.println("page========"+page);

        nextOnClick();


    btnClick();
    }

    public void initializeView(){
        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);
        adview = findViewById(R.id.fine_banner);
        newEnding = findViewById(R.id.newEnding);
        now = findViewById(R.id.now);
        home=1;

        fine_img1 = findViewById(R.id.fine_img1);
        fine_tv1 = findViewById(R.id.fine_tv1);
        fine_tv2 = findViewById(R.id.fine_tv2);

        mediaPlayer=Application.getMusicActivity();
        Application.getSavePageDB().putInt("saveV",6);
    }

    public void nextOnClick(){

        View.OnClickListener nextOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("버튼버ㅡㅌㄴ버튼!!!!!!!!!!!!!!!!!!!!!1");

                c++;
                if(c==1){
                    fine_tv1.setText("\" 우리 모두\n 사이비 조심합시다..\n" +
                            "누가 비밀로 해달라고 하면 가족들이나\n" +
                            "주변 친한 지인들한테\n" +
                            "먼저 알리세요!\"");
                } else {
                    fine_tv2.setText(R.string.pageFine);
                    next.setClickable(false);
                    next.setVisibility(View.INVISIBLE);
                    adview.setVisibility(View.VISIBLE);
                    newEnding.setVisibility(View.VISIBLE);
                    startBlink();
                    //배너.
                    AdRequest adRequest = new AdRequest.Builder().build();
                    adview.loadAd(adRequest);

                }
            }
        };
        next.setOnClickListener(nextOnClickListener);

    }

    public void btnClick() {

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    toMain();
                }

        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fine.this, Endings.class);
                intent.putExtra("page",page);
                System.out.println("page ="+page);
                startActivityForResult(intent , ENTER);//

            }
        });

        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fine.this,Now.class);
                intent.putExtra("page",page-1);
                startActivity(intent);
            }
        });

    }

    public void startBlink(){
        Animation startAnim = AnimationUtils.loadAnimation(getApplication(),R.anim.blink_anim);
        newEnding.startAnimation(startAnim);
    }


    @Override
    public void onBackPressed() {
        toMain();
    }
    public void toMain(){
        Intent i = new Intent(Fine.this, MainActivity.class);
        i.putExtra("page", page);
        home= 0;
        System.out.println("PAGE 1 ============" + StartStory.getPage());
        System.out.println("VIewNUM 4 ============" + StartStory.getViewNum());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

    @Override
    protected void onPause() {
        //액티비티가 다른데로 넘어갈때 - 다이얼로그 / 다른 뷰로.
        //홈으로 갈떄 --> 이때만 음악 멈춤.
        System.out.println("HOME+++++++"+home);
        if(home == 0){
            if(mediaPlayer!=null) {
                mediaPlayer.stopMusic();
                super.onPause();
            }
            System.out.println("mediaPlayer == null");
            super.onPause();
        }else{
            System.out.println("home!=0");
            super.onPause();
        }
        System.out.println("PAUSE!!!");
    }

    @Override
    protected void onDestroy() {
        System.out.println("DESTROY!!!");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        //홈갔다가 재시작. .. 다이얼로그?
        newEnding.setVisibility(View.INVISIBLE);
        if(mediaPlayer!=null){
            mediaPlayer.stopMusic();
            startStory.music(StartStory.getPage());
            System.out.println("null!!!restart");
        }
        System.out.println("RESTART!!!");

        super.onRestart();

    }

    @Override
    protected void onStart() {

        super.onStart();
    }
}
