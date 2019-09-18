package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Comic extends AppCompatActivity {

    ImageButton ib13;
    ImageButton ib14;
    ImageButton ib15;
    ImageButton ib16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic);
        setTitle("Comic Book List");

        ib13 = findViewById(R.id.ImageButton13);
        ib13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Comic.this,CaptainMarvel.class);
                startActivity(i);
            }
        });

        ib14 = findViewById(R.id.ImageButton14);
        ib14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Comic.this,BlackCat.class);
                startActivity(i);
            }
        });

        ib15 = findViewById(R.id.ImageButton15);
        ib15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Comic.this,SpiderMan.class);
                startActivity(i);
            }
        });

        ib16 = findViewById(R.id.ImageButton16);
        ib16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Comic.this,Titans.class);
                startActivity(i);
            }
        });
    }
}
