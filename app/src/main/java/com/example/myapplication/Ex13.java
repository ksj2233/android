package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

public class Ex13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex13);

        final RatingBar rating1, rating2, rating3;
        Button btnInc, btnDec;

        rating1 = findViewById(R.id.ratingBar1);
        rating2 = findViewById(R.id.ratingBar2);
        rating3 = findViewById(R.id.ratingBar3);
        btnInc = findViewById(R.id.btnInc);
        btnDec = findViewById(R.id.btnDec);

        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rating1.setRating(rating1.getRating()+rating1.getStepSize());
                rating2.setRating(rating2.getRating()+rating2.getStepSize());
                rating3.setRating(rating3.getRating()+rating3.getStepSize());
            }
        });


    }
}