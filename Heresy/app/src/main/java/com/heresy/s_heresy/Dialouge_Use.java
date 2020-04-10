package com.heresy.s_heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dialouge_Use extends AppCompatActivity {

    ImageButton yes; ImageButton no;int nChange = Application.getSavePageDB().getInt("skip");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialouge__use);

        getIntent();

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent back = new Intent();
                setResult(-1);
                nChange -=1;
                Application.getSavePageDB().putInt("skip",nChange);
                finish();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent();
                finish();
            }
        });

    }

}
