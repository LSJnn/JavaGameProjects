package com.example.heresy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.text.RelativeDateTimeFormatter;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.Timer;
import java.util.TimerTask;

public class Story extends AppCompatActivity {

    final static int STORY_BACK = 20020;
    final static int LOAD_OK =23000;

    View tInclude;View tInclude2;View tInclude3;
    View include;View include2;

    String f;String l;

    ImageView h1;ImageView h2;ImageView h3;ImageView h4;
    ImageView m1;ImageView m2;ImageView m3;ImageView m4;

    TextView tv1; TextView tv2; TextView tv3;

    View[] chat_1; View[] chat_2;

    ImageButton next; ImageButton back;

    mySharedPreferences sf;
    int code;

    Intent intent;
    Intent newIntent;
    int n = 0;
    int new_game;
    int recentPage;

    Intent storyIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        intent = getIntent();
        f = intent.getStringExtra("firstname");
        l = intent.getStringExtra("lastname");
        recentPage = intent.getExtras().getInt("loadpage");
        System.out.println(f+ l);

        sf = new mySharedPreferences();
        sf.setString(this,"firstname",f);
        sf.setString(this,"lastname",l);


        if(f== null && l ==null){
            f= sf.getStringR(this, "firstname");
            l= sf.getStringR(this, "lastname");
        }

        this.initialize();
        System.out.println("recentPage = "+recentPage);
        this.setStoryListener();
        this.storyManager();
        System.out.println("AF recentPage = "+recentPage);


        //////////////////////레이아웃 객체 선언///////////////////////////////////////////////

        /////////////////////카톡 화면 순서대로 구현///////////////////////////////////////////////////

        //recentPage 가 0이 아니면 = 값이 있으면 = 전에 누른 흔적이 있으면 거기부터 시작.

        //new_game = intent.getExtras().getInt("NEW");
/////////////////////////////////////////////////////////////////////////////
        //새로하기 신호를 받아서 이어하기 할떄는 n 을 recentPage와 동기화 시키고,
        // 새로하기 할 떄는 n 을 다시 0으로 바꿔줘야함.
        // startActivitForReuslt 로 시도 한번....
        //바로 위의 코드를 수정. 위에 널값 오류가 나옴...
        ////////////////////////////////////////////////////////////////////

        //스토리 진행


        // sf 에 들어있는 page 키에 아무것도 안 들어 있으면 0 을 반환.//새로 시작.

        //////////////////이전 버튼 눌렀을 떄///////////////////////////////////////////////
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             storyIntent = new Intent(Story.this, MainActivity.class);
             //storyIntent.putExtra("STORY_BACK",n);//현재 페이지--> n 저장 안됨.
             setResult(STORY_BACK);
             finish();
            }
        });

/*        if (sum == 1) {
            tv1.setText("나는 4년제 대학에 다니고 있는 \n" +
                    "평범한 대학생 " + i.getExtras() + l + f + "\n");
        }
        chat_1[0].setVisibility(View.VISIBLE);
        chat_1[1].setVisibility(View.VISIBLE);
    */
/* while(sum <=5 ) {
     chat_1[sum].setVisibility(View.VISIBLE);*/
        /*

         */
/*            if (sum >= 7) {
                for(int k=1;k<chat_1.length;k++){
                    chat_1[k].setVisibility(View.INVISIBLE);
                }
                for (int t = 5; sum<12; t++) {
                    chat_2[t-5].setVisibility(View.VISIBLE);
                }
            }*//*

            }else if(sum<0){
            finish();
*/

/////////////////////////////back/ next 버튼 /////////////////////


/////////////////////배열에 1글자씩 저장///////////////////////.//
/*        String text = tv1.getText().toString();
        String[] eachString;

        Typing typing = new Typing(text);
        typing.string_split();


        eachString = typing.array_story;*/

//////////////////한 글자씩 출력////////////////--> 실패... timer 함수는 run 안의 내용을 일정 간격마다 반복하는 것. 여기서 for 문을 사용하든 뭘하든 안됨.

        //Read(eachString,tv2);

/*
        String saying = "";
        for(int a=0;a<eachString.length;a++){

            String s = eachString[a];// 1 2/
            saying +=s; //1 +2 +3
//            String s = eachString[a];

            System.out.println(saying);
            tv2.setText(saying);
        }
*/

    }

    ///////////////////////////SharedPreferences/////
