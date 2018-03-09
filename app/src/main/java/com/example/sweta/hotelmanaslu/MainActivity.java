package com.example.sweta.hotelmanaslu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by sweta on 3/8/18.
 */

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initactivities();
        initToolbar();
    }

    private void initactivities(){

        toolbar=findViewById(R.id.toolbar);
    }

    private void initToolbar(){
        setSupportActionBar(toolbar);
    }
}
