package com.example.trainingvssuite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.media.Image;
import android.opengl.Visibility;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.text.Layout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LabelActivity extends AppCompatActivity {

    public static final String ch_1 = "SUMIN";
    public static final String ch_2 = "YUJIN";

    //////////////////////////////////캐릭터 지정/////////////////////////////////////////


    ImageView imgBg;
    ImageView ImgCh;
    ImageButton SkipBtn;

    ImageView imgDialouge;
    ImageView imgDialougeName;
    TextView dialougeText;
    TextView dialougeName;

    Cursor iCursor;

    boolean v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_label);

        imgBg=findViewById(R.id.bg);
        ImgCh = findViewById(R.id.ch);


        SkipBtn = findViewById(R.id.skipbtn);
        imgDialouge = findViewById(R.id.dialougeW);//대화창.
        imgDialougeName= findViewById(R.id.dialouge_name);
        dialougeText = findViewById(R.id.dialougeT);  // 텍스트
        dialougeName = findViewById(R.id.dialouge_nameT);  // 이름

        v= false;




        Intent i = getIntent();

////////////////////////////////////////////////////////////////////DB///////////////////////
        DbOpenHelper mDbOpenHelper = new DbOpenHelper(this);
        //DatabaseHelper 를 통해 테이블 구조 가져옴.
        mDbOpenHelper.open();
        //dB 열어서 사용할 수 있도록 해줌. --> getWritableDatabase() 있음.
        mDbOpenHelper.create();
        //DB 열었고, db 생성 및 연결함.

        mDbOpenHelper.insertColumn( ch_1, "안녕  내이름은 youjin 이야.");
        mDbOpenHelper.insertColumn(ch_2, "만나서 반가워.");

        //가져온 구조에 값 저장.

        mDbOpenHelper.insertColumn("ch_2","안녕");
        mDbOpenHelper.insertColumn("ch_2","메롱메롱");
        mDbOpenHelper.insertColumn("ch_1","메롱");


        iCursor = mDbOpenHelper.selectColumns();
        // 커서 생성. chapter1 테이블의 한 줄씩 읽어옴.
        iCursor.getColumnIndex("_ID");
        //_ID 값의 인덱스값을 정수로 받아옴.

/*
        List stories = new ArrayList();
        while(iCursor.moveToNext()){
            //대사 추가.
            String story = iCursor.getString(
                    iCursor.getColumnIndexOrThrow(DataBaseDemo.CreateDB.SAYING)
            );
            stories.add(story);
        }
*/
            imgBg.setBackgroundResource(R.drawable.room);
            ImgCh.setImageResource(R.drawable.ysu_smile);


            final int c= iCursor.getColumnCount();
            imgDialouge.setOnClickListener(new View.OnClickListener() {
                int count = -1;
                        @Override
                        public void onClick(View v) {
                            count +=1;
                            for(int k = 0 ; k<= c; ){

                                k=count;
                                while(iCursor.moveToNext()){// 한 줄 당 멈추지 않고 바로 진행
                                    if(k ==iCursor.getPosition()) {
                                        // id 값. 몇 번째인지 알 수 있음. --> id 값과 비교
                                        //--> 순서별로 나옴. 이제 레이아웃 차례
                                        String tempName = iCursor.getString(iCursor.getColumnIndex("charname"));
                                        String tempText = iCursor.getString(iCursor.getColumnIndex("saying"));

                                        setCompo(tempName,tempText);
                                    }
                    }

                }
            }
        });

        iCursor.close();

    }

    public void touchDialouge(){
        imgDialouge.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {
                count += 1;
            }
        });
    }

    public void touchSkip(){
        SkipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //처음 터치 시  해당 대화가 끝까지 다 나오게
                // 두번째 터치시 다음으로 넘어가기.
            }
        });
    }

    public void startStory(){
        // db 에서 내용 꺼내오기.
    }

/*    public void dialougeVIsibility(){
        v= !v; // 이 메소드 --> v가 반대 상황으로 바뀜.

        // dialougeTExt 와 imgDialouge 가 공동 운명체여야함. --> 같이 보이고, 같이 사라지고.
        // v 상태 바뀔 호출 필요...?
        // db 내용 다 훑으면 실행.
       if(v==false){
           imgDialouge.setVisibility(View.INVISIBLE);
           dialougeText.setVisibility(View.INVISIBLE);
       } else {
           imgDialouge.setVisibility(View.VISIBLE);
           dialougeText.setVisibility(View.VISIBLE);
       }

    }*/

public void setCompo(String a, String b ){
    switch(a){//캐릭터 이름 --> 이미지
        case ch_1 :
            ImgCh.setImageResource(R.drawable.ysu_smile);
            break;
        case ch_2 :
            ImgCh.setImageResource(R.drawable.sar_smile);
            break;
        default:
            ImgCh.setImageResource(R.drawable.jjh_smile);
    }

    dialougeName.setText(a);
    dialougeText.setText(b);

    }
}

