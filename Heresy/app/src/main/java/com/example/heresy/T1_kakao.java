package com.example.heresy;

import androidx.annotation.Nullable;
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
import android.widget.Toast;

import org.w3c.dom.Text;

public class T1_kakao extends AppCompatActivity {
    //프레임 레이아웃은 갈아끼는 방식으로. 매번. 어쩔 수 없다.
    ImageButton back; ImageButton next; ImageButton ending;ImageButton now;ImageButton skip; TextView skipT;

    TextView k_tv1;TextView k_tv2; TextView k_tv3;
    LinearLayout k_view; TextView kao1; TextView kao2;

    ImageView k_img1; ImageView k_img2;ImageView k_img3;ImageView k_img4; ImageView k_img5;ImageView k_img6;
    Intent i;

    int changeCode;
    String f; String l; int restart;

    StartStory startStory4;
    int c=0; int p=0; int n; int a ; // Nis 에 사용. Page 설정.
    int getPage; int getViewNum;

    LayoutInflater layoutInflater;
    MusicActivity mediaPlayer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_kakao);

        getData();

        initializeView();
        initializeLayout();

        startStory4 = new StartStory();
        startStory4.getFOUR(k_tv1,k_tv2,k_tv3,k_view,kao1,kao2 );
        nextOnClick();




        btnClick();
    }

    public void getData(){
        i = getIntent();
        l = Application.getL();
        f = Application.getF();

        restart = i.getIntExtra("Restart",1);//1 --> 기본/ 2 --> 이어하기
        getPage = i.getIntExtra("getPage",0);

        System.out.println("RESTART " + restart);

        if(restart==1){//false
            n = i.getIntExtra("n",8);
            System.out.println("재시작합니다.");
        }else if(restart==2){
            n=getPage;
            System.out.println("getPage ===="+getPage+"n ====="+n);
            restart=1;
        }
        System.out.println("kakaoFL ================== "+i.getStringExtra("firstName") + "\n2 L = "+i.getStringExtra("lastName")+"\n");


    }



    public void initializeView(){

        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);
        now = findViewById(R.id.now);
        skip = findViewById(R.id.skip);

        k_tv1 = findViewById(R.id.t1_k_tv1);
        k_tv2 = findViewById(R.id.t1_k_tv2);
        k_tv3 = findViewById(R.id.t1_k_tv3);

        k_view = findViewById(R.id.k_include);
        mediaPlayer = Application.getMusicActivity();

      //  startStory4.setViewNum(4);
        System.out.println("initializeVIew!!!!!!!!!!!!!!!!!!!!!1");
    }

    public void initializeLayout() {
        switch (changeCode) {
            case 1:
                Intent i1 = new Intent(T1_kakao.this, T1_text.class);
                i1.putExtra("n",n);
                i1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i1);
                finish();
                break;
            case 2:
                Intent i2 = new Intent(T1_kakao.this, T1_text_image.class);
                i2.putExtra("n",n);
                i2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i2);
                finish();
                break;
            case 3:
                Intent i3 = new Intent(T1_kakao.this, T1_choice.class);
                i3.putExtra("n",n);
                i3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i3);
                finish();
                break;
            case 5 :
                Intent i0 = new Intent(T1_kakao.this,Success.class);
                i0.putExtra("page",n);
                i0.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
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
                StartStory.getPage();
                StartStory.getViewNum();
                if(mediaPlayer!=null){mediaPlayer.stopMusic();}
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
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

        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_kakao.this,Now.class);
                intent.putExtra("page",StartStory.getPage());
                startActivity(intent);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(T1_kakao.this, Skip_popup.class);
                //팝업--> 현재 보유개수. 사용/구매버튼.
                i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(i);
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
        if(n==28){//+1; d왜? 뷰 지우려고.
            a=6;
        }
        if(n==29){
            a=8;
        }if(n==30){
            a=3;
        }
        if(n==31){
            a=6;
        }
        if(n==38){  // 여기도 아마 +1 해야할 듯..
            a=4;
        }
        if(n == 39){
            a = 4;
        }
        if(n == 41){
            a = 8;
        }
        if(n==42){
            a = 5;
        }
        if(n==58){
            a = 6;
        }
        if(n==110){
            a = 4;
        }
        if(n==122){
            a = 4;
        }
        if(n==123){
            a = 4;
        }
        if(n==124){
            a = 4;
        }
        if(n==179){
            a = 7;
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
                System.out.println(getPage+"---------page-------------");
                System.out.println(n+"--------n--------------");

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
        kao1 = findViewById(R.id.kao_tv1);

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

        kao1 = findViewById(R.id.kao_tv1);
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
        kao1=findViewById(R.id.kao_tv1);
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

        kao1= findViewById(R.id.kao_tv1);
    }
    public void kakao39(){
        layoutInflater.inflate(R.layout.kakotalk39, k_view,true);

        k_img1 = findViewById(R.id.kakao39_h1);
        k_img2 = findViewById(R.id.kakao39_m1);
        k_img3 = findViewById(R.id.kakao39_m2);

        kao1 = findViewById(R.id.kao_tv1);
    }
    public void kakao41(){
        layoutInflater.inflate(R.layout.kakotalk41, k_view,true);

        k_img1 = findViewById(R.id.kakao41_h1);
        k_img2 = findViewById(R.id.kakao41_h2);
        k_img3 = findViewById(R.id.kakao41_h3);
        k_img4 = findViewById(R.id.kakao41_h4);
        k_img5 = findViewById(R.id.kakao41_m1);
        k_img6 = findViewById(R.id.kakao41_m2);

        kao1=findViewById(R.id.kao_tv1);

    }
    public void kakao42(){
        layoutInflater.inflate(R.layout.kakotalk42, k_view,true);

        k_img1 = findViewById(R.id.kakao42_h1);
        k_img2 = findViewById(R.id.kakao42_h2);
        k_img3 = findViewById(R.id.kakao42_m1);
        k_img4 = findViewById(R.id.kakao42_h3);

        kao1 = findViewById(R.id.kao_tv1);
    }
    public void kakao58(){
        layoutInflater.inflate(R.layout.kakotalk58, k_view,true);

        k_img1 = findViewById(R.id.kakao58_m1);
        k_img2 = findViewById(R.id.kakao58_h1);
        k_img3 = findViewById(R.id.kakao58_h2);
        k_img4 = findViewById(R.id.kakao58_m2);
        k_img5 = findViewById(R.id.kakao58_h3);

        kao1 =findViewById(R.id.kao_tv1);
    }
    public void kakao110(){
        layoutInflater.inflate(R.layout.kakotalk110, k_view,true);

        k_img1 = findViewById(R.id.kakao110_h1);
        k_img2 = findViewById(R.id.kakao110_m1);
    }

    public void kakao122(){
        layoutInflater.inflate(R.layout.kakotalk122, k_view,true);

        k_img1 = findViewById(R.id.kakao112_m1);
        k_img2 = findViewById(R.id.kakao112_h1);
        k_img3 = findViewById(R.id.kakao112_m2);
        k_img4 = findViewById(R.id.kakao112_h2);
    }
    public void kakao123(){
        layoutInflater.inflate(R.layout.kakotalk123, k_view,true);

        k_img1 = findViewById(R.id.kakao113_m1);
        k_img2 = findViewById(R.id.kakao113_h1);
        k_img3 = findViewById(R.id.kakao113_m2);
        k_img4 = findViewById(R.id.kakao113_h2);
    }
    public void kakao124(){
        layoutInflater.inflate(R.layout.kakotalk124, k_view,true);

        k_img1 = findViewById(R.id.kakao124_m1);
        k_img2 = findViewById(R.id.kakao124__h1);
        k_img3 = findViewById(R.id.kakao124_m2);
    }
    public void kakao179(){
        layoutInflater.inflate(R.layout.kakotalk179, k_view,true);

        k_img1 = findViewById(R.id.kakao179_h1);
        k_img2 = findViewById(R.id.kakao179_h2);
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
                    kao1.setText(f+" 뭐해");
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
                    kao1.setText(f);kao1.append(" 오늘 뭐해?");
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
                case 1:k_tv1.setText("");
                    k_view.setVisibility(View.VISIBLE);
                    kao1.setText("[만남 결과 보고]\n" +
                            "인도자 : 송가진\n" +
                            "대상자 :  ");kao1.append(l+f);
                            kao1.append("\n" +
                            "협력자 : 최상담\n");
                    break;
                case 2  :
                    k_img2.setVisibility(View.VISIBLE);
                    break;
            }
        }
        else if (n == 31) {

            kakao6();
            switch (kakao) {
                case 1:k_tv1.setText("");
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
                    kao1.setText(f);kao1.append("!! \n오늘도 화이팅!");
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
                    kao1.setText(f+"아~ 항상 \n 너를 위해 기도해~");
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
                    kao1.setText(f);
                    kao1.append("아 오늘 꿈에 \n너가 나왔다.");
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
                    kao1.setText("너는 잘 모를 수도 있지만\n 영적으로 튼튼해야 모든 일이\n 잘 풀릴 수 있어.");
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
                    kao1.setText("뭐하냐");kao1.append(l+f);kao1.append("~~~ 얘 어떡함 ;;; \n빨리 나오셈;;");
                    break;
            }

        }
        else if (n == 110) {
            kakao110();
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
        else if (n == 122) {
            kakao122();
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
        else if (n == 123) {
            kakao123();
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
        else if (n == 124) {
            kakao124();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img2.setVisibility(View.VISIBLE);
                    break;
                case 3 : k_img3.setVisibility(View.VISIBLE);
                break;
            }

        }
        else if (n == 179) {
            kakao179();
            switch (kakao) {
                case 1:
                    k_view.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    k_img1.setVisibility(View.VISIBLE);
                    break;
                case 3 : k_img2.setVisibility(View.VISIBLE);
                    break;
            }

        }



    }
    @Override
    public void onBackPressed() {

        Intent i = new Intent(T1_kakao.this,MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

         StartStory.getViewNum();
         StartStory.getPage();
         if(mediaPlayer!=null) {
             mediaPlayer.stopMusic();
         }
       // setShared();
        System.out.println("PAGE 4 ============" +StartStory.getViewNum());
        System.out.println("VIewNUM 4 ============" +StartStory.getPage());
        startActivity(i);
        finish();


    }



}
