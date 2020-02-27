package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
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

    static  final int OK = 00000;
    EditText lstE;
    EditText fstE;
    ImageButton back;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);


        lstE = findViewById(R.id.e_lastname);
        fstE=findViewById(R.id.e_firstname);
        back=findViewById(R.id.backbtn);
        next=findViewById(R.id.nextBtn);

        //////////////초기화//////////////////////////

        String l = lstE.getText().toString();
        String f = fstE.getText().toString();
        String full = l+f;


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                setResult(OK);
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String l = lstE.getText().toString();
                String f = fstE.getText().toString();

                Intent i = new Intent(getApplicationContext(),Story.class);
                i.putExtra("firstname",f);
                i.putExtra("lastname",l);
                startActivity(i);

            }
        });


    }
}
