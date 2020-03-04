package com.example.heresy;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class MusicActivity {

    private static MediaPlayer mp;
    Context c;

   MusicActivity(Context c){
       this.c = c;
   }

   public void Play_MainMusic(){
       mp =  MediaPlayer.create(c, R.raw.main_theme);
   }

   public void Play_Shocked(){
       mp = MediaPlayer.create(c, R.raw.shocked);
   }


}
