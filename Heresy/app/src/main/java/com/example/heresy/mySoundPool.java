/*
package com.example.heresy;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class mySoundPool {
    SoundPool soundPool;

    int bg_Sleep;   int playSleep;
    int bg_Holy;    int playHoly;
    int bg_Appre;   int playAppre;
    int bg_After;   int playAfter;
    int bg_Some;    int playSome;
    int bg_Blue;    int playBlue;
    int bg_cue;     int playCue;
    int bg_Species; int playSpe;
    int bg_Quiet;   int playQuiet;
    int bg_bap;     int playBap;

    public mySoundPool(){
        soundPool= new SoundPool(2, AudioManager.STREAM_MUSIC,0);
    }

    public void loadBg(Context context){
        System.out.println("로드되었습니다.");

         bg_Sleep = soundPool.load(context,R.raw.main_theme,1);
         bg_Holy = soundPool.load(context,R.raw.holy_tension_batman,1);
         bg_Appre = soundPool.load(context,R.raw.apprehensive_at_best,1);
         bg_After = soundPool.load(context,R.raw.after_thought,1);
         bg_Some = soundPool.load(context,R.raw.something_s_here,1);
         bg_Blue = soundPool.load(context,R.raw.blue_macaw,1);
         bg_cue = soundPool.load(context,R.raw.cue,1);
         bg_Species = soundPool.load(context,R.raw.species,1);
         bg_Quiet = soundPool.load(context,R.raw.a_quiet_thought,1);
         bg_bap = soundPool.load(context,R.raw.bap,1);

    }
    //따로..?? 아님 같이..??
    // 같이 --> 한번 호출...계속 대기??  계속 가능...이렇게까지 많지 않으니까 따로로 하기.
    //따로 는
    public  int playBgSleep(){
        playSleep = soundPool.play(bg_Sleep,1.0F,1.0F,1,-1,1.0F);
        return  playSleep;
    }
    public  void plahBgHoly(){
        playHoly = soundPool.play(bg_Holy,1.0F,1.0F,1,-1,1.0F);
    }
    public  void playBgAppre(){
        playSleep = soundPool.play(bg_Appre,1.0F,1.0F,1,-1,1.0F);
    }
    public  void playAfter(){
        playSleep = soundPool.play(bg_After,1.0F,1.0F,1,-1,1.0F);
    }
    public  void playBgSome(){
        playSleep = soundPool.play(bg_Some,1.0F,1.0F,1,-1,1.0F);
    }
    public  void playBgBlue(){
        playSleep = soundPool.play(bg_Blue,1.0F,1.0F,1,-1,1.0F);
    }
    public  void playBgCue(){
        playSleep = soundPool.play(bg_cue,1.0F,1.0F,1,-1,1.0F);
    }
    public  void playBgSpe(){
        playSleep = soundPool.play(bg_Species,1.0F,1.0F,1,-1,1.0F);
    }
    public  void playBgQuiet(){
        playSleep = soundPool.play(bg_Quiet,1.0F,1.0F,1,-1,1.0F);
    }
    public  void playBgBap(){
        playSleep = soundPool.play(bg_bap,1.0F,1.0F,1,-1,1.0F);
    }

    public void stopPlaying(int streamId){
        soundPool.stop(streamId);
    }







}
*/
