package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class T1_text extends AppCompatActivity {

    //////////////레이아웃 요소/////////////////////////////////////////////////////////////////////////
    ImageButton next;ImageButton back;ImageButton ending;ImageButton now;ImageButton skip;

    TextView otv1;TextView otv2;TextView otv3;
    ////////////////////////필요 객체////////////////////////////////////////////////////////////

    int changeCode;
    int getPage ;int getViewNum;

    String l; String f;
    int recentPage;// 최근 페이지.
    mySharedPreferences sf; Intent i1; int restart;

    int n; int p=0; int c=0; int a;// paragraph 조정. 나누기 3 --> 나머지 1=001/ 2 = 002/ 3= 003
    StartStory startStory;
    MusicActivity mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_text);

        initializeVIew();

        getData();

        startStory = new StartStory();
        startStory.getONE(otv1,otv2,otv3/*,l ,f*/ );

        nextOnClick();// 다음 누르면 이야기 전개됨

        btnClick();
    }


    public void initializeVIew() {
        otv1 = findViewById(R.id.t1_o_tv1);
        otv2 = findViewById(R.id.t1_o_tv2);
        otv3 = findViewById(R.id.t1_o_tv3);
        now = findViewById(R.id.now);
        skip = findViewById(R.id.skip);


        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);
        mediaPlayer = Application.getMusicActivity();
        System.out.println("initializeVIew!!!!!!!!!!!!!!!!!!!!!1");

        startStory.setViewNum(1);

    }
    public void getData() {

        i1 = getIntent();//second 에서 받아옴.
         l =  Application.getL();
         f =  Application.getF();
        System.out.println("TExtL ================== "+l + "\n2 F = "+ f+"\n");
        restart = i1.getIntExtra("Restart",1);//1 --> 기본/ 2 --> 이어하기
        getPage = i1.getIntExtra("getPage",0);


        System.out.println("RESTART " + restart);

        if(restart==1){//false
            n = i1.getIntExtra("n",7);
            System.out.println("재시작합니다.");
        }else if(restart==2){
            n=getPage;
            System.out.println("getPage ===="+getPage+"n ====="+n);
            restart=1;
        }

/*        changeCode = i1.getExtras().getInt("changeCode");//:: 단위.
        System.out.println("changeCode ========= "+changeCode);*/
        // 첫 시작 시 secondPage 화면에서 코드 넘어옴.
        //1 : activity_t1_text, 2 : activity_t1_txt_img , 3 : activity_t1_choice


    }

    public void initializeLayout() {
        switch (changeCode) {
            case 2:
                Intent i2 = new Intent(T1_text.this, T1_text_image.class);
                i2.putExtra("n",n);
                i2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i2);
                finish();
                break;
            case 3:
                Intent i3 = new Intent(T1_text.this, T1_choice.class);
                i3.putExtra("n",n);
                i3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i3);
                finish();
                break;
            case 4://카카오톡 필요.
                Intent i4 = new Intent(T1_text.this,T1_kakao.class);
                i4.putExtra("n",n);
                i4.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i4);
                finish();
                break;
            case 5 :
                Intent i0 = new Intent(T1_text.this,Success.class);
                i0.putExtra("page",n);
                i0.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i0);
                finish();
                break;
            case 6 :
                Intent i6 = new Intent(T1_text.this,Fine.class);
                i6.putExtra("page",n);
                i6.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i6);
                finish();
                break;
            default: //아무것도 안함.
        }
    }

    public void btnClick() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(T1_text.this, MainActivity.class);
                StartStory.getPage();
                StartStory.getViewNum();
                startActivity(i);
                mediaPlayer.stopMusic();
                finish();

            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_text.this, Endings.class);
                startActivity(intent);

            }
        });
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_text.this,Now.class);
                intent.putExtra("page",StartStory.getPage());
                System.out.println("page ========"+StartStory.getPage());
                startActivity(intent);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(T1_text.this, Skip_popup.class);
                //팝업--> 현재 보유개수. 사용/구매버튼.
                startActivity(i);
            }
        });
    }
    public void Nis(){
        if(n==7){
            a = 4;
        }if(n==34){
            a = 2;
        }if(n==35){
            a=3;
        }
        if (n == 37) {
            a = 2;
        }if(n==59){
            a = 3;
        }if(n==63){
            a = 7;
        }
        if(n==64){
            a = 6;
        }
        if(n==65){
            a = 3;
        }
        if(n==68){  /////새로 추가.
            a = 4;
        }
        if(n==72){
            a = 4;
        }
        if(n==77){
            a = 2;
        }
        if(n==79){
            a = 4;
        }
        if(n==80){
            a = 3;
        }
        if(n==82){
            a = 4;
        }
        if(n==94){
            a = 4;
        }
        if(n ==99){
            a =4;
        }
        if(n ==105){
            a =4;
        }
        if(n ==111){
            a =3;
        }
        if(n ==112){
            a =3;
        }
        if(n ==113){
            a =3;
        }
        if(n ==114){
            a =3;
        }
        if(n ==115){
            a =3;
        }
        if(n ==115){
            a =3;
        }
        if(n ==118){
            a =5;
        }
        if(n ==119){
            a =6;
        }
        if(n ==128){
            a =4;
        }
        if(n ==129){
            a =7;
        }
        if(n ==140){
            a =7;
        }
        if(n ==146){
            a =7;
        }
        if(n ==147){
            a =7;
        }
        if(n ==148){
            a =4;
        }
        if(n ==149){
            a =4;
        }
        if(n ==150){
            a =4;
        }
        if(n ==151){
            a =5;
        }
        if(n ==152){
            a =4;
        }
        if(n ==153){
            a =3;
        }
        if(n ==167){
            a =3;
        }
        if(n ==168){
            a =5;
        }
        if(n ==182){
            a =6;
        }
        if(n ==183){
            a =5;
        }
        if(n ==184){
            a =7;
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
        startStory.setStory(1,n,p);

        if(p==a){// codeChange 메소드.
            if(n==149){
                n=152;
            }else {
                n++;
            }
            c=0;
            changeCode=startStory.changeCode;
            System.out.println("changeCode ============="+changeCode);
        }

        initializeLayout();
    }

    public void nextOnClick(){

        View.OnClickListener nextOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //n 은 장 수 --> 7로 유지되야함. 123 이 끝날때 까지.
                c++;
                Nis();
                PageIs(a);
            }
        };
        next.setOnClickListener(nextOnClickListener);

    }


    @Override
    public void onBackPressed() {
        Intent ib = new Intent(T1_text.this, MainActivity.class);
        StartStory.getPage();
        StartStory.getViewNum();
        mediaPlayer.stopMusic();
       // setShared();
        System.out.println("PAGE 1 ============" +StartStory.getPage());
        System.out.println("VIewNUM 1 ============" +StartStory.getViewNum());
        startActivity(ib);
        finish();


    }
    public void setShared(){
        Application.msf.setInt(getApplicationContext(),"page",StartStory.getPage());
        Application.msf.setInt(getApplicationContext(),"view",StartStory.getViewNum());
    }
}
