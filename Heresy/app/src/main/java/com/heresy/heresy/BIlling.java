/*
package com.heresy.heresy;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.heresy.heresy.Application;

import java.util.ArrayList;
import java.util.List;

public class BIlling implements PurchasesUpdatedListener {
    Context context;
    private BillingClient billingClient;
    String skuIDS0001 = "skip_001"; SkuDetails skuDetailS001;
    String skuIDS0002 = "skip_002";SkuDetails skuDetailS002;
    String skuIDS0003 = "skip_003";SkuDetails skuDetailS003;


    public BIlling(Context context){
        this.context = context;

        //클라이언트 생성.구매 업데이트.
        billingClient = BillingClient.newBuilder(context).setListener(this).build();
        //설정 : 비동기적 --> 콜백 위한 Listener 구현.연결 끊길 경운 startConnection 으로 호출필요
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingSetupFinished(BillingResult billingResult) {
                if(billingResult.getResponseCode()== BillingClient.BillingResponseCode.OK){
                    //구매 시작. 클라이언트 준비됨.
                    //상품 등록
                    List<String> skuList = new ArrayList<>();
                    skuList.add(skuIDS0001);
                    skuList.add(skuIDS0002);
                    skuList.add(skuIDS0003);
                    //SKU 타입 지정-일회성 제품.
                    SkuDetailsParams.Builder params =  SkuDetailsParams.newBuilder();
                    //비동기적 쿼리.상품 형태 및 제품 문자열 목록 전달됨.
                    params.setSkusList(skuList).setType(BillingClient.SkuType.INAPP);
                    //비동기적 build/ --> 리스너 필요.
                    billingClient.querySkuDetailsAsync(params.build(),
                            new SkuDetailsResponseListener() {
                                @Override
                                public void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> skuDetailsList) {
                                    if(billingResult.getResponseCode()==BillingClient.BillingResponseCode.OK && skuDetailsList!=null){
                                        //skuDetail리스트에 있으면.
                                        for(SkuDetails skuDetails : skuDetailsList){

                                            String sku = skuDetails.getSku();
                                            String price = skuDetails.getPrice();

                                            if(skuIDS0001.equals(sku)){
                                                skuDetailS001 = skuDetails;
                                            }else if(skuIDS0002.equals(sku)){
                                                skuDetailS002 = skuDetails;
                                            }else if(skuIDS0003.equals(sku)){
                                                skuDetailS003=skuDetails;
                                            }
                                        }
                                    }else {
                                        billingResult.getDebugMessage();
                                    }
                                }
                            });

                }

            }

            @Override
            public void onBillingServiceDisconnected() {
            // 재시작. startConnection 피룡.
                Toast.makeText(context,"구매가 취소되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
        // billing 라이브러리에서 구매가 업데이트 된 후 콜백 핸들
    @Override
    public void onPurchasesUpdated(BillingResult billingResult, @Nullable List<Purchase> purchases) {
        if(billingResult.getResponseCode()==BillingClient.BillingResponseCode.OK&&purchases!=null){
            //purchase 는 구매확인 객체. -- isacknowledged
            for(Purchase purchase : purchases){
                handlePurchase(purchase);
            }
        }else if(billingResult.getResponseCode()==BillingClient.BillingResponseCode.USER_CANCELED){
            Toast.makeText(context,"구매가 취소되었습니다.",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context,"결제 진행 도중 에러가 발생되었습니다.",Toast.LENGTH_SHORT).show();

        }
    }

    private void doBillingFolw(SkuDetails skuDetails){
        BillingFlowParams flowParams = BillingFlowParams.newBuilder().setSkuDetails(skuDetails).build();
        int responseCode = billingClient.launchBillingFlow(flowParams);
    }

    //
    private  void handlePurchase(Purchase purchase) {
        //구매 성공 시 구매 토큰 생성됨.
        String purchaseToken;
        purchaseToken = purchase.getPurchaseToken();
       // billingClient.consumeAsync(purchaseToken,consumeListener);
    }

    ConsumeResponseListener consumeListener = new ConsumeResponseListener() {
        @Override
        public void onConsumeResponse(BillingResult billingResult, String purchaseToken) {
            if(billingResult.getResponseCode()== BillingClient.BillingResponseCode.OK){
                int pChange=Application.getSavePageDB().getInt("skip");
                pChange+=1;
                Application.getSavePageDB().putInt("skip",pChange);
            }
        }
    };

}
*/
