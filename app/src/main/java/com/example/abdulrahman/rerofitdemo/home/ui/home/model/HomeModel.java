package com.example.abdulrahman.rerofitdemo.home.ui.home.model;

import com.example.abdulrahman.rerofitdemo.home.data.MovieModel;

import java.util.List;

/**
 * Created by abdulrahman on 5/9/2018.
 */

public interface HomeModel {
   void getMOviesList(OnGettingMoviesCallback callback);
    interface OnGettingMoviesCallback{
        void onGetMoviesSuccess(List<MovieModel> movies);

        void onGetMoviesFailure(Exception e);
        void onGetMoviesFailure(int errorCode);
    }
}
