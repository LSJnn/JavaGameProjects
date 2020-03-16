package com.example.heresy;

import android.content.Context;
import android.media.MediaPlayer;

public class MusicActivity extends MediaPlayer{

    public MediaPlayer mp;
    Context c;

   MusicActivity(Context c){
       this.c = c;
   }

   public void stopMusic() {
       try {
           mp.reset();
       }catch (Exception e){
           e.printStackTrace();
           playBgSleep();
       }
   }

   public void playBgSleep(){
       mp =  MediaPlayer.create(c, R.raw.main_theme);
       mp.start();
       mp.setLooping(true);
       System.out.println("mp = theme");
   }


    public  void plahBgHoly(){
        mp =  MediaPlayer.create(c, R.raw.holy_tension_batman);
        mp.setVolume(0.7f,0.7f);
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = holy");
    }
    public  void playBgAppre(){

        mp =  MediaPlayer.create(c, R.raw.apprehensive_at_best);
        if (mp.isPlaying()){
            mp.pause();
            System.out.println("pause");
        }
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = apre");
    }
    public  void playAfter(){

        mp =  MediaPlayer.create(c, R.raw.after_thought);
        if (mp.isPlaying()){
            mp.pause();
            System.out.println("pause");
        }
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = after");
    }
    public  void playBgSome(){
        mp =  MediaPlayer.create(c, R.raw.something_s_here);
        if (mp.isPlaying()){
            mp.pause();
            System.out.println("pause");
        }
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = some");
    }
    public  void playBgBlue(){
        mp =  MediaPlayer.create(c, R.raw.blue_macaw);
        if (mp.isPlaying()){
            mp.pause();
            System.out.println("pause");
        }
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = blue");
   }
    public  void playBgCue(){

        mp =  MediaPlayer.create(c, R.raw.cue);
        if (mp.isPlaying()){
            mp.pause();
            System.out.println("pause");
        }
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = cue");
   }
    public  void playBgSpe(){

        mp =  MediaPlayer.create(c, R.raw.species);
        if (mp.isPlaying()){
            mp.pause();
            System.out.println("pause");
        }
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = species");
    }
    public  void playBgQuiet(){

        mp =  MediaPlayer.create(c, R.raw.a_quiet_thought);
        if (mp.isPlaying()){
            mp.pause();
            System.out.println("pause");
        }
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = quiet");
    }
    public  void playBgBap(){

        mp =  MediaPlayer.create(c, R.raw.bap);
        if (mp.isPlaying()){
            mp.pause();
            System.out.println("pause");
        }
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = bap");
   }



    //따로..?? 아님 같이..??
    // 같이 --> 한번 호출...계속 대기??  계속 가능...이렇게까지 많지 않으니까 따로로 하기.
    //따로 는





}
