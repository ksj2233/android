package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button button8;
    Button button9;

    EditText editTextText;
    EditText editTextText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button8 = findViewById(R.id.button8);
        editTextText = findViewById(R.id.editTextText);
        button9 = findViewById(R.id.button9);
        editTextText2 = findViewById(R.id.editTextText2);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText("반갑습니다.");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText2.getText());
            }
        });



    }
}