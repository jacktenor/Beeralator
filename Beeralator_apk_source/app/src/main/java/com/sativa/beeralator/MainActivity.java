package com.sativa.beeralator;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import static android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private EditText input5;
    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;
    private TextView tv_result;
    private TextView tv_result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input5 = findViewById(R.id.et_input5);
        input1 = findViewById(R.id.et_input1);
        input2 = findViewById(R.id.et_input2);
        input3 = findViewById(R.id.et_input3);
        input4 = findViewById(R.id.et_input4);

        Button bt_calculate = findViewById(R.id.bt_calculate);

        tv_result = findViewById(R.id.tv_result);
        tv_result2 = findViewById(R.id.tv_result2);

        bt_calculate.setOnClickListener(new OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(Objects.requireNonNull(getCurrentFocus()).getWindowToken(), 0);
                makeCalculations();


            }
        });
    }



    private void makeCalculations() {
        double doorfee = Double.parseDouble(input5.getText().toString());
        double people = Double.parseDouble(input1.getText().toString());
        double beersperhour = Double.parseDouble(input2.getText().toString());
        double hours = Double.parseDouble(input3.getText().toString());
        double contributions = doorfee * people;
        double cost = Double.parseDouble(input4.getText().toString());
        double result = (int) Math.ceil(people * beersperhour * hours / 24);
        double result2 = (result * cost) - contributions;


        String sValue = String.format("%,.0f", result);
        String sValue2 = String.format("%,.2f", (Math.abs(result2)));

        tv_result.setText(String.format(" Required cases = %s", sValue));

        if (result2 >= 0) {
        tv_result2.setText(String.format(" Total dollars spent = %s", sValue2));
    }
        else {
            tv_result2.setText(String.format(" Profit in dollars = %s", sValue2));

        }

    }



}
