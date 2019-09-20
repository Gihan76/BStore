package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Thriller extends AppCompatActivity {


    ImageButton ib71;
    ImageButton ib72;
    ImageButton ib73;
    ImageButton ib74;
    ImageButton ib75;
    ImageButton ib76;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thriller);
        setTitle("Thriller Book List");

        ib71 = findViewById(R.id.ImageButton00000000100);
        ib71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Thriller.this,DeadEndAtTheEnd.class);
                startActivity(i);
            }
        });

        ib72 = findViewById(R.id.ImageButton00000000101);
        ib72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Thriller.this,FinalGirls.class);
                startActivity(i);
            }
        });


        ib73 = findViewById(R.id.ImageButton00000000102);
        ib73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Thriller.this,HouseOfSmoke.class);
                startActivity(i);
            }
        });


        ib74 = findViewById(R.id.ImageButton00000000103);
        ib74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Thriller.this,LooseEnds.class);
                startActivity(i);
            }
        });


        ib75 = findViewById(R.id.ImageButton00000000104);
        ib75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Thriller.this,TheOutsider.class);
                startActivity(i);
            }
        });


        ib76 = findViewById(R.id.ImageButton00000000105);
        ib76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Thriller.this,TheSeventhVictim.class);
                startActivity(i);
            }
        });


    }
}
