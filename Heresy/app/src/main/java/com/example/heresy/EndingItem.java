package com.example.heresy;

import android.graphics.drawable.Drawable;
import android.media.Image;

import java.util.HashMap;
import java.util.Map;

public class EndingItem {

    //스토리 진행 중 일정 상황 오면 오픈
    //story로 몇번쨰 엔딩인지 받아오고.switch_case로 표시.:setText

    private int chapter;
    private String ending;
    int position;

    public EndingItem(int chapter){
        this.chapter= chapter;
    }
    public EndingItem(int chapter,int position){
        this.chapter= chapter;
        this.position = position;
    }

    public void setEnding(int chapter) {
        this.chapter = chapter;
    }


    public String getEnding(){

        switch (chapter){
            case 0 ://챕터별 결말. 작성.
                ending = "혜준이의 심리상담가 소개를 거절했다";
                break;
            case 1: ending ="상담쌤의 정체를 핸드폰을 통해 알아냈다. ";
                break;
            case 2: ending = "성경공부 한다는 사실을 온 동네방네 소문냈다.";
                break;
            case 3: ending = "상담 썜의 센터 소개를 거절했다.";
                break;
            case 4: ending = "면접에서 바쁜 티를 내버려서 떨어졌다.(취준이 날 살림..)";
                break;
            case 5: ending = "면접에서 게으리다고 거절당했다.(게으름이 날 살림...)";
                break;
            case 6: ending = "면접에서 호락호락하지 않게 굴어서 떨어졌다.(의심이 날 살림)";
                break;
            case 7: ending = "합동작전 시작?!";
                break;
            case 8: ending = "가족들 성경공부 초기 진압 성공";
                break;
            case -1: ending =position+"? ? ? ? ? ?";
        }
        return ending;
    }
}

