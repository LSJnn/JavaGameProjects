package com.example.heresy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class T1_text_image extends AppCompatActivity {

    ImageButton next;ImageButton back;ImageButton ending;ImageButton now;ImageButton skip;

    ImageView ti_img1;
    TextView ti_tv1;TextView ti_tv2;TextView ti_tv3;TextView ti_tv4;

    int changeCode;

    StartStory startStory2;
    Intent i;
    int getPage;

    int c=0;int p=0; int n; int a;
    int restart;
    MusicActivity mediaPlayer = Application.getMusicActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_txt_img);

        i = getIntent();
        initializeView();
        startStory2.getTWO(ti_img1,ti_tv1,ti_tv2,ti_tv3,ti_tv4);


        restart = i.getIntExtra("Restart",1);//1 --> 기본/ 2 --> 이어하기
        getPage = i.getIntExtra("getPage",0);


        System.out.println("RESTART " + restart);

        if(restart==1){//false
            n = i.getIntExtra("n",11);
            System.out.println("재시작합니다.");
        }else if(restart==2){
            n=getPage;
            System.out.println("getPage ===="+getPage+"n ====="+n);
            restart=1;

        }


        System.out.println("N = "+n);


        nextOnClick();


        btnClick();
    }

    public void initializeView(){
        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);
        now = findViewById(R.id.now);
        skip= findViewById(R.id.skip);

        ti_img1 = findViewById(R.id.t1_ti_img1);
        ti_tv1 = findViewById(R.id.t1_tl_tv1);
        ti_tv2 = findViewById(R.id.t1_ti_tv2);
        ti_tv3 = findViewById(R.id.t1_ti_tv3);
        ti_tv4 = findViewById(R.id.t1_ti_tv4);

        StartStory.setViewNum(2);

    }

    public void Nis(){
        if(n==11){
            a = 2;
        }else if(n==12){
            a = 3;
        }else if(n==13){
            a = 3;
        }else if(n==14){
            a = 4;
        }else if(n==15){
            a=7;
        }else if(n==16){
            a=5;
        }else if(n==17){
            a=3;
        }else if(n==18){
            a=2;
        }else if(n==19){
            a=4;
        }
        else if(n==21){
            a=2;
        }else if(n==22){
            a=3;
        }else if(n==23){
            a=2;
        }else if(n==24){
            a=3;
        }else if(n==25){
            a=2;
        }else if(n==27){
            a=3;
        }
        else if(n==32){
            a=2;
        }else if(n==33){
            a=3;
        }else if(n ==36){
            a = 4;
        }else if(n ==40){
            a = 5;
        }
        else if(n ==43){
            a = 5;
        }else if(n ==44){
            a = 4;
        }else if( n ==46){
            a = 4;
        }
        else if( n ==48){
            a = 3;
        }
        else if( n == 49){
            a = 2;
        }
        else if( n ==50){
            a = 2;
        }
        else if( n ==51){
            a = 3;
        }
        else if( n ==52){
            a = 3;
        }
        else if( n ==53){
            a = 4;
        }
        else if( n ==54){
            a = 4;
        }
        else if( n ==56){
            a = 6;
        }
        else if( n ==57){
            a = 4;
        }
        else if( n ==60){
            a = 2;
        }
        else if( n ==61){
            a = 5;
        }
        else if( n ==67){
            a = 5;
        }
        else if( n ==69){
            a =6;
        }
        else if( n ==71){
            a = 5;
        }
        else if( n ==73){
            a = 2;
        }
        else if( n ==75){
            a = 5;
        }
        else if( n ==76){
            a = 5;
        }
        else if( n ==81){
            a = 6;
        }
        else if( n ==83){
            a = 3;
        }
        else if( n ==84){
            a = 3;
        }
        else if( n ==85){
            a = 4;
        }
        else if( n ==86){
            a = 3;
        }
        else if( n ==87){
            a = 5;
        }
        else if( n ==88){
            a = 7;
        }
        else if( n ==90){
            a = 3;
        }
        else if( n ==91){
            a = 5;
        }
        else if( n ==92){
            a = 4;
        }
        else if( n ==93){
            a = 6;
        }
        else if( n ==95){
            a = 3;
        }
        else if( n ==96){
            a = 4;
        }
        else if( n ==97){
            a = 4;
        }
        else if( n ==98){
            a = 6;
        }
        else if( n ==101){
            a = 5;
        }
        else if( n ==102){
            a = 5;
        }
        else if( n ==104){
            a = 4;
        }
        else if( n ==106){
            a = 3;
        }
        else if( n ==107){
            a = 3;
        }
        else if( n ==108){
            a = 5;
        }
        else if( n ==109){
            a = 5;
        }
        else if( n ==120){
            a = 5;
        }
        else if( n ==121){
            a = 6;
        }
        else if( n ==125){
            a = 6;
        }
        else if( n ==126){
            a = 6;
        }
        else if( n ==127){
            a = 4;
        }
        else if( n ==128){
            a = 7;
        }
        else if( n ==131){
            a = 5;
        }
        else if( n ==132){
            a = 3;
        }
        else if( n ==133){
            a = 3;
        }
        else if( n ==134){
            a = 4;
        }
        else if( n ==135){
            a = 3;
        }
        else if( n ==136){
            a = 5;
        }
        else if( n ==137){
            a = 3;
        }
        else if( n ==138){
            a = 3;
        }
        else if( n ==139){
            a = 5;
        }
        else if( n ==141){
            a = 4;
        }
        else if( n ==142){
            a = 4;
        }
        else if( n ==143){
            a = 4;
        }
        else if( n ==144){
            a = 4;
        }
        else if( n ==145){
            a = 7;
        }
        else if( n ==154){
            a = 5;
        }
        else if( n ==155){
            a = 4;
        }
        else if( n ==156){
            a = 5;
        }
        else if( n ==157){
            a = 5;
        }
        else if( n ==158){
            a = 4;
        }
        else if( n ==159){
            a = 5;
        }
        else if( n ==160){
            a = 4;
        }
        else if( n ==161){
            a = 4;
        }
        else if( n ==162){
            a = 6;
        }
        else if( n ==163){
            a = 5;
        }
        else if( n ==165){
            a = 4;
        }
        else if( n ==166){
            a = 6;
        }
        else if( n ==169){
            a = 4;
        }
        else if( n ==170){
            a = 5;
        }
        else if( n ==171){
            a = 3;
        }
        else if( n ==172){
            a = 3;
        }
        else if( n ==173){
            a = 3;
        }
        else if( n ==174){
            a = 3;
        }
        else if( n ==175){
            a = 5;
        }
        else if( n ==176){
            a = 3;
        }
        else if( n ==177){
            a = 3;
        }
        else if( n ==178){
            a = 3;
        }
        else if( n ==180){
            a = 3;
        }
        else if( n ==181){
            a = 9;
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
        startStory2.setStory(2,n,p);

        if(p==a){// codeChange 메소드.
            if (n == 49) { // 유교-친구따라
                n =52;
            }else if(n==50){// 불교 -- 따라가기
                n=52;
            }else if(n==90){
                mediaPlayer.stopMusic();
                mediaPlayer.playBgSleep();
                n++;
            }else if(n ==95&&Application.isZ()==true){
                //먹으면.
                mediaPlayer.stopMusic();
                mediaPlayer.playBgSome();
                n++;
            }
            else if(n==109&&Application.isZ()==false){//안먹으면 131로
                n=131;//109페이지. 먹으면 그냥 그대로
                // .
            }
            else{  // 성경 + 일반.
                n++;
            }
            c=0;
            changeCode=startStory2.changeCode;
            System.out.println("changeCode ============="+changeCode);
            initializeLayout();

        }
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

    public void initializeLayout() {
        switch (changeCode) {
            case 1:
                Intent i1 = new Intent(T1_text_image.this, T1_text.class);
                i1.putExtra("n",n);
                i1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i1);
                finish();
                break;
            case 2:
                Intent i2 = new Intent(T1_text_image.this, T1_text_image.class);
                i2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                i2.putExtra("n",n);
                startActivity(i2);
                finish();
                break;
            case 3:
                Intent i3 = new Intent(T1_text_image.this, T1_choice.class);
                i3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                i3.putExtra("n",n);
                startActivity(i3);
                finish();
                break;
            case 4://카카오톡 필요.
                Intent i4 = new Intent(T1_text_image.this,T1_kakao.class);
                i4.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                i4.putExtra("n",n);
                startActivity(i4);
                finish();
                break;
            case 5 :
                Intent i0 = new Intent(T1_text_image.this,Success.class);
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
                Intent i = new Intent(T1_text_image.this, MainActivity.class);
                StartStory.getPage();
                StartStory.getViewNum();
                mediaPlayer.stopMusic();
                startActivity(i);
                finish();

            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(T1_text_image.this, Skip_popup.class);
                //팝업--> 현재 보유개수. 사용/구매버튼.
                startActivity(i);
            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_text_image.this, Endings.class);
                startActivity(intent);

            }
        });

        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_text_image.this,Now.class);
                intent.putExtra("page",StartStory.getPage());
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(T1_text_image.this,MainActivity.class);

        StartStory.getPage();
        StartStory.getViewNum();
        mediaPlayer.stopMusic();

        System.out.println("PAGE 2 ============" +StartStory.getPage());
        System.out.println("VIewNUM 2 ============" +StartStory.getViewNum());
        //setShared();

        startActivity(i);
        finish();

    }

    public void setShared(){
        Application.msf.setInt(getApplicationContext(),"page",StartStory.getPage());
        Application.msf.setInt(getApplicationContext(),"view",StartStory.getViewNum());
    }



}
