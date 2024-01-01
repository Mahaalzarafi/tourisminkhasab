package com.example.tourisminkhasab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tourismareas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourismareas);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button homebutt = findViewById(R.id.hometo);
        homebutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tourismareas.this, HomePageto.class);
                startActivity(intent);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button ratebutt = findViewById(R.id.rato);
        ratebutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tourismareas.this, finalPage.class);
                startActivity(intent);
                finish();
            }
        });
    }
}