package com.heresy.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class SecondPage extends AppCompatActivity {

    EditText lstE;
    EditText fstE;
    ImageButton back;
    ImageButton next;
    ImageButton ending;

    int home;

    MusicActivity mediaPlayer =Application.getMusicActivity();
    StartStory startStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        home=0;

        lstE = findViewById(R.id.e_lastname);
        fstE=findViewById(R.id.e_firstname);
        back=findViewById(R.id.backbtn);
        next=findViewById(R.id.nextBtn);
        ending= findViewById(R.id.endingBtn);

        startStory = new StartStory();

        //////////////초기화//////////////////////////


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                StartStory.setViewNum(0);
                finish();
            }
        });

        nextClick();

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondPage.this, Endings.class);
                home=1;
                startActivity(intent);
            }
        });


    }

    public void nextClick(){
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( lstE.getText().toString().length()!=0&&fstE.getText().toString().length()!=0) {

                    Intent i = new Intent(SecondPage.this, T1_text.class);
                    home=1;
                   //이름 tinyDB 에 저장.
                    Application.getSavePageDB().putString("L",lstE.getText().toString());
                    Application.getSavePageDB().putString("F",fstE.getText().toString());

                    i.putExtra("changeCode", 1);
                    startActivity(i);
                    finish();
                }else {Toast.makeText(getApplicationContext()," 이름을 입력해주세요",Toast.LENGTH_SHORT).show();}

            }
        };
        next.setOnClickListener(onClickListener);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        StartStory.setViewNum(0);
    }

    @Override
    protected void onPause() {
        //액티비티가 다른데로 넘어갈때 - 다이얼로그 / 다른 뷰로.
        //홈으로 갈떄 --> 이때만 음악 멈춤.
        System.out.println("HOME+++++++"+home);
        if(home == 0){
            if(mediaPlayer!=null) {
                mediaPlayer.stopMusic();
                super.onPause();
            }
        }else{
            super.onPause();
        }
        System.out.println("PAUSE!!!");
    }

    @Override
    protected void onDestroy() {
        System.out.println("DESTROY!!!");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        //홈갔다가 재시작. .. 다이얼로그?
        if(mediaPlayer!=null){
                mediaPlayer.stopMusic();
                startStory.music(StartStory.getPage());
                System.out.println("null!!!restart");
        }
        System.out.println("RESTART!!!");

        super.onRestart();

    }

    @Override
    protected void onStart() {
        System.out.println("START");
        super.onStart();
    }
}
