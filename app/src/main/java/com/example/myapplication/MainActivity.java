package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    public void correct(View view){
        Toast.makeText(this,"Yes", Toast.LENGTH_LONG).show();

    }
    public void wrong(View view){
        Toast.makeText(this,"No", Toast.LENGTH_LONG).show();

    }

    public void onClick_10(View view){
        Toast.makeText(this,"10대는 20년 전입니다.", Toast.LENGTH_LONG).show();
    }
    public void onClick_20(View view){
        Toast.makeText(this,"20대는 10년 전입니다.", Toast.LENGTH_LONG).show();
    }
    public void onClick_30(View view){
        Toast.makeText(this,"30대 정답입니다.", Toast.LENGTH_LONG).show();
    }

    public void onClickMove(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent);
    }

    public void onClickMove2(View view){
        Intent intent = new Intent(getApplicationContext(), calculator.class);
        startActivity(intent);
    }
}