package com.sativa.beeralator;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

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

        input1 = findViewById(R.id.et_input1);
        input2 = findViewById(R.id.et_input2);
        input3 = findViewById(R.id.et_input3);
        input4 = findViewById(R.id.et_input4);

        Button bt_calculate = findViewById(R.id.bt_calculate);

        tv_result = findViewById(R.id.tv_result);
        tv_result2 = findViewById(R.id.tv_result2);

        bt_calculate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                makeCalculations();


            }
        });
    }


    private void makeCalculations() {
        double people = Double.parseDouble(input1.getText().toString());
        double beersperhour = Double.parseDouble(input2.getText().toString());
        double hours = Double.parseDouble(input3.getText().toString());
        double cost = Double.parseDouble(input4.getText().toString());
        double result = (int) Math.ceil(people * beersperhour * hours / 24);
        String sValue = String.format("%.0f", result);

        tv_result.setText(String.format("Required cases = %s", sValue));

        double result2 = result * cost;
        String sValue2 = String.format("%.2f", result2);

        tv_result2.setText(String.format("Total dollars spent = %s", sValue2));


    }



}
