package com.heresy.heresy;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.Window;

import androidx.lifecycle.Lifecycle;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MusicActivity extends MediaPlayer{

    public MediaPlayer mp;
    Context c;

    AudioManager audioManager;
    int r;

    static boolean playAudioFocus;


   MusicActivity(Context c){
       this.c = c;
       audioManager=
               (AudioManager) c.getSystemService(Context.AUDIO_SERVICE);
       r = setFocusManager();
   }


   public int setFocusManager(){
       //버전 별 다름.
       AudioManager.OnAudioFocusChangeListener focusManager = new AudioManager.OnAudioFocusChangeListener() {
           @Override
           public void onAudioFocusChange(int focusChange) {
               //오디오 포커스 변화 감지.
               switch (focusChange){
                   case AudioManager.AUDIOFOCUS_REQUEST_FAILED :
                       //오디오 포커스 요청 거부당함.
                       //재생 멈추고 음악 재생 안함. --
                       if(isPlaying()){
                           mp.pause();
                       }
                       break;

                   case AudioManager.AUDIOFOCUS_GAIN:
                       if(playAudioFocus && !isPlaying()){
                           // 포커스 있는데 재생 안됨.
                           mp.start();
                       } else if(isPlaying()) {
                           // 재생되고 있을 때. --> transit 로 잠시 잃었을때.
                           mp.setVolume(1.0f, 1.0f);
                       }
                       playAudioFocus = false;
                       break;

                   case AudioManager.AUDIOFOCUS_GAIN_TRANSIENT:
                           mp.pause();
                           //잠시 얻어야 하는 경우
                           break;
                    case AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK:
                               //얻더라도 뒤 소리 볼륨 낮게. 같이 재생되게.
                        mp.pause();
                        break;
                   case AudioManager.AUDIOFOCUS_LOSS :
                       audioManager.abandonAudioFocus(this);
                       playAudioFocus = false;
                       if(mp!=null) {
                           mp.stop();
                       }
                        break;
                   case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT :
                       //잠시동안만 잃음.리소스 해제 ㅇ나함.
                       if(mp!=null){
                           playAudioFocus = true;
                           mp.pause();
                       }
                       break;
                   case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK :

                       break;

               }
           }

       };
       //이 앱의 오디오 포커스 요청
       //AUDIOFOCUS_GAIN 은 지속적은 FOCUS 필요.
       //요청 승인여부 정수값 반환
       int r = audioManager.requestAudioFocus(
               focusManager,AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);
       System.out.println("r========="+r);
       return r;

   }

   public void stopMusic() {
       try {
           mp.pause();
           mp.reset();
       }catch (Exception e){
           e.printStackTrace();
           mp.reset();
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
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = apre");
    }
    public  void playAfter(){

        mp =  MediaPlayer.create(c, R.raw.after_thought);
        mp.start();
        mp.setLooping(true);
        System.out.println("mp = after");
    }
    public  void playBgSome(){
        mp =  MediaPlayer.create(c, R.raw.something_s_here);

        mp.start();
        mp.setLooping(true);
        System.out.println("mp = some");
    }
    public  void playBgBlue(){
        mp =  MediaPlayer.create(c, R.raw.blue_macaw);

        mp.start();
        mp.setLooping(true);
        System.out.println("mp = blue");
   }
    public  void playBgCue(){

        mp =  MediaPlayer.create(c, R.raw.cue);

        mp.start();
        mp.setLooping(true);
        System.out.println("mp = cue");
   }
    public  void playBgSpe(){

        mp =  MediaPlayer.create(c, R.raw.species);

        mp.start();
        mp.setLooping(true);
        System.out.println("mp = species");
    }
    public  void playBgQuiet(){

        mp =  MediaPlayer.create(c, R.raw.a_quiet_thought);

        mp.start();
        mp.setLooping(true);
        System.out.println("mp = quiet");
    }
    public  void playBgBap(){

        mp =  MediaPlayer.create(c, R.raw.bap);

        mp.start();
        mp.setLooping(true);
        System.out.println("mp = bap");
   }






    //따로..?? 아님 같이..??
    // 같이 --> 한번 호출...계속 대기??  계속 가능...이렇게까지 많지 않으니까 따로로 하기.
    //따로 는





}
