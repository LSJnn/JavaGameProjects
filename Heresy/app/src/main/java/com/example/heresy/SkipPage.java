package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.rewarded.RewardedAd;

public class SkipPage extends AppCompatActivity implements RewardedVideoAdListener {
    private RewardedVideoAd rewardedVideoAd;

    ImageButton exit;
    ImageButton skip1;
    ImageButton skip2;
    ImageButton skip3;
    ImageButton free;


    @Override
    protected void onStart() {
        super.onStart();
        MobileAds.initialize(this,"ca-app-pub-6192078009124891~5702234038");
        rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        rewardedVideoAd.setRewardedVideoAdListener(this);
        rewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917", new AdRequest.Builder().build());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip_page);


        getIntent();
        initializer();
        skipBuyListener();




    }

    public void initializer(){
        skip1 = findViewById(R.id.skip1);
        skip2 = findViewById(R.id.skip2);
        skip3 = findViewById(R.id.skip3);
        free = findViewById(R.id.skipFree);
        exit= findViewById(R.id.exit);

    }

    public void skipBuyListener (){

        skip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(1);

                finish();

            }
        });

        skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(2);

                finish();
            }
        });

        skip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(3);
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
                    onRewardedVideoAdClosed();
                    setResult(4);
                    finish();
                }else {
                    //로드가 안됐을 경우
                    Toast.makeText(getApplicationContext(), "동영상 로드에 실패했습니다. 다시 시도해주세요",Toast.LENGTH_LONG).show();
                    finish();
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

    }
}
