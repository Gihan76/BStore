package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Adventures extends AppCompatActivity {

    ImageButton ib35;
    ImageButton ib36;
    ImageButton ib37;
    ImageButton ib38;
    ImageButton ib39;
    ImageButton ib40;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventures);
        setTitle("Adventures Book List");

        ib35 = findViewById(R.id.ImageButton000100);
        ib35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Adventures.this,Milady.class);
                startActivity(i);
            }
        });

        ib36 = findViewById(R.id.ImageButton000101);
        ib36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Adventures.this,TheHobbit.class);
                startActivity(i);
            }
        });

        ib37 = findViewById(R.id.ImageButton000102);
        ib37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Adventures.this,TheIronTrial.class);
                startActivity(i);
            }
        });

        ib38 = findViewById(R.id.ImageButton000103);
        ib38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Adventures.this,TheMirrorOfZ.class);
                startActivity(i);
            }
        });

        ib39 = findViewById(R.id.ImageButton000104);
        ib39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Adventures.this,TimeSnatchers.class);
                startActivity(i);
            }
        });

        ib40 = findViewById(R.id.ImageButton000105);
        ib40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Adventures.this,Infected.class);
                startActivity(i);
            }
        });
    }
}
