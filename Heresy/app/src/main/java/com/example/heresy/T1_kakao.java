package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class T1_kakao extends AppCompatActivity {
    //프레임 레이아웃은 갈아끼는 방식으로. 매번. 어쩔 수 없다.
    ImageButton back; ImageButton next; ImageButton ending;

    TextView k_tv1;TextView k_tv2; TextView k_tv3;
    LinearLayout k_view;

    ImageView k_img1; ImageView k_img2;ImageView k_img3;ImageView k_img4; ImageView k_img5;

    int changeCode;
    String F; String L;

    StartStory startStory4;
    int c; int p; int n; int kakao;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_kakao);

        Intent i = getIntent();
        F = i.getStringExtra("firstName");
        L = i.getStringExtra("lastName");

        initializeView();
        initializeLayout();

        startStory4 = new StartStory();
        startStory4.getFOUR(k_tv1,k_tv2,k_tv3,k_view);

        nextOnClick();




        btnClick();
    }



    public void initializeView(){

        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);

        k_tv1 = findViewById(R.id.t1_k_tv1);
        k_tv2 = findViewById(R.id.t1_k_tv2);
        k_tv3 = findViewById(R.id.t1_k_tv3);

        k_view = findViewById(R.id.k_include);


        n = 8; c=0; p=0;
        kakao=0;
        System.out.println("initializeVIew!!!!!!!!!!!!!!!!!!!!!1");
    }

    public void kako1(){
        k_img1 = findViewById(R.id.kakao_h1);
        k_img2 = findViewById(R.id.kakao_m1);
        k_img3 = findViewById(R.id.kakao_m2);
        k_img4 = findViewById(R.id.kakao_h2);
        k_img5 = findViewById(R.id.kakao_h3);

    }

    public void initializeLayout() {
        switch (changeCode) {
            case 1:
                Intent i1 = new Intent(T1_kakao.this, T1_text.class);
                startActivity(i1);
                finish();
                break;
            case 2:
                Intent i2 = new Intent(T1_kakao.this, T1_text_image.class);
                i2.putExtra("firstName", F);
                i2.putExtra("lastName",L);
                startActivity(i2);
                finish();
                break;
            case 3:
                Intent i3 = new Intent(T1_kakao.this, T1_choice.class);
                startActivity(i3);
                finish();
                break;
            default: //아무것도 안함.
        }
    }

    public void btnClick() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                finish();

            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_kakao.this, Endings.class);
                startActivity(intent);

            }
        });
    }

    public void nextOnClick(){

        View.OnClickListener nextOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("버튼버ㅡㅌㄴ버튼!!!!!!!!!!!!!!!!!!!!!1");

                c++;
                int k = c%7;//2,1,0

                switch(k){////////////////뷰 더 추가될 때 아마 수정해야 할듯. 나누는 숫자랑.
                    case 1 : p=1;
                    break;
                    case 2: p =2;
                        break;
                    case 3: p = 3;
                        break;
                    case 4 : p = 4;
                        break;
                    case 5 : p=5;
                        break;
                    case 6 :  p =6;
                        break;
                    case  0 : p = 7;
                        break;
                }

                System.out.println("n ======"+n+"\nc===="+c+"\nk======="+k+"p ========"+p);
                startStory4.setStory(4,n,p);
                System.out.println(startStory4.kakao);
                changeView(startStory4.kakao);
                if(p==7){
                    n++; // 9까지 끝나면 다음 쪽으로.
                    changeCode=startStory4.changeCode;
                    System.out.println("changeCode ============="+changeCode);
                }
                //--> changeCode 에 따라 넘어감.
                initializeLayout();

            }
        };
        next.setOnClickListener(nextOnClickListener);

    }

    public void changeView(int kakao){
        LayoutInflater layoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.kakotalk, k_view,true);
        kako1();

/*        if(frameLayout.getChildCount() > 0){
            frameLayout.removeViewAt(0);
        }

        view =null;*/
        switch(kakao){
            case 2 :k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                break;
            case 3 : k_img2.setVisibility(View.VISIBLE);
                break;
            case 4:k_img3.setVisibility(View.VISIBLE);
                break;
            case 5: k_img4.setVisibility(View.VISIBLE);
                break;
            case 6:k_img5.setVisibility(View.VISIBLE);
                break;
        }
    }

}
