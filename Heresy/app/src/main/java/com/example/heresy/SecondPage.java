package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
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

    String l; String f;static String  APPL;

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
        Application a = (Application)this.getApplication();
         a.setL(lstE.getText().toString());
         APPL =a.getL();
        Intent newI = getIntent();
        setResult(NEW_OK);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("SECOND_BACK",SECOND_BACK);
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SecondPage.this,T1_text.class);
                i.putExtra("lastName",lstE.getText().toString());//성
                i.putExtra("firstName",fstE.getText().toString());//이름 // f만 옴. // 객체로 하면 안옴.
                i.putExtra("changeCode", 1);
                System.out.println("GOOOOOOOOOOOOOOOOOo TO T1");
                System.out.println("appL =========="+  APPL);
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



}
