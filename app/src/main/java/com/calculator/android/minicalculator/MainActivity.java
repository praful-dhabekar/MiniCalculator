package com.calculator.android.minicalculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText secondNumber;
    Button mAddition,mSubtraction,mMultiplication,mDivision;
    double num1,num2,yourResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText)findViewById(R.id.first_num_et);
        secondNumber = (EditText)findViewById(R.id.second_num_et);
        final TextView yourAnswer = (TextView)findViewById(R.id.your_answer);

        mAddition = (Button)findViewById(R.id.addition);
        mSubtraction = (Button)findViewById(R.id.subtraction);
        mMultiplication = (Button)findViewById(R.id.multiplication);
        mDivision = (Button)findViewById(R.id.division);

        mAddition.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        num1 = Double.parseDouble(firstNumber.getText().toString());
                        num2 = Double.parseDouble(secondNumber.getText().toString());
                        yourResult = num1 + num2;
                        yourAnswer.setText(Double.toString(yourResult));
                        yourAnswer.setTextColor(Color.parseColor("#64DD17"));

                    }
                }
        );
        mSubtraction.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        num1 = Double.parseDouble(firstNumber.getText().toString());
                        num2 = Double.parseDouble(secondNumber.getText().toString());
                        yourResult = num1 - num2;
                        yourAnswer.setText(Double.toString(yourResult));
                        yourAnswer.setTextColor(Color.parseColor("#64DD17"));
                    }
                }
        );
        mMultiplication.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        num1 = Double.parseDouble(firstNumber.getText().toString());
                        num2 = Double.parseDouble(secondNumber.getText().toString());
                        yourResult = num1 * num2;
                        yourAnswer.setText(Double.toString(yourResult));
                        yourAnswer.setTextColor(Color.parseColor("#64DD17"));
                    }
                }
        );
        mDivision.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        num1 = Double.parseDouble(firstNumber.getText().toString());
                        num2 = Double.parseDouble(secondNumber.getText().toString());
                        yourResult = num1 / num2;
                        yourAnswer.setText(Double.toString(yourResult));
                        yourAnswer.setTextColor(Color.parseColor("#64DD17"));
                    }
                }
        );

    }
}
