package com.heresy.heresy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;

public class SkipPage extends AppCompatActivity{
    private RewardedVideoAd rewardedVideoAd;

    ImageButton exit;
    ImageButton skip1;
    ImageButton skip2;
    ImageButton skip3;
    ImageButton free;
    int home;
    Intent i;
    int rewarded;
    int pChange=Application.getSavePageDB().getInt("skip");


    @Override
    protected void onStart() {
        super.onStart();
       }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip_page);

        MobileAds.initialize(this,
                "ca-app-pub-6192078009124891~5702234038");
        rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        setListener();
        //리워드
        rewardedVideoAd.loadAd("ca-app-pub-6192078009124891/7958245171", new AdRequest.Builder().build());


        getIntent();
        initializer();
        skipBuyListener();

    }

    public void initializer(){
        home=0;
        rewarded=0;
        skip1 = findViewById(R.id.skip1);
        skip2 = findViewById(R.id.skip2);
        skip3 = findViewById(R.id.skip3);
        free = findViewById(R.id.skipFree);
        exit= findViewById(R.id.exit);



    }

    public void skipBuyListener (){
        home=1;
        skip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                pChange +=1;
                Application.getSavePageDB().putInt("skip",pChange);
                finish();

            }
        });

        skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                pChange += 2;
                Application.getSavePageDB().putInt("skip",pChange);
                finish();
            }
        });

        skip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                pChange += 3;
                Application.getSavePageDB().putInt("skip",pChange);
                finish();
            }
        });

        free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                //광고 보여주기.
                if(rewardedVideoAd.isLoaded()){
                    rewardedVideoAd.show();
                    Toast.makeText(getApplicationContext(), "ad 재생.",Toast.LENGTH_LONG).show();
                }else {
                    //로드가 안됐을 경우
                    Toast.makeText(getApplicationContext(), "동영상 로드에 실패했습니다. 다시 시도해주세요",Toast.LENGTH_LONG).show();
                }

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                finish();

            }
        });

    }


    protected  void setListener(){
        RewardedVideoAdListener rewardedVideoAdListener = new RewardedVideoAdListener() {
            @Override
            public void onRewardedVideoAdLoaded() {

            }

            @Override
            public void onRewardedVideoAdOpened() {

            }

            @Override
            public void onRewardedVideoStarted() {

            }

            @Override
            public void onRewardedVideoAdClosed() {
            }

            @Override
            public void onRewarded(RewardItem rewardItem) {

            }

            @Override
            public void onRewardedVideoAdLeftApplication() {

            }

            @Override
            public void onRewardedVideoAdFailedToLoad(int i) {

            }

            @Override
            public void onRewardedVideoCompleted() {
                rewarded = Application.getSavePageDB().getInt("ad")+1;
                Application.getSavePageDB().putInt("ad",rewarded);
                Toast.makeText(getApplicationContext(), "무료 스킵권 1장을 획득했습니다.",Toast.LENGTH_LONG).show();

            }

        };
        rewardedVideoAd.setRewardedVideoAdListener(rewardedVideoAdListener);
    }


    @Override
    protected void onPause() {
        rewardedVideoAd.pause();
        if(Application.getMusicActivity()!=null){
            Application.getMusicActivity().stopMusic();
        }
        System.out.println("RESULT +=="+rewarded);
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        rewardedVideoAd.destroy();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        rewardedVideoAd.resume();
        super.onResume();
    }

    @Override
    protected void onRestart() {
        if(Application.getMusicActivity()!=null){
            StartStory startStory = new StartStory();
            startStory.music(StartStory.getPage());
        }
        super.onRestart();
    }

}
