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
    TextView FOUR_tv4;
    TextView FOUR_tv5;
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

    public void getONE(TextView tv1, TextView tv2, TextView tv3,String l , String f) {
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

    public void getFOUR(TextView tv1, TextView tv2, TextView tv3, LinearLayout frame,String l, String f ,TextView kaka1, TextView kaka2)
    {
        FOUR_tv1 = tv1;
        FOUR_tv2 = tv2;
        FOUR_tv3 = tv3;
        FOUR_frame = frame;
        FOUR_tv4 = kaka1;
        FOUR_tv5 = kaka2;

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
            case 99 :
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
            case 101  :
                pageTINUM();
                break;
            case 102 :
                pageTINUM();
                break;
            case 105 :
                pageTINUM();
                break;
            case 106  :
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
            case 100: pageCHOICE();
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
                case 1 : ONE_tv1.setText(l+f);
                        ONE_tv1.append(": 음.. 면접까지는 좀\n" +
                                "부담스러운 것 같아서\n" +
                                "소개는 괜찮을 것 같아요!");
                    break;
                case 2 : ONE_tv2.setText(R.string.page63002);
                    break;
                case 3 :
                    ONE_tv3.setText(l+f);ONE_tv3.setText(R.string.page63003);
                    break;
                case 4 : ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page63004);
                    break;
                case 5 :ONE_tv2.setText(l+f);
                    ONE_tv2.append(" : ..미안ㅠ 난 여기까지도\n" +
                            "충분한 것 같어\n" +
                            "\n너 해보고 후기 알려주셈ㅎ\n" +
                            "ㅎㅇㅌ~!!");
                    break;
                case 6 : changeCode = 5;

            }
        }
        else if (page == 64) {
            switch (paragraph){
                case 1 : ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(l+f);
                    ONE_tv1.append(" : 음.. 면접까지는 좀 \n 부담스러운 것 같은데...");
                    break;
                case 2 : ONE_tv2.setText(R.string.page63002);
                    break;
                case 3 :
                    ONE_tv3.setText(l+f);ONE_tv3.append(": (작게) 근데 면접도 본대잖아\n" +
                        "뭘 그렇게까지 해가면서 배워..;");
                    break;
                case 4 : ONE_tv2.setText("");ONE_tv2.setText("");
                    ONE_tv1.setText(R.string.page63004);
                    break;
                case 5 :
                    ONE_tv2.setText(l+f);ONE_tv2.append(" : 아..");
                    break;
                case 6 : ONE_tv3.setText(R.string.page64006);
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
                case 1 :ONE_tv1.setText(l+f);
                    ONE_tv1.append(" : 아, 넵! \n 그럼 가보겠습니다!");
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
                case 1 :ONE_tv1.setText(l+f);
                    ONE_tv1.append(" : 아, 넵! \n 그럼 가보겠습니다!");
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
                case 1 :ONE_tv1.setText(l+f);
                    ONE_tv1.append(" : 아 제가 하필 요즘 돈이 떨어져서,,");
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
                case 2 :ONE_tv2.setText(l+f);
                    ONE_tv2.append(": ㅋㅋ그래 너도 편하게 해~");
                    break;
                case 3 :  ONE_tv3.setText(R.string.page94003);
                    break;
                case 4 :ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(l+f);
                    ONE_tv1.append(": (당황) 어 그래ㅎㅎ");
                break;
                case 5 : ONE_tv2.setText(R.string.page94005);
                break;
                case 6 : ONE_tv3.setText(R.string.page94006);
                    break;
                case 7 : changeCode = 2;
                break;
            }
        }
        else if (page == 99) {
            switch (paragraph){
                case 1 :
                    ONE_tv1.setText(R.string.page99001);
                    break;
                case 2 :ONE_tv2.setText(R.string.page99002);
                    break;
                case 3 :  ONE_tv3.setText(R.string.page99003);
                    break;
                case 4 : changeCode = 3;
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
                    TWO_tv3.setText(l + f);
                    TWO_tv3.append(": 아 그냥 해당하는 거 \n체크만 하면 되는 건가요?");
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
                    TWO_tv4.setText(l +f);
                    TWO_tv4.append(": (아니 왜 심리테스트에 \n신앙이 있냐는 얘기가 나오지;\n이런 것도 원래 체크하나)");
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
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(": 다 했어요");

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
                    TWO_tv4.setText(l+f);
                    TWO_tv4.append(": 다 그렸어요!");
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
                    TWO_tv2.append("친구가 \n취업 준비부터 여러가지 상황들 때문에 심적으로 힘들어 보여요~");
                    break;
                case 2:
                    TWO_tv3.setText(l + f);
                    TWO_tv3.setText(": 네 아무래도 그렇죠..?");
                    break;
                case 3:
                    TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page16005);
                    break;
                case 4:
                    TWO_tv3.setText(l + f);
                    TWO_tv3.append(": 아 네 통금시간도 있고 그래서\n집에 빨리 들어가야되고 \n그런 게 좀 있어요");
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
                    TWO_tv3.setText(l + f);
                    TWO_tv3.append(" : 헉ㅋㅋㅋ네 어떻게 아셨어요?\n검사지 보면 그런 것도 \n다 알 수 있어요??");
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page17004);
                    TWO_tv4.append(f);TWO_tv4.append("학생은 그런 느낌이 들어요...!");
                    break;
            }

        }
        else if (page == 18) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(f);
                    TWO_tv2.append(": 아빠가 집에서 맨날 \ntv만 봐도 뭐라하거든요ㅋㅋㅋ \n한 마디씩 꼭 하고");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page18003);
                    TWO_tv3.append(f);TWO_tv3.append("학생이 집에서 많이 힘들었겠다~");
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
                    TWO_tv2.append(f);TWO_tv2.setText("(이)랑 가진이랑 \n같이 오니까 너무 좋다~~.");
                    break;
                case 2:
                TWO_tv3.setText(l+f);TWO_tv3.append("저두요~~");
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page22005);
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
                    TWO_tv3.setText(l + f);
                    TWO_tv3.append(": 제가 자리 지키고 있을게요~");
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
                    TWO_tv4.setText(l+f);
                    TWO_tv4.append(": 그냥 불빛이 너무 예뻐서\n구경하고 있었어ㅎ\n빨리왔네ㅎㅎ");
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
                    TWO_tv3.append(f);TWO_tv3.append(" (이)기 심리적으로 안정된 것 같아서 쌤이 정말 기뻐!!");
                    break;
                case 2:
                    TWO_tv4.setText(l+f);TWO_tv4.append("ㅠㅠ쌤이 신경 많이 써주셨죠");
                    break;
                case 3:
                    TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page39004);
                    break;
                case 4:
                    TWO_tv4.setText(l+f);TWO_tv4.append("감사해요...!");
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
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": (그 공부 얘기인가..)");
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
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append("흠.....저는 \n유교에 대해 배워보고 싶어요");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page46003);
                    break;
                case 3:
                    TWO_tv4.setText(l+f);
                    TWO_tv4.append(": ;;;");
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
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(": 그럼 너 혼자 성경책 배워\n나는 공자 공부 아니면 안 할래;");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page48003);
                    break;
                case 3:
                    changeCode = 5;
                    break;

            }
        }
        else if (page == 49) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(" : 흠.....저는..불ㄱ");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page50003);
                    break;
                case 3 : TWO_tv4.setText(l+f);
                TWO_tv4.setText("(난 딱히 별로 상관없으니까\n가진이 의견 들어줘야겠다.)");

            }
        }
        else if (page == 50) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    TWO_tv2.setText(R.string.page49002);
                    break;
                case 2:
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 성경책으로 배워보죠 뭐");
                    break;

            }
        }
        else if (page == 51) {
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");TWO_tv3.setText("");
                    TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(" : 흠.....\\n(그래도 성경책이 베스트 셀러 아닌가)");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page50003);
                    break;
                case 3:
                    TWO_tv4.setText(l+f);
                    TWO_tv4.append(": 저도.. 그게 나을 것 같아요!");
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
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 뭐에요 쌤?");
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
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(" : 엄마!! 엄마 있어??");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page56003);
                    break;
                case 3 :
                    TWO_tv4.setText(R.string.page56004);
                    break;
                case 4 :
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(": 나 요즘 우리 학교 근처로\n성경공부 다니고 있거든?");
                    break;
                case 5 :
                    TWO_tv3.setText(R.string.page56006);
                    break;
                case 6 :
                    TWO_tv4.setText(l+f);
                    TWO_tv4.append(": 아 몰라 얼마 안됐어\n근데ㅋㅋ 쌤이 심리상담가거든?\n" +
                            "\n원래 꽁짜로 이런거 안해주는데\n나라서 해주는거래ㅋㅋ");
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
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": ??그러게 ? 근데 쌤이 어디가서 말하지 말랬는데ㅠ 엄마한테 말해버렸네 나도 참~!!");
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
                    TWO_tv2.setText(l+f);
                    TWO_tv2.setText(" : 어휴 쌤~ \\n저는 말할데도 없어요!!");
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
                    TWO_tv4.setText(l+f);
                    TWO_tv4.append(" : 우와 면접도 봐요? \n좋은 데인가보다");
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
                case 2:TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아 하고싶긴 한데\n" +
                            "제가 태생이 좀 게을러서요ㅠ");
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
                case 2:TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 부모님이 용돈을 주세요");
                    break;
                case  3: TWO_tv4.setText(R.string.page70004);
                    break;
                case 4 :TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page70005 );
                    break;
                case 5 :TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아, 뭐..");
                    break;
            }
        }
        else if (page == 72) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.interview);
                    TWO_tv2.setText(R.string.page68002);
                    break;
                case 2:TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아 하고싶긴 한데 제가 요즘 정신이 없어가지고 하");
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
                case 2:TWO_tv4.setText(l+f);
                    TWO_tv4.append(": 아니 제가 어디서 들었는데 월,화,목,금 맨날 모여서 성경공부하면 사이비라고 했던 것 같은데 여긴 아닌가요??");
                    break;
                case  3: TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page75004 );
                    break;
                case 4 :TWO_tv4.setText(l+f);
                    TWO_tv4.append(": 아니 알겠는데요 왜 이렇게 시간을 많이 잡아 먹나요?\n" +
                            "일주일에 두 번만 해도 충분할텐데");
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
                    TWO_tv2.setText(l+f);TWO_tv2.append("나 : 아 넵!\n" +
                        "그럼 가보겠습니다!");
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
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(" : 언니 근데 성경을 원래 이렇게  씨는 말씀이다! 비유하면서 배우는게 맞아요?");
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page86003);
                    break;
                case  3: TWO_tv4.setText("");TWO_tv3.setText("");
                TWO_tv2.setText(R.string.page86004);
                    TWO_tv2.append(f);TWO_tv2.append("아~ 원래 이렇게 배우는거야~ 공부 많이 안해봤나보네ㅎㅎ!!");
                    break;
            }
        }
        else if (page == 87) {
            switch (paragraph) {
                case 1:
                    TWO_tv4.setText("");TWO_tv2.setText("");
                    TWO_tv2.setText(l+f);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page87002);
                    break;
                case  3:
                    TWO_tv4.setText(R.string.page87003);
                    break;
                case 4 :
                    TWO_tv4.setText("");TWO_tv2.setText("");
                    TWO_tv3.setText(R.string.page87004 );
                    break;
                case 5 :
                    TWO_tv4.setText(R.string.page87005 );
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
                    TWO_tv4.setText(l+f);
                    TWO_tv4.append(": (되게 발끈하네..)");
                    break;
                case 4 :TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(": 언니 근데 여기 다닌 지  얼마 안됐다고 하지 않았어요?");
                    break;
                case 5 :
                    TWO_tv2.setText(R.string.page88006 );
                    break;
                case 6 :TWO_tv2.setText(l+f);
                    TWO_tv2.append(" : 근데 되게 짬에서 나오는 바이브가  있어 보여서요ㅎ");
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
                case 4 :TWO_tv3.setText(l+f);
                    TWO_tv3.append(" : 아? 안녕하세요!" );
                    break;
                case 5 :
                    TWO_tv3.setText(R.string.page91006 );
                    break;
            }
        }
        else if (page == 92) {
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");TWO_tv2.setText("");
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아 네..!");
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page92003);
                    break;
                case  3: TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv3.setText(l+f);
                    TWO_tv3.setText(": 아뇨 저는 안 다녀요");
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page92005 );
                    break;
            }
        }
        else if (page == 93) {
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");TWO_tv2.setText("");
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(" : 그러시구나ㅎㅎ");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page93003);
                    break;
                case  3:
                    TWO_tv4.setText(l+f);
                    TWO_tv4.append("  : 저 스물셋이요");
                    break;
                case 4 :TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv3.setText(R.string.page93005 );
                    break;
                case 5 :TWO_tv4.setText(l+f);
                    TWO_tv4.append(" : ㅋㅋㅋㅋ그러네요");
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
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아 언니들 제가 이제 개강이 얼마 안남아서 수요일에 예배 참석은 좀 힘들 것 같아요ㅠ");
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
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(" : …");
                    break;
                case 2:TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page98003);
                    TWO_tv2.append(l+f);
                    TWO_tv2.append("지금같이 중요한 시기에\n" +
                            "그렇게 해이해져 버리면\n" +
                            "너의 영이 죽어버릴거야..\n" +
                            "심각해지면 더 이상 돌아올수 없는\n" +
                            "지경까지 갈수가 있어..");
                    break;
                case  3:TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page98004 );
                    TWO_tv3.append(l+f);TWO_tv3.append("~~!!");
                    break;
                case 4 :TWO_tv4.setText(l+f);
                    TWO_tv4.append(": …." );
                    break;
                case 5 :
                    changeCode = 1;
                    break;

            }
        }
        else if (page == 101) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.home);
                    TWO_tv2.setText(R.string.page101002);
                    break;
                case 2:TWO_tv3.setText(l+f);
                    TWO_tv3.append(": (에라 모르겠다..)성경..공부");
                    break;
                case  3:TWO_tv2.setText("");
                    TWO_tv2.setText(R.string.page101003 );
                    break;
                case 4 :TWO_tv3.setText(R.string.page101004);
                    break;
                case 5 :TWO_tv4.setText(R.string.page101005);
                    break;

            }
        }
        else if (page == 102) {
            switch (paragraph) {
                case 1:TWO_tv2.setText("");
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(": 아냐 아빠\n 사이비 아니야 사람들이 너무 다 착하고 좋아..!");
                    break;
                case 2:TWO_tv3.setText(R.string.page102002);
                break;
                case  3:TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page102003 );
                    break;
                case 4 :TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 헉 맞긴 맞는데…" );
                    break;
                case 5 :TWO_tv4.setText(R.string.page12004);
                    changeCode = 1;
                    break;

            }
        }
        else if (page == 103) {
            switch (paragraph) {
                case 1:TWO_tv2.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page103002);
                    break;
                case 2:TWO_tv4.setText(R.string.page103003);
                    break;
                case  3:TWO_tv4.setText(""); TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page102004 );
                    break;
                case 4 :TWO_tv3.setText(R.string.page103005);
                    TWO_tv3.append(": 헉 맞긴 맞는데…" );
                    break;
                case 5 :TWO_tv4.setText(R.string.page103006);
                    changeCode = 5;
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
        else if(page ==100){
            switch (paragraph){
                case 1 : THREE_tv1.setText(R.string.page100002);
                THREE_img1.setTag(R.drawable.home);
                break;
                case 2 : THREE_tv2.setText(R.string.page100003);
                    THREE_tv2.append(l+f);THREE_tv2.append("아, 요즘 뭐하느라 맨날 그렇게 나가니??");
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_100001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_100001_2);
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);

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
                case 1 :FOUR_tv3.setText("");
                FOUR_tv2.setText("");
                FOUR_tv1.setVisibility(View.GONE);
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
