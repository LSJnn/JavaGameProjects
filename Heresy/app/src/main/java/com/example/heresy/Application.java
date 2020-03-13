package com.example.heresy;

import java.util.ArrayList;

public class Application extends android.app.Application {

    public static String L;
    public static String F;
    public static boolean Z = false;
    public static int N;
    public static int skip;
    public static ArrayList<EndingItem> endingItemArrayList ;
    public static boolean first;

    public static void setEndingItemArrayList(ArrayList<EndingItem> endingItemArrayList) {
        Application.endingItemArrayList = endingItemArrayList;
    }

    public static ArrayList<EndingItem> getEndingItemArrayList() {
        return endingItemArrayList;
    }

    public static void setFirst(boolean first) {
        Application.first = first;
    }

    public static boolean isFirst() {
        return first;
    }

    public static int getN() {
        return N;
    }

    public static void setN(int n){
        N =n;
    }
    public static void setL(String l) {
        L = l;
    }

    public static String getL() {
        return L;
    }

    public static void setF(String f) {
        F = f;
    }

    public static String getF() {
        return F;
    }

    public static boolean isZ() {
        return Z;
    }

    public static void setZ(boolean z) {
        Z = z;
    }

    public static void setSkip(int skip) {
        Application.skip = skip;
    }

    public static int getSkip() {
        return skip;
    }
}




