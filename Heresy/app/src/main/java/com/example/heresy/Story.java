package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.icu.text.RelativeDateTimeFormatter;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
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

    int n = 0;
    View tInclude;
    View tInclude2;
    View tInclude3;
    View include;
    View include2;

    ImageView h1;ImageView h2;ImageView h3;ImageView h4;
    ImageView m1;ImageView m2;ImageView m3;ImageView m4;

    View[] chat_1; View[] chat_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        final Intent intent = getIntent();
        final String f = intent.getStringExtra("firstname");
        final String l = intent.getStringExtra("lastname");


        final TextView tv1 = findViewById(R.id.tv1);
        final TextView tv2 = findViewById(R.id.tv2);
        final TextView tv3 = findViewById(R.id.tv3);


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

        ImageButton next = findViewById(R.id.nextBtn);
        //////////////////////레이아웃 객체 선언///////////////////////////////////////////////


        /////////////////////임의 변수 선언///////////////////////////////////////////////////

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n++;
                System.out.println("n = " + n + "\n");

                switch (n){
                    case 1: tInclude.setVisibility(View.VISIBLE);
                            tv1.setText("나는 4년제 대학에 다니고 있는 \n" +
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


                }

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
    public void Do(int i,View[] arr){
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

