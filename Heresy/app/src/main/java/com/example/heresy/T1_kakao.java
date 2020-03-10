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

    ImageView k_img1; ImageView k_img2;ImageView k_img3;ImageView k_img4; ImageView k_img5;ImageView k_img6;
    Intent i;

    int changeCode;
    String f; String l;

    StartStory startStory4;
    int c=0; int p=0; int n; int a ; // Nis 에 사용. Page 설정.

    LayoutInflater layoutInflater;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_kakao);

        getData();

        initializeView();
        initializeLayout();

        startStory4 = new StartStory();
        startStory4.getFOUR(k_tv1,k_tv2,k_tv3,k_view,l, f);
        nextOnClick();




        btnClick();
    }

    public void getData(){
        i = getIntent();
        f= i.getStringExtra("firstName");
        l = i.getStringExtra("lastName");
        n = i.getIntExtra("n",8);
        System.out.println("kakaoFL ================== "+i.getStringExtra("firstName") + "\n2 L = "+i.getStringExtra("lastName")+"\n");
    }



    public void initializeView(){

        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);

        k_tv1 = findViewById(R.id.t1_k_tv1);
        k_tv2 = findViewById(R.id.t1_k_tv2);
        k_tv3 = findViewById(R.id.t1_k_tv3);

        k_view = findViewById(R.id.k_include);

        System.out.println("initializeVIew!!!!!!!!!!!!!!!!!!!!!1");
    }

    public void initializeLayout() {
        switch (changeCode) {
            case 1:
                Intent i1 = new Intent(T1_kakao.this, T1_text.class);
                i1.putExtra("n",n);
                i1.putExtra("firstName", i.getStringExtra("firstName"));
                i1.putExtra("lastName",i.getStringExtra("lastName"));
                startActivity(i1);
                finish();
                break;
            case 2:
                Intent i2 = new Intent(T1_kakao.this, T1_text_image.class);
                i2.putExtra("firstName", i.getStringExtra("firstName"));
                i2.putExtra("lastName",i.getStringExtra("lastName"));
                i2.putExtra("n",n);
                startActivity(i2);
                finish();
                break;
            case 3:
                Intent i3 = new Intent(T1_kakao.this, T1_choice.class);
                i3.putExtra("n",n);
                i3.putExtra("firstName", i.getStringExtra("firstName"));
                i3.putExtra("lastName",i.getStringExtra("lastName"));
                startActivity(i3);
                finish();
                break;
            case 5 :
                Intent i0 = new Intent(T1_kakao.this,Success.class);
                i0.putExtra("page",n);
                startActivity(i0);
                finish();
            default: //아무것도 안함.
        }
    }

    public void btnClick() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(T1_kakao.this, MainActivity.class);
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

    public void Nis(){
        if(n==8){
            a = 7;
        }if(n==10){
            a = 6;
        }if(n==20){
            a=5;
        }
        if(n==28){
            a=5;
        }if(n==29){
            a=7;
        }if(n==30){
            a=2;
        }
        if(n==31){
            a=6;
        }
        if(n==38){
            a=4;
        }
        if(n == 39){
            a = 4;
        }
        if(n == 41){
            a = 7;
        }
        if(n==42){
            a = 6;
        }
        if(n==58){
            a = 6;
        }
    }

    public void PageIs(int a){
        int k = c%a;
        if(k!= 0 ){
            p=k;
        } else {
            p= a;
        }
        System.out.println("n ======"+n+"\nc===="+c+"\np ========"+p);
        startStory4.setStory(4,n,p);
        System.out.println(startStory4.kakao);
        changeView(startStory4.kakao);

        if(p==a){// codeChange 메소드.
            n++;
            c=0;
            removeVIew();
            changeCode=startStory4.changeCode;
            System.out.println("changeCode ============="+changeCode);
        }

        initializeLayout();
    }


    public void nextOnClick(){

        View.OnClickListener nextOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("버튼버ㅡㅌㄴ버튼!!!!!!!!!!!!!!!!!!!!!1");

                c++;
                Nis();
                PageIs(a);
            }
        };
        next.setOnClickListener(nextOnClickListener);

    }

    public void kakao1(){
        layoutInflater.inflate(R.layout.kakotalk, k_view,true);

        k_img1 = findViewById(R.id.kakao_h1);
        k_img2 = findViewById(R.id.kakao_m1);
        k_img3 = findViewById(R.id.kakao_m2);
        k_img4 = findViewById(R.id.kakao_h2);
        k_img5 = findViewById(R.id.kakao_h3);

    }

    public void kakao2(){
        layoutInflater.inflate(R.layout.kakotalk2, k_view,true);

        k_img1 = findViewById(R.id.kakao_m3);
        k_img2 = findViewById(R.id.kakao_h4);
        k_img3 = findViewById(R.id.kakao_m4);
    }

    public void kakaoP20(){
        layoutInflater.inflate(R.layout.kakotalk20, k_view,true);

        k_img1 = findViewById(R.id.kakao20_h1);
        k_img2 = findViewById(R.id.kakao20_h2);
        k_img3 = findViewById(R.id.kakao20_m1);
    }

    public void kakao3(){
        layoutInflater.inflate(R.layout.kakotalk3, k_view,true);

        k_img1 = findViewById(R.id.kakao28_m1);
        k_img2 = findViewById(R.id.kakao28_h1);
    }
    public void kakao4(){
        layoutInflater.inflate(R.layout.kakotalk4, k_view,true);

        k_img1 = findViewById(R.id.kakao29_m);
        k_img2 = findViewById(R.id.kakao29_h);
    }
    public void kakao5(){
        layoutInflater.inflate(R.layout.kakotalk5, k_view,true);

        k_img1 = findViewById(R.id.kakao30_m);
        k_img2 = findViewById(R.id.kakao30_h);
    }
    public void kakao6(){
        layoutInflater.inflate(R.layout.kakotalk6, k_view,true);

        k_img1 = findViewById(R.id.kakao31_h1);
        k_img2 = findViewById(R.id.kakao31_h2);
        k_img3 = findViewById(R.id.kakao31_h3);
        k_img4 = findViewById(R.id.kakao31_m1);
    }
    public void kakao38(){
        layoutInflater.inflate(R.layout.kakotalk38, k_view,true);

        k_img1 = findViewById(R.id.kakao38_h1);
        k_img2 = findViewById(R.id.kakao38_h2);
        k_img3 = findViewById(R.id.kakao38_m);
    }
    public void kakao39(){
        layoutInflater.inflate(R.layout.kakotalk39, k_view,true);

        k_img1 = findViewById(R.id.kakao39_h1);
        k_img2 = findViewById(R.id.kakao39_m1);
        k_img3 = findViewById(R.id.kakao39_m2);
    }

    public void kakao41(){
        layoutInflater.inflate(R.layout.kakotalk41, k_view,true);

        k_img1 = findViewById(R.id.kakao41_h1);
        k_img2 = findViewById(R.id.kakao41_h2);
        k_img3 = findViewById(R.id.kakao41_h3);
        k_img4 = findViewById(R.id.kakao41_h4);
        k_img5 = findViewById(R.id.kakao41_m1);
        k_img6 = findViewById(R.id.kakao41_m2);

    }
    public void kakao42(){
        layoutInflater.inflate(R.layout.kakotalk42, k_view,true);

        k_img1 = findViewById(R.id.kakao42_h1);
        k_img2 = findViewById(R.id.kakao42_h2);
        k_img3 = findViewById(R.id.kakao42_m1);
        k_img4 = findViewById(R.id.kakao42_h3);
    }

    public void kakao58(){
        layoutInflater.inflate(R.layout.kakotalk42, k_view,true);

        k_img1 = findViewById(R.id.kakao58_m1);
        k_img2 = findViewById(R.id.kakao58_h1);
        k_img3 = findViewById(R.id.kakao58_h2);
        k_img4 = findViewById(R.id.kakao58_m2);
        k_img5 = findViewById(R.id.kakao58_h3);
    }

    public void removeVIew(){
        if(k_view.getChildCount()>0){
            k_view.removeAllViews();
        }

    }

    public void changeView(int kakao) {
        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (n == 8) {
            kakao1();//뷰 나타내기.
            switch (kakao) {
                case 2:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    k_img3.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    k_img4.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    k_img5.setVisibility(View.VISIBLE);
                    break;
            }
        }
        else if (n == 10) {
            kakao2();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    k_img3.setVisibility(View.VISIBLE);
                    break;
            }
        }
        else if (n == 20) {
            kakaoP20();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    k_img3.setVisibility(View.VISIBLE);
                    break;
            }
        }
        else if (n == 28) {
            kakao3();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
            }
        }
        else if (n == 29) {

            kakao4();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
            }

        }
        else if (n == 30) {
            kakao5();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    break;
                case 2  :
                    k_img2.setVisibility(View.VISIBLE);
                    break;
            }
        }
        else if (n == 31) {

            kakao6();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    k_img3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    k_img4.setVisibility(View.VISIBLE);
                    break;
            }

        }
        else if (n == 38) {

            kakao38();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    k_img3.setVisibility(View.VISIBLE);
                    break;
            }

        }
        else if (n == 39) {

            kakao39();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    k_img3.setVisibility(View.VISIBLE);
                    break;
            }

        }
        else if (n == 41) {
            kakao41();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    k_img3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    k_img4.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    k_img5.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    k_img6.setVisibility(View.VISIBLE);
                    break;
            }

        }
        else if (n == 42) {
            kakao42();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    k_img3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    k_img4.setVisibility(View.VISIBLE);
                    break;
            }

        }
        else if (n == 58) {
            kakao58();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    k_img3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    k_img4.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    k_img5.setVisibility(View.VISIBLE);
                    break;
            }

        }

    }

}
