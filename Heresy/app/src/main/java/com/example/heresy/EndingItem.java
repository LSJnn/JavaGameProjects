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
                ending = "가진이의 심리상담가 소개를 거절했다";
                break;
            case 1: ending ="상담쌤의 정체를 핸드폰을 통해 알아냈다. ";
                break;
            case 2: ending = "유교경전을 선택하고 갑분싸를 만들었다.";
                break;
            case 3: ending = "성경공부 한다는 사실을 온 동네방네 소문냈다.";
                break;
            case 4: ending = "상담쌤의 센터소개를 거절했다.";
                break;
            case 5: ending = "면접에서 게으르다고 거절당했다. (게으름이 날 살림). ";
                break;
            case 6: ending = "면접에서 바쁜 티를 내버려서 떨어졌다. (취준이 날 살림)";
                break;
            case 7: ending = "면접때 호락호락하지 않게 굴어서 떨어졌다. (의심이 날 살림)";
                break;
            case 8: ending = "우연히 회비를 낼 돈이 없어서 탈출 성공";
                break;
            case 9: ending = "가족들의 성경공부 초기진압덕분에 탈출 성공";
                break;
            case 10: ending = "스윗 도환 덕분에 탈출성공 ";
                break;
            case 11: ending = "다소 늦었지만 인생에서 크게 한방 깨닫고 일상으로 돌아감";
                break;
            case 12: ending = "평생을 새별지의 노예로 살다 인생 망함";
                break;

            case -1: ending =position+"? ? ? ? ? ?";
        }
        return ending;
    }
}

