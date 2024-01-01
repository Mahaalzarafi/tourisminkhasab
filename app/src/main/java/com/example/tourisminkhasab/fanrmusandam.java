package com.example.tourisminkhasab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class fanrmusandam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fanrmusandam);


        int restaurantImageResourceId = R.drawable.tea;
        String restaurantName = "fanr musandam";
        String restaurantDescription = "A restaurant famous for selling Turkish food. It is the only Turkish restaurant in Khasab overlooking Khasab Port. It is also famous for seafood instagram account :@fanrmusandam";


        ImageView imageRest = findViewById(R.id.imRe2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView teResName = findViewById(R.id.RestName);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView texResDes = findViewById(R.id.ResDes);

        imageRest.setImageResource(restaurantImageResourceId);
        teResName.setText(restaurantName);
        texResDes.setText(restaurantDescription);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button butBackToResList = findViewById(R.id.butBackToResList);
        butBackToResList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fanrmusandam.this, Restaurants.class);
                startActivity(intent);

            }
        });
        Button butrate = findViewById(R.id.rate);
        butrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fanrmusandam.this, finalPage.class);
                startActivity(intent);

                finish();
            }
        });
    }
}
