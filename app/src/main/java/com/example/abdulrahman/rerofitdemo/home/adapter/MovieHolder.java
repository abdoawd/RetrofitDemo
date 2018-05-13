package com.example.abdulrahman.rerofitdemo.home.adapter;

import android.view.View;
import android.widget.ImageView;

import com.example.abdulrahman.rerofitdemo.R;

/**
 * Created by abdulrahman on 5/12/2018.
 */

public class MovieHolder {
    ImageView imageView;
    MovieHolder(View v) {
        imageView = (ImageView) v.findViewById(R.id.img_single_row);
    }
}
