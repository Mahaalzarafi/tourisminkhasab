package com.example.tourisminkhasab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private EditText emailid,pass;
    private Button login,sigup;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
    String  email, Password;
    tourismdata Tourismdata;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailid = (EditText) findViewById(R.id.editText2);
        pass = (EditText) findViewById(R.id.edt1);
        login = (Button) findViewById(R.id.button);
        sigup=(Button) findViewById(R.id.butnn2);


        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("tourismdata");
        Tourismdata = new tourismdata();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email = emailid.getEditableText().toString();
                Password = pass.getEditableText().toString();

                if ( TextUtils.isEmpty(email) && TextUtils.isEmpty(Password)) {
                    Toast.makeText(MainActivity.this, "Enter Data", Toast.LENGTH_SHORT).show();
                } else {
                    addDatatoFirebase(email, Password);
                }

            }
        });
    }
    private void addDatatoFirebase(String emailid, String pass) {

        Tourismdata.setEmail(email);
        Tourismdata.setPassword(Password);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                databaseReference.setValue(Tourismdata);
                Toast.makeText(MainActivity.this, "done", Toast.LENGTH_SHORT).show();
            }



            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this, "Fail to add data"+error, Toast.LENGTH_SHORT).show();


            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(MainActivity.this,HomePageto .class);
                startActivity(login);
                finish();
            }
        });
        sigup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(MainActivity.this,regpage .class);
                startActivity(signup);

            }
        });


    }
}


