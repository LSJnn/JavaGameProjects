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

    TextView ONE_tv1;
    TextView ONE_tv2;
    TextView ONE_tv3;
    String l;
    String f;

    ImageView TWO_img1;
    TextView TWO_tv1;
    TextView TWO_tv2;
    TextView TWO_tv3;
    TextView TWO_tv4;

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
        }else if (viewNum== 3){viewNumIsTHREE();}

    }

    public void getONE(TextView tv1, TextView tv2, TextView tv3, String l, String f) {
        ONE_tv1 = tv1;
        ONE_tv2 = tv2;
        ONE_tv3 = tv3;
        this.l = l;
        this.f = f;
    }

    public void getTWO(ImageView img1, TextView tv1, TextView tv2, TextView tv3, TextView tv4,String l, String f) {
        TWO_img1 = img1;
        TWO_tv1 = tv1;
        TWO_tv2 = tv2;
        TWO_tv3 = tv3;
        TWO_tv4 = tv4;
        this.l = l;
        this.f = f;
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

    public void getFOUR(TextView tv1, TextView tv2, TextView tv3, LinearLayout frame,String l, String f ) {
        FOUR_tv1 = tv1;
        FOUR_tv2 = tv2;
        FOUR_tv3 = tv3;
        FOUR_frame = frame;

        this.l = l;
        this.f = f;
    }

    //페이지 1(텍스트만)/2(텍스트 이미비)/3(선택 창)/4(카카오톡 창)

    public int viewNumIsONE() {//text 만 있는 장. 의 ppt 쪽수.
        switch (page) {
            case 7:
                pageTNUM();
                break;
            case 34 :
                pageTNUM();
                break;
            case 35 :
                pageTNUM();
                break;
            case 37 :
                pageTNUM();
                break;
            case 59 :
                pageTNUM();
                break;
            case 63 :
                pageTNUM();
                break;
            case 64 :
                pageTNUM();
                break;
            case 65 :
                pageTNUM();
                break;
            case 69 :
                pageTNUM();
                break;
            case 73 :
                pageTNUM();
                break;
            case 77 :
                pageTNUM();
                break;
            case 79 :
                pageTNUM();
                break;
            case 80 :
                pageTNUM();
                break;
            case 82 :
                pageTNUM();
                break;
            case 94 :
                pageTNUM();
                break;


        }
        return changeCode;
    }

    public int viewNumIsTWO() {
        switch (page) {
            case 11:
                pageTINUM();
                break;
            case 12 :
                pageTINUM();
                break;
            case 13 :
                pageTINUM();
                break;
            case 14 :
                pageTINUM();
                break;
            case 15 :
                pageTINUM();
                break;
            case 16 :
                pageTINUM();
                break;
            case 17 :
                pageTINUM();
                break;
            case 18 :
                pageTINUM();
                break;
            case 19 :
                pageTINUM();
                break;
            case 21 :
                pageTINUM();
                break;
            case 22 :
                pageTINUM();
                break;
            case 23 :
                pageTINUM();
                break;
            case 24 :
                pageTINUM();
                break;
            case 25 :
                pageTINUM();
                break;
            case 27 :
                pageTINUM();
                break;
            case 32 :
                pageTINUM();
                break;
            case 33 :
                pageTINUM();
                break;
            case 36 :
                pageTINUM();
                break;
            case 39 :
                pageTINUM();
                break;
            case 40  :
                pageTINUM();
                break;
            case 43  :
                pageTINUM();
                break;
            case 44  :
                pageTINUM();
                break;
            case 46  :
                pageTINUM();
                break;
            case 48  :
                pageTINUM();
                break;
            case 49  :
                pageTINUM();
                break;
            case 50  :
                pageTINUM();
                break;
            case 51  :
                pageTINUM();
                break;
            case 52  :
                pageTINUM();
                break;
            case 53  :
                pageTINUM();
                break;
            case 54  :
                pageTINUM();
                break;
            case 56  :
                pageTINUM();
                break;
            case 57  :
                pageTINUM();
                break;
            case 60  :
                pageTINUM();
                break;
            case 61  :
                pageTINUM();
                break;
            case 66  :
                pageTINUM();
                break;
            case 68  :
                pageTINUM();
                break;
            case 70  :
                pageTINUM();
                break;
            case 72  :
                pageTINUM();
                break;
            case 75  :
                pageTINUM();
                break;
            case 76  :
                pageTINUM();
                break;
            case 81  :
                pageTINUM();
                break;
            case 83  :
                pageTINUM();
                break;
            case  84 :
                pageTINUM();
                break;
            case 85 :
                pageTINUM();
                break;
            case 86  :
                pageTINUM();
                break;
            case 78  :
                pageTINUM();
                break;
            case 90  :
                pageTINUM();
                break;
            case 91  :
                pageTINUM();
                break;
            case 92  :
                pageTINUM();
                break;
            case 94  :
                pageTINUM();
                break;
            case 95  :
                pageTINUM();
                break;
            case 96  :
                pageTINUM();
                break;
            case 97  :
                pageTINUM();
                break;
            case 98  :
                pageTINUM();
                break;


        }
        return changeCode;
    }

    public int viewNumIsTHREE() {
        switch (page) {
            case 9: pageCHOICE();
                break;
            case 26: pageCHOICE();
            break;
            case 45: pageCHOICE();
                break;
            case 47: pageCHOICE();
                break;
            case 55: pageCHOICE();
                break;
            case 62: pageCHOICE();
                break;
            case 67: pageCHOICE();
                break;
            case 71: pageCHOICE();
                break;
            case 74: pageCHOICE();
                break;
            case 78: pageCHOICE();
                break;
            case 89: pageCHOICE();
                break;

        }return changeCode;
    }

    public int viewNumIsFOUR() {//카카오
        switch (page) {
            //++ 할떄 조심.!... 한 번 해보기.
            case 8: pageKakao();
                break;
            case 10 : pageKakao();
                break;
            case 20 : pageKakao();
            break;
            case 28: pageKakao();
                break;
            case 29 : pageKakao();
                break;
            case 30 : pageKakao();
                break;
            case 31 : pageKakao();
                break;
            case 38 : pageKakao();
                break;
            case 39 : pageKakao();
                break;
            case 41 : pageKakao();
            break;
            case 42 : pageKakao();
                break;
            case 58 : pageKakao();
                break;


        }
        return changeCode;
    }


    ////////////헤이지 내 뷰들 set///////////////////

    public void pageTNUM() {
        if (page == 7) {
            switch (paragraph) {//ppt 쪽수 중 문단.
                case 1:
                    ONE_tv1.setText(R.string.page7001);
                    ONE_tv1.append(" " + l + f);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page7002);
                    break;
                case 3:
                    ONE_tv3.setText(R.string.page7003);
                    break;
                case 4: changeCode = 4;//--> 2페이지로 넘어감.
                    break;
                    // 4에서 넘어가기.
            }
        }
        else if (page == 34) {
            switch (paragraph){
                case 1 : ONE_tv1.setText(R.string.page34001);
                break;
                case 2 : ONE_tv2.setText(R.string.page34002);
                break;
            }
        }
        else if (page == 35) {
            switch (paragraph){
                case 1 :ONE_tv2.setText("");
                    ONE_tv1.setText(R.string.page35001);
                    break;
                case 2 : ONE_tv2.setText(R.string.page35002);
                    break;
                case 3 : changeCode =5;
            }
        }
        else if (page == 37) {
            switch (paragraph){
                case 1 : ONE_tv2.setText(R.string.page37002);
                    break;
                case 2 : changeCode =4;
                break;
            }
        }
        else if (page == 59) {
            switch (paragraph){
                case 1 : ONE_tv2.setText(R.string.page59002);
                    break;
                case 2 : ONE_tv2.setText(R.string.page59003);
                    break;
                case 3 : changeCode = 5;
                    break;
            }
        }
        else if (page == 63) {
            switch (paragraph){
                case 1 : ONE_tv1.setText(R.string.page63001);
                    break;
                case 2 : ONE_tv2.setText(R.string.page63002);
                    break;
                case 3 : ONE_tv3.setText(R.string.page63003);
                    break;
                case 4 : ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page63004);
                    break;
                case 5 : ONE_tv2.setText(R.string.page63005);
                    break;
                case 6 : changeCode = 5;

            }
        }
        else if (page == 64) {
            switch (paragraph){
                case 1 : ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page63001);
                    break;
                case 2 : ONE_tv2.setText(R.string.page63002);
                    break;
                case 3 : ONE_tv3.setText(R.string.page63003);
                    break;
                case 4 : ONE_tv2.setText("");ONE_tv2.setText("");
                    ONE_tv1.setText(R.string.page63004);
                    break;
                case 5 : ONE_tv2.setText(R.string.page64005);
                    break;
                case 6 : ONE_tv2.setText(R.string.page64006);
                    break;
            }
        }
        else if (page == 65) {
            switch (paragraph){
                case 1 :ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page65001);
                    break;
                case 2 : ONE_tv2.setText(R.string.page65002);
                    break;
                case 3 : changeCode = 2;
                break;
            }
        }
        else if (page == 69) {
            switch (paragraph){
                case 1 :
                    ONE_tv1.setText(R.string.page69001);
                    break;
                case 2 : ONE_tv2.setText(R.string.page69002);
                    break;
                case 3 : ONE_tv2.setText(R.string.page69003);
                    break;
                case 4 : changeCode = 5;
                break;
            }
        }
        else if (page == 73) {
            switch (paragraph){
                case 1 :
                    ONE_tv1.setText(R.string.page69001);
                    break;
                case 2 : ONE_tv2.setText(R.string.page69002);
                    break;
                case 3 : ONE_tv2.setText(R.string.page69003);
                    break;
                case 4 : changeCode = 5;
                    break;
            }
        }
        else if (page == 77) {
            switch (paragraph){
                case 1 :
                    ONE_tv1.setText(R.string.page77001);
                    break;
                case 2 :  changeCode = 5;
                    break;
            }
        }
        else if (page == 79) {
            switch (paragraph){
                case 1 :
                    ONE_tv1.setText(R.string.page79001);
                    break;
                case 2 :  ONE_tv2.setText(R.string.page79002);
                    break;
                case 3 :  ONE_tv3.setText(R.string.page79003);
                    break;
                case 4 : changeCode =5;break;
            }
        }
        else if (page == 80) {
            switch (paragraph){
                case 1 :ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page79001);
                    break;
                case 2 :  ONE_tv1.setText(R.string.page79002);
                    break;
                case 3 :  ONE_tv1.setText(R.string.page79003);
                    break;
                case 4 : changeCode =4;break;
            }
        }
        else if (page == 82) {
            switch (paragraph){
                case 1 :
                    ONE_tv1.setText(R.string.page82001);
                    break;
                case 2 :  ONE_tv1.setText(R.string.page82002);
                    break;
                case 3 :  ONE_tv1.setText(R.string.page82003);
                    break;
                case 4 : changeCode =2;break;
            }
        }
        else if (page == 94) {
            switch (paragraph){
                case 1 :
                    ONE_tv1.setText(R.string.page94001);
                    break;
                case 2 :  ONE_tv2.setText(R.string.page94002);
                    break;
                case 3 :  ONE_tv3.setText(R.string.page94003);
                    break;
                case 4 :ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page94004);
                break;
                case 5 : ONE_tv2.setText(R.string.page94005);
                break;
                case 6 : ONE_tv3.setText(R.string.page94006);
                    break;
                case 7 : changeCode = 2;
                break;
            }
        }



    }

    public void pageTINUM() {
        if (page == 11) {
            switch (paragraph) {//ppt 쪽수 중 문단
                case 1:
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    break;
                case 2:
                    TWO_tv2.setText(R.string.page11002);
                    break;
            }
        }
        else if (page == 12) { // 이미지 새로 삽입 안 함... 전 이미지 저장 될까..??.. changeCode 하면 안넘겨지고 안하면 넘겨짐. ?? intent 니까.
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");
                    TWO_tv2.setText(R.string.page12002);
                    break;
                case 2:
                    TWO_tv3.append(l + f);
                    TWO_tv3.setText(R.string.page12003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page12004);
                    break;
            }
        }
        else if (page == 13) {
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page13002);
                    break;
                case 2:
                    TWO_tv3.append(l + f);
                    TWO_tv3.setText(R.string.page13003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page13004);
                    break;
            }

        }
        else if (page == 14) {
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page14001);
                    break;
                case 2:
                    TWO_tv3.setText("");
                    TWO_tv2.append(l + f);
                    TWO_tv2.setText(R.string.page14002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page14003);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page14004);
                    break;
            }

        }
        else if (page == 15) {
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page15002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page15003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page15004);
                    break;
                case 4:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page15005);
                    break;
                case 5:
                    TWO_tv3.setText(R.string.page15006);
                    break;
                case 6:
                    TWO_tv4.setText(R.string.page15007);
                    break;

            }
        }
        else if (page == 16) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page16002);
                    TWO_tv2.append(l + f);
                    TWO_tv2.setText(R.string.page16003);
                    break;
                case 2:
                    TWO_tv3.append(l + f);
                    TWO_tv3.setText(R.string.page16004);
                    break;
                case 3:
                    TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page16005);
                    break;
                case 4:
                    TWO_tv3.append(l + f);
                    TWO_tv3.setText(R.string.page16006);
                    break;
            }

        }
        else if (page == 17) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page17002);
                    break;
                case 2:
                    TWO_tv3.append(l + f);
                    TWO_tv3.setText(R.string.page17003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page17004);
                    break;
            }

        }
        else if (page == 18) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page18002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page18003);
                    break;
            }

        }
        else if (page == 19) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page19002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page19003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page19004);
                    break;
                case 4:
                    changeCode = 4;
                    break;
            }

        }
        else if (page == 21) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.pizza);
                    TWO_tv2.setText(R.string.page21002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page21003);
                    break;
            }
        }
        else if (page == 22) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.pizza);
                    TWO_tv2.setText(R.string.page22002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page22003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page22004);
                    break;

            }
        }
        else if (page == 23) {
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_img1.setImageResource(R.drawable.firework);
                    break;
                case 2:
                    TWO_tv2.setText(R.string.page23002);
                    break;
            }
        }
        else if (page == 24) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page24002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page24003);
                    break;
                case 3:
                    TWO_tv3.append(l + f);
                    TWO_tv3.setText(R.string.page24004);
                    break;
            }
        }
        else if (page == 25) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page25002);
                    break;
                case 2:
                    changeCode = 3;
                    break;
            }
        }
        else if (page == 27) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.firework);
                    TWO_tv2.setText(R.string.page27002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page27003);
                    break;
                case 3:
                    changeCode = 4;
                    break;
            }
        }
        else if (page == 32) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.firework);
                    TWO_tv2.setText(R.string.page32002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page32003);
                    break;
            }
        }
        else if (page == 33) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page33002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page33003);
                    break;
                case 3:
                    changeCode = 1;
                    break;
            }
        }
        else if (page == 36) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.firework);
                    TWO_tv2.setText(R.string.page36002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page36003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page36004);
                    break;
                case 4:
                    changeCode = 1;
                    break;
            }
        }
        else if (page == 40) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    TWO_tv3.setText(R.string.page39002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page39003);
                    break;
                case 3:
                    TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page39004);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page39005);
                    break;
                case 5:
                    changeCode = 4;
                    break;
            }
        }
        else if (page == 43) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    TWO_tv2.setText(R.string.page43001);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page43002);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page43003);
                    break;
                case 4:
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page43004);
                    break;
                case 5:
                    TWO_tv3.setText(R.string.page43005);
                    break;
                case 6:
                    TWO_tv4.setText(R.string.page43006);
                    break;

            }
        }
        else if (page == 44) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page44002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page44003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page44004);
                    break;
                case 4:
                    changeCode = 3;
                    break;

            }
        }
        else if (page == 46) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    TWO_tv2.setText(R.string.page46002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page46003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page46004);
                    break;
                case 4:
                    changeCode = 3;
                    break;

            }
        }
        else if (page == 48) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    TWO_tv2.setText(R.string.page48002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page48003);
                    break;
                case 3:
                    changeCode = 5;
                    break;

            }
        }
        else if (page == 50) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    TWO_tv2.setText(R.string.page49002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page49003);
                    break;

            }
        }
        else if (page == 49) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    TWO_tv2.setText(R.string.page50002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page50003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page50004);
                    break;

            }
        }
        else if (page == 51) {
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");TWO_tv3.setText("");
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    TWO_tv2.setText(R.string.page51002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page50003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page51003);
                    break;
            }
        }
        else if (page == 52) {
            switch (paragraph) {
                case 1:
                    TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page52002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page52003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page52004);
                    break;
            }
        }
        else if (page == 53) {
            switch (paragraph) {
                case 1 :
                    TWO_img1.setImageResource(R.drawable.edu);
                    TWO_tv4.setText("");TWO_tv3.setText("");TWO_tv2.setText("");
                    TWO_tv1.setText(R.string.page53001);
                    break;
                case 2:
                    TWO_tv2.setText(R.string.page53002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page53003);
                    break;
                case 4 : TWO_tv4.setText(R.string.page53004);
                break;
            }
        }
        else if (page == 54) {
            switch (paragraph) {
                case 1:
                    TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv1.setText("");
                    TWO_tv2.setText(R.string.page54002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page54003);
                    break;
                case 3:
                    TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page54004);
                    break;
                case 4 : changeCode = 3;
                    break;
            }
        }
        else if (page == 56) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.home);
                    TWO_tv2.setText(R.string.page56002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page56003);
                    break;
                case 3 :
                    TWO_tv4.setText(R.string.page56004);
                    break;
                case 4 :
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page56005);
                    break;
                case 5 :
                    TWO_tv3.setText(R.string.page56006);
                    break;
                case 6 :
                    TWO_tv4.setText(R.string.page56007);
                    break;
            }
        }
        else if (page == 57) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page57002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page57003);
                    break;
                case 3 :
                    TWO_tv4.setText(R.string.page57004);
                    break;
                case 4 : changeCode = 4;
                break;
            }
        }
        else if (page == 60) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.edu);
                    TWO_tv2.setText(R.string.page60002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page60003);
                    break;
            }
        }
        else if (page == 61) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");TWO_tv4.setText("");TWO_tv2.setText("");
                    TWO_tv1.setText(R.string.page61001);
                    break;
                case 2:
                    TWO_tv1.setVisibility(View.GONE);
                    TWO_tv2.setText(R.string.page61002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page61003);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page61004);
                    break;
                case  5: changeCode = 3;
                break;
            }
        }
        else if (page == 66) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.interview);
                    TWO_tv1.setText(R.string.page66002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page66003);
                    break;
                case  3: changeCode = 3;
                    break;
            }
        }
        else if (page == 68) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.interview);
                    TWO_tv1.setText(R.string.page68002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page68003);
                    break;
                case  3: TWO_tv3.setText(R.string.page68004);
                    break;
                case 4 : TWO_tv3.setText(R.string.page68005 );
                break;
                case 5 : changeCode = 1;
                break;
            }
        }
        else if (page == 70) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.interview);
                    TWO_tv2.setText(R.string.page70002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page70003);
                    break;
                case  3: TWO_tv4.setText(R.string.page70004);
                    break;
                case 4 :TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page70005 );
                    break;
                case 5 : TWO_tv3.setText(R.string.page70006 );
                    break;
            }
        }
        else if (page == 72) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.interview);
                    TWO_tv2.setText(R.string.page68002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page72003);
                    break;
                case  3: TWO_tv4.setText(R.string.page68004);
                    break;
                case 4 :TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page72004 );
                    break;
                case 5 : changeCode=1;
                    break;
            }
        }
        else if (page == 75) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.interview);
                    TWO_tv3.setText(R.string.page75002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page75003);
                    break;
                case  3: TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page75004 );
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page75005 );
                    break;
            }
        }
        else if (page == 76) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.interview);
                    TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page76002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page76003);
                    break;
                case  3: TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page69001 );
                    break;
                case 4 :
                    TWO_tv3.setText(R.string.page69002 );
                    break;
                case 5 :
                    TWO_tv4.setText(R.string.page69003 );
                    break;
                case 6 : changeCode = 5;
                break;
            }
        }
        else if (page == 81) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.teacher);
                    TWO_tv3.setText(R.string.page81002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page81003);
                    break;
                case  3: TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page81004 );
                    break;
                case 4 :
                    TWO_tv3.setText(R.string.page81005 );
                    break;
                case 5 :
                    changeCode = 1;
                    break;
            }
        }
        else if (page == 83) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.teacher);
                    TWO_tv2.setText(R.string.page83002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page83003);
                    break;
                case  3: TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv4.setText(R.string.page83004 );
                    break;
            }
        }
        else if (page == 84) {
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page84002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page84003);
                    break;
                case  3:
                    TWO_tv4.setText(R.string.page84004 );
                    break;
            }
        }
        else if (page == 85) {
            switch (paragraph) {
                case 1:
                    TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page85002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page85003);
                    break;
                case  3: TWO_tv3.setText("");
                    TWO_tv3.setText(R.string.page85004 );
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page85005 );
                    break;
            }
        }
        else if (page == 86) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.edu);
                    TWO_tv4.setText("");TWO_tv2.setText("");
                    TWO_tv3.setText(R.string.page86002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page86003);
                    break;
                case  3: TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page86004 );
                    break;
            }
        }
        else if (page == 87) {
            switch (paragraph) {
                case 1:
                    TWO_tv4.setText("");TWO_tv2.setText("");
                    TWO_tv3.setText(R.string.page81002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page81003);
                    break;
                case  3:
                    TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page81004 );
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page81005 );
                    break;
            }
        }
        else if (page == 88) {
            switch (paragraph) {
                case 1:
                    TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page88002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page88003);
                    break;
                case  3:
                    TWO_tv4.setText(R.string.page88004 );
                    break;
                case 4 :TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page88005 );
                    break;
                case 5 :
                    TWO_tv2.setText(R.string.page88006 );
                    break;
                case 6 :
                    TWO_tv2.setText(R.string.page88007 );
                    break;
                case 7 :
                    changeCode = 3;
                    break;
            }
        }
        else if (page == 90) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.zzazang);
                    TWO_tv2.setText(R.string.page90002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page90003);
                    break;
                case  3:
                    TWO_tv4.setText(R.string.page90004);
                    break;
            }
        }
        else if (page == 91) {
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page91002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page91003);
                    break;
                case  3: TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page91004 );
                    break;
                case 4 :
                    TWO_tv3.setText(R.string.page91005 );
                    break;
                case 5 :
                    TWO_tv3.setText(R.string.page91006 );
                    break;
            }
        }
        else if (page == 92) {
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");TWO_tv2.setText("");
                    TWO_tv3.setText(R.string.page92002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page92003);
                    break;
                case  3: TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv3.setText(R.string.page92004 );
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page92005 );
                    break;
            }
        }
        else if (page == 93) {
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");TWO_tv2.setText("");
                    TWO_tv2.setText(R.string.page93002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page93003);
                    break;
                case  3:
                    TWO_tv4.setText(R.string.page93004 );
                    break;
                case 4 :TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv3.setText(R.string.page93005 );
                    break;
                case 5 :
                    TWO_tv4.setText(R.string.page93006 );
                    break;
                case 6 : changeCode = 1;
                break;
            }
        }
        else if (page == 95) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.teacher);
                    TWO_tv3.setText(R.string.page95002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page95003);
                    break;
                case  3:
                    TWO_tv4.setText(R.string.page95004 );
                    break;
            }
        }
        else if (page == 96) {
            switch (paragraph) {
                case 1:TWO_tv2.setText("");
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page96002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page96003);
                    break;
                case  3:TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page96004 );
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page96005 );
                    break;

            }
        }
        else if (page == 97) {
            switch (paragraph) {
                case 1:TWO_tv2.setText("");
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page97002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page97003);
                    break;
                case  3:TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page97004 );
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page97005 );
                    break;
                case 5 :
                    changeCode = 1;
                    break;

            }
        }
        else if (page == 98) {
            switch (paragraph) {
                case 1:TWO_tv2.setText("");
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_img1.setBackgroundResource(R.drawable.edu);
                    TWO_tv3.setText(R.string.page98002);
                    break;
                case 2:TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page98003);
                    break;
                case  3:TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page98004 );
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page98005 );
                    break;
                case 5 :
                    changeCode = 1;
                    break;

            }
        }

    }

    public void pageCHOICE(){
        if(page ==9){
            switch (paragraph){
                case 1: THREE_tv1.setText(R.string.page9001);
                break;
                case 2:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_9002_1);
                THREE_imgbtn2.setBackgroundResource(R.drawable.choice_9002_2);
                break;
            }
        }
        else if(page ==26){
            switch (paragraph){// 카톡 글미으로 바꾸는 건??
                case 1: THREE_img1.setImageResource(R.drawable.firework);
                        THREE_tv1.setText(R.string.page26002);
                    break;
                case 2:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice26001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice26001_2);
                    break;

            }
        }
        else if(page ==45){
            switch (paragraph){// 카톡 글미으로 바꾸는 건??
                case 1: THREE_img1.setImageResource(R.drawable.cofffee_icon);
                    THREE_tv1.setText(R.string.page45002);
                    break;
                case 2:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn3.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_45002_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_45002_2);
                    THREE_imgbtn3.setBackgroundResource(R.drawable.choice_45002_3);
                    break;

            }
        }
        else if(page ==47){
            switch (paragraph){// 카톡 글미으로 바꾸는 건??
                case 1: THREE_img1.setImageResource(R.drawable.cofffee_icon);
                    THREE_tv1.setText(R.string.page47002);
                    break;
                case 2:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_47002_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_47002_2);
                    break;

            }
        }
        else if(page ==55){
            switch (paragraph){// 카톡 글미으로 바꾸는 건??
                case 1: THREE_img1.setImageResource(R.drawable.edu);
                    THREE_tv1.setVisibility(View.GONE);
                    break;
                case 2:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_55001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_55001_2);
                    break;

            }
        }
        else if(page ==62){
            switch (paragraph){// 카톡 글미으로 바꾸는 건??
                case 1:
                    THREE_tv1.setText(R.string.page62001);
                    break;
                case 2:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_62001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_62001_2);
                    break;

            }
        }
        else if(page ==67) {
            switch (paragraph) {// 카톡 글미으로 바꾸는 건??
                case 1:
                    THREE_img1.setImageResource(R.drawable.interview);
                    THREE_tv1.setText(R.string.page67002);
                    break;
                case 2:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);
                    THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_67001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_67001_2);
                    break;

            }
        }
        else if(page ==71) {
            switch (paragraph) {// 카톡 글미으로 바꾸는 건??
                case 1:
                    THREE_img1.setImageResource(R.drawable.interview);
                    THREE_tv1.setText(R.string.page71002);
                    break;
                case 2:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);
                    THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_70001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_70001_2);
                    break;

            }
        }
        else if(page ==74) {
            switch (paragraph) {// 카톡 글미으로 바꾸는 건??
                case 1:
                    THREE_img1.setImageResource(R.drawable.interview);
                    THREE_tv1.setText(R.string.page74002);
                    break;
                case 2:
                    THREE_tv2.setText(R.string.page74003);
                    break;
                case 3 :
                    THREE_imgbtn1.setVisibility(View.VISIBLE);
                    THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_74001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_74001_2);
                    break;

            }
        }
        else if(page ==78) {
            switch (paragraph) {// 카톡 글미으로 바꾸는 건??
                case 1:
                    THREE_img1.setImageResource(R.drawable.interview);
                    THREE_tv1.setText(R.string.page78002);
                    break;
                case 2:
                    THREE_tv2.setText(R.string.page78003);
                    break;
                case 3 :
                    THREE_imgbtn1.setVisibility(View.VISIBLE);
                    THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_78001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_78001_2);
                    break;

            }
        }
        else if(page ==89) {
            switch (paragraph) {// 카톡 글미으로 바꾸는 건??
                case 1:
                    THREE_img1.setImageResource(R.drawable.teacher);
                    THREE_tv1.setText(R.string.page89002);
                    break;
                case 2:
                    THREE_tv2.setText(R.string.page89003);
                    break;
                case 3 :
                    THREE_imgbtn1.setVisibility(View.VISIBLE);
                    THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_89001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_89001_2);
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
        else if(page ==10){
            switch (paragraph){
                case 1 : kakao=1;
                break;
                case 2 :  kakao=2;
                break;
                case 3: kakao = 3;
                break;
                case 4: FOUR_tv2.setText(R.string.page10004);
                break;
                case 5: FOUR_tv3.setText(R.string.page10005);
                break;
                case 6 : changeCode =2;
                return changeCode;
                }
        }
        else if(page ==20){
            switch (paragraph){
                case 1 : FOUR_tv1.setText(R.string.page20001);
                    break;
                case 2 :  kakao=1;
                    break;
                case 3: kakao = 2;
                    break;
                case 4: kakao=3;
                break;
                case 5 : changeCode=2;
                    break;
            }
        }
        else if(page ==28){
            switch (paragraph){
                case 1 : kakao = 1;
                break;
                case 2 : kakao = 2;
                break;
                case 3 : FOUR_tv2.setText(R.string.page28002);
                break;
                case 4 : FOUR_tv3.setText(R.string.page28003);
                break;
                case 5 : FOUR_tv2.setText("");
                FOUR_tv3.setText(R.string.page28004);
                break;
            }
        }
        else if(page ==29){
            switch(paragraph){
                case 1 :FOUR_tv2.setText("");FOUR_tv3.setText("");
                    kakao = 1;
                break;
                case 2 : kakao=2;
                break;
                case 3 : FOUR_tv2.setText(R.string.page29002);
                break;
                case 4 : FOUR_tv3.setText(R.string.page29003);
                break;
                case 5 :FOUR_tv3.setText("");
                FOUR_tv2.setText(R.string.page29004);
                break;
                case 6 : FOUR_tv3.setText(R.string.page29005);
                break;
                case 7 :FOUR_tv3.setText("");
                    FOUR_tv2.setText(R.string.page29006);
                break;
            }

        }
        else if(page==30){
            switch (paragraph){
                case 1 :FOUR_tv3.setText("");FOUR_tv2.setText("");FOUR_tv1.setVisibility(View.GONE);
                    kakao =1;
                break;
                case 2 : FOUR_tv2.setText(R.string.page30002);
                break;
            }
        }
        else if(page==31){
            switch (paragraph){
                case 1 :FOUR_tv3.setText("");FOUR_tv2.setText("");
                    kakao =1;
                    break;
                case 2 : kakao =2;
                    break;
                case 3 : kakao =3;
                    break;
                case 4 : kakao =4;
                    break;
                case 5 : FOUR_tv2.setText(R.string.page31002);
                break;
                case 6 : changeCode = 2;
                break;
            }
        }
        else if(page == 38){
            switch (paragraph) {
                case 1:
                    FOUR_tv1.setText(R.string.page38001);
                    break;
                case 2 :kakao = 1;
                break;
                case 3 : kakao = 2;
                break;
                case 4 : kakao=3;
                break;
            }
        }
        else if(page == 39) {
            switch (paragraph) {
                case 1:
                    kakao = 1;
                    break;
                case 2:
                    kakao = 2;
                    break;
                case 3:
                    kakao = 3;
                    break;
                case 4:
                    changeCode = 2;
                    break;
            }
        }
        else if(page ==41) {
                switch (paragraph) {
                    case 1:
                        FOUR_tv1.setText(R.string.page41001);
                        break;
                    case 2:
                        kakao = 1;
                        break;
                    case 3 :kakao = 2;
                        break;
                    case 4 :
                        kakao = 3;
                        break;
                    case 5 : kakao = 4;
                        break;
                    case 6 : kakao = 5;
                        break;
                    case 7 : kakao = 6;
                        break;

                }
            }
        else if(page ==42) {
            switch (paragraph) {
                case 1:kakao = 1;
                    break;
                case 2:
                    kakao = 2;
                    break;
                case 3 :kakao = 3;
                    break;
                case 4 :
                    kakao = 4;
                    break;
                case 5 : kakao = 5;
                    break;
                case 6 : changeCode = 2;
                break;

            }}
        else if(page ==58) {
            switch (paragraph) {
                case 1:kakao = 1;
                    break;
                case 2:
                    kakao = 2;
                    break;
                case 3 :kakao = 3;
                    break;
                case 4 :
                    kakao = 4;
                    break;
                case 5 : kakao = 5;
                    break;
                case 6 : changeCode = 1;
                    break;

            }}
        return kakao;
    }

}
