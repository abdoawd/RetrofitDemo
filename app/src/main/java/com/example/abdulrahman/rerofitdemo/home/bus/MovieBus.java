package com.example.abdulrahman.rerofitdemo.home.bus;

import com.example.abdulrahman.rerofitdemo.home.data.MovieModel;

/**
 * Created by abdulrahman on 5/12/2018.
 */

public class MovieBus {
    MovieModel model;

    public MovieModel getModel() {
        return model;
    }

    public MovieBus(MovieModel model){

    }

    public void setModel(MovieModel model) {
        this.model = model;
    }
}
