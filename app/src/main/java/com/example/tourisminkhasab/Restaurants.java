package com.example.tourisminkhasab;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        String[] restaurantNames = {"fanr musandam", "lezzetli", "Blak pan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, restaurantNames);

        ListView listViewRestaurants = findViewById(R.id.lisRest);
        listViewRestaurants.setAdapter(adapter);


        listViewRestaurants.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedRestaurant = restaurantNames[position];
                Toast.makeText(Restaurants.this, "was selected " + selectedRestaurant, Toast.LENGTH_SHORT).show();
            }
        });


        Button buttonDetails = findViewById(R.id.butDet);
        buttonDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Restaurants.this, fanrmusandam.class);
                startActivity(intent);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button butthomepage = findViewById(R.id.buthom);
        butthomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurants.this, HomePageto.class);
                startActivity(intent);
            }
        });
    }
}
