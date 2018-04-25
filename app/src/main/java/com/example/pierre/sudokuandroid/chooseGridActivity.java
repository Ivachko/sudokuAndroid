package com.example.pierre.sudokuandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import com.example.pierre.sudokuandroid.Model.Grid;

import java.util.ArrayList;

public class chooseGridActivity extends AppCompatActivity {
    private ListView listView;
    private GridAdapter gridAdapter;
    private TextView header;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_grid);
        Intent intent = getIntent();
        String level = intent.getStringExtra("level");
        header = findViewById(R.id.header);
            header.setText(header.getText() + level);
            listView = (ListView) findViewById(R.id.chooseGridElement);
            ArrayList<Grid> gridList= new ArrayList<>();
            gridList.add(new Grid("Test1", 15));
            gridList.add(new Grid("Test2", 25));
            gridList.add(new Grid("Test3", 58));
            gridList.add(new Grid("Test4", 10));
            gridList.add(new Grid("Test5", 85));
            gridAdapter= new GridAdapter(this,gridList);
            listView.setAdapter(gridAdapter);



    }
}
