package com.example.listviewexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class  AnimalAdapter extends BaseAdapter {
    private List<Animal> animals;
    private LayoutInflater inflator;

    public <activity> AnimalAdapter(List<Animal> animals, Activity activity) {
        this.animals = animals;
        inflator=activity.getLayoutInflater();
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int position) {
        return animals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowview;
        rowview=inflator.inflate(R.layout.listview_row,null);
        TextView textView = rowview.findViewById(R.id.label);
        textView.setText(animals.get(position).getType());
        ImageView imageView =rowview.findViewById(R.id.imageView);
        imageView.setImageResource(animals.get(position).getPicId());

        return rowview;
    }
}
