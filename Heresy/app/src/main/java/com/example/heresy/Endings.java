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

import java.util.ArrayList;


public class Endings extends AppCompatActivity {


    ListView listView;
    EndingAdapter endingAdapter;
    ImageButton exit;
    ArrayList<EndingItem> endingItemArrayList ;

    int endingPage;
    EndingItem endingItem;
    String ending;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endings);

        Intent i = getIntent();

        listView = findViewById(R.id.endingList);
        endingItemArrayList = new ArrayList<EndingItem>();

        endingAdapter = new EndingAdapter(Endings.this, endingItemArrayList);
        listView.setAdapter(endingAdapter);
        defaultEnding();

        /////엔딩 설정.
        endingPage = i.getIntExtra("page",-1);


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

        for(int i = 0 ; i <20; i++){
            endingItemArrayList.add(new EndingItem(i));
        }
    }

    public void addEnding(){

    }
}
