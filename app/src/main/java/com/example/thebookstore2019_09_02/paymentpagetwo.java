package com.example.thebookstore2019_09_02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class paymentpagetwo extends AppCompatActivity {
    TextView tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8;
    EditText in1,in2,in3,in4,in5,in6,in7,in8;
    Button btn1, btn2,btn3,btn4;
    Payment payment;
    DatabaseReference dbRef;

    private void clearControls() {
        in1.setText("");
        in2.setText("");
        in3.setText("");
        in4.setText("");
        in5.setText("");
        in6.setText("");
        //in7.setText("");
        //tx7.setText("");
        in8.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentpagetwo);

        tx1 = findViewById(R.id.uname);
        tx2 = findViewById(R.id.email);
        tx3 = findViewById(R.id.add);
        tx4 = findViewById(R.id.connum);
        tx5 = findViewById(R.id.code2);
        tx6 = findViewById(R.id.acnum2);
        tx7 = findViewById(R.id.cdtype);
        tx8 = findViewById(R.id.city);

        btn1 = findViewById(R.id.submit);
        btn2 = findViewById(R.id.show);
        btn3 = findViewById(R.id.update);
        btn4 = findViewById(R.id.delete);

        in1 = findViewById(R.id.unmaein);
        in2 = findViewById(R.id.emailin);
        in3 = findViewById(R.id.addin);
        in4 = findViewById(R.id.phonein);
        in5 = findViewById(R.id.codein2);
        in6 = findViewById(R.id.acnumin);
        in8 = findViewById(R.id.cityin);

        payment = new Payment();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbRef = FirebaseDatabase.getInstance().getReference().child("Payment").child("payment");

                if (TextUtils.isEmpty(in5.getText().toString()))
                    Toast.makeText(getApplicationContext(), "Please enter correct Zip code", Toast.LENGTH_SHORT).show();
                else if (TextUtils.isEmpty(in6.getText().toString()))
                    Toast.makeText(getApplicationContext(), "Fill before your go next", Toast.LENGTH_SHORT).show();
                else if (TextUtils.isEmpty(in8.getText().toString()))
                    Toast.makeText(getApplicationContext(), "Fill before your go next", Toast.LENGTH_SHORT).show();
                else {
                    payment.setCode(Integer.parseInt(in5.getText().toString().trim()));
                    payment. setAccountnum(Integer.parseInt(in6.getText().toString().trim()));
                    payment.setCity(in8.getText().toString().trim());
                    //payment.setCode(Integer.parseInt(tx5.getText().toString().trim()));
                    //payment.setAccountnum(Integer.parseInt(tx6.getText().toString().trim()));
                    //payment.setCdType(boolean());
                    //payment.setCity(tx8.getText().toString().trim());

                    dbRef.push().setValue(payment);

                    Toast.makeText(getApplicationContext(),"Data Saved Successfully",Toast.LENGTH_SHORT).show();
                    clearControls();

                    //Toast.makeText(getApplicationContext(),"Invalid detail",Toast.LENGTH_SHORT).show();
                }

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference readRef = FirebaseDatabase.getInstance().getReference().child("Payment").child("payment");
                readRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if(dataSnapshot.hasChildren()){
                            in1.setText(dataSnapshot.child("Username").getValue().toString());
                            in2.setText(dataSnapshot.child("Email").getValue().toString());
                            in3.setText(dataSnapshot.child("Address").getValue().toString());
                            in4.setText(dataSnapshot.child("Phone").getValue().toString());
                            in5.setText(dataSnapshot.child("ZIP code").getValue().toString());
                            in6.setText(dataSnapshot.child("Account Number").getValue().toString());
                            in8.setText(dataSnapshot.child("City").getValue().toString());
                        }else{
                            Toast.makeText(getApplicationContext(),"No values to Display",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                DatabaseReference upRef =  FirebaseDatabase.getInstance().getReference().child("Payment").child("payment2");
                upRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if(dataSnapshot.hasChildren())
                        {
                            payment.setUsername(in1.getText().toString().trim());
                            payment.setEmail(in2.getText().toString().trim());
                            payment.setAddres(in3.getText().toString().trim());
                            payment.setPhone(Integer.parseInt(in4.getText().toString().trim()));
                            payment.setAccountnum(Integer.parseInt(in6.getText().toString().trim()));
                            payment.setCode(Integer.parseInt(in5.getText().toString().trim()));
                            payment.setCity(in1.getText().toString().trim());

                            dbRef = FirebaseDatabase.getInstance().getReference().child("Payment");
                            dbRef.setValue(payment);
                            clearControls();

                            Toast.makeText(getApplicationContext(),"Data Updated Successfuly",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(getApplicationContext(),"No source to update",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference delRef = FirebaseDatabase.getInstance().getReference().child("Payment").child("payment2");
                delRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if(dataSnapshot.hasChildren()){
                            dbRef = FirebaseDatabase.getInstance().getReference().child("Payment");
                            dbRef.removeValue();
                            clearControls();
                            Toast.makeText(getApplicationContext(),"Source deleted successfuly",Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(getApplicationContext(),"No source to delete",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }




}