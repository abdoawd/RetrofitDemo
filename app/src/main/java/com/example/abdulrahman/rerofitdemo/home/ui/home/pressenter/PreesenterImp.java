package com.example.abdulrahman.rerofitdemo.home.ui.home.pressenter;

import com.example.abdulrahman.rerofitdemo.home.data.MovieModel;
import com.example.abdulrahman.rerofitdemo.home.ui.home.model.HomeModel;
import com.example.abdulrahman.rerofitdemo.home.ui.home.model.ModelImp;
import com.example.abdulrahman.rerofitdemo.home.ui.home.view.HomeView;

import java.util.List;

/**
 * Created by abdulrahman on 5/9/2018.
 */

public class PreesenterImp implements Homepressenter,HomeModel.OnGettingMoviesCallback {
    HomeModel model;

    HomeView view;
    public PreesenterImp (HomeView homeView){
        view=homeView;
        model=new ModelImp();

    }
    @Override
    public void iinit() {
        model.getMOviesList(this);

    }

    @Override
    public void btnGetListClicked() {

    }

    @Override
    public void btnDetailedMovieClicked() {

    }


    @Override
    public void onGetMoviesSuccess(List<MovieModel> movies) {
        view.getMoviesSucess(movies);
    }

    @Override
    public void onGetMoviesFailure(Exception e) {
        view.onErorrOccured(e);

    }

    @Override
    public void onGetMoviesFailure(int errorCode) {

    }

}
