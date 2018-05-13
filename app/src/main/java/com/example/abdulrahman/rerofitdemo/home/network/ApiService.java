package com.example.abdulrahman.rerofitdemo.home.network;

import com.example.abdulrahman.rerofitdemo.home.data.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by abdulrahman on 5/9/2018.
 */

public interface ApiService {
    @GET("movie/top_rated?")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
