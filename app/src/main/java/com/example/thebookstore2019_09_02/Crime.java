package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Crime extends AppCompatActivity {

    ImageButton ib17;
    ImageButton ib18;
    ImageButton ib19;
    ImageButton ib20;
    ImageButton ib21;
    ImageButton ib22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        setTitle("Crime Book List");

        ib17=findViewById(R.id.ImageButton0100);
        ib17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Crime.this,KillerWomen.class);
                startActivity(i);
            }
        });

        ib18=findViewById(R.id.ImageButton0101);
        ib18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Crime.this,TheShutEye.class);
                startActivity(i);
            }
        });


        ib19=findViewById(R.id.ImageButton0102);
        ib19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Crime.this,TheStudent.class);
                startActivity(i);
            }
        });


        ib20=findViewById(R.id.ImageButton0103);
        ib20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Crime.this,ThosePeople.class);
                startActivity(i);
            }
        });


        ib21=findViewById(R.id.ImageButton0104);
        ib21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Crime.this,UnsolvedChildMurders.class);
                startActivity(i);
            }
        });
        ib22=findViewById(R.id.ImageButton0105);
        ib22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Crime.this,YouLetMeIn.class);
                startActivity(i);
            }
        });























    }
}
