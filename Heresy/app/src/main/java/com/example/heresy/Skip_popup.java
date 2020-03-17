package com.example.heresy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Skip_popup extends AppCompatActivity {
    TextView own;TextView own2;
    ImageButton use;
    int nChange;  // 얘가 변화. 사용--> -1/ 사용안함 = 0;
    ImageButton buy;
    int pChange; // 구매 --> =1, 2,3
    ImageButton exit;
    int skip;
    int ad;
    int adchange;

    private static int USE_CODE = 11111;
    private static int BUY_CODE = 11121;

    StartStory startStory;

    Intent get;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip_popup);

        get = getIntent();//들어옴.
        startStory = new StartStory();
        skip=Application.getSavePageDB().getInt("skip");
        ad=Application.getSavePageDB().getInt("ad");

        own = findViewById(R.id.tvOwn);
        own2 = findViewById(R.id.tvOwn2);
        //기본적으로 0. --> 데이터 보존.
        use = findViewById(R.id.use);
        buy = findViewById(R.id.buy);
        exit = findViewById(R.id.exit);

        clicks();

        own.setText(skip + " 장");
        own2.setText(ad+" 장");


    }

    public void clicks() {
        use.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skip = Application.getSavePageDB().getInt("skip");  // 결과보고 와서 다시 새로고침. 느낌.
                if (skip < 1) {// 0.2 고려.1보다 작아야만 사용가능.
                    Intent no = new Intent(getApplicationContext(), Dialouge_Own_zero.class);
                    startActivity(no);
                } else {
                    //1개 빼기.//다이얼로그..? 지금 사용하시겠습니까
                    Intent use_now = new Intent(getApplicationContext(), Dialouge_Use.class);
                    startActivityForResult(use_now, USE_CODE);
                }
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buy = new Intent(getApplicationContext(), SkipPage.class);
                startActivityForResult(buy, BUY_CODE);
                startActivity(buy);

                //finish 안함. ?? 다시 돌아와서 보유개수확인.
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent();
                finish();
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        setnChange(requestCode, resultCode);
        setpChange(requestCode, resultCode);

        System.out.println("pChange ====" + pChange);
        System.out.println("\nnChange ====" + nChange);
        System.out.println("\nadchange ====" + adchange);

        if(nChange==-1){
        skipAction();
        }

        skip += (nChange + pChange);
        ad+=adchange;
        System.out.println("skip ====" + skip);
        System.out.println("ad ====" + ad);
        System.out.println("skip ====" + skip);

        if(ad==5){
            Application.getSavePageDB().putInt("skip",skip+1);
            ad=0;
            Application.getSavePageDB().putInt("ad",ad);
        }else {
            Application.getSavePageDB().putInt("skip", skip);//저장.
            Application.getSavePageDB().putInt("ad", ad);//저장.
        }

        System.out.println("디비 저장" + Application.getSavePageDB().getInt("skip"));
        own.setText(Application.getSavePageDB().getInt("skip") + " 장");
        own2.setText(Application.getSavePageDB().getInt("ad") + " 장");


    }


    public void setnChange(int requestCode,int resultCode) {

        if (requestCode == USE_CODE) {
            switch (resultCode) {
                case -1:
                    nChange = -1;
                    System.out.println("nChange ====" + nChange);
                    break;
                case 0:
                    nChange = 0;
                    System.out.println("사용안함.");
                    break;
            }
        }else{
            System.out.println("not USING");
            nChange = 0;
        }
    }

    public void setpChange(int requestCode, int resultCode) {

        if (requestCode == BUY_CODE) {
            switch (resultCode) {
                //구매//
                case 1:
                    pChange = 1;
                    System.out.println("pChange 1====" + pChange);
                    break;
                case 2:
                    pChange = 2;
                    System.out.println("pChange 2====" + pChange);
                    break;
                case 3:
                    pChange = 3;
                    System.out.println("pChange3 ====" + pChange);
                    break;
                case 4:
                    adchange = 1;
                    System.out.println("pChange =4===" + adchange);
                    break;
                default:
                    pChange = 0;
                    adchange =0;
            }
        }else{
            System.out.println("not BUYING");
            pChange = 0;
            adchange =0;
        }

    }

    public void skipAction(){
        System.out.println("getVuew"+ StartStory.getPage());
      if(7<=StartStory.getPage()&&StartStory.getPage()<9){
            startStory.setStory(3,9,0);//소개
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
          }
      else if(10<=StartStory.getPage()&&StartStory.getPage()<=25) {
          startStory.setStory(3, 26, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(27<=StartStory.getPage()&&StartStory.getPage()<=35) {
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if(36<=StartStory.getPage()&&StartStory.getPage()<=44) {
            startStory.setStory(3, 45, 0);//경전
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(46==StartStory.getPage()) {
          startStory.setStory(3, 47, 0);//친구따라
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(48<=StartStory.getPage()&&StartStory.getPage()<=54) {
          startStory.setStory(3, 55, 0);//지밀
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(56<=StartStory.getPage()&&StartStory.getPage()<=59){
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if(60<=StartStory.getPage()&&StartStory.getPage()<=61) {
          startStory.setStory(3, 62, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(63==StartStory.getPage()){
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if(64<=StartStory.getPage()&&StartStory.getPage()<=65) {
          startStory.setStory(3, 66, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(67<=StartStory.getPage()&&StartStory.getPage()<=68){
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if(69==StartStory.getPage()) {
          startStory.setStory(3, 70, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(71<=StartStory.getPage()&&StartStory.getPage()<=72){
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if(73==StartStory.getPage()){
          startStory.setStory(3, 74, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(75<=StartStory.getPage()&&StartStory.getPage()<=76){
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if(StartStory.getPage()<=77) {
          startStory.setStory(3, 78, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(79==StartStory.getPage()){
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if(80<=StartStory.getPage()&&StartStory.getPage()<=88) {
          startStory.setStory(3, 89, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(90<=StartStory.getPage()&&StartStory.getPage()<=94) {
          startStory.setStory(2, 95, 0);//짜장면 에피
          Intent skip = new Intent(getApplicationContext(),T1_text_image.class);
          startActivity(skip);
          finish();
      }
      else if(95<=StartStory.getPage()&&StartStory.getPage()<=99) {
          startStory.setStory(3, 100, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(101<=StartStory.getPage()&&StartStory.getPage()<=103){
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if(104<=StartStory.getPage()&&StartStory.getPage()<=116) {
          startStory.setStory(3, 117, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(118<=StartStory.getPage()&&StartStory.getPage()<=130){
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if (131<=StartStory.getPage()&&StartStory.getPage()<=146) {
          startStory.setStory(3, 147, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(148<=StartStory.getPage()&&StartStory.getPage()<=151) {
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if(152<=StartStory.getPage()&&StartStory.getPage()<=163) {
          startStory.setStory(3, 164, 0);//핸드폰
          Intent skip = new Intent(getApplicationContext(),T1_choice.class);
          startActivity(skip);
          finish();
      }
      else if(165<=StartStory.getPage()&&StartStory.getPage()<=168) {
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange = 1;
      }
      else if(169<=StartStory.getPage()&&StartStory.getPage()<=185){
          Toast.makeText(getApplicationContext(), "라스트 엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_SHORT).show();
          nChange=1;
      }
      else {
          //선택지 지점.(9/26/45/47/55/62/66/70/74/78/89/100/117/147/164).
          // 27-35(엔딩)48.(엔딩)56-59(엔딩) 63 67-68 71-72 75-76 79 90-94(짜장면) 101-103
          //118-130 148-151(탈출 ) 165-168
          Toast.makeText(getApplicationContext(), "선택 지점입니다. 스킵이 불가합니다.선택해주십시오", Toast.LENGTH_SHORT).show();
          nChange=1;
      }

        System.out.println("SkipgetVuew"+ StartStory.getPage());

    }

}