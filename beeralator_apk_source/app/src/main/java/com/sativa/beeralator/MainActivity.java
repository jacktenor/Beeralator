package com.sativa.beeralator;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText input5;
    private TextView tv_textView;
    private TextView tv_textView1;
    private TextView tv_textView2;
    private TextView tv_textView3;
    private TextView tv_textView4;
    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;
    private TextView tv_result;
    private TextView tv_result2;;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input5 = findViewById(R.id.et_input5);
        input1 = findViewById(R.id.et_input1);
        input2 = findViewById(R.id.et_input2);
        input3 = findViewById(R.id.et_input3);
        input4 = findViewById(R.id.et_input4);

        EditText edit_txt = this.findViewById(R.id.et_input4);
        tv_result = findViewById(R.id.tv_result);
        tv_result2 = findViewById(R.id.tv_result2);
        tv_textView = findViewById(R.id.tv_textView);
        tv_textView1 = findViewById(R.id.tv_textView1);
        tv_textView2 = findViewById(R.id.tv_textView2);
        tv_textView3 = findViewById(R.id.tv_textView3);
        tv_textView4 = findViewById(R.id.tv_textView4);


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

                    if (doorfee == 0) {
                        tv_textView.setText(" FREE BEER!!!");
                    }
                    if (doorfee >= 1 && doorfee <= 11) {
                        tv_textView.setText(" A reasonable cover charge.");
                    }
                    if (doorfee >= 12 && doorfee <= 21) {
                        tv_textView.setText(" Maybe should have gone BYOB");
                    }
                    if (doorfee >= 22) {
                        tv_textView.setText(" What is this a fund raiser?");
                    }
                    if (people >= 1 && people <= 5) {
                        tv_textView1.setText(" No friends?");
                    }
                    if (people >= 6 && people <=19) {
                        tv_textView1.setText(" A social  gathering.");
                    }
                    if (people >= 20 && people <= 50) {
                        tv_textView1.setText(" Now that's a party!");
                    }
                    if (people >= 51 && people <= 99) {
                        tv_textView1.setText(" A rager!");
                    }
                    if (people >= 100 && people <= 999) {
                        tv_textView1.setText(" It's not a party, it's an event!");
                    }
                    if (people >= 1000) {
                        tv_textView1.setText(" Call in the National Guard!!!");
                    }
                    if (beersperhour >= 1 && beersperhour <= 2) {
                        tv_textView2.setText(" Hard to get a buzz at that rate.");
                    }
                    if (beersperhour == 3) {
                        tv_textView2.setText(" Sip, sip.");
                    }
                    if (beersperhour == 4) {
                        tv_textView2.setText(" A nice steady pace.");
                    }
                    if (beersperhour == 5) {
                        tv_textView2.setText(" Going to tie one on!");
                    }
                    if (beersperhour == 6) {
                        tv_textView2.setText(" There will be hangovers.");
                    }
                    if (beersperhour >= 7) {
                        tv_textView2.setText(" Bring on the coma!");
                    }
                    if (hours >= 1 && hours <= 3) {
                        tv_textView3.setText(" What is this a brunch?");
                    }
                    if (hours >= 4 && hours <= 5) {
                        tv_textView3.setText(" You will be just getting started.");
                    }
                    if (hours >= 6 && hours <= 7) {
                        tv_textView3.setText(" Enough time to get good and loose.");
                    }
                    if (hours >= 8) {
                        tv_textView3.setText(" A good old fashion all-nighter!");
                    }
                    if (cost >= 0 && cost <= 10) {
                        tv_textView4.setText(" Cheap beer = bad mornings.");
                    }
                    if (cost >= 11 && cost <= 14) {
                        tv_textView4.setText(" Not drinking the imports?");
                    }
                    if (cost >= 15 && cost <= 21) {
                        tv_textView4.setText(" Some good choices at that price.");
                    }
                    if (cost >= 22 && cost <= 29) {
                        tv_textView4.setText(" Your spoiling your guests.");
                    }
                    if (cost >= 30) {
                        tv_textView4.setText(" Drinking the good stuff.");
                    }

                        String sValue = String.format(Locale.US,"%,.0f", result);
                        String sValue2 = String.format(Locale.US,"%.2f", (Math.abs(result2)));

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