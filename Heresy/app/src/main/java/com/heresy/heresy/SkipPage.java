package com.heresy.heresy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;

import java.util.ArrayList;
import java.util.List;

public class SkipPage extends AppCompatActivity implements PurchasesUpdatedListener{
    private RewardedVideoAd rewardedVideoAd;
    private  BillingClient billingClient;

    ImageButton exit;
    ImageButton skip1;
    ImageButton skip2;
    ImageButton skip3;
    ImageButton free;
    int home;
    Intent i;
    int rewarded;
    int gain=0;
    int pChange=Application.getSavePageDB().getInt("skip");

    String skuIDS0001 = "skip_001"; SkuDetails skuDetailS001;
    String skuIDS0002 = "skip_002";SkuDetails skuDetailS002;
    String skuIDS0003 = "skip_003";SkuDetails skuDetailS003;


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

        billingClient = BillingClient.newBuilder(this).setListener(this).build();
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingSetupFinished(int responseCode) {
                if (responseCode == BillingClient.BillingResponse.OK) {
                    //BillingClient 가 준비됨. 구매 구현하기.
                    //상품 등록
                    List<String> skuList = new ArrayList<>();
                    skuList.add(skuIDS0001);
                    skuList.add(skuIDS0002);
                    skuList.add(skuIDS0003);
                    //SKU 타입 지정-일회성 제품.
                    SkuDetailsParams.Builder params = SkuDetailsParams.newBuilder();
                    params.setSkusList(skuList).setType(BillingClient.SkuType.INAPP);

                    //인앱상품을 비동기적 build/ --> 리스너 필요.
                    billingClient.querySkuDetailsAsync(params.build(),
                            new SkuDetailsResponseListener() {
                                @Override
                                public void onSkuDetailsResponse(int responseCode, List<SkuDetails> skuDetailsList) {
                                    if (responseCode == BillingClient.BillingResponse.OK
                                            && skuDetailsList != null) {
                                        //skuDetail리스트에 있으면.

                                        for (SkuDetails skuDetails : skuDetailsList) {
                                            String sku = skuDetails.getSku();
                                            String price = skuDetails.getPrice();

                                            if (skuIDS0001.equals(sku)) {
                                                skuDetailS001 = skuDetails;
                                                //가격 가져오기.
                                            } else if (skuIDS0002.equals(sku)) {
                                                skuDetailS002 = skuDetails;
                                            } else if (skuIDS0003.equals(sku)) {
                                                skuDetailS003 = skuDetails;
                                            }
                                        }
                                    }

                                }
                            });
                }
            }
            @Override
            public void onBillingServiceDisconnected() {
                billingClient.startConnection(this);
                Toast.makeText(SkipPage.this,"로딩에 실패했습니다. 다시 시도해주십시오",Toast.LENGTH_SHORT).show();

            }
        });
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

    public void skipBuyListener (){
        home=1;
        skip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                billingFlow(skuDetailS001);
                Application.getSavePageDB().putInt("skip",pChange);

            }
        });

        skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                billingFlow(skuDetailS001);
                Application.getSavePageDB().putInt("skip",pChange);
            }
        });

        skip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                billingFlow(skuDetailS001);
                Application.getSavePageDB().putInt("skip",pChange);
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
                finish();
            }
        });

    }

//상숨 id 및 유형 등 데이터 포함되어있음. FlowParams 안에.
    private void billingFlow(SkuDetails skuDetails){
        BillingFlowParams flowParams = new BillingFlowParams().newBuilder().setSkuDetails(skuDetails).build();
        int responseCode = billingClient.launchBillingFlow(SkipPage.this, flowParams);
        //--> 해당 상품에 대한 구매화면 나옴.
    }

    @Override
    public void onPurchasesUpdated(int responseCode, @Nullable List<Purchase> purchases) {
        if (responseCode == BillingClient.BillingResponse.OK
                && purchases != null) {
            for (Purchase purchase : purchases) {
                handlePurchase(purchase);
                if(gain ==1 ){
                    if (skuIDS0001.equals(purchase.getSku())) {
                        int pChange = Application.getSavePageDB().getInt("skip");
                        pChange += 1;
                        Application.getSavePageDB().putInt("skip", pChange);
                    } else if ( skuIDS0002.equals(purchase.getSku())) {
                        int pChange = Application.getSavePageDB().getInt("skip");
                        pChange += 2;
                        Application.getSavePageDB().putInt("skip", pChange);
                    } else if (skuIDS0003.equals(purchase.getSku())) {
                        int pChange = Application.getSavePageDB().getInt("skip");
                        pChange += 3;
                        Application.getSavePageDB().putInt("skip", pChange);

                    }
                }
            }

        } else if (responseCode == BillingClient.BillingResponse.USER_CANCELED) {
            Toast.makeText(this,"구매를 취소하셨습니다.",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"오류가 발생했습니다.",Toast.LENGTH_SHORT).show();
        }
    }

    private void  handlePurchase(Purchase purchase) {
        //구매 성공 시 구매 토큰 생성됨.
        String purchaseToken = purchase.getPurchaseToken();
        billingClient.consumeAsync(purchaseToken,consumeListener);
    }
    ConsumeResponseListener consumeListener = new ConsumeResponseListener() {
        @Override
        public void onConsumeResponse(int responseCode, String purchaseToken) {
            if (responseCode == BillingClient.BillingResponse.OK) {
                gain =1;
                System.out.println("GAIN=="+gain);
            }else {
                gain =-1;
                System.out.println("GAIN=="+gain);
            }
            System.out.println("GAIN=="+gain);
        }

    };

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
