package com.example.davison.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class surfaceview extends AppCompatActivity {

    newsurfaceview newSurface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surfaceview);
        newSurface = new newsurfaceview(getApplicationContext());
        setContentView(newSurface);

    }


    }

