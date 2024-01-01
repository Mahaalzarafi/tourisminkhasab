package com.example.tourisminkhasab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageto extends AppCompatActivity {
    private Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pageto);

        btn1=(Button)findViewById(R.id.but1);
        btn2=(Button)findViewById(R.id.but2);
        btn3=(Button)findViewById(R.id.bu3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1=new Intent(HomePageto.this,Restaurants.class);
                startActivity(btn1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2=new Intent(HomePageto.this,Hotel.class);
                startActivity(btn2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn3=new Intent(HomePageto.this,Tourismareas.class);
                startActivity(btn3);
            }
        });
    }
}

