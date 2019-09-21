package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class paymentpageone extends AppCompatActivity {

    TextView name,email,address,accno,phone,code,city;
    EditText in1,in2,in3,in4,in5,in6,in7;
    Button btn;
    Payment payment;

    private void clearControls(){
        name.setText("");
        email.setText("");
        address.setText("");
        accno.setText("");
        phone.setText("");
        code.setText("");
        city.setText("");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentpageone);

        name = findViewById(R.id.uname);
        email = findViewById(R.id.email);
        address = findViewById(R.id.add);
        phone = findViewById(R.id.connum);
        accno = findViewById(R.id.acnum2);
        code = findViewById(R.id.code2);
        city = findViewById(R.id.city);

        btn = findViewById(R.id.submitbtn);

        in1 = findViewById(R.id.unmaein);
        in2 = findViewById(R.id.emailin);
        in3 = findViewById(R.id.phonein);
        in4 = findViewById(R.id.addin);
        in5 = findViewById(R.id.acnumin);
        in6 = findViewById(R.id.codein2);
        in7 = findViewById(R.id.cityin);

        payment = new Payment();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), paymentpagetwo.class);
                startActivity(i);
            }
        });



    }
}

