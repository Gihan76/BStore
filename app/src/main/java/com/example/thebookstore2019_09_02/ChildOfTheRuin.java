package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChildOfTheRuin extends AppCompatActivity {

    Button btn105;
    Button btn106;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_of_the_ruin);
        setTitle("Children Of THe Ruin");


        btn105 = findViewById(R.id.button105);
        btn106=findViewById(R.id.button106);

        btn105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), paymentpageone.class);
                startActivity(i);
            }
        });

        btn106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),SignUpActivity.class);
                startActivity(i);
            }
        });


    }
}
