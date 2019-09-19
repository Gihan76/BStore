package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Horror extends AppCompatActivity {

    ImageButton ib23;
    ImageButton ib24;
    ImageButton ib25;
    ImageButton ib26;
    ImageButton ib27;
    ImageButton ib28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror);
        setTitle("Horror Book List");

        ib23 = findViewById(R.id.ImageButton24);
        ib23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Horror.this,Dracula.class);
                startActivity(i);
            }
        });

        ib24 = findViewById(R.id.ImageButton25);
        ib24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Horror.this,NakedSheDied.class);
                startActivity(i);
            }
        });

        ib25 = findViewById(R.id.ImageButton26);
        ib25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Horror.this,TheCarrowHaunt.class);
                startActivity(i);
            }
        });


        ib26 = findViewById(R.id.ImageButton27);
        ib26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Horror.this,TheSentinel.class);
                startActivity(i);
            }
        });

        ib27 = findViewById(R.id.ImageButton28);
        ib27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Horror.this,TheSleepRoom.class);
                startActivity(i);
            }
        });

        ib28 = findViewById(R.id.ImageButton29);
        ib28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Horror.this,ThirtyDaysOfNight.class);
                startActivity(i);
            }
        });























    }
}
