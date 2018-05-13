package com.example.abdulrahman.rerofitdemo.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.abdulrahman.rerofitdemo.R;
import com.example.abdulrahman.rerofitdemo.home.data.MovieModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by abdulrahman on 5/12/2018.
 */

public class ImageAdapter extends BaseAdapter {
    List<MovieModel> movies;
    Context context;
    public ImageAdapter (List<MovieModel> movies,Context context){
        this.context=context;
        this.movies=movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        MovieHolder holder;
        if (row==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_row, parent, false);
            holder= new MovieHolder(row);
            row.setTag(holder);}
        else {
            holder= (MovieHolder) row.getTag();
        }
        MovieModel item=movies.get(position);
        Picasso.with(context).load("http://image.tmdb.org/t/p/w185/"+item.getPosterPath()).
                resize(400,400).into(holder.imageView);

        return row;
    }

    }



