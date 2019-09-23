package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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

        btnAdd = findViewById(R.id.button);
        btnShow = findViewById(R.id.button144);
        btnUpdate = findViewById(R.id.button145);
        btnDelete = findViewById(R.id.button146);

        book = new Book();

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

                dbref.push().setValue(book);

                Toast.makeText(getApplicationContext(),"Book Added Successfully",Toast.LENGTH_SHORT).show();
                clearControls();
            }
        }
        catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Invalid Currency",Toast.LENGTH_SHORT).show();
        }
    }
}
