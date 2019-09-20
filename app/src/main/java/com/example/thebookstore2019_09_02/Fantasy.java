package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Fantasy extends AppCompatActivity {


    ImageButton ib47;
    ImageButton ib48;
    ImageButton ib49;
    ImageButton ib50;
    ImageButton ib51;
    ImageButton ib52;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fantasy);
        setTitle("Fantacy Book List");

        ib47 = findViewById(R.id.ImageButton00000100);
        ib47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fantasy.this,HisMajestysDragon.class);
                startActivity(i);
            }
        });

        ib48 = findViewById(R.id.ImageButton00000101);
        ib48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fantasy.this,RidersRevenge.class);
                startActivity(i);
            }
        });


        ib49 = findViewById(R.id.ImageButton00000102);
        ib49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fantasy.this,StrangeLuck.class);
                startActivity(i);
            }
        });


        ib50 = findViewById(R.id.ImageButton00000103);
        ib50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fantasy.this,TheApprenticeWitch.class);
                startActivity(i);
            }
        });


        ib51 = findViewById(R.id.ImageButton00000104);
        ib51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fantasy.this,TheShapeOfWater.class);
                startActivity(i);
            }
        });


        ib52 = findViewById(R.id.ImageButton0000105);
        ib52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fantasy.this,TigersDream.class);
                startActivity(i);
            }
        });
    }
}

