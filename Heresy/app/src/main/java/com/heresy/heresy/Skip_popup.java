package com.heresy.heresy;

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
    public static int adchange;
    int home;

    private static int USE_CODE = 11111;
    private static int BUY_CODE = 11121;

    StartStory startStory;
    MusicActivity mediaPlayer;

    Intent get;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip_popup);

        get = getIntent();//들어옴.
        startStory = new StartStory();
        skip=Application.getSavePageDB().getInt("skip");
        ad=Application.getSavePageDB().getInt("ad");
        mediaPlayer=Application.getMusicActivity();

        own = findViewById(R.id.tvOwn);
        own2 = findViewById(R.id.tvOwn2);
        //기본적으로 0. --> 데이터 보존.
        use = findViewById(R.id.use);
        buy = findViewById(R.id.buy);
        exit = findViewById(R.id.exit);
        home=0;

        clicks();

        own.setText(skip + "장");
        own2.setText(ad+"장");


    }

    public void clicks() {
        use.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skip = Application.getSavePageDB().getInt("skip");  // 결과보고 와서 다시 새로고침. 느낌.
                if (skip < 1) {// 0.2 고려.1보다 작아야만 사용가능.
                    Intent no = new Intent(getApplicationContext(), Dialouge_Own_zero.class);
                    home=1;
                    startActivity(no);
                } else {
                    //1개 빼기.//다이얼로그..? 지금 사용하시겠습니까
                    Intent use_now = new Intent(getApplicationContext(), Dialouge_Use.class);
                    home=1;
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
                home=1;

                //finish 안함. ?? 다시 돌아와서 보유개수확인.
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent();
                finish();
                home=1;
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        System.out.println("RESULTCODE="+resultCode);

        if(requestCode==USE_CODE){
            if(resultCode==-1){
                skipAction();
            }
        }

            skip = Application.getSavePageDB().getInt("skip");
            ad = Application.getSavePageDB().getInt("ad");
            System.out.println("skip ====" + skip);
            System.out.println("ad ====" + ad);

            if (ad == 5) {
                Toast.makeText(getApplicationContext(),"광고 티켓 5장이 스킵권 1장으로 변경되었습니다.",Toast.LENGTH_SHORT).show();
                Application.getSavePageDB().putInt("skip", skip + 1);
                Application.getSavePageDB().putInt("ad", 0);
            }

            System.out.println("디비 저장" + Application.getSavePageDB().getInt("skip"));
            own.setText(Application.getSavePageDB().getInt("skip") + " 장");
            own2.setText(Application.getSavePageDB().getInt("ad") + " 장");



    }


    public void setnChange(int requestCode,int resultCode) {

        if (requestCode == USE_CODE) {
            switch (resultCode) {
                case -1:
                    skipAction();
                    break;
                case 0:
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
                default://무료.//안삼.
                    pChange = 0;
            }
        }else{
            System.out.println("not BUYING");
            pChange = 0;
        }

    }

    public void skipAction(){
        System.out.println("getVuew"+ StartStory.getPage());
      if(7<=StartStory.getPage()&&StartStory.getPage()<9) {
          intentDO(9);
      }
      else if(10<=StartStory.getPage()&&StartStory.getPage()<=25) {
        //  Intent skip2 = new Intent(getApplicationContext(),T1_choice.class);
           intentDO(26);

      }
      else if(27<=StartStory.getPage()&&StartStory.getPage()<=35) {
          intentEnding(35);
      }
      else if(36<=StartStory.getPage()&&StartStory.getPage()<=44) {
          intentDO(45);
      }
      else if(46==StartStory.getPage()) {
          intentDO(47);
      }else if(48==StartStory.getPage()){
          intentEnding(48);
      }
      else if(48<StartStory.getPage()&&StartStory.getPage()<=54) {
          intentDO(55);
      }
      else if(56<=StartStory.getPage()&&StartStory.getPage()<=59){
          intentEnding(59);
      }
      else if(60<=StartStory.getPage()&&StartStory.getPage()<=61) {
          intentDO(62);
      }
      else if(63==StartStory.getPage()){
          intentEnding(63);
      }
      else if(64<=StartStory.getPage()&&StartStory.getPage()<=65) {
          intentDO(66);
      }
      else if(67<=StartStory.getPage()&&StartStory.getPage()<=68){
          intentEnding(68);
      }
      else if(69==StartStory.getPage()) {
          intentDO(70);
      }
      else if(71<=StartStory.getPage()&&StartStory.getPage()<=72){
          intentEnding(72);
      }
      else if(73==StartStory.getPage()){
          intentDO(74);
      }
      else if(75<=StartStory.getPage()&&StartStory.getPage()<=76){
          intentEnding(76);
      }
      else if(77==StartStory.getPage()) {
          intentDO(78);
      }
      else if(79==StartStory.getPage()){
          intentEnding(79);
      }
      else if(80<=StartStory.getPage()&&StartStory.getPage()<=88) {
          intentDO(89);
      }
      else if(90<=StartStory.getPage()&&StartStory.getPage()<=99) {
          intentDO(100);
      }
      else if(101<=StartStory.getPage()&&StartStory.getPage()<=103){
          intentEnding(103);
      }
      else if(104<=StartStory.getPage()&&StartStory.getPage()<=109) {
          if(Application.isZ()==true){
              intentDO(110);
          }else{
              intentDO(131);
          }
      }else if(110<=StartStory.getPage()&&StartStory.getPage()<=116){
          intentDO(117);
      }
      else if(118==StartStory.getPage()){
          intentEnding(118);
      }
      else if(119 <= StartStory.getPage()&&StartStory.getPage()<=130){
          intentEnding(130);
      }
      else if (131<=StartStory.getPage()&&StartStory.getPage()<=146) {
          intentDO(147);
      }
      else if(148<=StartStory.getPage()&&StartStory.getPage()<=151) {
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_LONG).show();
          nChange = 0;
      }
      else if(152<=StartStory.getPage()&&StartStory.getPage()<=163) {
          intentDO(164);
      }
      else if(165<=StartStory.getPage()&&StartStory.getPage()<=168) {
          Toast.makeText(getApplicationContext(), "엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_LONG).show();
          nChange = 0;
      }
      else if(169<=StartStory.getPage()&&StartStory.getPage()<=176){
          intentDO(177);
      }else if(177<=startStory.getPage()&&StartStory.getPage()<=185){
          Toast.makeText(getApplicationContext(), "라스트 엔딩 지점입니다. 스킵이 불가합니다.", Toast.LENGTH_LONG).show();
          nChange=0;
      }
      else {
          //선택지 지점.(9/26/45/47/55/62/66/70/74/78/89/100/117/147/164).
          // 27-35(엔딩)48.(엔딩)56-59(엔딩) 63 67-68 71-72 75-76 79 90-94(짜장면) 101-103
          //118-130 148-151(탈출 ) 165-168
          Toast.makeText(getApplicationContext(), "선택 지점입니다. 스킵이 불가하니 선택해주십시오", Toast.LENGTH_LONG).show();
          nChange=0;
      }

        System.out.println("SkipgetVuew"+ StartStory.getPage());

    }
    public void intentDO(int a){

        finish();
        Intent skipp = new Intent(this,T1_choice.class);
        System.out.println("skip --> "+home);
        StartStory.setViewNum(3);
        skipp.putExtra("Restart",2);
        skipp.putExtra("getPage",a);
        skipp.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(skipp);

    }

    public void intentEnding(int a){
        finish();
        Intent ending = new Intent(this, Success.class);
        home=1;
        ending.putExtra("page",a);
        ending.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(ending);

    }

    @Override
    protected void onPause() {

        if(home==0) {
            if (mediaPlayer != null) {
                mediaPlayer.stopMusic();
            }
        }
        super.onPause();
    }

    @Override
    protected void onRestart() {
        if(mediaPlayer!=null) {
            startStory.music(StartStory.getPage());
        }
        super.onRestart();
    }
}