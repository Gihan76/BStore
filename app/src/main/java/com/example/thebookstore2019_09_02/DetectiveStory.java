package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetectiveStory extends AppCompatActivity {

    ImageButton ib29;
    ImageButton ib30;
    ImageButton ib31;
    ImageButton ib32;
    ImageButton ib33;
    ImageButton ib34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detective_story);
        setTitle("Detective Story Book List");

        ib29 = findViewById(R.id.ImageButton00100);
        ib29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetectiveStory.this,GirlsLikeUs.class);
                startActivity(i);
            }
        });

        ib30 = findViewById(R.id.ImageButton00101);
        ib30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetectiveStory.this,TellNobody.class);
                startActivity(i);
            }
        });

        ib31 = findViewById(R.id.ImageButton00102);
        ib31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetectiveStory.this,TheChef.class);
                startActivity(i);
            }
        });

        ib32 = findViewById(R.id.ImageButton00103);
        ib32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetectiveStory.this,TheLastDetective.class);
                startActivity(i);
            }
        });


        ib33 = findViewById(R.id.ImageButton00104);
        ib33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetectiveStory.this,TheMissingOnes.class);
                startActivity(i);
            }
        });


        ib34 = findViewById(R.id.ImageButton00105);
        ib34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetectiveStory.this,TheStolenGirls.class);
                startActivity(i);
            }
        });


    }
}
