package com.example.tourisminkhasab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class Ratepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratepage);
        RatingBar ratingBar = findViewById(R.id.ratBar);
        EditText ediComm = findViewById(R.id.ediCom);
        Button butSub = findViewById(R.id.butSub);


        butSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating = ratingBar.getRating();
                String comment = ediComm.getText().toString();
                submitRatingAndComment(rating, comment);
            }
        });
    }

    private void submitRatingAndComment(float rating, String comment) {

        String message = "Rating submitted: " + rating + "\nComment: " + comment;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        finish();
    }
}
