package com.example.thebookstore2019_09_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Admin_LoggedInActivity extends AppCompatActivity {
    Button btnLogout,manage;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin__logged_in_activity);

        btnLogout = findViewById(R.id.logout);
        manage = findViewById(R.id.button147);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(Admin_LoggedInActivity.this, SignUpActivity.class);
                startActivity(intToMain);
            }
        });

        manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Book_Manager.class);
                startActivity(i);
            }
        });

    }
}
