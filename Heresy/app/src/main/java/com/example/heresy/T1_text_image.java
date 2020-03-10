package com.example.heresy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class T1_text_image extends AppCompatActivity {

    ImageButton next;ImageButton back;ImageButton ending;

    ImageView ti_img1;
    TextView ti_tv1;TextView ti_tv2;TextView ti_tv3;TextView ti_tv4;

    int changeCode;
    String L; String F;
    StartStory startStory2;
    Intent i;

    int c=0;int p=0; static int n; int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_txt_img);

        initializeView();

        i = getIntent();
        F = i.getStringExtra("firstName");
        L = i.getStringExtra("lastName");
        System.out.println("2FL ================== "+i.getStringExtra("firstName") + "\n2 L = "+i.getStringExtra("lastName")+"\n");
        n = i.getIntExtra("n",11);
        System.out.println("N = "+n);

        startStory2 = new StartStory();
        startStory2.getTWO(ti_img1,ti_tv1,ti_tv2,ti_tv3,ti_tv4,L,F);

        nextOnClick();


        btnClick();
    }

    public void initializeView(){
        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);

        ti_img1 = findViewById(R.id.t1_ti_img1);
        ti_tv1 = findViewById(R.id.t1_tl_tv1);
        ti_tv2 = findViewById(R.id.t1_ti_tv2);
        ti_tv3 = findViewById(R.id.t1_ti_tv3);
        ti_tv4 = findViewById(R.id.t1_ti_tv4);
    }

    public void Nis(){
        if(n==11){
            a = 3;
        }else if(n==12){
            a = 3;
        }else if(n==13){
            a = 3;
        }else if(n==14){
            a = 4;
        }else if(n==15){
            a=6;
        }else if(n==16){
            a=4;
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
            a = 3;
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
        else if( n ==66){
            a = 3;
        }
        else if( n ==68){
            a = 5;
        }
        else if( n ==70){
            a = 5;
        }
        else if( n ==72){
            a = 5;
        }
        else if( n ==75){
            a = 5;
        }
        else if( n ==76){
            a = 6;
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
            a = 4;
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
        else if( n ==96){
            a = 4;
        }
        else if( n ==97){
            a = 5;
        }
        else if( n ==98){
            a = 5;
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
            }else{  // 성경 + 일반.
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
                i1.putExtra("firstName", i.getStringExtra("firstName"));
                i1.putExtra("lastName",i.getStringExtra("latName"));
                startActivity(i1);
                finish();
                break;
            case 2:
                Intent i2 = new Intent(T1_text_image.this, T1_text_image.class);
                i2.putExtra("firstName", i.getStringExtra("firstName"));
                i2.putExtra("lastName",i.getStringExtra("lastName"));
                i2.putExtra("n",n);
                startActivity(i2);
                finish();
                break;
            case 3:
                Intent i3 = new Intent(T1_text_image.this, T1_choice.class);
                i3.putExtra("firstName", i.getStringExtra("firstName"));
                i3.putExtra("lastName",i.getStringExtra("lastName"));
                i3.putExtra("n",n);
                startActivity(i3);
                finish();
                break;
            case 4://카카오톡 필요.
                Intent i4 = new Intent(T1_text_image.this,T1_kakao.class);
                i4.putExtra("firstName", i.getStringExtra("firstName"));
                i4.putExtra("lastName",i.getStringExtra("lastName"));
                i4.putExtra("n",n);
                startActivity(i4);
                finish();
                break;
            case 5 :
                Intent i0 = new Intent(T1_text_image.this,Success.class);
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
                Intent i = new Intent(T1_text_image.this, MainActivity.class);
                finish();

            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_text_image.this, Endings.class);
                startActivity(intent);

            }
        });
    }



}
