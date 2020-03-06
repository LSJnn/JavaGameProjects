package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Success extends AppCompatActivity {

    ImageButton ending;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        Intent i = getIntent();
        i.getExtras().getInt("page");

        ending = findViewById(R.id.endingBtn);

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Success.this, Endings.class);
                startActivity(intent);
            }
        });



    }
}
