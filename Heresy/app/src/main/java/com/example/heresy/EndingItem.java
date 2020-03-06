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
    private int position;

    public EndingItem(int chapter){
        this.chapter= chapter;
        //this.image = image;
    }

    public void setEnding(int chapter) {
        this.chapter = chapter;
    }
    //몇번쨰 엔딩 표시.


    public String getEnding(){

        switch (chapter){
            case 9 ://챕터별 결말. 작성.
                ending = "혜준이의 심리상담가 소개를 거절했다";
                break;
            case 30: ending ="유교경전은 선택하고 갑분싸를 만들었다. ";
                break;
            case 40: ending = "성경공부 한다는 사실을 온 동네방네 소문냈다.";
                break;
            case 48: ending = "상담 썜의 센터 소개를 거절했다.";
                break;
            case 52: ending = "면접에서 바쁜 티를 내버려서 떨어졌다. (취준이 날 살림..)";
                break;
            case 61: ending = "면접에서 게으리다고 거절당했다.(게으름이 날 살림...)";
                break;
            case 57: ending = "면접에서 호락호락하지 않게 굴어서 떨어졌다.(의심이 날 살림)";
                break;
            case 70: ending = "합동작전 시작?!";
                break;
            case 77: ending = "가족들 성경공부 초기 진압 성공";
                break;
            default: ending = "? ? ? ? ? ?";
        }
        return ending;
    }


}

