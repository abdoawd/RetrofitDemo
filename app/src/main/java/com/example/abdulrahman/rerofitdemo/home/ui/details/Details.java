package com.example.abdulrahman.rerofitdemo.home.ui.details;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.abdulrahman.rerofitdemo.R;
import com.example.abdulrahman.rerofitdemo.home.bus.MovieBus;

import de.greenrobot.event.EventBus;

public class Details extends AppCompatActivity {
    private EventBus bus = EventBus.getDefault();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
    
    public void onEvent(MovieBus event){
        Toast.makeText(this, event.getModel().getId(), Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onResume() {
        super.onResume();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onPause() {
        EventBus.getDefault().unregister(this);
        super.onPause();
    }
}
