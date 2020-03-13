package com.example.heresy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Endings extends AppCompatActivity {


    ListView listView;
    EndingAdapter endingAdapter;
    ImageButton exit;
    ArrayList<EndingItem> endingItemArrayList ;

    int endingPage;
    EndingItem endingItem;
    String ending;
    int position;
    boolean first=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endings);

        listView = findViewById(R.id.endingList);

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

        if(endingPage!=-1){
        getChapterEnding();
            Application.setEndingItemArrayList(endingItemArrayList);// 엔딩 목록 저장시킴.
        }



        exit= findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                finish();
            }
        });




    }


    public void defaultEnding(){
        int i;

        for(i=0; i <20; i++){
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
            case 41:
                endingItemArrayList.remove(2);
                endingItemArrayList.add(2,new EndingItem(2));
                break;
            case 49:
                endingItemArrayList.remove(3);
                endingItemArrayList.add(3,new EndingItem(3));
                break;
            case 52:
                endingItemArrayList.remove(4);
                endingItemArrayList.add(4,new EndingItem(4));
                break;
            case 61:
                endingItemArrayList.remove(5);
                endingItemArrayList.add(5,new EndingItem(5));
                break;
            case 57:
                endingItemArrayList.remove(6);
                endingItemArrayList.add(6,new EndingItem(6));
                break;
            case 70:
                endingItemArrayList.remove(7);
                endingItemArrayList.add(7,new EndingItem(7));
                break;
            case 77:
                endingItemArrayList.remove(8);
                endingItemArrayList.add(new EndingItem(8,8));
                break;
        }

    }



}