/*    @Override
    protected void onStop() {
        super.onStop();
        // activity 종료 전에 loadPage 파일에 저장.
        SharedPreferences sharedPreferences  = getSharedPreferences("loadPage",MODE_PRIVATE);
        //저장하기 위해 editor 사용
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int memory = n;
        editor.putInt("page",memory);
        editor.commit();
    }*/

    public void initialize(){
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);


        tInclude = findViewById(R.id.include);
        tInclude2=findViewById(R.id.include2);
        tInclude3 = findViewById(R.id.include3);
        include = findViewById(R.id.include_Image);
        include2 = findViewById(R.id.include_Image2);


        ImageView kakao_bg = findViewById(R.id.kakao_bg);
        ImageView kakao_date = findViewById(R.id.kakao_date1);

        h1 = findViewById(R.id.kakao_h1);
        h2 = findViewById(R.id.kakao_h2);
        h3 = findViewById(R.id.kakao_h3);
        h4 = findViewById(R.id.kakao_h4);

        m1 = findViewById(R.id.kakao_m1);
        m2 = findViewById(R.id.kakao_m2);
        m3 = findViewById(R.id.kakao_m3);
        m4 = findViewById(R.id.kakao_m4);

        chat_1 = new View[]{kakao_bg, kakao_date, h1, m1, m2, h3};
        chat_2 = new View[]{kakao_bg, m3, h4, h4};

         next = findViewById(R.id.nextBtn);
         back = findViewById(R.id.backbtn);
    }

    public void setStoryListener(){
        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n++;
                System.out.println("n = " + n + "\n");

                sf.getPreferenences(Story.this);
                sf.setInt(Story.this,"page",n); // 현재 n 저장.
//                storyIntent.putExtra("STORY_BACK",n);
                System.out.println("SFn = " + sf.getIntR(Story.this, "page") + "\n");

                switch (n){
                    case 1: tv1.setText("나는 4년제 대학에 다니고 있는 \n" +
                            "평범한 대학생 "+l+f);
                        break;
                    case 2: include.setVisibility(View.VISIBLE);
                        break;
                    case 3: h1.setVisibility(View.VISIBLE);
                        break;
                    case 4: m1.setVisibility(View.VISIBLE);
                        break;
                    case 5: m2.setVisibility(View.VISIBLE);
                        break;
                    case 6: h2.setVisibility(View.VISIBLE);
                        break;
                    case 7: h3.setVisibility(View.VISIBLE);
                        break;
                    case 8: tv2.setText("혜준이는 \n 초등학생때부터 쭉 친구다");
                        break;
                    case 9: tInclude.setVisibility(View.GONE);
                        include.setVisibility(View.GONE);
                        include2.setVisibility(View.VISIBLE);
                        break;
                    case 10:m3.setVisibility(View.VISIBLE);
                        break;
                    case 11:h4.setVisibility(View.VISIBLE);
                        break;
                    case 12:m4.setVisibility(View.VISIBLE);
                        break;
                    case 13: tInclude3.setVisibility(View.VISIBLE);
                        tv3.setText("답답한 일상에 상담이라도 받아보면\n" +
                                " 나아질까 하는 마음이다\n" +
                                "\n" +
                                "…\n");
                        break;
                }

            }
        };

        next.setOnClickListener(Listener);
    }

    public void storyManager(){
        if(recentPage!=0){
            n = recentPage;
        }else if(recentPage <=2){
            recentPage = 0;
        }else if(recentPage<=8){
            recentPage = 1;
        }else if(recentPage<=13){
            recentPage=8;
        }
    }


    public void Do(int i, View[] arr){
        for(; i<arr.length;){
            Toast.makeText(this, n+"입니다.",Toast.LENGTH_LONG).show();
        }
    }
    public void Read(String[] arr, TextView tv){

        String saying ="";
        ReadingStory readingStory = new ReadingStory();

        for(int a=0;a<arr.length;a++){

            String s = arr[a];// 1 2/
            saying +=s; //1 +2 +3

            System.out.println(saying);
            readingStory.setSettings(saying,tv,arr);
            readingStory.readingTimerTask();

        }readingStory.stopTimerTask();

    }

}

