package com.heresy.s_heresy;

public class Practice extends StartStory{
    static int[][] where;
    static int[][] skipposition;

    static int getP;
    static int getV;

    public static void doSkip(){

        getViewNum();getPage();
        //갔던 창. 다 저장 --> 현재 보다 딱 1선택 지까지만 더 앞서게.
    }

    public static void decidePos(){
         setPage(45); setViewNum(3);
    }

}
