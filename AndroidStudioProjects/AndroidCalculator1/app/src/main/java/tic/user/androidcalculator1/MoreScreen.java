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
}
