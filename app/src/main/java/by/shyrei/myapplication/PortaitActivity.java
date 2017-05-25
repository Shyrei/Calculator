/*
package by.shyrei.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class PortaitActivity extends AppCompatActivity {

    EditText display, symbolDisplay;
    TextView allClear, equals, divide, multiply, minus, plus, square, percent, exponent;
    TextView one, two, three, four, five, six, seven, eight, nine, zero, point;
    BigDecimal valueOne;
    BigDecimal valueTwo;
    boolean bPlus, bMinus, bMultiply, bDivide, bPercent, bExponent;

    public void portait() {
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

        point = (TextView) findViewById(R.id.btnPoint);
        divide =(TextView) findViewById(R.id.btnDevide);
        multiply = (TextView) findViewById(R.id.btnMultiply);
        plus = (TextView) findViewById(R.id.btnPlus);
        minus = (TextView) findViewById(R.id.btnMinus);

        display.setKeyListener(DigitsKeyListener.getInstance(true,true));
        registerListeners();
    }

    public void registerListeners () {

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

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append(".");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(display.getText())){
                    display.setText("");
                }else {
                    valueOne = new BigDecimal(display.getText().toString());
                    bDivide = true;
                    display.setText("");
                    symbolDisplay.append("/");
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(display.getText())){
                    display.setText("");
                }else {
                    valueOne = new BigDecimal(display.getText().toString());
                    bMultiply = true;
                    display.setText("");
                    symbolDisplay.setText("*");
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(display.getText())){
                    display.setText("");
                }else {
                    valueOne = new BigDecimal(display.getText().toString());
                    bPlus = true;
                    display.setText("");
                    symbolDisplay.setText("+");
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(display.getText())){
                    display.setText("");
                }else {
                    valueOne = new BigDecimal(display.getText().toString());
                    bMinus = true;
                    display.setText("");
                    symbolDisplay.setText("-");
                }
            }
        });


        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(display.getText())) {
                    display.setText("");
                } else {
                    valueTwo = new BigDecimal(display.getText().toString());
                }

                if (bPlus == true){
                    display.setText(valueOne.add(valueTwo).toString());
                    bPlus=false;
                    symbolDisplay.setText("");
                }

                if (bMinus == true){
                    display.setText(valueOne.subtract(valueTwo).toString());
                    bMinus = false;
                    symbolDisplay.setText("");
                }

                if (bMultiply == true){
                    display.setText(valueOne.multiply(valueTwo).toString());
                    bMultiply=false;
                    symbolDisplay.setText("");
                }

                if (bDivide == true){
                    display.setText(valueOne.divide(valueTwo, 5, BigDecimal.ROUND_HALF_UP).toString());
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
*/
