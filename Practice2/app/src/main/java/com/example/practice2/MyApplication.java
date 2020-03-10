package com.example.practice2;

import android.app.Application;

public class MyApplication extends Application {

    public String  text ;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
