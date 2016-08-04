package tic.user.androidcalculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String first;
    String second;
    String operation;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operation = "";
        first = "";
        second = "";


        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonPoint = (Button) findViewById(R.id.buttonPoint);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonMult = (Button) findViewById(R.id.buttonMult);
        Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
        Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);

        tv = (TextView) findViewById(R.id.textView);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("0");


            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("1");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("2");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("3");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("4");

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("5");

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("6");

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("7");

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("8");

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("9");

            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(".");

            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "plus";

            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "minus";

            }
        });
        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "mult";

            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "div";

            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result;
                result = Double.parseDouble(first);
                if(operation.equals("plus")){
                    result = result + Double.parseDouble(second);
                }
                else if(operation.equals("minus")){
                    result = result - Double.parseDouble(second);
                }
                else if(operation.equals("mult")){
                    result = result * Double.parseDouble(second);
                }
                else if(operation.equals("div")){
                    result = result / Double.parseDouble(second);
                }
                else{
                    //operation hasn't been chosen, result will stay the same
                }

                if(result % 1 == 0){
                    result = (int) result;
                }

                operation = "";
                first = String.valueOf(result);
                second = "";
                numView(first);
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "";
                first = "";
                second = "";
                numView(first);

            }
        });


    }
    public void setNumber(String s){
        if (operation.equals("")){
            first += s;
            numView(first);
        }
        else{
            second += s;
            numView(second);
        }
    }

    public void numView(String i){
     tv.setText(i);
    }
}
