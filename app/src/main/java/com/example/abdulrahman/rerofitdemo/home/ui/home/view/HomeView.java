package com.example.abdulrahman.rerofitdemo.home.ui.home.view;

import com.example.abdulrahman.rerofitdemo.home.data.MovieModel;

import java.util.List;

/**
 * Created by abdulrahman on 5/9/2018.
 */

public interface HomeView {
    void getMoviesSucess(List<MovieModel> movies);
    void onErorrOccured(Exception e);

}
