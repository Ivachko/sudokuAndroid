package com.example.pierre.sudokuandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button level1B;
    private Button level2B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        level1B = (Button)findViewById(R.id.buttonLevel1);
        level1B.setOnClickListener(this);
        level2B = (Button)findViewById(R.id.buttonLevel2);
        level2B.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intention = new Intent(this,chooseGridActivity.class);
        if(view == level1B){
            intention.putExtra("level","1");
        }
        if(view == level2B){
            intention.putExtra("level","2");
        }
        startActivity(intention);
    }
}
