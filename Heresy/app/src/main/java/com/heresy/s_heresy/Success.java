package com.heresy.s_heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Success extends AppCompatActivity {

    public static final int ENTER = 201;

    ImageButton ending;ImageButton now;
    ImageView newEnding;
    ImageButton back; TextView successTv;
    int page;
    MusicActivity mediaPlayer = Application.getMusicActivity();
    StartStory startStory;
    int home;
    private InterstitialAd interstitialAd = new InterstitialAd(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 전면 광고.
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        //전면 광고 - succss 받아 오면.
        interstitialAd.setAdUnitId("ca-app-pub-6192078009124891/6240116628");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        setContentView(R.layout.activity_success);

////////////광고///////////////
        //배너.
        AdView success = findViewById(R.id.success_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        success.loadAd(adRequest);

        AdRequest request = new AdRequest.Builder().
                addTestDevice("CBE5FE34B8F07928C9ABB0CA996BDA98").build();

////////시작.
        Thread.setDefaultUncaughtExceptionHandler(new ErrorHandler(this));
        System.out.println("시작  전 :  " + Application.getSavePageDB().getInt("saveV"));
        initializeVIew();
        btnClick();

        Intent i = getIntent();
        page = i.getIntExtra("page",-1);
        System.out.println("시작  :  " + Application.getSavePageDB().getInt("saveV"));
        if(page == 169){
            successTv.setText(R.string.success);
        }

        // 엔딩으로 안 가져가도, 추가시킴.
        // page 이름으로 n 엔딩나와야할 페이지 받아오면, 리스트에 저장. 목록 생성.
        Application.getSavePageDB().getListInt("endingPages").add(page);
        System.out.println("page========"+page);
    }


    public void initializeVIew(){

        ending = findViewById(R.id.endingBtn);
        back = findViewById(R.id.backbtn);
        newEnding = findViewById(R.id.newEnding);
        now = findViewById(R.id.now);
        successTv = findViewById(R.id.tvSuccess);

        startStory=new StartStory();
        home=0;

    }

    public void btnClick() {

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAd();
                try {
                    interstitialAd.setAdListener(new AdListener() {
                        @Override
                        public void onAdClosed() {
                            super.onAdClosed();
                            toMain();
                        }

                        @Override
                        public void onAdFailedToLoad(int i) {
                            super.onAdFailedToLoad(i);
                            toMain();
                        }
                    });
                }catch(Exception e) {
                    e.printStackTrace();
                    toMain();
                }
            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Success.this, Endings.class);
                intent.putExtra("page",page);
                System.out.println("page ="+page);
                home=1;
                startActivityForResult(intent , ENTER);//

            }
        });

        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Success.this,Now.class);
                intent.putExtra("page",page-1);
                startActivity(intent);
                home=1;
            }
        });

    }
    public void setAd(){
        if(Application.getSavePageDB().getInt("saveV")==5||Application.getSavePageDB().getInt("saveV")==6) ;

                if (interstitialAd.isLoaded()) {
                    interstitialAd.show();
                } else {
                    System.out.println("ad 로드 실패");
                    Log.d("TAG", "로드 실패.");
                }

        }

    public void startBlink(){
        Animation startAnim = AnimationUtils.loadAnimation(getApplication(),R.anim.blink_anim);
        newEnding.startAnimation(startAnim);
    }


    @Override
    public void onBackPressed() {
        setAd();
        interstitialAd.setAdListener(new AdListener(){

            @Override
            public void onAdClosed() {
                super.onAdClosed();
                toMain();
            }

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
                toMain();
            }
        });

    }
    public void toMain(){
        Intent i = new Intent(Success.this, MainActivity.class);
        i.putExtra("page", page);
        home=0;
        Application.getSavePageDB().putInt("saveV",5);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }


    @Override
    protected void onPause() {
        //액티비티가 다른데로 넘어갈때 - 다이얼로그 / 다른 뷰로.
        //홈으로 갈떄 --> 이때만 음악 멈춤.
        System.out.println("HOME+++++++"+home);

        if(home == 0){
            if(mediaPlayer!=null) {
                mediaPlayer.stopMusic();
                super.onPause();
            }
            System.out.println("mediaPlayer == null");
            super.onPause();
        }else{
            System.out.println("home!=0");
            super.onPause();
        }
        System.out.println("PAUSE!!!");
    }

    @Override
    protected void onDestroy() {
        System.out.println("DESTROY 전  " + Application.getSavePageDB().getInt("saveV"));
        System.out.println("DESTROY!!!");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        //홈갔다가 재시작. .. 다이얼로그?
        if(mediaPlayer!=null){
            mediaPlayer.stopMusic();
                 startStory.music(StartStory.getPage());
            }
                System.out.println("null!!!restart");

        System.out.println("RESTART!!!");

        super.onRestart();

    }

    @Override
    protected void onResume() {
        System.out.println("START");

        if(page!=-1){
            newEnding.setVisibility(View.VISIBLE);
            startBlink();
            System.out.println("PAGE!=-1");
        }
        if(Endings.star==1){
            System.out.println("START==1");
            newEnding.setVisibility(View.INVISIBLE);
        }
        // 엔딩페이지 갔다오면 멈추게 하기.
        super.onResume();
    }
}
