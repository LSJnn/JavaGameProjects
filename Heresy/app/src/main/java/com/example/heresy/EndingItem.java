package com.example.heresy;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class EndingItem {

    //스토리 진행 중 일정 상황 오면 오픈
    //story로 몇번쨰 엔딩인지 받아오고.switch_case로 표시.:setText

    private int chapter;
    private String ending;
    //private int image ;

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
            case 1 ://챕터별 결말. 작성.
                ending  = "케이스 1 결말";
                break;
            case 2: ending ="케이스 2 ";
                break;
            case 3: ending = "케이스 3";
                break;
            default: ending = "? ? ? ? ? ?";
        }
        return ending;
    }


}

