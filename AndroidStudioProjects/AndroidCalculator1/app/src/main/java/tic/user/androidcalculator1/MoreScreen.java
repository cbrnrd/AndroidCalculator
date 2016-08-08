package tic.user.androidcalculator1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MoreScreen extends AppCompatActivity {
    TextView tv;
    String operation;
    String first;
    String second;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_screen);

        tv = (TextView) findViewById(R.id.textView);
        final String pi = Double.toString(Math.PI);
        Bundle passedInfo = getIntent().getExtras();
        if(passedInfo != null){
            operation = passedInfo.getString("operation");
            first = passedInfo.getString("first");
            second = passedInfo.getString("second");
            if(operation.equals("")){
                if(first.equals("")){
                    numView("0");
                }
                else{
                    numView(first);
                }

            }
            else{
                if(second.equals("")){
                    numView(first);
                }
                else{
                    numView(second);
                }
            }
           // if(passedInfo.getString())
        }


        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        Button buttonSqrt = (Button) findViewById(R.id.buttonSqrt);
        Button buttonPi = (Button) findViewById(R.id.buttonPi);
        Button buttonMult = (Button) findViewById(R.id.buttonMult);
        Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
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
        Button buttonPoint = (Button) findViewById(R.id.buttonPoint);
        Button buttonEquals = (Button) findViewById(R.id.buttonEquals);

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
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result;
                if (operation.equals("")) {
                    if (first.equals("")) {

                    } else {
                        /*result = Double.parseDouble(first);
                        if(second.equals("")) {
                            second = "0";

                            result = Math.pow(Double.parseDouble(first), Double.parseDouble(second));
                        *//*if (result % 1 == .0) {
                            first = String.valueOf((int) result);

                        }*//* //else {
                            first = String.valueOf(result);
                            //}

                            operation = "";
                            second = "";
                            numView(first);*/
                        operation = "exp";


                    }
                }
            }
        });

        buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.equals("")){
                    first = pi;
                    numView(first);
                }
                else{
                    second = pi;
                    numView(second);
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "";
                first = "";
                second = "";
                numView("0");
            }
        });

        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result;
                if(operation.equals("")){
                    if(first.equals("")){

                    }
                    else{
                        result = Double.parseDouble(first);
                        result = Math.sqrt(result);
                        if(result % 1 == .0){
                            first = String.valueOf((int) result);

                        }else{
                            first = String.valueOf(result);
                        }

                        operation = "";
                        second = "";
                        numView(first);
                    }
                }

            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result;
                if(operation.equals("")){
                    if(first.equals("")){

                    }
                    else{
                        result = Double.parseDouble(first);
                        result = Math.abs(result);
                        if(result % 1 == .0){
                            first = String.valueOf((int) result);

                        }else{
                            first = String.valueOf(result);
                        }

                        operation = "";
                        second = "";
                        numView(first);
                    }
                }

            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result;
                result = Double.parseDouble(first);


                // do all the operations here
                if (operation.equals("plus")) {
                    result = result + Double.parseDouble(second);
                } else if (operation.equals("minus")) {
                    result = result - Double.parseDouble(second);
                } else if (operation.equals("mult")) {
                    result = result * Double.parseDouble(second);
                } else if (operation.equals("div")) {
                    result = result / Double.parseDouble(second);
                } else if (operation.equals("exp")) {
                    result = Math.pow(Double.parseDouble(first), Double.parseDouble(second));
                }
                else{
                    //operation hasn't been chosen, result will stay the same
                }


                if(result % 1 == .0){
                    first = String.valueOf((int) result);

                }else{
                    first = String.valueOf(result);
                }

                operation = "";
                second = "";
                numView(first);
            }
        });
        
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(MoreScreen.this, MainActivity.class);
                //passes info to other intent
                backIntent.putExtra("operation",operation);
                backIntent.putExtra("first", first);
                backIntent.putExtra("second", second);
                startActivity(backIntent);
            }
        });



    }
    public void numView(String i){
        tv.setText(i);
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
}
