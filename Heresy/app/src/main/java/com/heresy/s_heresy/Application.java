package com.heresy.s_heresy;

public class Application extends android.app.Application{

    public static boolean Z = false;
    public static int skip;
    public static MusicActivity musicActivity;
    public static TinyDB savePageDB;

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

}






