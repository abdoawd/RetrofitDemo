package com.example.abdulrahman.rerofitdemo.home.ui.home.model;

import com.example.abdulrahman.rerofitdemo.home.data.Constant;
import com.example.abdulrahman.rerofitdemo.home.data.MoviesResponse;
import com.example.abdulrahman.rerofitdemo.home.network.ApiClient;
import com.example.abdulrahman.rerofitdemo.home.network.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by abdulrahman on 5/9/2018.
 */

public class ModelImp implements HomeModel {
    @Override
    public void getMOviesList(final OnGettingMoviesCallback callback) {
        ApiService apiService =
                ApiClient.getClient().create(ApiService.class);
      Call<MoviesResponse>call= apiService.getTopRatedMovies(Constant.apiKey);
      call.enqueue(new Callback<MoviesResponse>() {
          @Override
          public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
              if (response.isSuccessful()){
                  callback.onGetMoviesSuccess(response.body().getResults());
              }
              else {
                  callback.onGetMoviesFailure(1);
              }

          }

          @Override
          public void onFailure(Call<MoviesResponse> call, Throwable t) {
              callback.onGetMoviesFailure((Exception) t);


          }
      });
    }
}
