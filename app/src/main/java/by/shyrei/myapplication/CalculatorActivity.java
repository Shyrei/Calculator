package by.shyrei.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    EditText display, symbolDisplay;

    TextView allClear, equals, divide, multiply, minus, plus;
    TextView one, two, three, four, five, six, seven, eight, nine, zero;
    float valueOne, valueTwo;
    boolean bPlus, bMinus, bMultiply, bDivide;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (EditText) findViewById(R.id.editText1);
        symbolDisplay = (EditText) findViewById(R.id.editText2);
        allClear = (TextView) findViewById(R.id.btnClear);
        equals = (TextView) findViewById(R.id.btnResult);

        one = (TextView) findViewById(R.id.btn1);
        two = (TextView) findViewById(R.id.btn2);
        three = (TextView) findViewById(R.id.btn3);
        four = (TextView) findViewById(R.id.btn4);
        five = (TextView) findViewById(R.id.btn5);
        six =(TextView) findViewById(R.id.btn6);
        seven = (TextView) findViewById(R.id.btn7);
        eight = (TextView) findViewById(R.id.btn8);
        nine = (TextView) findViewById(R.id.btn9);
        zero = (TextView) findViewById(R.id.btn0);

        divide =(TextView) findViewById(R.id.btnDevide);
        multiply = (TextView) findViewById(R.id.btnMultiply);
        plus = (TextView) findViewById(R.id.btnPlus);
        minus = (TextView) findViewById(R.id.btnMinus);

        display.setKeyListener(DigitsKeyListener.getInstance(true,true));

        registerListeners();
    }

    public void registerListeners () {

        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               display.append("1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("0");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null){
                    display.setText("");
                }else {
                    valueOne = Float.parseFloat(display.getText() + "");
                    bDivide = true;
                    display.setText(null);
                    symbolDisplay.append(" / ");
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null){
                    display.setText("");
                }else {
                    valueOne = Float.parseFloat(display.getText() + "");
                    bMultiply = true;
                    display.setText(null);
                    symbolDisplay.setText(" * ");
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null){
                    display.setText("");
                }else {
                    valueOne = Float.parseFloat(display.getText() + "");
                    bPlus = true;
                    display.setText(null);
                    symbolDisplay.setText(" + ");
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null){
                    display.setText("");
                }else {
                    valueOne = Float.parseFloat(display.getText() + "");
                    bMinus = true;
                    display.setText(null);
                    symbolDisplay.setText(" - ");
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(display.getText() + "");

                if (bPlus == true){
                    display.setText(String.format("%.0f", valueOne + valueTwo));
                    bPlus=false;
                    symbolDisplay.setText("");
                }

                if (bMinus == true){
                    display.setText(String.format("%.0f", valueOne - valueTwo));
                    bMinus = false;
                    symbolDisplay.setText("");
                }

                if (bMultiply == true){
                    display.setText(String.format("%.0f", valueOne * valueTwo));
                    bMultiply=false;
                    symbolDisplay.setText("");
                }

                if (bDivide == true){
                    display.setText(String.format("%.0f", valueOne / valueTwo));
                    bDivide=false;
                    symbolDisplay.setText("");
                }
            }
        });

        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
                symbolDisplay.setText("");
            }
        });
    }



}
