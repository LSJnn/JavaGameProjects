package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Fine extends AppCompatActivity {
    ImageButton next;ImageButton back;ImageButton ending;

    ImageView fine_img1;
    TextView fine_tv1;TextView fine_tv2;

    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fine);

        initializeView();
        nextOnClick();



    btnClick();
    }

    public void initializeView(){
        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);

        fine_img1 = findViewById(R.id.fine_img1);
        fine_tv1 = findViewById(R.id.fine_tv1);
        fine_tv2 = findViewById(R.id.fine_tv2);
    }

    public void nextOnClick(){

        View.OnClickListener nextOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("버튼버ㅡㅌㄴ버튼!!!!!!!!!!!!!!!!!!!!!1");

                c++;
                if(c==1){
                    fine_tv1.setText("\" 우리 모두\\n 사이비 조심합시다..\\n\n" +
                            "누가 비밀로 해달라고 하면 가족들이나\n" +
                            "주변 친한 지인들한테\n" +
                            "먼저 알리세요!\n" +
                            "\"");
                } else {
                    fine_tv2.setText(R.string.pageFine);
                    next.setClickable(false);
                }
            }
        };
        next.setOnClickListener(nextOnClickListener);

    }
    public void btnClick() {

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Fine.this, MainActivity.class);
                finish();

            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fine.this, Endings.class);
                startActivity(intent);

            }
        });
    }


}
