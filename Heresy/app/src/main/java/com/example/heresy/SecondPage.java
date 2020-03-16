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
    boolean L;
    boolean F;

    int new_start;
    mySharedPreferences msf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);


        lstE = findViewById(R.id.e_lastname);
        fstE=findViewById(R.id.e_firstname);
        back=findViewById(R.id.backbtn);
        next=findViewById(R.id.nextBtn);
        ending= findViewById(R.id.endingBtn);
        msf = new mySharedPreferences();


        msf.getPreferenences(this);
        Application.setMsf(msf);

        //////////////초기화//////////////////////////


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                StartStory.setViewNum(0);
                finish();
            }
        });
        nextClick();

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondPage.this, Endings.class);
                startActivity(intent);
            }
        });


    }

    public void nextClick(){
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( lstE.getText().toString().length()!=0&&fstE.getText().toString().length()!=0) {

                    Intent i = new Intent(SecondPage.this, T1_text.class);
                    Application.setL(lstE.getText().toString());
                    Application.setF(fstE.getText().toString());

                    l = Application.getL();
                    f = Application.getF();
                    msf.setString("lastName", l, "firstName", f);
                    i.putExtra("changeCode", 1);
                    startActivity(i);
                    finish();
                }else {Toast.makeText(getApplicationContext()," 이름을 입력해주세요",Toast.LENGTH_SHORT).show();}

            }
        };
        next.setOnClickListener(onClickListener);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        StartStory.setViewNum(0);

    }
}
