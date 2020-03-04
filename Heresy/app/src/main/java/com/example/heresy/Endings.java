package com.example.heresy;

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
/*        endingItemArrayList.add(new EndingItem(1,R.drawable.ending_item));
        endingItemArrayList.add(new EndingItem(2,R.drawable.ending_item));*/

        for(int i = 0 ; i <20; i++){
            endingItemArrayList.add(new EndingItem(i));
        }
    }

    public void addEnding(){

    }
}
