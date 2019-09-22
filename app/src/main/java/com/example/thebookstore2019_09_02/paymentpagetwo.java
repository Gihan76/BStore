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

    TextView name,email,address,accno,phone,cdtype,code,city;
    EditText in1,in2,in3,in4,in5,in6,in7,in8;
    Button btn1,btn2,btn3,btn4;
    Payment payment;
    DatabaseReference dbRef;

    private void clearControls(){
        name.setText("");
        email.setText("");
        address.setText("");
        accno.setText("");
        phone.setText("");
        code.setText("");
        //cdtype.setText("");
        city.setText("");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentpagetwo);

        name = findViewById(R.id.uname);
        email = findViewById(R.id.email);
        address = findViewById(R.id.add);
        phone = findViewById(R.id.connum);
        accno = findViewById(R.id.acnum2);
        //cdtype = findViewById(R.id)
        code = findViewById(R.id.code2);
        city = findViewById(R.id.city);

        btn1 = findViewById(R.id.submit);
        btn2 = findViewById(R.id.show);
        btn3 = findViewById(R.id.update);
        btn4 = findViewById(R.id.delete);


        in1 = findViewById(R.id.unmaein);
        in2 = findViewById(R.id.emailin);
        in3 = findViewById(R.id.phonein);
        in4 = findViewById(R.id.addin);
        in5 = findViewById(R.id.acnumin);
        in6 = findViewById(R.id.codein2);
        in8 = findViewById(R.id.cityin);

        payment = new Payment();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbRef = FirebaseDatabase.getInstance().getReference().child("Payment");
                if(TextUtils.isEmpty(in5.getText().toString()))
                    Toast.makeText(getApplicationContext(),"Enter valid username",Toast.LENGTH_SHORT).show();
                else if(TextUtils.isEmpty(in6.getText().toString()))
                    Toast.makeText(getApplicationContext(),"Enter valid Email",Toast.LENGTH_SHORT).show();
                else if(TextUtils.isEmpty(in8.getText().toString()))
                    Toast.makeText(getApplicationContext(),"Fill all before go next",Toast.LENGTH_SHORT).show();
                else
                {
                    payment.setAccnum(Integer.parseInt(in5.getText().toString().trim()));
                    payment.setCode(Integer.parseInt(in6.getText().toString().trim()));
                    payment.setCity(in8.getText().toString().trim());
                    //payment.setPhone(Integer.parseInt(in4.getText().toString().trim()));

                    dbRef.push().setValue(payment);

                    Toast.makeText(getApplicationContext(),"Data saved successfuly",Toast.LENGTH_SHORT).show();
                    clearControls();
                }
                //Intent i = new Intent(getApplicationContext(), paymentpagetwo.class);
                //startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference readRef = FirebaseDatabase.getInstance().getReference().child("Payment");
                readRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.hasChildren())
                        {
                            in1.setText(dataSnapshot.child("Username").getValue().toString());
                            in2.setText(dataSnapshot.child("Email").getValue().toString());
                            in3.setText(dataSnapshot.child("Address").getValue().toString());
                            in4.setText(dataSnapshot.child("Phone").getValue().toString());
                            in5.setText(dataSnapshot.child("Account number").getValue().toString());
                            in6.setText(dataSnapshot.child("ZIP code").getValue().toString());
                            in8.setText(dataSnapshot.child("City").getValue().toString());
                        }else{
                            Toast.makeText(getApplicationContext(),"No data to show",Toast.LENGTH_SHORT).show();
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
            public void onClick(View v) {
                DatabaseReference updata = FirebaseDatabase.getInstance().getReference().child("Payment");
                updata.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if(dataSnapshot.hasChildren()){
                            payment.setUsername(in1.getText().toString().trim());
                            payment.setEmail(in2.getText().toString().trim());
                            payment.setAddres(in3.getText().toString().trim());
                            payment.setPhone(Integer.parseInt(in4.getText().toString().trim()));
                            payment.setAccnum(Integer.parseInt(in5.getText().toString().trim()));
                            payment.setCode(Integer.parseInt(in6.getText().toString().trim()));
                            payment.setCity(in8.getText().toString().trim());

                            dbRef = FirebaseDatabase.getInstance().getReference().child("Payment");
                            dbRef.setValue(payment);
                            clearControls();

                            Toast.makeText(getApplicationContext(),"Details Updated Successfuly",Toast.LENGTH_SHORT).show();

                        }else {
                            Toast.makeText(getApplicationContext(),"No data to update",Toast.LENGTH_SHORT).show();
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
                DatabaseReference delete = FirebaseDatabase.getInstance().getReference().child("Payment");
                delete.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.hasChildren()){
                            dbRef = FirebaseDatabase.getInstance().getReference().child("Payment");
                            dbRef.removeValue();
                            clearControls();
                            Toast.makeText(getApplicationContext(),"Data removed successfully",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(getApplicationContext(),"No data to delete",Toast.LENGTH_SHORT).show();
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