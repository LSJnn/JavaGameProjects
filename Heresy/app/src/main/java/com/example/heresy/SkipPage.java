package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class SkipPage extends AppCompatActivity {
    ImageButton exit;
    ImageButton skip1;
    ImageButton skip2;
    ImageButton skip3;
    ImageButton free;

    static int skip =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip_page);

        skipBuyListener();


    }

    public void initializer(){
        skip1 = findViewById(R.id.skip1);
        skip2 = findViewById(R.id.skip2);
        skip3 = findViewById(R.id.skip3);
        free = findViewById(R.id.skipFree);
        exit= findViewById(R.id.exit);

    }

    public void skipBuyListener (){

        skip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                skip +=1;
                Application.setSkip(skip);
                //
            }
        });

        skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                skip +=2;
                Application.setSkip(skip);
            }
        });

        skip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                skip +=3;
                Application.setSkip(skip);
            }
        });

        free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                skip +=1;
                Application.setSkip(skip);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                skip +=1;
            }
        });

    }

}
