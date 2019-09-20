package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Romance extends AppCompatActivity {

    ImageButton ib59;
    ImageButton ib60;
    ImageButton ib61;
    ImageButton ib62;
    ImageButton ib63;
    ImageButton ib64;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance);
        setTitle("Romance Book List");

        ib59 = findViewById(R.id.ImageButton000000100);
        ib59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Romance.this,IWanntYouBack.class);
                startActivity(i);
            }
        });

        ib60 = findViewById(R.id.ImageButton000000101);
        ib60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Romance.this,LoveAndOtherBattles.class);
                startActivity(i);
            }
        });


        ib61 = findViewById(R.id.ImageButton000000102);
        ib61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Romance.this,MeBeforeYou.class);
                startActivity(i);
            }
        });


        ib62 = findViewById(R.id.ImageButton000000103);
        ib62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Romance.this,TheLastLetterFromYourLover.class);
                startActivity(i);
            }
        });


        ib63 = findViewById(R.id.ImageButton000000104);
        ib63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Romance.this,TwiceShy.class);
                startActivity(i);
            }
        });


        ib64 = findViewById(R.id.ImageButton000000105);
        ib64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Romance.this,TheWeddingDate.class);
                startActivity(i);
            }
        });






        
    }
}
