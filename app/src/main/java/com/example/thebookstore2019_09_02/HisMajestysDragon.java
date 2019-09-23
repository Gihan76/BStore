package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HisMajestysDragon extends AppCompatActivity {

    Button btn69;
    Button btn70;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_his_majestys_dragon);
        setTitle("His Majesty's Dradon");

        btn69 = findViewById(R.id.button69);
        btn70=findViewById(R.id.button70);

        btn69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), paymentpageone.class);
                startActivity(i);
            }
        });

        btn70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),SignUpActivity.class);
                startActivity(i);
            }
        });
    }
}
