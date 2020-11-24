package com.sativa.beeralator;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;
    private TextView tv_result;
    private TextView tv_result2;
    private TextView safe;
    private TextView safe2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_result = findViewById(R.id.result);
        tv_result2 = findViewById(R.id.result2);

        input = findViewById(R.id.input);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        safe = findViewById(R.id.safe);
        safe2 = findViewById(R.id.safe2);


        input.requestFocus();

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

        input.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                try {
                    input.performClick();

                    final double doorfee = Double.parseDouble(input.getText().toString());
                    {
                        final MediaPlayer[] mp = {MediaPlayer.create(MainActivity.this, R.raw.reggaepaety)};
                        if (doorfee == 0) {
                            Toast toast = Toast.makeText(getApplicationContext(), "FREE BEER!!!", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                            toast.show();
                        }

                        if (doorfee >= 1 && doorfee <= 4) {
                            Toast toast = Toast.makeText(getApplicationContext(), "A strange cover charge.", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                            toast.show();
                        }

                        if (doorfee == 5) {
                            Toast toast = Toast.makeText(getApplicationContext(), "Ain't no reggae party, $5 at the door.", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                            toast.show();
                            mp[0].start();
                        }

                        if (doorfee >= 6 && doorfee <= 11) {
                            Toast toast = Toast.makeText(getApplicationContext(), "A reasonable cover", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                            toast.show();
                        }

                        if (doorfee >= 12 && doorfee <= 21) {
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "Make them wish they had gone B.Y.O.B.", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                            toast.show();
                        }

                        if (doorfee >= 22) {
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "What is this a fund raiser?", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                            toast.show();
                        }

                        input1.setOnEditorActionListener(new EditText.OnEditorActionListener() {
                            @Override
                            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                                try {
                                    input1.performClick();

                                    final double people = Double.parseDouble(input1.getText().toString());
                                    {
                                        if (people >= 1 && people <= 11) {
                                            Toast toast = Toast.makeText(getApplicationContext(),
                                                    "No friends?", Toast.LENGTH_LONG);
                                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                            toast.show();
                                        }

                                        if (people >= 12 && people <= 49) {
                                            Toast toast = Toast.makeText(getApplicationContext(),
                                                    "A gathering!", Toast.LENGTH_LONG);
                                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                            toast.show();
                                            if (mp[0] != null) {
                                                if (mp[0].isPlaying()) {
                                                    mp[0].stop();
                                                    mp[0].release();
                                                }
                                                mp[0] = MediaPlayer.create(MainActivity.this, R.raw.party);
                                                mp[0].start();
                                            }
                                        }
                                        if (people >= 50 && people <= 99) {
                                            Toast toast = Toast.makeText(getApplicationContext(),
                                                    "Now that's a party!", Toast.LENGTH_LONG);
                                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                            toast.show();
                                        }

                                        if (people >= 100 && people <= 999) {
                                            Toast toast = Toast.makeText(getApplicationContext(),
                                                    "Good old fashion rager!!!", Toast.LENGTH_LONG);
                                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                            toast.show();
                                        }

                                        if (people >= 1000) {
                                            Toast toast = Toast.makeText(getApplicationContext(),
                                                    "Call in the National Guard!!!", Toast.LENGTH_LONG);
                                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                            toast.show();
                                        }

                                        input2.setOnEditorActionListener(new EditText.OnEditorActionListener() {
                                            @Override
                                            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                                                try {
                                                    input2.performClick();
                                                    final double beersperhour = Double.parseDouble(input2.getText().toString());
                                                    {
                                                        if (beersperhour >= 1 && beersperhour <= 2) {
                                                            Toast toast = Toast.makeText(getApplicationContext(),
                                                                    "Hard to get a buzz at that rate.", Toast.LENGTH_LONG);
                                                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                                            toast.show();
                                                        }

                                                        if (beersperhour == 3) {
                                                            Toast toast = Toast.makeText(getApplicationContext(),
                                                                    "Sip, sip.", Toast.LENGTH_LONG);
                                                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                                            toast.show();
                                                        }

                                                        if (beersperhour == 4) {
                                                            Toast toast = Toast.makeText(getApplicationContext(),
                                                                    "A nice steady pace.", Toast.LENGTH_LONG);
                                                            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                                            toast.show();
                                                            if (mp[0] != null) {
                                                                if (mp[0].isPlaying()) {
                                                                    mp[0].stop();
                                                                    mp[0].release();
                                                                }
                                                                mp[0] = MediaPlayer.create(MainActivity.this, R.raw.threefour);
                                                                mp[0].start();
                                                            }
                                                        }
                                                    }

                                                    if (beersperhour == 5) {
                                                        Toast toast = Toast.makeText(getApplicationContext(),
                                                                "Going to tie one on!", Toast.LENGTH_LONG);
                                                        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                                        toast.show();
                                                    }

                                                    if (beersperhour == 6) {
                                                        Toast toast = Toast.makeText(getApplicationContext(),
                                                                "There will be hangovers.", Toast.LENGTH_LONG);
                                                        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                                        toast.show();
                                                    }

                                                    if (beersperhour >= 7) {
                                                        Toast toast = Toast.makeText(getApplicationContext(),
                                                                "Bring on the coma!", Toast.LENGTH_LONG);
                                                        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                                        toast.show();
                                                    }

                                                    input3.setOnEditorActionListener(new EditText.OnEditorActionListener() {
                                                        @Override
                                                        public boolean onEditorAction(TextView v, final int actionId, KeyEvent event) {
                                                            try {
                                                                input3.performClick();
                                                                final double hours = Double.parseDouble(input3.getText().toString());
                                                                {
                                                                    if (hours >= 1 && hours <= 3) {
                                                                        Toast toast = Toast.makeText(getApplicationContext(),
                                                                                "What is this a brunch?", Toast.LENGTH_LONG);
                                                                        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                                                        toast.show();
                                                                    }

                                                                    if (hours >= 4 && hours <= 5) {
                                                                        Toast toast = Toast.makeText(getApplicationContext(),
                                                                                "You will be just getting started.", Toast.LENGTH_LONG);
                                                                        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                                                        toast.show();
                                                                    }

                                                                    if (hours >= 6 && hours <= 7) {
                                                                        Toast toast = Toast.makeText(getApplicationContext(),
                                                                                "Enough time to get good and loose.", Toast.LENGTH_LONG);
                                                                        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                                                        toast.show();
                                                                        if (mp[0] != null) {
                                                                            if (mp[0].isPlaying()) {
                                                                                mp[0].stop();
                                                                                mp[0].release();
                                                                            }
                                                                            mp[0] = MediaPlayer.create(MainActivity.this, R.raw.what);
                                                                            mp[0].start();
                                                                        }
                                                                    }
                                                                }


                                                                if (hours >= 8) {
                                                                    Toast toast = Toast.makeText(getApplicationContext(),
                                                                            "An all nighter!", Toast.LENGTH_LONG);
                                                                    toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 50);
                                                                    toast.show();

                                                                }

                                                                input4.setOnEditorActionListener(new EditText.OnEditorActionListener() {
                                                                    @Override
                                                                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                                                                        try {
                                                                            input4.performClick();
                                                                            double cost = Double.parseDouble(input4.getText().toString());
                                                                            {
                                                                                if (actionId == EditorInfo.IME_ACTION_DONE) {

                                                                                    double contributions = doorfee * people;
                                                                                    final double result = Math.ceil(people * beersperhour * hours / 24);
                                                                                    final double result2 = (result * cost) - contributions;

                                                                                    String sValue = String.format(Locale.ENGLISH, "%,.0f", result);
                                                                                    String sValue2 = String.format(Locale.ENGLISH, "%,.2f", (Math.abs(result2)));

                                                                                    tv_result.setText(String.format(" Required cases = %s", sValue));
                                                                                     getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

                                                                                    if (result2 >= 0) {
                                                                                        tv_result2.setText(String.format(" Your cost will be $%s", sValue2));
                                                                                        Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                "Looks like it's going to cost you.", Toast.LENGTH_LONG);
                                                                                        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, -30);
                                                                                        toast.show();
                                                                                        safe.setText(R.string.recalculate);
                                                                                        safe2.setText(R.string.safe);
                                                                                        if (mp[0] != null) {
                                                                                            if (mp[0].isPlaying()) {
                                                                                                mp[0].stop();
                                                                                                mp[0].release();
                                                                                            }
                                                                                            mp[0] = MediaPlayer.create(MainActivity.this, R.raw.charity);
                                                                                            mp[0].start();
                                                                                        }
                                                                                       } else {
                                                                                        tv_result2.setText(String.format(" Your profit will be $%s", sValue2));
                                                                                        Toast toast = Toast.makeText(getApplicationContext(),
                                                                                                "A party and a profit!", Toast.LENGTH_LONG);
                                                                                        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, -30);
                                                                                        toast.show();
                                                                                        safe.setText(R.string.fun);
                                                                                        safe2.setText(R.string.staysafe);
                                                                                        if (mp[0] != null) {
                                                                                            if (mp[0].isPlaying()) {
                                                                                                mp[0].stop();
                                                                                                mp[0].release();
                                                                                            }
                                                                                            mp[0] = MediaPlayer.create(MainActivity.this, R.raw.dollars);
                                                                                            mp[0].start();
                                                                                            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (NumberFormatException e) {getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                                                                            e.printStackTrace();
                                                                        } catch (IllegalStateException e) {getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                                                                            e.printStackTrace();
                                                                        }
                                                                        return false;
                                                                    }
                                                                });
                                                            } catch (NumberFormatException numberFormatException) {
                                                                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                                                                numberFormatException.printStackTrace();
                                                            } catch (IllegalStateException illegalStateException) {
                                                                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                                                                illegalStateException.printStackTrace();
                                                            }
                                                            return false;
                                                        }
                                                    });

                                                } catch (NumberFormatException numberFormatException) {
                                                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                                                    numberFormatException.printStackTrace();
                                                } catch (IllegalStateException illegalStateException) {
                                                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                                                    illegalStateException.printStackTrace();
                                                }
                                                return false;
                                            }

                                        });
                                    }
                                    return false;
                                } catch (NumberFormatException e) {
                                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                                    e.printStackTrace();
                                } catch (IllegalStateException e) {
                                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                                    e.printStackTrace();
                                }
                                return false;
                            }
                        });
                    }
                } catch (NumberFormatException e) {
                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                    e.printStackTrace();
                } catch (IllegalStateException e) {
                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                    e.printStackTrace();
                }
                return false;
            }
        });
    }
}
