package com.example.heresy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class T1_choice extends AppCompatActivity {

    ImageButton next;ImageButton back;ImageButton ending;

    ImageView c_img1;
    TextView c_tv1;TextView c_tv2;
    ImageButton c_imgbtn1;ImageButton c_imgbtn2;ImageButton c_imgbtn3;

    int changeCode;
    StartStory startStory3;
    String F; String L;

    int c; int p ; int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_choice);

        Intent i = getIntent();

        initializeView();

        startStory3 = new StartStory();
        startStory3.getTHREE(c_img1,c_tv1,c_tv2,c_imgbtn1,c_imgbtn2,c_imgbtn3);
        startStory3.viewNumIsTHREE();

        nextOnClick();

        btnClick();
    }

    public void btnClick() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                finish();


            }
        });


        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_choice.this, Endings.class);
                startActivity(intent);

            }
        });
    }
    public void NisTHREE(){// page9- 1. 텍1, 2. 버튼2(한번에), 3. 다음장으로 넘어가는 .
        ////// 매개 변수로 개수 넣으면 아마 아래 전개 될 듯.. 한번 해보기.
        int k = c%3;//2,1,0

        if(k==1){
            p = 1;
        }else if(k ==2){
            p = 2;
        }else {
            p = 3;
            n++;
        }
    }

    public void codeChangeTHREE(){
        if(p==3){
            n++;
        }
    }

    public void nextOnClick(){

        View.OnClickListener nextOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //n 은 장 수 --> 7로 유지되야함. 123 이 끝날때 까지.
                c++;

                NisTHREE();

                startStory3.setStory(3,n,p);

                codeChangeTHREE();
                //--> changeCode 에 따라 넘어감.

                //받는다. --> 코드 변경/.
                c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        changeCode = 2;
                        System.out.println("changeCode ============="+changeCode);
                        initializeLayout();
                    }
                });
                //안 받는다. --> 완결 .--> 업적 추가.
                c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(T1_choice.this, Success.class);
                        intent.getIntExtra("page",9);
                        startActivity(intent);
                        finish();
                    }
                });


            }
        };
        next.setOnClickListener(nextOnClickListener);

    }

    public void initializeView(){
        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);

        c_img1 = findViewById(R.id.t1_c_img1);
        c_imgbtn1 = findViewById(R.id.t1_c_btn1);
        c_imgbtn2 = findViewById(R.id.t1_c_btn2);
        c_imgbtn3 = findViewById(R.id.t1_c_btn3);
        c_tv1 = findViewById(R.id.t1_c_tv1);
        c_tv2 = findViewById(R.id.t1_c_tv2);

        n=9;
    }

    public void initializeLayout() {
        switch (changeCode) {
            case 1 : Intent i1 = new Intent(T1_choice.this, T1_text.class);
            finish();
            case 2:
                Intent i2 = new Intent(T1_choice.this, T1_text_image.class);
                i2.putExtra("firstName", F);
                i2.putExtra("lastName",L);
                startActivity(i2);
                finish();
                break;
            case 4:
                Intent i4 = new Intent(T1_choice.this,T1_kakao.class);
                startActivity(i4);
                finish();
            default: //아무것도 안함.
        }
    }

}
