package com.example.abdulrahman.rerofitdemo.home.ui.home.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.abdulrahman.rerofitdemo.R;
import com.example.abdulrahman.rerofitdemo.home.adapter.ImageAdapter;
import com.example.abdulrahman.rerofitdemo.home.bus.MovieBus;
import com.example.abdulrahman.rerofitdemo.home.data.MovieModel;
import com.example.abdulrahman.rerofitdemo.home.ui.details.Details;
import com.example.abdulrahman.rerofitdemo.home.ui.home.pressenter.Homepressenter;
import com.example.abdulrahman.rerofitdemo.home.ui.home.pressenter.PreesenterImp;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.greenrobot.event.EventBus;


public class MainActivity extends AppCompatActivity implements HomeView {
    @BindView(R.id.grid)
    GridView  gridView;
    ImageAdapter adapter;

    Homepressenter pressenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        pressenter=new PreesenterImp(this);
        pressenter.iinit();

    }



    @Override
    public void getMoviesSucess(final List<MovieModel> movies) {
        Toast.makeText(this,"sucess"+movies.get(1).getBackdropPath(),Toast.LENGTH_LONG).show();
        adapter=new ImageAdapter(movies,this);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MovieModel movieModel = movies.get(position);
                EventBus.getDefault().post(new MovieBus(movieModel));
                startActivity(new Intent(MainActivity.this, Details.class));

            }
        });



    }

    @Override
    public void onErorrOccured(Exception e) {
        Toast.makeText(this,"failure"+e.getMessage(),Toast.LENGTH_LONG).show();
        Log.d(e.getMessage(),"failure");


    }

}
