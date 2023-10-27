package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity {

    boolean isfirstInput = true; // 입력 값이 처음 입력되는가를 체크
    int resultNumber = 0; // 계산된 결과 값을 저장하는 변수
    char operator = '+'; // 입력된 연산자를 저장하는 변수

    final String CLEAR_INPUT_TEXT = "0";
    TextView resultText;
    TextView resultSumText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        resultText = findViewById(R.id.result_text);
        resultSumText = findViewById(R.id.resultSum_text);

    }

    public void buttonClick(View view) {
        if (view.getId() == R.id.all_clear_button) {
            resultNumber = 0;
            operator = '+';
            setClearText(CLEAR_INPUT_TEXT);
        } else if (view.getId() == R.id.clear_entry_button) {
            setClearText(CLEAR_INPUT_TEXT);
        } else if (view.getId() == R.id.back_space_button) {
            if (resultText.getText().toString().length() > 1) {
                String getResultText = resultText.getText().toString();
                String subString = getResultText.substring(0, getResultText.length() - 1);
                resultText.setText(subString);
            } else {
                setClearText(CLEAR_INPUT_TEXT);
            }
        }

        Button getButton = findViewById(view.getId());

        if (view.getId() == R.id.decimal_button) {
            Toast.makeText(getApplicationContext(), "정수형 계산기라 구현되지 않았습니다.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), getButton.getText().toString() + "버튼이 클릭되었습니다.", Toast.LENGTH_LONG).show();
            Log.e("buttonClick", "default" + getButton.getText().toString() + "버튼이 클릭되었습니다.");
        }

    }

    public void numButtonClick(View view) {
        Button getButton = findViewById(view.getId());
        if (isfirstInput) {
            resultText.setTextColor(0xFF000000);
            resultText.setText(getButton.getText().toString());
            isfirstInput = false;
        } else {
            if (resultText.getText().toString().equals(CLEAR_INPUT_TEXT)) {
                Toast.makeText(getApplicationContext(), "0으로 시작 없음", Toast.LENGTH_SHORT).show();
                setClearText(CLEAR_INPUT_TEXT);
            } else {
                String str;
                resultText.append(getButton.getText().toString());
                str = resultText.getText().toString().replace(",","");
                Log.e("numButtonClick",str);
                resultText.setText(addCommas(str));
            }
        }
    }

    public void operatorClick(View view) {
        Button getButton = findViewById(view.getId());

        if (view.getId() == R.id.result_button) {
            if(isfirstInput){
                resultNumber = 0;
                operator = '+';
                setClearText(CLEAR_INPUT_TEXT);
            }else{
                resultNumber = intCal(resultNumber, Integer.parseInt(resultText.getText().toString().replace(",","")), operator);
                resultText.setText(addCommas(String.valueOf(resultNumber)));
                isfirstInput = true;
            }
        } else {
            if(isfirstInput){
                operator = getButton.getText().toString().charAt(0);
                resultSumText.setText(resultText.getText().toString().replace(",","")+operator);
            }else{
                int lastNum = Integer.parseInt(resultText.getText().toString().replace(",",""));
                resultNumber = intCal(resultNumber, lastNum, operator);
                operator = getButton.getText().toString().charAt(0);
                resultText.setText(addCommas(String.valueOf(resultNumber)));
                resultSumText.setText(resultText.getText().toString().replace(",","")+operator);
                isfirstInput = true;
            }
        }
    }

    public int intCal(int result, int lastNum, char operator) {
        if (operator == '+') {
            result += lastNum;
        } else if (operator == '-') {
            result -= lastNum;
        } else if (operator == '/') {
            result /= lastNum;
        } else if (operator == '*') {
            result *= lastNum;
        }
        return result;
    }

    public void setClearText(String clearText) {
        isfirstInput = true;
        resultText.setTextColor(0xFF666666);
        resultText.setText(clearText);
    }
    public String addCommas(String str) {
        str.replace(",","");
        int length = str.length();
        int count = 0;

        StringBuilder result = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            result.insert(0, str.charAt(i));
            count++;

            if (count % 3 == 0 && i > 0) {
                result.insert(0, ",");
            }
        }

        return result.toString();
    }


    // TODO: 2023-10-25 계산기의 예외처리 , 100의 자리 마다 "," 표시하기 , 코드 간소화 , 계산전까지 입력된 숫자 출력하는 화면 만들기
    // TODO :
}