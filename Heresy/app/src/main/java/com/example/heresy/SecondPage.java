package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
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

        //////////////초기화//////////////////////////

        l = lstE.getText().toString();
        f = fstE.getText().toString();

        System.out.println("1 L = "+l + "1 F = "+ f);

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

                Intent i = new Intent(getApplicationContext(),Story.class);
                i.putExtra("firstname",f);
                i.putExtra("lastname",l);
                startActivity(i);
                finish();

            }
        });


    }



}
