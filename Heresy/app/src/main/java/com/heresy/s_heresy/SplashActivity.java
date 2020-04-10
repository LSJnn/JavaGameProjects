package com.heresy.s_heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

public class SplashActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        try{
            VideoView videoHolder = findViewById(R.id.videoView);
            Uri video = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.splash3);
            videoHolder.setVideoURI(video);

            videoHolder.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    jump();
                }
            });
        videoHolder.start();
        }catch (Exception e){
            e.printStackTrace();
            jump();
        }
    }

    public void jump(){
        if(isFinishing())return;
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
