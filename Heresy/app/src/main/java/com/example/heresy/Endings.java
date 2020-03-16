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

import org.json.JSONArray;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Endings extends AppCompatActivity {


    ListView listView;
    EndingAdapter endingAdapter;
    ImageButton exit;
    ArrayList<EndingItem> endingItemArrayList ;
    ArrayList<Integer> endingArray;

    int endingPage;
    String ending;
    int position;
    boolean first=false;
    TinyDB tinyDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endings);

        listView = findViewById(R.id.endingList);
        endingArray = new ArrayList<Integer>();
        tinyDB = Application.getSavePageDB();

        /////엔딩 설정.
        Intent i = getIntent();
        endingPage = i.getIntExtra("page",-1);

        System.out.println("page ="+i.getIntExtra("page",-1));
        System.out.println("ENDINGPAGE ========="+endingPage);

        if(Application.isFirst()){
            endingItemArrayList=Application.getEndingItemArrayList();
            //업적 저장된 걸로.
        }else{//완전 처음.
            endingItemArrayList = new ArrayList<EndingItem>();
        }

        endingAdapter = new EndingAdapter(Endings.this, endingItemArrayList);
        listView.setAdapter(endingAdapter);
        defaultEnding();

        if(endingPage!=-1){//인텐트가 있을 떄.
            endingArray.add(endingPage);
            getChapterEnding();
            tinyDB.putListInt("endingItems",endingArray);
            Application.setEndingItemArrayList(endingItemArrayList);// 엔딩 목록 저장시킴.
        }

        if(tinyDB!=null){ //저장된 게 있을 때
            ArrayList<Integer> saved = tinyDB.getListInt("endingItems");

            for(int a = 0; a < saved.size();a++){
                endingPage=saved.get(a);
                getChapterEnding();
            }
            getChapterEnding();
            Application.setEndingItemArrayList(endingItemArrayList);// 엔딩 목록 저장시킴.
        }


        exit= findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("enter",true);
                finish();
            }
        });


    }


    @Override
    public void onBackPressed() {
        Intent i = new Intent();
        i.putExtra("enter",true);
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
            case 36:endingItemArrayList.remove(1);
                endingItemArrayList.add(1,new EndingItem(1));
                break;
            case 49:
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
            case 68:
                endingItemArrayList.remove(5);
                endingItemArrayList.add(5,new EndingItem(5));
                break;
            case 69:
                endingItemArrayList.remove(6);
                endingItemArrayList.add(6,new EndingItem(6));
                break;
            case 73:
                endingItemArrayList.remove(7);
                endingItemArrayList.add(7,new EndingItem(7));
                break;
            case 77:
                endingItemArrayList.remove(8);
                endingItemArrayList.add(new EndingItem(8,8));
                break;
            case 104:
                endingItemArrayList.remove(9);
                endingItemArrayList.add(new EndingItem(9,9));
                break;
            case 130:
                endingItemArrayList.remove(10);
                endingItemArrayList.add(new EndingItem(10,10));
                break;
            case 169:
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
