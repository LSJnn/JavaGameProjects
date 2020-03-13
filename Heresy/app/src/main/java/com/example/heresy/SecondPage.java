package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SecondPage extends AppCompatActivity {

    static  final int SECOND_BACK = 00000;
    static  final int NEW_OK = 13000;

    EditText lstE;
    EditText fstE;
    ImageButton back;
    ImageButton next;
    ImageButton ending;

    String l; String f;

    int new_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);


        lstE = findViewById(R.id.e_lastname);
        fstE=findViewById(R.id.e_firstname);
        back=findViewById(R.id.backbtn);
        next=findViewById(R.id.nextBtn);
        ending= findViewById(R.id.endingBtn);

        //////////////초기화//////////////////////////

    //lstE.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                StartStory.setViewNum(0);
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SecondPage.this,T1_text.class);
                Application.setL(lstE.getText().toString());
                Application.setF(fstE.getText().toString());

                l = Application.getL();
                f = Application.getF();
                i.putExtra("changeCode", 1);
                startActivity(i);
                finish();
            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondPage.this, Endings.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        StartStory.setViewNum(0);

    }
}
