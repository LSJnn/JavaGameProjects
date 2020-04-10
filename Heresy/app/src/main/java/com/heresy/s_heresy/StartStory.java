package com.heresy.s_heresy;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StartStory {

    public static int viewNum;
    public static int page; //ch메ter는 ppt 기준.
    int paragraph; // 문단.//페이지0문단
    int changeCode;

    TextView ONE_tv1;
    TextView ONE_tv2;
    TextView ONE_tv3;
    String l = Application.getSavePageDB().getString("L");
    String f = Application.getSavePageDB().getString("F");

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

    MusicActivity mediaPlayer = Application.getMusicActivity();

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
        }else if (viewNum== 3){
            viewNumIsTHREE();
        }
        Application.getSavePageDB().putInt("saveP",page);
        Application.getSavePageDB().putInt("saveV",viewNum);

    }

    public static int getViewNum(){
        return viewNum;
    }

    public static void setPage(int page) {
        StartStory.page = page;
    }

    public static void setViewNum(int viewNum) {
        StartStory.viewNum = viewNum;
    }

    public static int getPage() {
        return page;
    }


    public void getONE(TextView tv1, TextView tv2, TextView tv3) {
        ONE_tv1 = tv1;
        ONE_tv2 = tv2;
        ONE_tv3 = tv3;
    }

    public void getTWO(ImageView img1, TextView tv1, TextView tv2, TextView tv3, TextView tv4) {
        TWO_img1 = img1;
        TWO_tv1 = tv1;
        TWO_tv2 = tv2;
        TWO_tv3 = tv3;
        TWO_tv4 = tv4;
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

    public void getFOUR(TextView tv1, TextView tv2, TextView tv3, LinearLayout frame,TextView kaka1, TextView kaka2)
    {
        FOUR_tv1 = tv1;
        FOUR_tv2 = tv2;
        FOUR_tv3 = tv3;
        FOUR_frame = frame;
        FOUR_tv4 = kaka1;
        FOUR_tv5 = kaka2;
    }

    public void removeVIew(){
        if(FOUR_frame.getChildCount()>0){
            FOUR_frame.removeAllViews();
        }

    }

    //////브금./////


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
            case 68 :
                pageTNUM();
                break;
            case 72 :
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
            case 103 :
                pageTNUM();
                break;
            case 105 :
                pageTNUM();
                break;
            case 111 :
                pageTNUM();
                break;
            case 112 :
                pageTNUM();
                break;
            case 113 :
                pageTNUM();
                break;
            case 114 :
                pageTNUM();
                break;
            case 115 :
                pageTNUM();
                break;
            case 116 :
                pageTNUM();
                break;
            case 118 :
                pageTNUM();
                break;
            case 119:
                pageTNUM();
                break;
            case 129:
                pageTNUM();
                break;
            case 130:
                pageTNUM();
                break;
            case 140:
                pageTNUM();
                break;
            case 146:
                pageTNUM();
                break;
            case 148:
                pageTNUM();
                break;
            case 149:
                pageTNUM();
                break;
            case 150:
                pageTNUM();
                break;
            case 151:
                pageTNUM();
                break;
            case 152:
                pageTNUM();
                break;
            case 153:
                pageTNUM();
                break;
            case 154:
                pageTNUM();
                break;
            case 167:
                pageTNUM();
                break;
            case 168:
                pageTNUM();
                break;
            case 182:
                pageTNUM();
                break;
            case 183:
                pageTNUM();
                break;
            case 184:
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
/*                MainActivity.mediaPlayer.reset();*/
//                MainActivity.mediaPlayer.plahBgHoly();
                pageTINUM();
                break;
            case 32 :
  //              MainActivity.mediaPlayer.playAfter();
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
//                MainActivity.mediaPlayer.plahBgHoly();
                pageTINUM();
                break;
            case 57  :
                pageTINUM();
                break;
            case 60  :
//                MainActivity.mediaPlayer.playBgSleep();
                pageTINUM();
                break;
            case 61  :
                pageTINUM();
                break;
            case 67  :
                pageTINUM();
                break;
            case 69  :
                pageTINUM();
                break;
            case 71  :
                pageTINUM();
                break;
            case 73  :
                pageTINUM();
                break;
            case 75  :
                pageTINUM();
                break;
            case 76  :
                pageTINUM();
                break;
            case 81  :
 //               MainActivity.mediaPlayer.playBgSome();
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
            case 87  :
                pageTINUM();
                break;
            case 88  :
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
            case 93  :
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
            case 104 :
                pageTINUM();
                break;
            case 106  :
                pageTINUM();
                break;
            case 107  :
                pageTINUM();
                break;
            case 108  :
                pageTINUM();
                break;
            case 109  :
                pageTINUM();
                break;
            case 120  :
                pageTINUM();
                break;
            case 121  :
                pageTINUM();
                break;
            case 122  :
                pageTINUM();
                break;
            case 123  :
                pageTINUM();
                break;
            case 124  :
                pageTINUM();
                break;
            case 125  :
                pageTINUM();
            case 126 :
                //MainActivity.mediaPlayer.playAfter();
                pageTINUM();
            case 127  :
                pageTINUM();
            case 128  :
                pageTINUM();

                break;
            case 131  :
                pageTINUM();
                break;
            case 132  :
                pageTINUM();
                break;
            case 133  :
                pageTINUM();
                break;
            case 134  :
                pageTINUM();
                break;
            case 135  :
                pageTINUM();
                break;
            case 136  :
                pageTINUM();
                break;
            case 137  :
                pageTINUM();
                break;
            case 138  :
                pageTINUM();
                break;
            case 139  :
                pageTINUM();
                break;
            case 141  :
                pageTINUM();
                break;
            case 142  :
                pageTINUM();
                break;
            case 143  :
                pageTINUM();
                break;
            case 144  :
                pageTINUM();
                break;
            case 145  :
               // MainActivity.mediaPlayer.playBgCue();
                pageTINUM();
                break;
            case 154  :
                //MainActivity.mediaPlayer.playBgSpe();
                pageTINUM();
                break;
            case  155 :
                pageTINUM();
                break;
            case 156  :
                pageTINUM();
                break;
            case 157  :
                pageTINUM();
                break;
            case 158  :
                pageTINUM();
                break;
            case 159  :
                pageTINUM();
                break;
            case 160  :
                pageTINUM();
                break;
            case 161  :
                pageTINUM();
                break;
            case 162  :
                pageTINUM();
                break;
            case 163  :
                pageTINUM();
                break;
            case 165  :
                pageTINUM();
                break;
            case 166  :
                pageTINUM();
                break;
            case 169  :
                //MainActivity.mediaPlayer.playBgSome();
                pageTINUM();
                break;
            case 170  :
                pageTINUM();
                break;
            case 171  :
                pageTINUM();
                break;
            case 172  :
                pageTINUM();
                break;
            case 173  :
                pageTINUM();
                break;
            case 174  :
                pageTINUM();
                break;
            case 175  :
                pageTINUM();
                break;
            case 176  :
                pageTINUM();
                break;
            case 177  :
                //MainActivity.mediaPlayer.playBgBap();
                pageTINUM();
                break;
            case 178  :
                pageTINUM();
                break;
            case 180  :
                pageTINUM();
                break;
            case 181  :
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
            case 66: pageCHOICE();
                break;
            case 70: pageCHOICE();
                break;
            case 74: pageCHOICE();
                break;
            case 78: pageCHOICE();
                break;
            case 89: pageCHOICE();
                break;
            case 100: pageCHOICE();
                break;
            case 117: pageCHOICE();
                break;
            case 147: pageCHOICE();
                break;
            case 164: pageCHOICE();
                break;
        }
        return changeCode;
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
            case 28:
                pageKakao();
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
            case 110 : pageKakao();
                break;
            case 122 : pageKakao();
                break;
            case 123 : pageKakao();
                break;
            case 124 : pageKakao();
                break;
            case 179 : pageKakao();
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
                case 3 : ONE_tv3.setText("가진이와는 여기까지이다.\n 더 이상 만나지 않는 게 좋겠다.\n\n그 애와 연락을 모두 끊었다.");
                break;
            }
        }
        else if (page == 35) {
            switch (paragraph){
                case 1 :ONE_tv3.setText("");ONE_tv1.setText("");
                    ONE_tv2.setText(R.string.page35001);
                    break;
                case 2 : ONE_tv2.append("\n\n힘들지만 잘한 거라고 생각한다..");
                    break;
                case 3 : changeCode = 5;//1 35 3
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
                    ONE_tv3.setText(l+f+" : (작게) 근데 면접도 본대잖아\n" +
                            "\\n뭘 그렇게까지 해가면서 배워..;;");
                    break;
                case 4 : ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page63004);
                    break;
                case 5 :ONE_tv2.setText(l+f);
                    ONE_tv2.append(" : ..미안ㅠ 난 여기까지도\n" +
                            "충분한 것 같어\n" );
                    break;
                case 6 : ONE_tv3.setText(  "\n너 해보고 후기 알려주셈ㅎ\n" +
                        "ㅎㅇㅌ~!!");
                    break;
                case 7 : changeCode = 5;

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
                case 4 : ONE_tv2.setText("");ONE_tv3.setText("");
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
                case 3 : changeCode = 3;
                break;
            }
        }
        else if (page == 68) {
            switch (paragraph){
                case 1 :ONE_tv1.setText(l+f);
                    ONE_tv1.append(" : 아, 넵! \n 그럼 가보겠습니다!");
                    break;
                case 2 : ONE_tv2.setText(R.string.page69002);
                    break;
                case 3 : ONE_tv3.setText(R.string.page69003);
                    break;
                case 4 : changeCode = 5;
                break;
            }
        }
        else if (page == 72) {
            switch (paragraph){
                case 1 :ONE_tv1.setText(l+f);
                    ONE_tv1.append(" : 아, 넵! \n 그럼 가보겠습니다!");
                    break;
                case 2 : ONE_tv2.setText(R.string.page69002);
                    break;
                case 3 : ONE_tv3.setText(R.string.page69003);
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
                case 2 :  changeCode = 3;
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
                case 4 : changeCode =5;
                break;
            }
        }
        else if (page == 80) {
            switch (paragraph){
                case 1 :
                    if(mediaPlayer!=null){mediaPlayer.stopMusic();}
                    mediaPlayer.playBgSome();
                    ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page80001);
                    break;
                case 2 :  ONE_tv2.setText(R.string.page80002);
                    break;
                case 3 : changeCode =2;
                break;
            }
        }
        else if (page == 82) {
            switch (paragraph){
                case 1 :
                    ONE_tv1.setText(R.string.page82001);
                    break;
                case 2 :  ONE_tv2.setText(R.string.page82002);
                    break;
                case 3 :  ONE_tv3.setText(R.string.page82003);
                    break;
                case 4 : changeCode =2;
                    break;
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
        else if (page == 103) {
            switch (paragraph) {
                case 1:ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page103002);
                    break;
                case 2:ONE_tv2.setText(R.string.page103003);
                    break;
                case  3:ONE_tv2.setText(""); ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page103004 );
                    break;
                case 4 :ONE_tv2.setText(R.string.page103005);
                    break;
                case 5 :ONE_tv3.setText(R.string.page103006);
                break;
                case  6: changeCode = 5;
                    break;

            }
        }
        else if (page == 105) {
            switch (paragraph) {
                case 1:
                    ONE_tv1.setText(R.string.page105001);
                    break;
                case 2:ONE_tv2.setText(R.string.page105002);
                    break;
                case  3:
                    ONE_tv3.setText(R.string.page105003 );
                    break;
                case 4 :
                    changeCode = 2;
                    break;

            }
        }
        else if (page == 111) {
            switch (paragraph) {
                case 1:
                    ONE_tv1.setText(R.string.page111001);
                    break;
                case 2:ONE_tv2.setText(R.string.page111004);
                    break;
                case  3:
                    ONE_tv3.setText(R.string.page111003);
                    break;
            }
        }
        else if (page == 112) {
            switch (paragraph) {
                case 1:ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page112001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page112002);
                    break;
                case 3:
                    ONE_tv3.setText(R.string.page112003);
                    break;
            }
        }
        else if (page == 113) {
            switch (paragraph) {
                case 1:ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page113001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page113002);
                    break;
                case 3:
                    ONE_tv3.setText(R.string.page113003);
                    break;
            }
        }
        else if (page == 114) {
            switch (paragraph) {
                case 1: ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page114001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page114002);
                    break;
                case 3:
                    ONE_tv3.setText(R.string.page114003);
                    break;
            }
        }
        else if (page == 115) {
            switch (paragraph) {
                case 1: ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page115001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page115002);
                    break;
                case 3:
                    ONE_tv3.setText(R.string.page115003);
                    break;
            }
        }
        else if (page == 116) {
            switch (paragraph) {
                case 1: ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page116001);
                    break;
                case 2: ONE_tv2.setText("\n원래 교육 끝나면 잠깐 모여서\n" +
                        "교제시간 갖는 거요.. 그거 \n");
                break;
                case 3 : ONE_tv3.setText("\n그날 누나네 조만 안하고 흩어졌어요.\n" +
                        "우연일수도 있겠지만..");
                break;
                case 4 : ONE_tv1.setText("");ONE_tv3.setText("");
                    ONE_tv2.setText(R.string.page116002);
                    break;
                case 5:
                    ONE_tv2.append("\n\n누나도 지금 여기서\n" +
                            "휴학까지 하게 만들었잖아요.");
                    break;
                case 6 : changeCode=3;
                break;
            }
        }

        else if (page == 118) {
            switch (paragraph) {
                case 1: ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page118001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page118002);
                    break;
                case 3:
                    ONE_tv3.setText(R.string.page118003);
                    break;
                case 4:ONE_tv1.setText("");ONE_tv3.setText("");
                    ONE_tv2.setText(R.string.page118004);
                    break;
                case 5: changeCode =5;
                break;
            }
        }
        else if (page == 119) {
            switch (paragraph) {
                case 1: ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page119001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page119002);
                    break;
                case 3:ONE_tv3.setText(R.string.page119002_1);
                    break;
                case 4:ONE_tv1.setText("");ONE_tv3.setText("");
                    ONE_tv2.setText(R.string.page119003);
                    break;
                case 5 :
                    ONE_tv2.setText(R.string.page119004);
                    break;
                case 6: changeCode= 2;
                break;
            }
        }
        else if (page == 129) {
            switch (paragraph) {
                case 1:
                    ONE_tv1.setText(R.string.page129002);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page129003);
                    break;
                case 3:ONE_tv3.setText(R.string.page129004);
                    break;
                case 4:ONE_tv3.append("\n\n" +
                        "부모님께도 죄송하고….\n");
                    break;
            }
        }
        else if (page == 130) {
            switch (paragraph) {
                case 1: ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page130002);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page130003);
                    break;
                case 3:ONE_tv3.setText(R.string.page130004);
                    break;
                case 4:ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page130005);
                    break;
                case 5 :
                    ONE_tv2.setText(R.string.page130006);
                    break;
                case 6: ONE_tv3.setText(R.string.page130005);
                    break;
                case 7: changeCode= 5;
                    break;
            }
        }
        else if (page == 140) {
            switch (paragraph) {
                case 1:
                    ONE_tv1.setText(R.string.page140001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page140002);
                    break;
                case 3:ONE_tv3.setText(R.string.page140003);
                    break;
                case 4:ONE_tv1.setText(R.string.page140004);ONE_tv3.setText("");ONE_tv2.setText("");
                    break;
                case 5 :
                    ONE_tv2.setText(R.string.page140005);
                    break;
                case 6: ONE_tv3.setText(R.string.page140006);
                    break;
                case 7: changeCode= 2;
                    break;
            }
        }
        else if (page == 146) {
            switch (paragraph) {
                case 1:
                    ONE_tv1.setText(R.string.page146001);ONE_tv1.append(f);
                    ONE_tv1.append("아 엄마랑 아빠가 \n" +
                        "할 얘기가 있다.\n");
                    break;
                case 2:
                    ONE_tv1.append("\n"+l+f+ " : ??왜 무슨 일이야?");
                    break;
                case 3:ONE_tv2.setText(f);ONE_tv2.append(" 너 요 근래에 가진이랑 \n" +
                        "자주 붙어 다녔지?");
                    break;
                case 4:
                    ONE_tv2.append("\n\n\n"+l+f+": 요즘은 같이 안 다니는데?");
                    break;
                case 5 :
                    ONE_tv3.setText(R.string.page146003);
                    break;
                case 6:  ONE_tv3.append("\n\n" +l+f+ ": 근데?? 왜? 원래 \n" +
                        "자주 연락하고 지내잖아 엄마랑");
                    break;
                case 7:ONE_tv1.setText("");ONE_tv3.setText("");
                ONE_tv2.setText(R.string.page147001);
                break;
                case 8 :
                    ONE_tv3.setText(l+f+" : 그게 무슨 소리야~..");
                    break;
                case 9:
                    changeCode= 3;
                    break;
            }
        }
        else if (page == 148) {
            switch (paragraph) {
                case 1:
                    ONE_tv1.setText(f + "은 배운대로 이 상황을 모면하기위해\n" +
                        "1순위로 새별지 언니들에게 연락하려고 \n" +
                        "핸드폰을 찾아봤지만");
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page148001);
                    break;
                case 3:ONE_tv2.setText("");
                    ONE_tv1.setText(R.string.page148002);ONE_tv2.append(f);ONE_tv2.append("아(야)..");
                    break;
                case 4:ONE_tv2.setText(R.string.page148003);
                    break;
            }
        }
        else if (page == 149) {
            switch (paragraph) {
                case 1:
                    ONE_tv2.setText("");
                    ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page149001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page149002);
                    break;
                case 3:
                    ONE_tv2.setText("");
                    ONE_tv1.setText(f+"아 엄마랑 아빠가 기다려줄게...");
                    break;
                case 4:
                    ONE_tv2.setText(l+ f+" : …….");
                    break;
            }
        }

        else if (page == 150) {
            switch (paragraph) {
                case 1:ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(l+f);ONE_tv1.append(": (웃으며)엄마 무슨 소리야~~\n" +
                        "거기 심리상담이랑 \n" +
                        "신앙 상담 같이 해주는 센터야!!");
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page150001); ONE_tv2.append(f+"아!!!");
                    break;
                case 3:ONE_tv2.append("\n\n 너 왜이렇게 됐니\n 거짓말을 눈 하나 깜빡 안하고 하네!!");
                    break;
                case 4:ONE_tv3.setText(l+f);ONE_tv3.append(" : ….\n");
                break;
            }
        }
        else if (page == 151) {
            switch (paragraph) {
                case 1:ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page151001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page151002);
                    break;
                case 3:ONE_tv3.setText(R.string.page151003);
                    break;
                case 4:ONE_tv1.setText("");ONE_tv3.setText("");
                    ONE_tv2.setText(R.string.page151004);
                    break;
                case 5 :
                    ONE_tv3.setText(l+f);ONE_tv3.append(" : (미치겠네)");
                    break;
            }
        }
        else if (page == 152) {
            switch (paragraph) {
                case 1:ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page152001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page152002);
                    break;
                case 3:ONE_tv3.setText(R.string.page152003);
                    break;
                case 4:ONE_tv3.append("\n\n그야말로 전쟁을 \n대비하신 듯 하다...");
                    break;
            }
        }
        else if (page == 153) {
            switch (paragraph) {
                case 1:ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page153001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page153002);
                    break;
                case 3:changeCode=2;
                    break;
            }
        }
        else if (page == 167) {
            switch (paragraph) {
                case 1:
                    ONE_tv1.setText(R.string.page167001);
                    break;
                case 2:
                    ONE_tv2.setText(R.string.page167002);
                    break;
                case 3:ONE_tv3.setText(R.string.page167003);
                break;
            }
        }
        else if (page == 168) {
            switch (paragraph) {
                case 1:ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page168001);
                    break;
                case 2:ONE_tv1.append("\n\n난 정말 꽉 막혀있었다.\n" +
                        "거의 1년 가까이 되는 시간을 \n" +
                        "세뇌속에서 살고 피폐해져 왔다.");
                break;
                case 3:
                    ONE_tv2.setText(R.string.page168002);
                    break;
                case 4:ONE_tv2.append("\n부모님이 아니었다면\n" +
                        "늙어 죽을 때까지 그곳에서 혹사당하고\n" +
                        "바보같이 살았을 것이다..");
                break;
                case 5 :
                    ONE_tv3.setText(R.string.page168003);
                    break;
                case 6 : changeCode= 5;
                break;
            }
        }
        else if (page == 182) {
            switch (paragraph) {
                case 1:
                    ONE_tv1.setText(R.string.page182001);
                    break;
                case 2:ONE_tv2.setText(R.string.page182002);
                ONE_tv2.append(l+f+" 너 \n요즘 전도 실적이 왜 이래?\n" +
                        "구원 안 받을거야??!!\n");
                    break;
                case 3:
                    ONE_tv3.setText(R.string.page182003);
                    break;
                case 4:ONE_tv1.setText(l+f + " : 죄송합니다 팀장님..");
                ONE_tv3.setText("");ONE_tv2.setText("");
                    break;
                case 5 : ONE_tv2.setText(R.string.page182004);
                break;
                case 6 : ONE_tv3.setText(l+f + " :  ….");
                    break;
            }
        }
        else if (page == 183) {
            switch (paragraph) {
                case 1:ONE_tv3.setText("");ONE_tv2.setText("");
                    ONE_tv1.setText(R.string.page183001);
                    break;
                case 2:ONE_tv2.setText(l+f + " : 죄송해요.. 내일은 꼭 낚아올게요..\n");
                    break;
                case 3:ONE_tv2.setText("");
                    ONE_tv1.setText(R.string.page183002);
                    break;
                case 4:ONE_tv2.setText(l+f + " : …네..");
                    break;
                case 5 : ONE_tv3.setText(R.string.page183003);
                    break;
            }
        }
        else if (page == 184) {
            switch (paragraph) {
                case 1:ONE_tv2.setText("");ONE_tv3.setText("");
                    ONE_tv1.setText(R.string.page184001);
                    break;
                case 2:ONE_tv2.setText(R.string.page184002);
                    break;
                case 3:
                    ONE_tv3.setText(R.string.page184003);
                    break;
                case 4:ONE_tv1.setText(R.string.page184002);
                    ONE_tv2.setText(R.string.page184003);
                    break;
                case 5 :
                    ONE_tv1.setText(R.string.page184003);
                    ONE_tv3.setText(R.string.page184003);
                    break;
                case 6 : ONE_tv3.setText(R.string.page184004);
                break;
                case 7 : changeCode= 6;
                break;
            }
        }












    }

    public void pageTINUM() {
        if (page == 11) {
            switch (paragraph) {//ppt 쪽수 중 문단
                case 1:TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page11002);
                    break;
            }
        }
        else if (page == 12) { // 이미지 새로 삽입 안 함... 전 이미지 저장 될까..??.. changeCode 하면 안넘겨지고 안하면 넘겨짐. ?? intent 니까.
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
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
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
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
                    TWO_tv4.append(" : \n(아니, 근데 왜 심리 테스트에 \n신앙이 있냐는 얘기가 나오지;;\n이런 것도 원래 체크하나)");
                    break;
            }

        }
        else if (page == 14) {
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
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
                    TWO_tv2.append(" : 다 했어요");

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
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page15002);
                    break;
                case 2:
                    TWO_tv2.append("\n먼저 산이랑 해를\n 그려볼래요?");
                    break;
                case 3 :
                    TWO_tv3.setText(R.string.page15003);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page15004);
                    break;
                case 5:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page15005);
                    break;
                case 6:
                    TWO_tv3.setText(R.string.page15006);
                    break;
                case 7:
                    TWO_tv4.setText(l+f);
                    TWO_tv4.append(" : 다 그렸어요!");
                    break;

            }
        }
        else if (page == 16) {
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText( R.string.page16002);
                    break;
                case 2 :
                    TWO_tv3.setText(l + f+" 친구가 취업 준비부터\n 여러가지 상황들 때문에\n 심적으로 힘들어 보여요~");
                    break;
                case 3:
                    TWO_tv4.setText(l + f+" : 네.. 아무래도 좀 그렇죠..?");
                    break;
                case 4:
                    TWO_tv2.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page16005);
                    break;
                case 5:
                    TWO_tv4.setText(l + f+" : 아 네 \n통금시간도 있고 그래서\n집에 빨리 들어가야되고 \n그런 게 좀 있어요");
                    break;
            }

        }
        else if (page == 17) {
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page17002);
                    break;
                case 2:
                    TWO_tv3.setText(l + f);
                    TWO_tv3.append(" : 헉ㅋㅋㅋ\n네 어떻게 아셨어요?\n검사지 보면 그런 것도 \n다 알 수 있어요??");
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page17004);
                    TWO_tv4.append(" "+f);TWO_tv4.append(" 학생은\n 그런 느낌이 들어요...!");
                    break;
            }

        }
        else if (page == 18) {
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(f);
                    TWO_tv2.append(": 아빠가 집에서 맨날 \n tv만 봐도 뭐라하거든요ㅋㅋㅋ \n한 마디씩 꼭 하고..");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page18003);
                    TWO_tv3.append(" "+f+" 학생이 \n집에서 많이 힘들었겠다~");
                    break;
            }

        }
        else if (page == 19) {
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
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
                case 1:TWO_img1.setImageResource(R.drawable.pizza);
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.plahBgHoly();
                    break;
                case 2 : TWO_tv2.setText(R.string.page21002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page21003);
                    break;
            }
        }
        else if (page == 22) {
            TWO_img1.setImageResource(R.drawable.pizza);
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.pizza);
                    TWO_tv2.setText(R.string.page22002);TWO_tv3.setText("");
                    TWO_tv2.append(f+", 가진이랑 \n같이 오니까 너무 좋다~~.");
                    break;
                case 2:
                TWO_tv3.setText(l+f);TWO_tv3.append(": 저두요~~");
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page22005);
                    break;

            }
        }
        else if (page == 23) {
            switch (paragraph) {
                case 1:TWO_img1.setImageResource(R.drawable.firework);
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page23002);
                    break;
            }
        }
        else if (page == 24) {
            TWO_img1.setImageResource(R.drawable.firework);
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
                    TWO_tv4.setText(l + f);
                    TWO_tv4.append(" : 제가 자리 지키고 있을게요~");
                    break;
            }
        }
        else if (page == 25) {
            TWO_img1.setImageResource(R.drawable.firework);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page25002);
                    break;
                case 2:
                    TWO_tv2.append("\n\n선생님의 것으로 추정되는데….");
                    break;
                case 3 :
                    changeCode = 3;
                    break;
            }
        }
        else if (page == 27) {
            switch (paragraph) {
                case 1:TWO_img1.setImageResource(R.drawable.kakao_miri);
                    if(mediaPlayer!=null){mediaPlayer.stopMusic();
                        mediaPlayer.playBgAppre();}
                    break;
                case 2:TWO_tv2.setText(R.string.page27002);
                break;
                case 3:TWO_tv3.setText(R.string.page27003);
                break;
                case 4 : changeCode = 4;
                    break;
            }
        }
        else if (page == 32) {
            switch (paragraph) {
                case 1:TWO_img1.setImageResource(R.drawable.firework);
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.playAfter();
                    break;
                case 2:TWO_tv2.setText(R.string.page32002);
                    break;
                case 3 : TWO_tv3.setText(R.string.page32003);
                break;
            }
        }
        else if (page == 33) {
            TWO_img1.setImageResource(R.drawable.firework);
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
            TWO_img1.setImageResource(R.drawable.firework);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(R.string.page36002);
                    break;
                case 2:TWO_tv2.append("\n쌤,가진 : 우리 왔어");
                break;
                case 3 :
                    TWO_tv3.setText(R.string.page36003);
                    break;
                case 4:
                    TWO_tv3.setText("");
                    TWO_tv2.setText("\n"+l+f+" : 그냥 불빛이 너무 예뻐서\n구경하고 있었어ㅎ");
                break;
                case 5 :
                TWO_tv3.setText("\n빨리왔네ㅎㅎ");
                    break;
                case 6:
                    changeCode = 1;
                    break;
            }
        }
        else if (page == 40) {
            switch (paragraph) {
                case 1:TWO_img1.setImageResource(R.drawable.cofffee_icon);
                    break;
                case 2:TWO_tv3.setText(R.string.page39002);
                    TWO_tv3.append(" "+f+" 친구가 \n심리적으로 안정된 것 같아서 \n쌤이 정말 기뻐!!");
                    break;
                case 3:
                    TWO_tv4.setText(l+f);TWO_tv4.append(" : ㅠㅠ쌤이 신경 많이 써주셨죠");
                    break;
                case 4:
                    TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page39004);
                    break;
                case 5 :TWO_tv3.append("\n\n다 들어줄테니까.");
                    break;
                case 6:
                    TWO_tv4.setText(l+f);TWO_tv4.append(" : 감사해요...!");
                    break;
                case 7 :
                    changeCode = 4;
                    break;
            }
        }
        else if (page == 43) {
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
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
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
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
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(l+f+" : 흠.....저는 \n유교에 대해 배워보고 싶어요");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page46003);
                    break;
                case 3:
                    TWO_tv4.setText(l+f+ " : ;;;");
                    break;
                case 4:
                    changeCode = 3;
                    break;

            }
        }
        else if (page == 48) {
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
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
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
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
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(R.string.page49002);
                    break;
                case 2:
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 성경책으로 배워보죠 뭐");
                    break;

            }
        }
        else if (page == 51) {
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(" : 흠.....\n(그래도 성경책이 베스트 셀러 아닌가)");
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
            TWO_img1.setImageResource(R.drawable.cofffee_icon);
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
                case 1 :TWO_img1.setImageResource(R.drawable.edu);
                    break;
                case 2:
                    TWO_tv4.setText("");TWO_tv1.setText("");TWO_tv2.setText("");
                    TWO_tv3.setText(R.string.page53001);
                    break;
                case 3:
                    TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page53002);
                    break;
                case 4 :
                    TWO_tv3.setText(l+f+" : 뭐에요 쌤?");
                    break;
                case 5 :
                    TWO_tv4.setText(R.string.page53004);
                break;
            }
        }
        else if (page == 54) {
            TWO_img1.setImageResource(R.drawable.edu);
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
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.plahBgHoly();
                    break;
                case 2:
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(" : 엄마!! 엄마 있어??");
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
                case 6 :
                    TWO_tv4.setText(l+f);
                    TWO_tv4.append(": 아 몰라 얼마 안됐어\n근데ㅋㅋ 쌤이 심리상담가거든?\n");
                    break;
                case 7 :
                    TWO_tv4.append("\n원래 꽁짜로 이런거 안해주는데\n나라서 해주는거래ㅋㅋ");
                    break;
            }
        }
        else if (page == 57) {
            TWO_img1.setImageResource(R.drawable.home);
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
                case 1:TWO_img1.setImageResource(R.drawable.edu);
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.playBgSleep();
                    break;
                case 2:
                    TWO_tv2.setText(l+f+" : 어휴 쌤~ \n저는 말할데도 없어요!!");
                    break;
                case 3 :
                    TWO_tv3.setText(R.string.page60003);
                    break;
            }
        }
        else if (page == 61) {
            TWO_img1.setImageResource(R.drawable.edu);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page61001);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page61002);
                    break;
                case 3:
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page61003);
                    break;
                case 4:
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(" : 우와 면접도 봐요? \n좋은 데인가보다");
                    break;
                case  5: changeCode = 3;
                break;
            }
        }

        else if (page == 67) {
            switch (paragraph) {
                case 1:TWO_img1.setImageResource(R.drawable.interview);
                    break;
                case 2:
                    TWO_tv2.setText(R.string.page68002);
                    break;
                case  3:
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아 하고싶긴 한데\n" +
                            "제가 태생이 좀 게을러서요ㅠ");
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page68004);
                break;
                case 5 :
                    TWO_tv3.setText(R.string.page68005 );
                    TWO_tv2.setText("");TWO_tv4.setText("");
                break;
                case  6:
                    changeCode = 1;
                    break;
            }
        }
        else if (page == 69) {
            TWO_img1.setImageResource(R.drawable.interview);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(R.string.page70002);
                    break;
                case 2:TWO_tv3.setText(l+f + " : 부모님이 용돈을 주세요");
                    break;
                case  3: TWO_tv4.setText(R.string.page70004);
                    break;
                case 4 :TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page70005 );
                    break;
                case 5 :TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아, 뭐..");
                    break;
                case 6 : changeCode = 3;
                break;
            }
        }
        else if (page == 71) {
            TWO_img1.setImageResource(R.drawable.interview);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(R.string.page68002);
                    break;
                case 2:TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아 하고 싶긴 한데..\n 제가 요즘 정신이 없어가지고 하");
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
        else if(page==73){
            TWO_img1.setImageResource(R.drawable.interview);
            switch (paragraph){
                case 1 :
                        TWO_tv3.setText("여자 면접관 : 그럼 다음주부터 \n" +
                                "유다마트 앞 건물 3층에 있는 센터에서 교육 진행하는 것으로 할게요.");
                        break;
                case 2 : changeCode = 3;
                break;
            }
        }
        else if (page == 75) {
            TWO_img1.setBackgroundResource(R.drawable.interview);
            switch (paragraph) {
                case 1:
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
            TWO_img1.setBackgroundResource(R.drawable.interview);
            switch (paragraph) {
                case 1:
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
                    break;
                case 2 :
                    TWO_tv3.setText(R.string.page81002);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page81003);
                    break;
                case  4: TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page81004 );
                    break;
                case 5:
                    TWO_tv3.setText(R.string.page81005 );
                    break;
                case 6 :
                    changeCode = 1;
                    break;
            }
        }
        else if (page == 83) {
            TWO_img1.setBackgroundResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(R.string.page83002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page83003);
                    break;
                case  3:
                    TWO_tv4.setText(R.string.page83004 );
                    break;
            }
        }
        else if (page == 84) {
            TWO_img1.setBackgroundResource(R.drawable.teacher);
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
            TWO_img1.setBackgroundResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:
                    TWO_tv4.setText("");TWO_tv2.setText("");
                    TWO_tv3.setText(R.string.page85002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page85003);
                    break;
                case  3: TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page85004 );
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page85005 );
                    break;
            }
        }
        else if (page == 86) {
            switch (paragraph) {
                case 1:TWO_img1.setBackgroundResource(R.drawable.edu);
                break;
                case 2 :
                    TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(" : 언니 근데 성경을 원래 이렇게  씨는 말씀이다! 비유하면서 배우는게 맞아요?");
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page86003);
                    break;
                case 4:
                TWO_tv4.setText(R.string.page86004);
                    TWO_tv4.append(f);TWO_tv4.append("아~ 원래 이렇게 배우는거야~ 공부 많이 안해봤나보네ㅎㅎ!!");
                    break;
            }
        }
        else if (page == 87) {
            TWO_img1.setBackgroundResource(R.drawable.edu);
            switch (paragraph) {
                case 1:
                    TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(l+f+ " : 어디서 들었는데 ");
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
            TWO_img1.setBackgroundResource(R.drawable.edu);
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
                    TWO_tv3.setText(R.string.page88006 );
                    break;
                case 6 :TWO_tv4.setText(l+f);
                    TWO_tv4.append(" : 근데 되게 짬에서 나오는 바이브가  있어 보여서요ㅎ");
                    break;
                case 7 :
                    changeCode = 3;
                    break;
            }
        }
        else if (page == 90) {
            switch (paragraph) {
                case 1:TWO_img1.setBackgroundResource(R.drawable.zzazang);
                    if(mediaPlayer!=null) {
                        mediaPlayer.stopMusic();
                    }
                    mediaPlayer.playBgSleep();
                break;
                case 2:
                    TWO_tv2.setText(R.string.page90002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page90003);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page90004);
                    break;
            }
        }
        else if (page == 91) {
            TWO_img1.setBackgroundResource(R.drawable.zzazang);
            switch (paragraph) {
                case 1:TWO_tv2.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page91002);
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page91003);
                    break;
                case  3: TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page91004 );
                    break;
                case 4 :TWO_tv3.setText(l+f);
                    TWO_tv3.append(" : 아? 안녕하세요!" );
                    break;
                case 5 :
                    TWO_tv4.setText(R.string.page91006 );
                    break;
            }
        }
        else if (page == 92) {
            TWO_img1.setBackgroundResource(R.drawable.zzazang);
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");TWO_tv2.setText("");
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아 네..!");
                    break;
                case 2:
                    TWO_tv4.setText(R.string.page92003);
                    break;
                case 3: TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아뇨 저는 안 다녀요");
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page92005 );
                    break;
            }
        }
        else if (page == 93) {
            TWO_img1.setBackgroundResource(R.drawable.zzazang);
            switch (paragraph) {
                case 1:
                    TWO_tv4.setText("");TWO_tv3.setText("");
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
                case 4 :TWO_tv4.setText("");TWO_tv2.setText("");
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
                case 1:TWO_img1.setBackgroundResource(R.drawable.teacher);
                if(Application.isZ()){
                    //먹으면.
                    if(mediaPlayer!=null) {
                        mediaPlayer.stopMusic();
                    }
                    mediaPlayer.playBgSome();
                }
                break;
                case 2 :
                    TWO_tv3.setText(R.string.page95002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page95003);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page95004 );
                    break;
            }
        }
        else if (page == 96) {
            TWO_img1.setBackgroundResource(R.drawable.teacher);
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
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.edu);
                    TWO_tv4.setText("");TWO_tv3.setText("");
                    break;
                case 2 :
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(": 아 언니들 제가 이제 개강이 얼마 안남아서 수요일에 예배 참석은 좀 힘들 것 같아요ㅠ");
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page97003);
                    break;
                case 4:TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page97004 );
                    break;
                case 5 :
                    TWO_tv4.setText(R.string.page97005 );
                    break;

            }
        }
        else if (page == 98) {
            TWO_img1.setBackgroundResource(R.drawable.edu);
            switch (paragraph) {
                case 1:TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(l+f);
                    TWO_tv2.append(" : …");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page98003);
                    TWO_tv3.append("\n지금같이 중요한 시기에\n" +
                            "그렇게 해이해져 버리면\n" +f+
                            "의 영은 죽어버릴거야..");
                    break;
                case 3 : TWO_tv2.setText("심각해지면 더 이상 돌아올 수 없는\n" +
                        "지경까지 갈 수가 있어..");
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    break;
                case  4:
                    TWO_tv3.setText(R.string.page98004 );
                    TWO_tv3.append("\n"+l+f+"~~!!");
                    break;
                case 5 :TWO_tv4.setText(l+f);
                    TWO_tv4.append(": …." );
                    break;
                case 6 :
                    changeCode = 1;
                    break;

            }
        }
        else if (page == 101) {
            switch (paragraph) {
                case 1:TWO_img1.setBackgroundResource(R.drawable.home);
                break;
                case 2:
                    TWO_tv2.setText(R.string.page101002);
                    break;
                case 3:TWO_tv3.setText(l+f);
                    TWO_tv3.append(": (에라 모르겠다..)\n성경..공부");
                    break;
                case 4:TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page101003 );
                    break;
                case 5 :TWO_tv3.setText(R.string.page101004);
                    break;
                case 6 :TWO_tv4.setText(R.string.page101005);
                    break;

            }
        }
        else if (page == 102) {
            TWO_img1.setBackgroundResource(R.drawable.home);
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
                case 5 :TWO_tv4.setText(R.string.page102004);
                    changeCode = 1;
                    break;

            }
        }
        else if (page == 104) {
            TWO_img1.setBackgroundResource(R.drawable.home);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(R.string.page104002);
                    break;
                case 2:
                    TWO_tv2.append("\n아빠가 잔소리 하는 것 같아도\n");
                    break;
                case 3 : TWO_tv2.append("이게 다 우리 딸 생각해서 \n하는 소리인 거 알지?");
                break;
                case 4 : TWO_tv2.append("\n\n취업 때문에 부담 갖지 말고..");
                break;
                case 5 :
                    TWO_tv3.setText(l+f);TWO_tv3.append(" : 으응.. 알지 아빠..");
                    break;
                case 6:TWO_tv4.setText(R.string.page104003 );
                    break;
                case 7 :
                    changeCode = 1;
                    break;

            }
        }
        else if (page == 106) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.teacher);
                    break;
                case 2 :
                    TWO_tv2.setText(R.string.page106002);
                    break;
                case 3:TWO_tv3.setText(R.string.page106003);
                    break;
                case 4:TWO_tv4.setText(R.string.page106004);
                    break;
            }
        }
        else if (page == 107) {
            TWO_img1.setImageResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:TWO_tv2.setText("");
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page107002);
                    break;
                case 2:TWO_tv3.setText(R.string.page107003);
                    break;
                case  3:TWO_tv3.append("\n\n 하지만 지금 보세요 \n메시아라고 찬양받고 있지 않습니까?");
                break;
                case 4 :
                    TWO_tv4.setText(R.string.page107004);
                    break;
            }
        }
        else if (page == 108) {
            TWO_img1.setImageResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page100802);
                    break;
                case 2:TWO_tv3.setText(R.string.page108003);
                    break;
                case  3:TWO_tv3.append("\n 그리고 그 마음의 성전을 \n 잘 지키세요...");
                    break;
                case 4 :
                    TWO_tv4.setText(R.string.page108004);
                    break;
                case 5 : TWO_tv3.setText(R.string.page108005);
                    TWO_tv2.setText("");TWO_tv4.setText("");
                break;

            }
        }
        else if (page == 109) {
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_img1.setImageResource(R.drawable.edu);
                    break;
                case 2 :
                    TWO_tv2.setText(R.string.page109002);
                    break;
                case 3:TWO_tv3.setText(R.string.page109003);
                TWO_tv3.append(f);TWO_tv3.append("이가 신앙 탑인 것 같아 \n진짜ㅋㅋ 열심이야 배워야겠어\n");
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page109004 );
                    break;
                case 5 :TWO_tv2.setText(R.string.page109005);TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.append(f );TWO_tv2.append("이 뭐 힘들거나\n" +
                        "그런거 있으면 말해 진짜\n" +
                        "응원한다 언니가\n");
                    break;
                case 6 :
                    TWO_tv3.setText(l+f);TWO_tv3.append(": 고마워요 언니들ㅠㅠㅠ");
                    break;
                case 7 :
                    if(Application.isZ()==true) {//짜장면 먹음.
                        changeCode = 4;
                    }//안머으면 131로. 그대로 여기 뷰.
                    break;

            }
        }
        else if (page == 120) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.teacher);
                    break;
                case 2 :
                    TWO_tv3.setText(R.string.page120000);
                    break;
                case 3:TWO_tv4.setText(R.string.page120001);
                    break;
                case 4:TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page120002 );
                    break;
                case 5 :TWO_tv3.setText(R.string.page120003);
                    break;
                case 6 :
                    TWO_tv4.setText(R.string.page120004);
                    break;
            }
        }
        else if (page == 121) {
            switch (paragraph) {
                case 1:TWO_img1.setImageResource(R.drawable.edu);
                TWO_tv3.setText("");TWO_tv4.setText("");
                TWO_tv2.setText("");
                break;
                case 2 :
                    TWO_tv2.setText(R.string.page121001);
                    break;
                case 3:TWO_tv3.setText(R.string.page121001_1);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page121002 );
                    break;
                case 5 :TWO_tv3.setText("");TWO_tv4.setText("");
                TWO_tv2.setText(R.string.page121003);
                break;
                case 6 :
                    TWO_tv3.setText(R.string.page121004);
                    break;
                case 7 :
                    TWO_tv4.setText(R.string.page121005);
                    break;
                case 8: changeCode = 4;
                break;

            }
        }

        else if (page == 125) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setImageResource(R.drawable.tea);
                    break;
                case 2 :
                    TWO_tv2.setText(l+f);TWO_tv2.append(" : 가진아..\n 센터 다니는 거 재밌어..?");
                    break;
                case 3:TWO_tv3.setText(R.string.page125002);
                    break;
                case 4:
                    TWO_tv4.setText(l+f);TWO_tv4.append(": ….\n");
                    break;
                case 5 :TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page125003);
                    break;
                case 6 :
                    TWO_tv3.setText(R.string.page125004);
                    break;
                case 7: TWO_tv4.setText(R.string.page125005);
                    break;

            }
        }
        else if (page == 126) {
            TWO_img1.setImageResource(R.drawable.tea);
            switch (paragraph) {
                case 1:
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.playAfter();
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(l+f);TWO_tv2.append(": 거기 교육받고 그러는 거\n" +
                        "새별지 아니냐고.. ");
                    break;
                case 2:TWO_tv3.setText(R.string.page126002);
                    break;
                case  3:
                    TWO_tv4.setText(R.string.page126003 );
                    break;
                case 4 :TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(l+f);TWO_tv2.append(" : …. 그게 할 소리야???\n");
                    break;
                case 5 :
                    TWO_tv3.setText(R.string.page126004);
                    break;
                case 6: TWO_tv4.setText(R.string.page126005);
                    break;

            }
        }
        else if (page == 127) {
            TWO_img1.setImageResource(R.drawable.tea);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page127002);
                    break;
                case 2:
                    TWO_tv3.setText("\n\n제명이야~\n");
                    break;
                case 3 : TWO_tv4.setText("너한테 비진리영 옮으면 안되니까"+"\n내 연락처 지우거나 차단 해줄래?");
                    break;
                case 4:TWO_tv2.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(l+f );TWO_tv3.append(" : … 너 나를 친구로는 생각했니?");
                    break;
                case 5 :
                    TWO_tv4.setText(R.string.page127004);
                    break;

            }
        }
        else if (page == 128) {
            TWO_img1.setImageResource(R.drawable.tea);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(l+f);TWO_tv2.append(" : ..김만춘 개XX.");
                    break;
                case 2:TWO_tv3.setText(R.string.page128001);
                    break;
                case  3:
                    TWO_tv4.setText(l+f);TWO_tv4.append(" : 김만춘 개XX. \n김만춘 미친 사이비 새끼!!!");
                    break;
                case 4 :TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page128002);
                    break;
                case 5 :
                    TWO_tv3.setText(R.string.page128003);
                    break;
                case 6:
                    TWO_tv4.setText(R.string.page128004);
                    break;
                case 7:TWO_tv2.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(l+f);TWO_tv3.append(": 하.. \n너랑은 여기까지인 것 같다.\n 너랑 있던 지난 시간이 \n너무 아까워.");
                    break;
                case 8 : TWO_tv4.setText("(일어서서 나감)");
                break;
                case 9 : changeCode = 1;
                break;
            }
        }
        else if (page == 131) {
            switch (paragraph) {
                case 1:TWO_img1.setImageResource(R.drawable.teacher);
                break;
                case 2 :
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv1.setText(R.string.page131002);
                    break;
                case 3:
                    TWO_tv2.setText(R.string.page131003);
                    break;
                case 4:
                    TWO_tv3.setText(R.string.page131004);
                    break;
                case 5:
                    TWO_tv4.setText(R.string.page131005);
                    break;
                case 6:
                    TWO_tv2.setText("");
                    TWO_tv4.setText("");
                    TWO_tv1.setText("");
                    TWO_tv3.setText(R.string.page131006);
                    break;

            }

        }

        else if (page == 132) {
            TWO_img1.setImageResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:
                    TWO_tv1.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(l+f);TWO_tv2.append(" : (뭐야.. 우리가 새별지라고..?)");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page132002);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page132003);
                    break;
            }

        }
        else if (page == 133) {
            switch (paragraph) {
                case 1:TWO_img1.setImageResource(R.drawable.edu);
                break;
                case 2 :
                    TWO_tv2.setText(l+f);TWO_tv2.append("  : (농담 투로)\n 언니가 그때 여기 \n" +
                        "새별지 아니랬는데\n" +
                        " 오늘 강사님이 \n" +
                        "새별지라고 말해주셨네요ㅋㅋㅋ");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    break;
                case 3:
                    TWO_tv2.setText(R.string.page133002);
                    break;
                case 4:
                    TWO_tv3.setText(l+f);TWO_tv3.append(" : (아ㅋㅋ역시 고인물이었군)\n" +
                        "ㅎㅎ언니 고마워요 내가 진리를 알 수 있게 도와줘서요.");
                    break;

            }

        }
        else if (page == 134) {
            switch (paragraph) {
                case 1:TWO_img1.setImageResource(R.drawable.teacher);
                break;
                case 2 :
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv1.setText(R.string.page134001);
                    break;
                case 3:
                    TWO_tv2.setText(R.string.page134002);
                    break;
                case 4:
                    TWO_tv3.setText(R.string.page134003);
                    break;
                case 5:
                    TWO_tv4.setText(R.string.page134004);
                    break;

            }

        }
        else if (page == 135) {
            TWO_img1.setImageResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:
                    TWO_tv1.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page135002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page135003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page135004);
                    break;

            }

        }
        else if (page == 136) {
            TWO_img1.setImageResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page136002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page136003);
                    break;
                case 3:TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page136004);
                    break;
                case 4:
                    TWO_tv3.setText(R.string.page136005);
                    break;
                case 5:
                    TWO_tv4.setText(R.string.page136006);
                    break;

            }

        }
        else if (page == 137) {
            TWO_img1.setImageResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");
                    TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page137002);
                    break;
                case 2: TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page137003);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page137004);
                    break;

            }

        }
        else if (page == 138) {
            TWO_img1.setImageResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page138002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page138003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page138004);
                    break;
            }

        }
        else if (page == 139) {
            TWO_img1.setImageResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv1.setText(R.string.page139001);
                    break;
                case 2:
                    TWO_tv2.setText(R.string.page139002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page139003);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page139004);
                    break;
                case 5:
                    changeCode =1;
                    break;

            }

        }
        else if (page == 141) {
            TWO_img1.setBackgroundResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:
                    break;
                case 2:
                    TWO_tv2.setText(R.string.page141002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page141003);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page141004);
                    break;
            }
        }
        else if (page == 142) {
            switch (paragraph) {
                case 1:TWO_img1.setBackgroundResource(R.drawable.edu);
                break;
                case 2 :
                    TWO_tv2.setText(R.string.page142002);TWO_tv2.append(l+f);
                    TWO_tv2.append("아 \n전도는 일단 언니들이랑 붙어서\n 노방전도부터 시작하면 돼 .");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page142003);
                    break;
                case 4:TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page142004);
                    break;
                case 5:
                    TWO_tv4.setText(R.string.page142005);
                    break;
            }

        }
        else if (page == 143) {
            switch (paragraph) {
                case 1:TWO_img1.setBackgroundResource(R.drawable.teacher);
                break;
                case 2 :
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv1.setText(R.string.page143001);
                    break;
                case 3:
                    TWO_tv2.setText(R.string.page143002);
                    break;
                case 4:
                    TWO_tv3.setText(R.string.page143003);
                    break;
                case 5:
                    TWO_tv4.setText(R.string.page143004);
                    break;

            }

        }
        else if (page == 144) {
            TWO_img1.setBackgroundResource(R.drawable.teacher);
            switch (paragraph) {
                case 1:TWO_tv1.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page144002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page144003);
                    break;
                case 3:
                    TWO_tv3.append("\n김 만! 춘! 메 시 아~~~~.\n");
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page144005);
                    break;
            }

        }
        else if (page == 145) {
            switch (paragraph) {
                case 1:TWO_img1.setBackgroundResource(R.drawable.home);
                break;
                case 2 :
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.playBgCue();
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv1.setText(R.string.page145001);
                    break;
                case 3:
                    TWO_tv2.setText(R.string.page145002);
                    break;
                case 4:
                    TWO_tv3.setText(l+f);TWO_tv3.append(" : 응~");
                    break;
                case 5:
                    TWO_tv4.setText(R.string.page145004);
                    break;
                case 6:TWO_tv2.setText("");
                    TWO_tv1.setText("");
                    TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page145005);
                    break;
                case 7:
                    TWO_tv4.setText(R.string.page145006);
                    break;
                case 8:
                    changeCode =1;
                    break;

            }

        }

        else if (page == 154) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.church);
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.playBgSpe();
                    break;
                case 2 :
                    TWO_tv2.setText(R.string.page154002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page154003);
                    break;
                case 4:TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page154004);
                    break;
                case 5:
                    TWO_tv3.setText(R.string.page154005);
                    break;
                case 6:
                    TWO_tv4.setText(R.string.page154006);
                    break;

            }

        }
        else if (page == 155) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page155002);
                    TWO_tv2.append("\n"+l+f+"씨 어서와요.\n부모님이 걱정 많이 했어요~..\n");
                    break;
                case 2:
                    TWO_tv3.append("우리 새별지가 뭐가 잘못된 것인지 \n" +
                            "같이 알아볼까요?\n");
                    break;
                case 3:
                    TWO_tv3.setText("");
                    TWO_tv2.setText(l+f);TWO_tv2.append(" : 열심히 공부하세요 저는 안 들을 테니까");
                    break;
                case 4:
                    TWO_tv3.setText(R.string.page155004);
                    break;
            }

        }
        else if (page == 156) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page156002);TWO_tv2.append(f+"아 너희는 \n김만춘 씨가 " +
                        "교주로 있지? \n새별지 말고도 이단이 많아~\n" +
                        "김만춘씨가 주장하는 거랑\n" +
                        "거기도 다 말이 비슷해~\n");
                    break;
                case 2:TWO_tv3.append("우리 이사야 46장9절 읽어볼까?");
                break;
                case 3 : TWO_tv3.setText("");
                    TWO_tv2.setText(l+f +" : 너희는 옛적 일을 기억하라\n" +
                        "나는 하나님이라 \n나 외에 다른 이가 없느니라 \n(울컥하며)\n");
                    break;
                case 4 : TWO_tv2.append("\n나는 하나님이라 \n"+
                        "나같은 이가 없느니라흐윽 뚜쉬ㅠ");
                break;
                case 5:
                    TWO_tv3.setText(R.string.page156003);
                    break;
            }

        }
        else if (page == 157) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(R.string.page157002);
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    break;
                case 2:
                    TWO_tv3.setText(l+f+"! 너 왜 우니??");
                    break;
                case 3:
                    TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page157003);TWO_tv2.append(f+" 친구가 '새별지' 식으로 \n"+
                        "생각해서 우는 거에요 "+"\n김만춘씨한테 감정이입이 되서..");
                    break;
                case 4:
                    TWO_tv3.setText(R.string.page157004);
                    break;
                case 5:
                    TWO_tv4.setText(R.string.page157005);
                    break;

            }

        }
        else if (page == 158) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(R.string.page158002);TWO_tv2.append(f+"아");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    break;
                case 2:
                    TWO_tv3.setText(" \n데살로니가후서 2장 1절부터 \n2절 읽어볼래?");
                    break;
                case 3 :
                    TWO_tv3.setText("");
                    TWO_tv2.setText(l+f+": 1)  형제들아 \n우리가 너희에게 구하는 것은 \n" +
                        "우리 주 예수 그리스도의 강림하심과 \n" +
                        "우리가 그 앞에 모임에 관하여 ");
                    break;
                case 4:
                    TWO_tv3.setText(R.string.page158003);
                    break;
                case 5:TWO_tv2.setText("");
                    TWO_tv3.setText(R.string.page158004);
                    break;
            }

        }
        else if (page == 159) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page159002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page159003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page159004);
                    break;
                case 4:TWO_tv2.setText("");
                    TWO_tv4.setText("");
                    TWO_tv3.setText(l+f+": 나는 그냥!!새별지가 좋아요..!");
                    break;
                case 5:
                    TWO_tv4.setText("엄마  : "+f+"아~~! 아이고오...");
                    break;

            }

        }
        else if (page == 160) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");
                    TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page160002);
                    break;
                case 2:
                    TWO_tv4.setText(l+f+" : 아니. \n나는 6만 6천명 안에 들어서 \n" +
                            "꼭 천국 갈꺼야\n");
                    break;
                case 3:
                    TWO_tv2.setText("");
                    TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page160003);
                    break;
                case 4:
                    TWO_tv4.setText(l+f+" : 난\n 엄마 아빠랑 산 25년 보다 \n 거기서 7개월 배운 게 \n더 행복했어!");
                    break;
            }

        }
        else if (page == 161) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(R.string.page161002);
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    break;
                case 2:
                    TWO_tv3.setText(l+f);TWO_tv3.append(" : 난 거기 사서 살래 \n 천국이 바로 새별지니까..!!\n 엄마 아빠는 다 몰라!");
                    break;
                case 3:TWO_tv3.setText("");
                    TWO_tv2.setText("\n김만춘 교주님은 절대 안죽어..!!");
                    break;
                case 4:
                    TWO_tv3.setText(R.string.page161004);
                    TWO_tv3.append(f+"아~~!.. \n 엄마는 너 절대 보내줄 수 없어\n 거기는 잘못된 곳이야");
                    break;

            }

        }
        else if (page == 162) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText("");
                    TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv1.setText(R.string.page162001);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page162002);
                    TWO_tv3.append( f+"아?");
                    break;
                case 3:TWO_tv1.setText("");TWO_tv3.setText("");
                    TWO_tv4.setText("");
                    TWO_tv2.setText(l+f+" : 그러나 나의 거짓말로 \n" +
                            "하나님의 참되심이 더 풍성하여 \n");
                    break;
                case 4:
                    TWO_tv3.setText("그의 영광이 되었으면 \n" +
                            "어찌 나도 죄인처럼 심판을 받으리요.\n");
                    break;
                case 5 : TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page162003);
                    break;
                case 6:
                    TWO_tv3.setText(R.string.page162004);
                    break;
            }

        }
        else if (page == 163) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv4.setText(R.string.page163002);
                    break;
                case 2:TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(R.string.page163003);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page163004);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page163005);
                    break;
                case 5:
                    changeCode =3;
                    break;

            }

        }
        else if (page == 165) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv2.setText(l+f+": 엄마... 미안해");
                    break;
                case 2:
                    TWO_tv2.append("\n내가.. 틀린 것 같아");
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page165002);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page165003);
                    break;
            }

        }
        else if (page == 166) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:
                    TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(l+f+" : 나는 사실\n살아도 사는게 아닌 것 같았어\n");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page166003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page166004);
                    break;
                case 4:TWO_tv2.setText("");TWO_tv4.setText("");
                    TWO_tv3.setText(R.string.page166005);
                    TWO_tv3.append(f+"아 고마워 이제라도 왔으면 됐어");
                    break;
                case 5 :TWO_tv4.setText(R.string.page166006);
                break;
                case 6 :
                    changeCode =1;
                    break;

            }

        }
        else if (page == 169) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:mediaPlayer.playBgSome();
                    TWO_tv2.setText("엄마 : "+f+"아.. 언제까지 이럴꺼야..\n 엄마 속 타들어간다.. 제발..");
                    break;
                case 2:
                    TWO_tv3.setText(l+f+" : ...아줌마 누구세요?");
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page169002);
                    break;
                case 4:
                    TWO_tv2.setText("");
                    TWO_tv4.setText("");
                    TWO_tv3.setText(l+f+" : 아줌마 누구시냐고요?!!\n 이제 더 이상은 못 참아 \n 핸드폰도 맘대로 가져가고 \n 이게 납치 감금이지 뭐야..!!");
                    break;

            }

        }
        else if (page == 170) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page170002);
                    break;
                case 2:
                    TWO_tv3.setText(l+f+" : 이제 엄마고 뭐고 없어\n 여기 온 이상 \n" +
                            "엄마 아빠가 무슨 소용이야\n");
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page170004);
                    break;
                case 4:
                    TWO_tv2.setText("");
                    TWO_tv4.setText("");
                    TWO_tv3.setText(l+f + " : 가족같이 안 느껴지고 \n" +
                            "이젠 정도 없어\n ");
                    break;
                case 5:
                    TWO_tv4.setText(R.string.page170005);
                    break;
            }

        }
        else if (page == 171) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv2.setText(l+f+" : 끼워 맞추지마 \n" +
                            "난 엄마 아빠를 사랑하지도 않고 \n" +
                            "그런 정 같은 거 없어\n ");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page171002);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page171003);
                    TWO_tv4.append(f+"아.. 엄마 봐…\n" +
                            "아이고…우리 "+f+"아..");
                    break;
            }

        }
        else if (page == 172) {
            TWO_img1.setBackgroundResource(R.drawable.church);
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page172002);
                    break;
                case 2:
                    TWO_tv3.setText(l+f);
                    TWO_tv3.append(" : 살려주세요!!!!!\n" +
                            "살려주세요!!!!!!!!!!!!!!!!!!!!!\n" +
                            "살려주세요!!!!!!!!!!!!!!!");
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page172004);
                    break;
            }

        }
        else if (page == 173) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.police);
                    break;
                case 2 :
                    TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page173002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page173003);
                    TWO_tv3.append(l+f+" 맞니??\n아저씨도 새별지야~\n도와줄게 얼른가자");
                    break;
                case 4:
                    TWO_tv4.setText(l+f+" : 따흐흑 감사합니다ㅠㅠㅠㅠ");
                    break;
            }

        }
        else if (page == 174) {
            TWO_img1.setBackgroundResource(R.drawable.police);
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page174002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page174003);
                    break;
                case 3:
                    TWO_tv4.setText(l+f + " : 갈게 엄마 아빠!\n" +
                            "그동안 고마웠어!\n");
                    break;
            }

        }
        else if (page == 175) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.policecar);
                    break;
                case 2 :
                    TWO_tv2.setText("");TWO_tv3.setText("");TWO_tv4.setText("");
                    TWO_tv1.setText(R.string.page175002);
                    break;
                case 3:
                    TWO_tv3.setText(l+f +" : 아저씨 \n근데 어떻게 알고 오셨어요?");
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page175003);
                    break;
                case 5:
                    TWO_tv4.setText("");
                    TWO_tv3.setText(l+f +" : (와 \n역시 나를 아껴주는 사람들은 \n" +
                            "새별지 사람들뿐이야..)");
                    break;
                case 6:
                    TWO_tv4.setText(R.string.page175004);
                    break;
            }

        }
        else if (page == 176) {
            TWO_img1.setBackgroundResource(R.drawable.policecar);
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");TWO_tv1.setText("");
                    TWO_tv2.setText(l+f+" : 아 그렇구나 .. 넵..!");
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page176003);
                    break;
                case 3:
                    TWO_tv4.setText(R.string.page176004);
                    break;
            }

        }
        else if (page == 177) {
            switch (paragraph) {
                case 1:
                    TWO_img1.setBackgroundResource(R.drawable.everyday);
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.playBgBap();
                    break;
                case 2 :
                    TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page177002);
                    break;
                case 3:
                    TWO_tv3.setText(R.string.page177003);
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page177004);
                    break;
            }

        }
        else if (page == 178) {
            TWO_img1.setBackgroundResource(R.drawable.everyday);
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page178002);
                    break;
                case 2:
                    TWO_tv3.setText(R.string.page178003);
                    break;
                case 3:
                    changeCode =4;
                    break;

            }

        }
        else if (page == 180) {
            switch (paragraph) {
                case 1:TWO_img1.setBackgroundResource(R.drawable.fine);
                break;
                case 2 :
                    TWO_tv2.setText(R.string.page180001);
                    break;
                case 3:
                    TWO_tv3.setText(l+f+" : 안녕하세요 \n저희 조원대 학생인데,\n" +
                            "과제 설문조사 좀 \n" +
                            "잠깐만 도와주실 수 있으세요?\n");
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page180002);
                    break;

            }

        }
        else if (page == 181) {
            TWO_img1.setBackgroundResource(R.drawable.fine);
            switch (paragraph) {
                case 1:TWO_tv4.setText("");TWO_tv3.setText("");
                    TWO_tv2.setText(R.string.page181002);
                    break;
                case 2:TWO_tv2.append("멀리서 여학생이 지나감");
                break;
                case 3 :
                    TWO_tv3.setText(l+f+ " : 안녕하세요\n 저희 웹툰작가 지망생인데\n" +
                            "스토리텔링 조언 좀 \n도와주실 수 있으세요?");
                    break;
                case 4:
                    TWO_tv4.setText(R.string.page181004);
                    break;
                case 5:TWO_tv2.append("(그냥 지나쳐가려고 한다.)");
                TWO_tv3.setText("");TWO_tv4.setText("");
                break;
                case 6 :TWO_tv3.setText(l+f+"에이~ 그러지 마시고 \n 잠시만..");
                break;
                case 7 : TWO_tv3.append("지나가던 여학생 : 아~뭐야 진짜~!\n 됐어요,,!");
                break;
                case 8: TWO_tv4.setText("….\n");
                break;
                case 9:
                    changeCode =1;
                    break;

            }

        }





    }


    public void pageCHOICE(){
        if(page ==9){
            switch (paragraph){
                case 1:
                    THREE_img1.setVisibility(View.GONE);
                    THREE_tv2.setVisibility(View.VISIBLE);
                    THREE_tv1.setText(R.string.page9001);
                    THREE_tv2.setText("\n\n\n");
                    break;
                case 2:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn3.setVisibility(View.INVISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_9002_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_9002_2);
                break;
            }
        }
        else if(page ==26){
            switch (paragraph){// 카톡 글미으로 바꾸는 건??
                case 1:
                    THREE_img1.setImageResource(R.drawable.kakao_miri);
                    break;
                case 2 :
                        THREE_tv2.setText(R.string.page26002);
                    break;
                case 3:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);THREE_imgbtn3.setVisibility(View.GONE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice26001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice26001_2);
                    break;

            }
        }
        else if(page ==45){
            switch (paragraph){// 카톡 글미으로 바꾸는 건??
                case 1: THREE_img1.setImageResource(R.drawable.cofffee_icon);
                    THREE_tv2.setText(R.string.page45002);
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
                    THREE_imgbtn3.setVisibility(View.GONE);
                    break;

            }
        }
        else if(page ==55){
            switch (paragraph){// 카톡 글미으로 바꾸는 건??
                case 1: THREE_img1.setImageResource(R.drawable.edu);
                    THREE_tv1.setText(R.string.page54004);
                    break;
                case 2:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn3.setVisibility(View.INVISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_55001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_55001_2);
                    break;

            }
        }
        else if(page ==62){
            switch (paragraph){// 카톡 글미으로 바꾸는 건??
                case 1:THREE_img1.setImageResource(R.drawable.edu);
                    THREE_tv1.setText(R.string.page62001);
                    break;
                case 2:
                    THREE_tv2.setText("\n어떻게 할래?\n");
                    break;
                case 3:
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn3.setVisibility(View.INVISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_62001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_62001_2);
                    break;

            }
        }
        else if(page ==66) {
            switch (paragraph) {// 카톡 글미으로 바꾸는 건??
                case 1:
                    THREE_img1.setImageResource(R.drawable.interview);
                    THREE_tv1.setText(R.string.page66002);
                    break;
                case 2:
                    THREE_tv2.setText(R.string.page66003);
                    break;
                case 3 : THREE_tv2.setText(R.string.page67002);THREE_tv1.setVisibility(View.GONE);
                break;
                case 4 :
                    THREE_imgbtn1.setVisibility(View.VISIBLE);
                    THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn3.setVisibility(View.INVISIBLE);
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_67001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_67001_2);
                    break;

            }
        }
        else if(page ==70) {
            switch (paragraph) {// 카톡 글미으로 바꾸는 건??
                case 1:
                    THREE_img1.setImageResource(R.drawable.interview);
                    THREE_tv1.setText(R.string.page71002);
                    break;
                case 2:
                    THREE_tv2.setText(R.string.page71003);
                    break;
                case 3:
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_70001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_70001_2);
                    THREE_imgbtn1.setVisibility(View.VISIBLE);
                    THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn3.setVisibility(View.GONE);
                    break;

            }
        }
        else if(page ==74) {
            switch (paragraph) {// 카톡 글미으로 바꾸는 건??
                case 1:THREE_img1.setBackgroundResource(R.drawable.interview);
                    THREE_tv2.setText(R.string.page74003);
                    THREE_tv1.setVisibility(View.INVISIBLE);
                    break;
                case 2 :
                    THREE_imgbtn1.setVisibility(View.VISIBLE);
                    THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn3.setVisibility(View.GONE);
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
                    THREE_imgbtn3.setVisibility(View.GONE);
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
                    THREE_imgbtn3.setVisibility(View.GONE);
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
                case 1 :
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.playBgSleep();
                    THREE_img1.setBackgroundResource(R.drawable.home);
                    THREE_tv2.setText("…\n");
                    break;
                case 2 :
                    THREE_tv1.setText(R.string.page100002);THREE_tv2.setText("");
                break;
                case 3 :THREE_tv2.setText("\n어떡하지..");
                break;
                case 4 :
                    THREE_tv2.setText(R.string.page100003);THREE_tv1.setText("");
                    THREE_tv2.append(l+f);THREE_tv2.append("아, 요즘 뭐하느라 맨날 그렇게 나가니??\n");
                    break;
                case 5:
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_100001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_100001_2);
                    THREE_imgbtn3.setVisibility(View.INVISIBLE);
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    break;
            }
        }
        else if(page ==117){
            switch (paragraph){
                case 1 :
                    THREE_img1.setBackgroundResource(R.drawable.home);
                    THREE_tv1.setText(R.string.page117001);
                    break;
                case 2 :
                    THREE_tv2.setText("이제야 자리를 좀 잡아가는가 싶었는데\n어떻게 하면 좋을까?");
                    break;
                case 3 :
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_117001_1);
                    THREE_imgbtn3.setBackgroundResource(R.drawable.choice_117001_2);
                    THREE_imgbtn1.setVisibility(View.GONE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    THREE_imgbtn3.setVisibility(View.VISIBLE);
                    break;
            }
        }
        else if(page ==147){
            switch (paragraph){
                case 1 :THREE_tv1.setVisibility(View.INVISIBLE);
                    THREE_tv2.setText(R.string.page147002);
                    break;
                case 2 :
                    THREE_tv2.append("\n\n 어떻게 하면 좋을까?");
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_147001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.page147001_2);
                    THREE_imgbtn3.setVisibility(View.INVISIBLE);
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
                    break;
            }
        }
        else if(page ==164){
            switch (paragraph){
                case 1 :
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.playBgQuiet();
                    THREE_img1.setBackgroundResource(R.drawable.church);
                    THREE_tv1.setText("엄마 : "+f+"아\n 엄마도 새별지가 틀린 걸\n 알겠는데 너는 어떠니");
                    break;
                case 2 :
                    THREE_tv2.setText(l+f+" : ….");
                    break;
                case 3 :
                    THREE_imgbtn1.setBackgroundResource(R.drawable.choice_164001_1);
                    THREE_imgbtn2.setBackgroundResource(R.drawable.choice_164001_2);
                    THREE_imgbtn3.setVisibility(View.GONE);
                    THREE_imgbtn1.setVisibility(View.VISIBLE);THREE_imgbtn2.setVisibility(View.VISIBLE);
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
                case 7:
                    kakao=7;
                    break;
                case 8: changeCode=3;
                    return  changeCode;
            }

            }
        else if(page ==10){
            switch (paragraph){
                case 1 : kakao=1;
                break;
                case 2 : kakao=2;
                break;
                case 3: kakao = 3;
                break;
                case 4: kakao=4;
                break;
                case 5 :FOUR_tv2.setText(R.string.page10004);
                break;
                case 6: FOUR_tv3.setText(R.string.page10005);
                break;
                case 7 : changeCode =2;
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
                case 5 : kakao=4;
                break;
                case 6 :
                    changeCode=2;
                    break;
            }
        }
        else if(page ==28){
            switch (paragraph){
                case 1 :
                    kakao = 1;
                break;
                case 2 : kakao = 2;
                break;
                case 3 : kakao=3;
                break;
                case 4 : FOUR_tv2.setText(R.string.page28002);
                break;
                case 5 : FOUR_tv3.setText(R.string.page28003);
                break;
                case 6 :
                FOUR_tv3.append("\n...더 올려봐야겠다");
                break;
                case 7 : FOUR_tv3.setText("");
                break;
            }
        }
        else if(page ==29){
            switch(paragraph){
                case 1 :FOUR_tv2.setText("");FOUR_tv3.setText("");removeVIew();
                    kakao = 1;
                break;
                case 2 : kakao=2;
                break;
                case 3 : kakao=3;
                break;
                case 4 : FOUR_tv2.setText(R.string.page29002);
                break;
                case 5 : FOUR_tv3.setText(R.string.page29003);
                break;
                case 6 :FOUR_tv3.setText("");
                FOUR_tv2.setText(R.string.page29004);
                break;
                case 7 : FOUR_tv3.setText(R.string.page29005);
                break;
                case 8 :FOUR_tv3.setText("");
                    FOUR_tv2.setText(R.string.page29006);
                break;
                case 9 : FOUR_tv2.setText("");
                break;
            }

        }
        else if(page==30){
            switch (paragraph){
                case 1 :FOUR_tv3.setText("");removeVIew();
                FOUR_tv2.setText("");
                FOUR_tv1.setVisibility(View.GONE);
                kakao =1;
                break;
                case 2: kakao=2;
                break;
                case 3 : kakao=3;
                break;
                case 4 : FOUR_tv2.setText(R.string.page30002);
                break;
                case 5 : FOUR_tv2.setText("");
                break;
            }
        }
        else if(page==31){
            switch (paragraph){
                case 1 :FOUR_tv3.setText("");FOUR_tv2.setText("");removeVIew();
                    kakao =1;
                    break;
                case 2 : kakao =2;
                    break;
                case 3 : kakao =3;
                    break;
                case 4 : kakao =4;
                    break;
                case 5: kakao=5;
                break;
                case 6 : FOUR_tv2.setText(R.string.page31002);
                break;
                case 7 : changeCode = 2;
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
                case 4 : kakao= 3;
                break;
                case 5:kakao=4;
                break;
                case 6 : FOUR_tv1.setText("");
                break;
            }
        }
        else if(page == 39) {
            switch (paragraph) {
                case 1:FOUR_tv1.setText("");removeVIew();
                    kakao = 1;
                    break;
                case 2:
                    kakao = 2;
                    break;
                case 3:
                    kakao = 3;
                    break;
                case 4:kakao=4;
                break;
                case 5:
                    changeCode = 2;
                    break;
            }
        }
        else if(page ==41) {
                switch (paragraph) {
                    case 1:
                        if(mediaPlayer!=null){
                            mediaPlayer.stopMusic();}
                        mediaPlayer.playBgSleep();
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
                    case 8 :kakao=7;
                    break;
                    case 9:FOUR_tv1.setText("");
                    break;

                }
            }
        else if(page ==42) {
            switch (paragraph) {
                case 1:
                    removeVIew();
                    kakao = 1;
                    break;
                case 2:
                    kakao = 2;
                    break;
                case 3 :kakao = 3;
                    break;
                case 4 :
                    kakao = 4;
                    break;
                case 5 :
                    kakao=5;
                    break;
                case 6:
                    changeCode = 2;
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
                case 6 :
                    kakao=6;
                    break;
                case 7:
                    changeCode = 1;
                    break;

            }}
        else if(page ==110) {
            switch (paragraph) {
                case 1:
                    if(mediaPlayer!=null){
                        mediaPlayer.stopMusic();}
                    mediaPlayer.playBgSleep();
                    kakao = 1;
                    break;
                case 2:
                    kakao = 2;
                    break;
                case 3 :kakao=3;
                break;
                case 4:FOUR_tv2.setText(R.string.page110002);
                break;
                case 5 : changeCode = 1;
                    break;

            }}
        else if(page ==122) {
            switch (paragraph) {
                case 1:kakao = 1;
                    break;
                case 2:
                    kakao = 2;
                    break;
                case 3 :kakao=3;
                break;
                case 4 :kakao=4;
                    break;
                case 5 : kakao=5;
                break;

            }}
        else if(page ==123) {
            switch (paragraph) {
                case 1:
                    removeVIew();
                    kakao = 1;
                    break;
                case 2:
                    kakao = 2;
                    break;
                case 3 : kakao = 3;
                    break;
                case 4 : kakao= 4;
                break;
                case 5 : kakao =5;
                break;
                case 6 :FOUR_tv1.setVisibility(View.INVISIBLE);
                    FOUR_tv2.setText(R.string.page123001);
                    break;
                case 7 : FOUR_tv2.setText("실망하고 상처도 많이 받았지만\n" +
                        "가진이에게 마지막 연락을 해보았다.");
            }}
        else if(page ==124) {
            switch (paragraph) {
                case 1:
                    removeVIew();
                    FOUR_tv2.setText("");
                    kakao = 1;
                    break;
                case 2:
                    kakao = 2;
                    break;
                case 3 : kakao = 3;
                    break;
                case 4 : kakao=4;
                break;
                case  5:
                    changeCode =2;
                    break;
            }}

        else if(page ==179) {
            switch (paragraph) {
                case 1:kakao = 1;//q배경
                    break;
                case 2: kakao=2;//1
                    break;
                case 3: kakao=3;//1
                    break;
                case 4:
                    FOUR_tv2.setText(l+f+" : 아...맨 \n 전도비 내려면 대출 또 떙겨야겠네....");
                    break;
                case 5 : FOUR_tv2.setText("….\n");
                    break;
                case 6 : FOUR_tv2.append("6만 6천명 안에 들어야 돼.\n");
                    break;
                case 7 : changeCode=2;
                    break;

            }}
        return kakao;
    }

    public void music(int p){
/*        if(mediaPlayer!=null){
            mediaPlayer.pause();
        }*/
        if(-1<=p&&p<=21){
            mediaPlayer.playBgSleep();
        }else if(p<=40) {
             if(26<p&&p<32){
                mediaPlayer.playBgAppre();
            }else if(32<=p&&p<=35){
                mediaPlayer.playAfter();
            }else {
                mediaPlayer.plahBgHoly();
            }
        } else if (p<=83){
            if (55<p&&p<=59){
                mediaPlayer.plahBgHoly();
            }else{
                mediaPlayer.playBgSleep();
            }
        }else if(p<110){
            if(90<=p&&p<=95){
                mediaPlayer.playBgSleep();
            }else {
            mediaPlayer.playBgSome();
            }
        }
        else if(p<=117){
            mediaPlayer.playBgSleep();
        }
        else if(p<=128){
            mediaPlayer.playBgBlue();
        }else if(p<=131){
            mediaPlayer.playAfter();
        }else if(p<=144){
            mediaPlayer.playBgBlue();
        }else if(p<=154){
            mediaPlayer.playBgCue();
        }else if(p<=164){
            mediaPlayer.playBgSpe();
        } else if(p<=168){
            mediaPlayer.playAfter();
        } else if(p<=176){
            mediaPlayer.playBgSome();
        }else if(p<=185){
            mediaPlayer.playBgBap();
        }
        else {
            mediaPlayer.playBgSleep();
            System.out.println("기본 시작.");
        }
        System.out.println("지그믕ㄴ"+getPage());

    }

}
