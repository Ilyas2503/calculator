package com.example.homework7calcul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first;
    private Integer second;
    private Integer sum;
    private Boolean isOperationClick;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    private void setNumber(String number) {
        if (textView.getText().toString().equals("0") || isOperationClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {

            case R.id.clear_btn:
                textView.setText("0");
                operator = "";
                first = 0;
                second = 0;
                sum = 0;
                break;

            case R.id.one_btn:
                setNumber("1");
                break;

            case R.id.two_btn:
                setNumber("2");
                break;

            case R.id.three_btn:
                setNumber("3");
                break;

            case R.id.four_btn:
                setNumber("4");
                break;

            case R.id.five_btn:
                setNumber("5");
                break;

            case R.id.six_btn:
                setNumber("6");
                break;

            case R.id.seven_btn:
                setNumber("7");
                break;

            case R.id.eight_btn:
                setNumber("8");
                break;

            case R.id.nine_btn:
                setNumber("9");
                break;

            case R.id.zero_btn:
                setNumber("0");
                break;
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {

        switch (view.getId()){
            case R.id.plus_btn:
                operator = "+";
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.minus_btn:
                operator = "-";
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.multiplication_btn:
                operator = "*";
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.division_mat_but:
                operator = "/";
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.percent_btn:
                operator = "%";
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.equal_btn:
                second = Integer.valueOf(textView.getText().toString());
                switch (operator){
                    case "+":
                        sum = first + second;
                        break;

                    case "-":
                        sum = first - second;
                        break;

                    case "*":
                        sum = first * second;
                        break;

                    case  "/":
                        sum = first / second;
                        break;
                }
                textView.setText(sum.toString());
                break;

        }
                isOperationClick = true;

    }
}