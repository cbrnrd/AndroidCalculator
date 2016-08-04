package tic.user.androidcalculator1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoreScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_screen);

        Bundle passedInfo = getIntent().getExtras();
        if(passedInfo != null){
           // if(passedInfo.getString())
        }

        Button buttonBack = (Button) findViewById(R.id.buttonBack);



        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(MoreScreen.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
