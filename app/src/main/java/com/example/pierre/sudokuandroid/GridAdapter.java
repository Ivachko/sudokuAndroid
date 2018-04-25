package com.example.pierre.sudokuandroid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.pierre.sudokuandroid.Model.Grid;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends ArrayAdapter<Grid> {
    private Context mContext;
    private List<Grid> gridList;

    public GridAdapter(Context context,  ArrayList<Grid> list){
        super(context,0,list);
        mContext = context;
        gridList=  list;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItem = convertView;

        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_row,parent,false);

        Grid currentGrid = gridList.get(position);

        TextView title = listItem.findViewById(R.id.title);
        title.setText(currentGrid.getTitle());

        TextView percent = listItem.findViewById(R.id.percentage);
        percent.setText(currentGrid.getPercent()+" %");
        if (currentGrid.getPercent() > 50){
            percent.setTextColor(Color.parseColor("#00EC22"));
        }else{

            percent.setTextColor(Color.parseColor("#B02A08"));
        }

        return listItem;

    }
}