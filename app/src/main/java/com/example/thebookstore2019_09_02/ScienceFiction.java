package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ScienceFiction extends AppCompatActivity {


    ImageButton ib65;
    ImageButton ib66;
    ImageButton ib67;
    ImageButton ib68;
    ImageButton ib69;
    ImageButton ib70;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_fiction);
        setTitle("Science Fiction Book List");

        ib65 = findViewById(R.id.ImageButton0000000100);
        ib65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScienceFiction.this,ChildOfTheRuin.class);
                startActivity(i);
            }
        });

        ib66 = findViewById(R.id.ImageButton0000000101);
        ib66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScienceFiction.this,CmocrsOfWars.class);
                startActivity(i);
            }
        });


        ib67 = findViewById(R.id.ImageButton0000000102);
        ib67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScienceFiction.this,Enceladus.class);
                startActivity(i);
            }
        });


        ib68 = findViewById(R.id.ImageButton0000000103);
        ib68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScienceFiction.this,TheHungerGames.class);
                startActivity(i);
            }
        });


        ib69 = findViewById(R.id.ImageButton0000000104);
        ib69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScienceFiction.this,ThePathlessSky.class);
                startActivity(i);
            }
        });


        ib70 = findViewById(R.id.ImageButton0000000105);
        ib70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScienceFiction.this,TheAccidentalWar.class);
                startActivity(i);
            }
        });

    }
}
