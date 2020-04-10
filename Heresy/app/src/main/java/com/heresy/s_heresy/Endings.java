package com.heresy.s_heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;


public class Endings extends AppCompatActivity {


    ListView listView;
    EndingAdapter endingAdapter;
    ImageButton exit;
    ArrayList<EndingItem> endingItemArrayList ;// 원래 적용시킬 리스트.
    ArrayList<Integer> endingArray;//종료 후 엔딩페이지 저장할 값들.

    ArrayList<Integer> endingPages;//종료 후 엔딩페이지 저장할 값들.
    MusicActivity mediaPlayer = Application.getMusicActivity();
    StartStory startStory;



    static int endingPage;
    static int star;
    String ending;
    TinyDB tinyDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endings);

        //초기화
        listView = findViewById(R.id.endingList);//
        endingArray = new ArrayList<Integer>();
        tinyDB = Application.getSavePageDB();
        exit= findViewById(R.id.exit);
        startStory = new StartStory();
        star= 0;

        /////엔딩 설정.
        final Intent i = getIntent();
        //share 에서 리스트 데이터 가져옴.
        endingPages = tinyDB.getListInt("endingPages");
        //적용시킴.
        endingPage = i.getIntExtra("page",-1);//--> 현재 리스트/ 저장리스트에 저장필요.\

        endingPages.add(endingPage);

        tinyDB.putListInt("endingPages",endingPages);// 영구 저장.

        endingItemArrayList = new ArrayList<EndingItem>();
        endingAdapter = new EndingAdapter(Endings.this, endingItemArrayList);
        listView.setAdapter(endingAdapter);
        defaultEnding();

        for (int p = 0; p < endingPages.size(); p++) {
            endingPage = endingPages.get(p);
            getChapterEnding();
        }


        System.out.println("page ="+i.getIntExtra("page",-1));
        System.out.println("ENDINGPAGE ========="+endingPage);


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                star=1;
            }
        });


    }



    @Override
    public void onBackPressed() {
        finish();
        star=1;
    }

    public void defaultEnding(){
        int i;

        for(i=0; i <13; i++){
            endingItemArrayList.add(new EndingItem(-1,i)); //>??? 20개 저장되어 있음.
        }// 디폴트 엔딩 구현.. ??? 로 20개 나옴.

    }


    public void getChapterEnding(){

        switch(endingPage){
            case 10:endingItemArrayList.remove(0);
                endingItemArrayList.add(0,new EndingItem(0));
                break;
            case 36:endingItemArrayList.remove(1);
                endingItemArrayList.add(1,new EndingItem(1));
                break;
            case 48:
                endingItemArrayList.remove(2);
                endingItemArrayList.add(2,new EndingItem(2));
                break;
            case 60:
                endingItemArrayList.remove(3);
                endingItemArrayList.add(3,new EndingItem(3));
                break;
            case 64:
                endingItemArrayList.remove(4);
                endingItemArrayList.add(4,new EndingItem(4));
                break;
            case 69:
                endingItemArrayList.remove(5);
                endingItemArrayList.add(5,new EndingItem(5));
                break;
            case 73:
                endingItemArrayList.remove(6);
                endingItemArrayList.add(6,new EndingItem(6));
                break;
            case 76:
                endingItemArrayList.remove(7);
                endingItemArrayList.add(7,new EndingItem(7));
                break;
            case 80:
                endingItemArrayList.remove(8);
                endingItemArrayList.add(8,new EndingItem(8));
                break;
            case 104:
                endingItemArrayList.remove(9);
                endingItemArrayList.add(9,new EndingItem(9));
                break;
                //여기부터,
            case 131:
                endingItemArrayList.remove(10);
                endingItemArrayList.add(10,new EndingItem(10));
                break;
            case 169:
                endingItemArrayList.remove(11);
                endingItemArrayList.add(11,new EndingItem(11));
                break;
            case 185:
                endingItemArrayList.remove(12);
                endingItemArrayList.add(12,new EndingItem(12));
                break;

        }

    }

    @Override
    protected void onPause() {
        //액티비티가 다른데로 넘어갈때 - 다이얼로그 / 다른 뷰로.
        //홈으로 갈떄 --> 이때만 음악 멈춤.
        if(star!=1) {
            if (mediaPlayer != null) {
                mediaPlayer.stopMusic();
            }
        }
        super.onPause();
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
            if(!mediaPlayer.isPlaying()){
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
