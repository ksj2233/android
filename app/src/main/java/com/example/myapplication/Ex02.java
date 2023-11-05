package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Ex02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_ex02);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setWeightSum(100);
        baseLayout.setBackgroundColor(Color.rgb(0, 0, 255));
        setContentView(baseLayout, params);

        LinearLayout.LayoutParams topParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0,
                20);

        LinearLayout topLayout = new LinearLayout(this);

        LinearLayout.LayoutParams editTextParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        EditText editText = new EditText(this);
        editText.setText("Java코드로 레이아웃 생성");
        editText.setGravity(Gravity.CENTER);
        editText.setTextSize(30);

        topLayout.addView(editText,editTextParams);
        baseLayout.addView(topLayout,topParams);


        Button btn = new Button(this);
        btn.setText("버튼");
        baseLayout.addView(btn);
    }


}