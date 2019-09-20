package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Drama extends AppCompatActivity {

    ImageButton ib41;
    ImageButton ib42;
    ImageButton ib43;
    ImageButton ib44;
    ImageButton ib45;
    ImageButton ib46;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drama);
        setTitle("Drama Book List");

        ib41 = findViewById(R.id.ImageButton0000100);
        ib41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Drama.this,D_Drama.class);
                startActivity(i);
            }
        });

        ib42 = findViewById(R.id.ImageButton0000101);
        ib42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Drama.this,GirlsQandA.class);
                startActivity(i);
            }
        });


        ib43 = findViewById(R.id.ImageButton0000102);
        ib43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Drama.this,MajorDrama.class);
                startActivity(i);
            }
        });


        ib44 = findViewById(R.id.ImageButton0000103);
        ib44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Drama.this,TheArrivelOfSomeDay.class);
                startActivity(i);
            }
        });


        ib45 = findViewById(R.id.ImageButton0000104);
        ib45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Drama.this,TheDramaOfLife.class);
                startActivity(i);
            }
        });


        ib46 = findViewById(R.id.ImageButton0000105);
        ib46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Drama.this,GreenKnicht.class);
                startActivity(i);
            }
        });




    }
}
