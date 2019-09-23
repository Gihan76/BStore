package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheGirlInTheIce extends AppCompatActivity {

    Button btn87;
    Button btn88;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_girl_in_the_ice);
        setTitle("The Girl In The Ice");

        btn87 = findViewById(R.id.button87);
        btn88=findViewById(R.id.button88);

        btn87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), paymentpageone.class);
                startActivity(i);
            }
        });

        btn88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),SignUpActivity.class);
                startActivity(i);
            }
        });
    }
}
