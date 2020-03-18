package com.example.heresy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Endings extends AppCompatActivity {


    ListView listView;
    EndingAdapter endingAdapter;
    ImageButton exit;
    ArrayList<EndingItem> endingItemArrayList ;// 원래 적용시킬 리스트.
    ArrayList<Integer> endingArray;//종료 후 엔딩페이지 저장할 값들.
    TextView tv;
    ArrayList<Integer> endingPages;//종료 후 엔딩페이지 저장할 값들.



    int endingPage;
    String ending;
    int position;
    boolean first=false;
    TinyDB tinyDB;
    MusicActivity mediaPlayer = Application.getMusicActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endings);

        listView = findViewById(R.id.endingList);//
        endingArray = new ArrayList<Integer>();
        tinyDB = Application.getSavePageDB();

        /////엔딩 설정.
        Intent i = getIntent();
        endingPages = tinyDB.getListInt("endingPages");//가져옴.

        endingPage = i.getIntExtra("page",-1);//--> 현재 리스트/ 저장리스트에 저장필요.\
        endingPages.add(endingPage);

        tinyDB.putListInt("endingPages",endingPages);// 영구 저장.

        endingItemArrayList = new ArrayList<EndingItem>();
        endingAdapter = new EndingAdapter(Endings.this, endingItemArrayList);
        listView.setAdapter(endingAdapter);
        defaultEnding();

        for(int p = 0 ; p < endingPages.size();p++) {
            endingPage =endingPages.get(p);
            getChapterEnding();
        }


        System.out.println("page ="+i.getIntExtra("page",-1));
        System.out.println("ENDINGPAGE ========="+endingPage);


        exit= findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(1);
                if(mediaPlayer!=null){
                    mediaPlayer.stopMusic();
                }
                finish();
            }
        });


    }



    @Override
    public void onBackPressed() {
        Intent i = new Intent();
        setResult(1);
        if(mediaPlayer!=null){
            mediaPlayer.stopMusic();
        }
        finish();
    }



    public void defaultEnding(){
        int i;

        for(i=0; i <13; i++){
            endingItemArrayList.add(new EndingItem(-1,i)); //>??? 20개 저장되어 있음.
        }// 디폴트 엔딩 구현.. ??? 로 20개 나옴.

    }

    public void getChapterEnding(){

        //한번이라도 업적 쌓음.
        first=true;
        Application.setFirst(first);
        switch(endingPage){
            case 9:endingItemArrayList.remove(0);
                endingItemArrayList.add(0,new EndingItem(0));
                break;
            case 35:endingItemArrayList.remove(1);
                endingItemArrayList.add(1,new EndingItem(1));
                break;
            case 48:
                endingItemArrayList.remove(2);
                endingItemArrayList.add(2,new EndingItem(2));
                break;
            case 59:
                endingItemArrayList.remove(3);
                endingItemArrayList.add(3,new EndingItem(3));
                break;
            case 63:
                endingItemArrayList.remove(4);
                endingItemArrayList.add(4,new EndingItem(4));
                break;
            case 68:
                endingItemArrayList.remove(5);
                endingItemArrayList.add(5,new EndingItem(5));
                break;
            case 72:
                endingItemArrayList.remove(6);
                endingItemArrayList.add(6,new EndingItem(6));
                break;
            case 76:
                endingItemArrayList.remove(7);
                endingItemArrayList.add(7,new EndingItem(7));
                break;
            case 79:
                endingItemArrayList.remove(8);
                endingItemArrayList.add(new EndingItem(8,8));
                break;
            case 103:
                endingItemArrayList.remove(9);
                endingItemArrayList.add(new EndingItem(9,9));
                break;
            case 130:
                endingItemArrayList.remove(10);
                endingItemArrayList.add(new EndingItem(10,10));
                break;
            case 168:
                endingItemArrayList.remove(11);
                endingItemArrayList.add(new EndingItem(11,11));
                break;
            case 185:
                endingItemArrayList.remove(12);
                endingItemArrayList.add(new EndingItem(12,12));
                break;
        }

    }



}
