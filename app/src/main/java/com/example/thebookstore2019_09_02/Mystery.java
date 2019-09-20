package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Mystery extends AppCompatActivity {

    ImageButton ib53;
    ImageButton ib54;
    ImageButton ib55;
    ImageButton ib56;
    ImageButton ib57;
    ImageButton ib58;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystery);
        setTitle("Mystery Book List");

        ib53 = findViewById(R.id.ImageButton100);
        ib53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mystery.this,AKillersMind.class);
                startActivity(i);
            }
        });

        ib54 = findViewById(R.id.ImageButton101);
        ib54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mystery.this,DeadlyStillWater.class);
                startActivity(i);
            }
        });


        ib55 = findViewById(R.id.ImageButton102);
        ib55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mystery.this,IamWatchingYou.class);
                startActivity(i);
            }
        });


        ib56 = findViewById(R.id.ImageButton103);
        ib56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mystery.this,TheGirlInTheIce.class);
                startActivity(i);
            }
        });


        ib57 = findViewById(R.id.ImageButton104);
        ib57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mystery.this,TheGoodDaughter.class);
                startActivity(i);
            }
        });


        ib58 = findViewById(R.id.ImageButton105);
        ib58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mystery.this,ThePortal.class);
                startActivity(i);
            }
        });


    }
}
