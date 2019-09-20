package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Westerns extends AppCompatActivity {

    ImageButton ib77;
    ImageButton ib78;
    ImageButton ib79;
    ImageButton ib80;
    ImageButton ib81;
    ImageButton ib82;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_westerns);
        setTitle("Westerns Book List");

        ib77 = findViewById(R.id.ImageButton000000000100);
        ib77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Westerns.this,AnyGunCanPlay.class);
                startActivity(i);
            }
        });

        ib78 = findViewById(R.id.ImageButton000000000101);
        ib78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Westerns.this,BloodMeridian.class);
                startActivity(i);
            }
        });


        ib79 = findViewById(R.id.ImageButton000000000102);
        ib79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Westerns.this,FiveChildrenOnTheWesternFront.class);
                startActivity(i);
            }
        });


        ib80 = findViewById(R.id.ImageButton000000000103);
        ib80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Westerns.this,FrontierAmerica.class);
                startActivity(i);
            }
        });


        ib81 = findViewById(R.id.ImageButton000000000104);
        ib81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Westerns.this,OneFineCowBoy.class);
                startActivity(i);
            }
        });


        ib82 = findViewById(R.id.ImageButton000000000105);
        ib82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Westerns.this,HellBentKid.class);
                startActivity(i);
            }
        });
    }
}
