package com.delight.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    public double val1, val2;
    public String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        //цифры 0-9
        Button button0 = findViewById(R.id.zero);
        Button button1 = findViewById(R.id.one);
        Button button2 = findViewById(R.id.two);
        Button button3 = findViewById(R.id.three);
        Button button4 = findViewById(R.id.four);
        Button button5 = findViewById(R.id.five);
        Button button6 = findViewById(R.id.six);
        Button button7 = findViewById(R.id.seven);
        Button button8 = findViewById(R.id.eight);
        Button button9 = findViewById(R.id.nine);
        //plus,minus,division,multiply,dot,equally,delete
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button division = findViewById(R.id.division);
        Button multiply = findViewById(R.id.multiply);
        Button dot = findViewById(R.id.dot);
        Button equally = findViewById(R.id.equally);
        Button delete = findViewById(R.id.delete);
        Button percent = findViewById(R.id.percent);
        //button0 click
        button0.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("0");
            }
        });

        //button1 click
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("1");
            }
        });

        //button2 click
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("2");
            }
        });

        //button3 click
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("3");
            }
        });

        //button4 click
        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("4");
            }
        });

        //button5 click
        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("5");
            }
        });

        //button6 click
        button6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("6");
            }
        });

        //button7 click
        button7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("7");
            }
        });


        //button8 click
        button8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("8");
            }
        });


        //button9 click
        button9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("9");
            }
        });
        //  dot button  click
        dot.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append(".");
            }
        });

        // button delete click

        delete.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.setText("");
            }
        });

        //plus button click
        plus.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "+";
            }
        });
        //minus button click
        minus.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "-";
            }
        });
        //division button click
        division.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "/";
            }
        });
        //multiply button click
        multiply.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "*";
            }
        });
        //percent button click
        percent.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "%";
            }
        });

        //equals button click
        equally.setOnClickListener(new Button.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           TextView output = findViewById(R.id.editText);
                                           val2 = Double.parseDouble(output.getText().toString());

                                           if (operator == "+") {
                                               output.setText(Double.toString(val1 + val2));
                                               Intent intent = new Intent();
                                               intent.putExtra("calculateResult", val1 + " + " + val2 + " = " + output.getText());
                                               setResult(RESULT_OK, intent);
                                               finish();

                                           } else if (operator == "-") {
                                               output.setText(Double.toString(val1 - val2));
                                               Intent intent = new Intent();
                                               intent.putExtra("calculateResult", val1 + " - " + val2 + " = " + output.getText());
                                               setResult(RESULT_OK, intent);
                                               finish();
                                           } else if (operator == "/") {
                                               if (val2 == 0) {
                                                   output.setText("Can not divide by zero!");
                                                   Intent intent = new Intent();
                                                   intent.putExtra("calculateResult",output.getText());
                                                   setResult(RESULT_OK, intent);
                                                   finish();
                                               } else {
                                                   output.setText(Double.toString(val1 / val2));
                                                   Intent intent = new Intent();
                                                   intent.putExtra("calculateResult", val1 + " / " + val2 + " = " + output.getText());
                                                   setResult(RESULT_OK, intent);
                                                   finish();
                                               }
                                           } else if (operator == "*") {
                                               output.setText(Double.toString(val1 * val2));
                                               Intent intent = new Intent();
                                               intent.putExtra("calculateResult", val1 + " * " + val2 + " = " + output.getText());
                                               setResult(RESULT_OK, intent);
                                               finish();
                                           } else if (operator == "%") {
                                               output.setText(Double.toString((val1 / 100) * val2));
                                               Intent intent = new Intent();
                                               intent.putExtra("calculateResult", val1 + " % " + val2 + " = " + output.getText());
                                               setResult(RESULT_OK, intent);
                                               finish();
                                           }
                                       }


                                   }


        );

       //button back click
        final Intent intent = new Intent(this,MainActivity.class);
        Button button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(intent);
            }
        });
    }


}

