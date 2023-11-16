package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button6;

    /**
     * 실습 진행한 목록
     */
    String[] arrString = {
            "계산기",
            "ex02",
            "ex03",
            "ex04",
            "ex05",
            "ex06",
            "ex07",
            "ex08",
            "ex09",
            "ex10",
            "ex11",
            "ex12",
            "ex13",
            "ex14"
    };

    /**
     * 생성한 번튼 계수
     */
//    final int MAX_BUTTON_NUM = 16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutModify(arrString);


    }

    public void layoutModify(String[] arrString) {
        Button btn1 = findViewById(R.id.exercise_1_btn);
        Button btn2 = findViewById(R.id.exercise_2_btn);
        Button btn3 = findViewById(R.id.exercise_3_btn);
        Button btn4 = findViewById(R.id.exercise_4_btn);
        Button btn5 = findViewById(R.id.exercise_5_btn);
        Button btn6 = findViewById(R.id.exercise_6_btn);
        Button btn7 = findViewById(R.id.exercise_7_btn);
        Button btn8 = findViewById(R.id.exercise_8_btn);
        Button btn9 = findViewById(R.id.exercise_9_btn);
        Button btn10 = findViewById(R.id.exercise_10_btn);
        Button btn11 = findViewById(R.id.exercise_11_btn);
        Button btn12 = findViewById(R.id.exercise_12_btn);
        Button btn13 = findViewById(R.id.exercise_13_btn);
        Button btn14 = findViewById(R.id.exercise_14_btn);
        Button btn15 = findViewById(R.id.exercise_15_btn);
        Button btn16 = findViewById(R.id.exercise_16_btn);

        for (String str : arrString) {
            if (str.equals(btn1.getText().toString())) {
                btn1.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn2.getText().toString())) {
                btn2.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn3.getText().toString())) {
                btn3.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn4.getText().toString())) {
                btn4.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn5.getText().toString())) {
                btn5.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn6.getText().toString())) {
                btn6.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn7.getText().toString())) {
                btn7.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn8.getText().toString())) {
                btn8.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn9.getText().toString())) {
                btn9.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn10.getText().toString())) {
                btn10.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn11.getText().toString())) {
                btn11.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn12.getText().toString())) {
                btn12.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn13.getText().toString())) {
                btn13.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn14.getText().toString())) {
                btn14.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn15.getText().toString())) {
                btn15.setBackgroundColor(0xFF4CAF50);
            } else if (str.equals(btn16.getText().toString())) {
                btn16.setBackgroundColor(0xFF4CAF50);
            }
        }
    }


    public void correct(View view) {
        Toast.makeText(this, "Yes", Toast.LENGTH_LONG).show();

    }

    public void wrong(View view) {
        Toast.makeText(this, "No", Toast.LENGTH_LONG).show();

    }

    public void onClick_10(View view) {
        Toast.makeText(this, "10대는 20년 전입니다.", Toast.LENGTH_LONG).show();
    }

    public void onClick_20(View view) {
        Toast.makeText(this, "20대는 10년 전입니다.", Toast.LENGTH_LONG).show();
    }

    public void onClick_30(View view) {
        Toast.makeText(this, "30대 정답입니다.", Toast.LENGTH_LONG).show();
    }

    public void onClickMove(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent);
    }

    public void onClickMove1(View view) {
        Intent intent = new Intent(getApplicationContext(), calculator.class);
        startActivity(intent);
    }

    public void onClickMove2(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex02.class);
        startActivity(intent);
    }

    public void onClickMove3(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex03.class);
        startActivity(intent);
    }

    public void onClickMove4(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex04.class);
        startActivity(intent);
    }

    public void onClickMove5(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex05.class);
        startActivity(intent);
    }

    public void onClickMove6(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex06.class);
        startActivity(intent);
    }

    public void onClickMove7(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex07.class);
        startActivity(intent);
    }

    public void onClickMove8(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex08.class);
        startActivity(intent);
    }

    public void onClickMove9(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex09.class);
        startActivity(intent);
    }

    public void onClickMove10(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex10.class);
        startActivity(intent);
    }

    public void onClickMove11(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex11.class);
        startActivity(intent);
    }

    public void onClickMove12(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex12.class);
        startActivity(intent);
    }

    public void onClickMove13(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex13.class);
        startActivity(intent);
    }

    public void onClickMove14(View view) {
        Intent intent = new Intent(getApplicationContext(), Ex14.class);
        startActivity(intent);
    }


}