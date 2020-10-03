package com.sativa.beeralator;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText input5;
    private TextView tv_textView5;
    private TextView tv_textView1;
    private TextView tv_textView2;
    private TextView tv_textView3;
    private TextView tv_textView4;
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

        tv_result = findViewById(R.id.tv_result);
        tv_result2 = findViewById(R.id.tv_result2);
        tv_textView5 = findViewById(R.id.tv_textView5);
        tv_textView1 = findViewById(R.id.tv_textView1);
        tv_textView2 = findViewById(R.id.tv_textView2);
        tv_textView3 = findViewById(R.id.tv_textView3);
        tv_textView4 = findViewById(R.id.tv_textView4);


        input5 = findViewById(R.id.et_input5);
        input1 = findViewById(R.id.et_input1);
        input2 = findViewById(R.id.et_input2);
        input3 = findViewById(R.id.et_input3);
        input4 = findViewById(R.id.et_input4);


        input5.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                input5.performClick();
                final double doorfee = Double.parseDouble(input5.getText().toString());
                if (doorfee == 0) tv_textView5.setText(" FREE BEER!!!");
                if (doorfee >= 1 && doorfee <= 11)
                    tv_textView5.setText(" A reasonable cover charge.");

                if (doorfee >= 12 && doorfee <= 21)
                    tv_textView5.setText(" Maybe should have gone BYOB");

                if (doorfee >= 22) tv_textView5.setText(" What is this a fund raiser?");

                input1.setOnEditorActionListener(new EditText.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        input1.performClick();
                        final double people = Double.parseDouble(input1.getText().toString());
                        if (people >= 1 && people <= 11) tv_textView1.setText(" No friends?");

                        if (people >= 12 && people <= 49) tv_textView1.setText(" A shindig!");

                        if (people >= 50 && people <= 99)
                            tv_textView1.setText(" Now that's a party!");

                        if (people >= 100 && people <= 999)
                            tv_textView1.setText(" Good old fasfion rager!!!");

                        if (people >= 1000) tv_textView1.setText(" Call in the National Guard!!!");

                        input2.setOnEditorActionListener(new EditText.OnEditorActionListener() {
                            @Override
                            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                                input2.performClick();
                                final double beersperhour = Double.parseDouble(input2.getText().toString());
                                if (beersperhour >= 1 && beersperhour <= 2) tv_textView2.setText(" Hard to get a buzz at that rate.");

                                if (beersperhour == 3) tv_textView2.setText(" Sip, sip.");

                                if (beersperhour == 4) tv_textView2.setText(" A nice steady pace.");

                                if (beersperhour == 5) tv_textView2.setText(" Going to tie one on!");

                                if (beersperhour == 6) tv_textView2.setText(" There will be hangovers.");

                                if (beersperhour >= 7) tv_textView2.setText(" Bring on the coma!");
                                    input3.setOnEditorActionListener(new EditText.OnEditorActionListener() {
                                        @Override
                                        public boolean onEditorAction(TextView v, final int actionId, KeyEvent event) {
                                            input3.performClick();
                                            final double hours = Double.parseDouble(input3.getText().toString());
                                            if (hours >= 1 && hours <= 3)
                                                tv_textView3.setText(" What is this a brunch?");

                                            if (hours >= 4 && hours <= 5)
                                                tv_textView3.setText(" You will be just getting started.");

                                            if (hours >= 6 && hours <= 7)
                                                tv_textView3.setText(" Enough time to get good and loose.");

                                            if (hours >= 8)
                                                tv_textView3.setText(" A good old fashion all-nighter!");
                                            input4.setOnEditorActionListener(new EditText.OnEditorActionListener() {
                                                @Override
                                                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                                                    input4.performClick();
                                                    double cost = Double.parseDouble(input4.getText().toString());
                                                    if (cost >= 0 && cost <= 10)
                                                        tv_textView4.setText(" Cheap beer = bad mornings.");

                                                    if (cost >= 11 && cost <= 14)
                                                        tv_textView4.setText(" Not drinking the imports?");

                                                    if (cost >= 15 && cost <= 21)
                                                        tv_textView4.setText(" Some good choices at that price.");

                                                    if (cost >= 22 && cost <= 29)
                                                        tv_textView4.setText(" Your spoiling your guests.");

                                                    if (cost >= 30)
                                                        tv_textView4.setText(" Drinking the good stuff.");
                                                    if (actionId == EditorInfo.IME_ACTION_DONE) {

                                                        double contributions = doorfee * people;
                                                        final double result = Math.ceil(people * beersperhour * hours / 24);
                                                        final double result2 = (result * cost) - contributions;

                                                        String sValue = String.format("%,.0f", result);
                                                        String sValue2 = String.format("%,.2f", (Math.abs(result2)));

                                                        tv_result.setText(String.format(" Required cases = %s", sValue));

                                                        if (result2 >= 0) {
                                                            tv_result2.setText(String.format(" Cost = $%s", sValue2));
                                                        } else {
                                                            tv_result2.setText(String.format(" Profit = $%s", sValue2));
                                                            {

                                                            }
                                                            return false;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                            });
                                            return false;
                                        }
                                    });
                                return false;
                            }
                        });
                        return false;
                    }

                });
                return false;
            }
        });

    }

}



