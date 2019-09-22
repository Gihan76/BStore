package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FeedBackAc extends AppCompatActivity {

    EditText etname, etemail, etcomment, etCon;
    Button btnSubmit, btnShow;
    DatabaseReference dbRef;
    FeedBack fb;


    public void clearControls(){
        etname.setText("");
        etemail.setText("");
        etcomment.setText("");
        etCon.setText("");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        etname = findViewById(R.id.etName);
        etemail = findViewById(R.id.etEmail);
        etCon = findViewById(R.id.etPhone);
        etcomment = findViewById(R.id.etMessage);


        btnShow = findViewById(R.id.btnSubmit);
        btnSubmit = findViewById(R.id.btnShow);

        fb = new FeedBack();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbRef = FirebaseDatabase.getInstance().getReference().child("FeedBack");

                try{
                    if(TextUtils.isEmpty(etname.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter a name",Toast.LENGTH_SHORT).show();
                    else if(TextUtils.isEmpty(etemail.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter an email",Toast.LENGTH_SHORT).show();
                    else if(TextUtils.isEmpty(etcomment.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter a message",Toast.LENGTH_SHORT).show();
                    else{
                        fb.setName(etname.getText().toString().trim());
                        fb.setEmail(etemail.getText().toString().trim());
                        fb.setMessage(etcomment.getText().toString().trim());
                        fb.setConNo((Integer.parseInt(etCon.getText().toString().trim())));

                        dbRef.push().setValue(fb);

                        Toast.makeText(getApplicationContext(),"Your Comment add successfully",Toast.LENGTH_SHORT).show();
                        clearControls();
                    }


                }catch(NumberFormatException e){
                   Toast.makeText(getApplicationContext(),"Invalid Contact Number",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent  = new Intent(FeedBackAc.this, ViewFeedBack.class);
                //startActivity(intent);
            }
        });


    }
}
