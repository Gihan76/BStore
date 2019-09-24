package com.example.thebookstore2019_09_02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Book_Manager extends AppCompatActivity {

    EditText txtTitle , txtAuthor , txtCategory , txtPrice;
    Button btnAdd , btnShow , btnUpdate , btnDelete;
    DatabaseReference dbref;
    Book book;

    private void clearControls(){
        txtTitle.setText("");
        txtAuthor.setText("");
        txtCategory.setText("");
        txtPrice.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book__manager);
        setTitle("Add Books");

        txtTitle = findViewById(R.id.editText7);
        txtAuthor = findViewById(R.id.editText8);
        txtCategory = findViewById(R.id.editText9);
        txtPrice = findViewById(R.id.editText10);

        btnAdd = findViewById(R.id.button147);
        btnShow = findViewById(R.id.button144);
        btnUpdate = findViewById(R.id.button145);
        btnDelete = findViewById(R.id.button146);

        book = new Book();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbref = FirebaseDatabase.getInstance().getReference().child("Books");
                try {
                    if (TextUtils.isEmpty(txtTitle.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter the title of the book",Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(txtAuthor.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter the author's name",Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(txtCategory.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter the category of the book",Toast.LENGTH_SHORT).show();
                    else {
                        book.setTitle(txtTitle.getText().toString().trim());
                        book.setAuthor(txtAuthor.getText().toString().trim());
                        book.setCategory(txtCategory.getText().toString().trim());
                        book.setPrice(txtPrice.getText().toString().trim());

                        //dbref.push().setValue(book);
                        dbref.child("book1").setValue(book);

                        Toast.makeText(getApplicationContext(),"Book Added Successfully",Toast.LENGTH_SHORT).show();
                        clearControls();
                    }
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Invalid Currency",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference readRef = FirebaseDatabase.getInstance().getReference().child("Books").child("book1");
                readRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.hasChildren()){
                            txtTitle.setText(dataSnapshot.child("Title").getValue().toString());
                            txtAuthor.setText(dataSnapshot.child("Author").getValue().toString());
                            txtCategory.setText(dataSnapshot.child("Category").getValue().toString());
                            txtPrice.setText(dataSnapshot.child("Price").getValue().toString());
                        }else {
                            Toast.makeText(getApplicationContext(),"No source to display",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference upRef = FirebaseDatabase.getInstance().getReference().child("Books");
                upRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.hasChild("book1")){
                            try {
                                book.setTitle(txtTitle.getText().toString().trim());
                                book.setAuthor(txtAuthor.getText().toString().trim());
                                book.setCategory(txtCategory.getText().toString().trim());
                                book.setPrice(txtPrice.getText().toString().trim());

                                dbref = FirebaseDatabase.getInstance().getReference().child("Books").child("book1");
                                dbref.setValue(book);
                                clearControls();

                                Toast.makeText(getApplicationContext(),"Data updated successfully",Toast.LENGTH_SHORT).show();
                            }
                            catch (NumberFormatException e){
                                Toast.makeText(getApplicationContext(),"Invalid Price",Toast.LENGTH_SHORT).show();
                            }
                        }else {
                            Toast.makeText(getApplicationContext(),"No source to update",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference delRef = FirebaseDatabase.getInstance().getReference().child("Books");
                delRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.hasChild("book1")){
                            dbref = FirebaseDatabase.getInstance().getReference().child("Books").child("book1");
                            dbref.removeValue();
                            clearControls();
                            Toast.makeText(getApplicationContext(),"Data deleted successfully",Toast.LENGTH_SHORT).show();
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
