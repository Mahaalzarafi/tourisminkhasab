package com.example.tourisminkhasab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

// RegistrationActivity.java
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class regpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regpage);

        Button reton = findViewById(R.id.bun4);
        reton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });
    }

    public void onRegisterClick(View view) {
        registerUser();
    }

    private void registerUser() {
        EditText useText = findViewById(R.id.ed342);
        EditText emext = findViewById(R.id.et21);
        EditText pat = findViewById(R.id.et1);

        String username = useText.getText().toString();
        String email = emext.getText().toString();
        String password = pat.getText().toString();


        String message = "Registration  " + username + "Email: " + email +"password"+ password;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


    }
}
