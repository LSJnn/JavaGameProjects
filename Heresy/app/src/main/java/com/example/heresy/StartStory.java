package com.example.heresy;

import android.graphics.Color;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.concurrent.TimeoutException;

public class StartStory {
    int viewNum;
    int page; //ch메ter는 ppt 기준.
    int paragraph; // 문단.//페이지0문단
    int changeCode;

    TextView one_tv1;
    TextView one_tv2;
    TextView one_tv3;
    String l;
    String f;

    ImageView two_img1;
    TextView two_tv1;
    TextView two_tv2;
    TextView two_tv3;
    TextView two_tv4;

    ImageView THREE_img1;
    TextView THREE_tv1;
    TextView THREE_tv2;
    ImageButton THREE_imgbtn1;
    ImageButton THREE_imgbtn2;
    ImageButton THREE_imgbtn3;

    TextView FOUR_tv1;
    TextView FOUR_tv2;
    TextView FOUR_tv3;
    LinearLayout FOUR_frame;

    int kakao;


    StartStory() {
    }

    public void setStory(int viewNum, int page, int paragraph) {// 텍스트만 있는 뷰/ ppt7쪽, 문단.
        this.viewNum = viewNum;
        this.page = page;
        this.paragraph = paragraph;

        if (viewNum == 1) {
            viewNumIsONE();
        } else if (viewNum == 2) {
            viewNumIsTWO();
        } else if (viewNum == 4) {
            viewNumIsFOUR();
        }else {viewNumIsTHREE();}

    }

    public void getONE(TextView tv1, TextView tv2, TextView tv3, String l, String f) {
        one_tv1 = tv1;
        one_tv2 = tv2;
        one_tv3 = tv3;
        this.l = l;
        this.f = f;
    }

    public void getTWO(ImageView img1, TextView tv1, TextView tv2, TextView tv3, TextView tv4) {
        two_img1 = img1;
        two_tv1 = tv1;
        two_tv2 = tv2;
        two_tv3 = tv3;
        two_tv4 = tv4;
    }

    public void getTHREE(ImageView img1, TextView tv1, TextView tv2,
                         ImageButton btn1, ImageButton btn2, ImageButton btn3) {
        THREE_img1 = img1;
        THREE_tv1 = tv1;
        THREE_tv2 = tv2;
        THREE_imgbtn1 = btn1;
        THREE_imgbtn2 = btn2;
        THREE_imgbtn3 = btn3;
    }

    public void getFOUR(TextView tv1, TextView tv2, TextView tv3, LinearLayout frame) {
        FOUR_tv1 = tv1;
        FOUR_tv2 = tv2;
        FOUR_tv3 = tv3;
        FOUR_frame = frame;
    }

    //페이지 1(텍스트만)/2(텍스트 이미비)/3(선택 창)/4(카카오톡 창)

    public int viewNumIsONE() {//text 만 있는 장. 의 ppt 쪽수.
        switch (page) {
            case 7:
                pageTNUM();
                break;
        }
        return changeCode;
    }

    public void viewNumIsTWO() {
        switch (page) {
            case 12:
                break;
        }
    }

    public void viewNumIsTHREE() {
        switch (page) {
            case 9: pageCHOICE();
                break;
            case 8002:
        }
    }

    public int viewNumIsFOUR() {
        switch (page) {
            //++ 할떄 조심.!... 한 번 해보기.
            case 8: pageKakao();
                break;
            case 11:
                break;
        }
        return changeCode;
    }


    ////////////헤이지 내 뷰들 set///////////////////

    public void pageTNUM() {
        if (page == 7) {
            switch (paragraph) {//ppt 쪽수 중 문단.
                case 1:
                    one_tv1.setText(R.string.page7001);
                    one_tv1.append(" " + l + f);
                    break;
                case 2:
                    one_tv2.setText(R.string.page7002);
                    break;
                case 3:
                    one_tv3.setText(R.string.page7003);
                    break;
                case 4: changeCode = 4;//--> 2페이지로 넘어감.
                    break;
                    // 4에서 넘어가기.
            }
        } else if (page == 10) {
        }
    }

    public void pageTINUM() {
        if (page == 12) {
            switch (paragraph) {//ppt 쪽수 중 문단
            }
        }
    }

    public void pageCHOICE(){
        if(page ==9){
            switch (paragraph){
                case 1: THREE_tv1.setText(R.string.page9001);
                break;
                case 2: THREE_imgbtn1.setBackgroundResource(R.drawable.choice_9002_1);
                THREE_imgbtn2.setBackgroundResource(R.drawable.choice_9002_2);
                break;

            }
        }

    }

    public int pageKakao() {
        if (page == 8) {
            switch (paragraph) {
                case 1:
                    FOUR_tv1.setText(R.string.page8001);
                    break;
                case 2:
                    kakao = 2;
                    break;// 배경 + h1
                case 3:
                    kakao = 3;//i1
                    break;
                case 4:
                    kakao = 4;//i2
                    break;
                case 5:
                    kakao = 5;
                    break;
                case 6:
                    kakao = 6;//h3
                    break;
                case 7: changeCode=3;
                    return  changeCode;
            }

        }
        return kakao;
    }

}
