package com.heresy.heresy;

import android.nfc.Tag;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Application extends android.app.Application {

    public static boolean Z = false;
    public static int skip;
    public static MusicActivity musicActivity;
    public static TinyDB savePageDB;

    /////에러 핸들러
    private Thread.UncaughtExceptionHandler defaultUEH;
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    public static void setSavePageDB(TinyDB savePageDB) {
        Application.savePageDB = savePageDB;
    }

    public static TinyDB getSavePageDB() {
        return savePageDB;
    }

    public static void setMusicActivity(MusicActivity musicActivity) {
        Application.musicActivity = musicActivity;
    }

    public static MusicActivity getMusicActivity() {
        return musicActivity;
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

    public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return uncaughtExceptionHandler;
    }

    @Override
    public void onCreate() {
        defaultUEH = Thread.getDefaultUncaughtExceptionHandler(); // 스레드에서 에러 핸들러 받아돔.
        uncaughtExceptionHandler = new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {

            }
        };

        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        super.onCreate();
    }
}





