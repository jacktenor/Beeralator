package com.sativa.beeralator;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

        EditText edit_txt = findViewById(R.id.et_input4);
        tv_result = findViewById(R.id.tv_result);
        tv_result2 = findViewById(R.id.tv_result2);

        edit_txt.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    input4.performClick();

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
                        tv_result2.setText(String.format(" Cost = $%s", sValue2));
                    } else {
                        tv_result2.setText(String.format(" Profit = $%s", sValue2));

                    }

                }

                return false;
            }

        });
    }
}