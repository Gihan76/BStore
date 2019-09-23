package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheWeddingDate extends AppCompatActivity {

    Button btn103;
    Button btn104;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_wedding_date);
        setTitle("The Wedding Date");

        btn103 = findViewById(R.id.button103);
        btn104=findViewById(R.id.button104);

        btn103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), paymentpageone.class);
                startActivity(i);
            }
        });

        btn104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),SignUpActivity.class);
                startActivity(i);
            }
        });
    }
}
