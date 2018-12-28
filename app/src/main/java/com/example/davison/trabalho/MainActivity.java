package com.example.davison.trabalho;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import java.sql.BatchUpdateException;

public class MainActivity extends Activity {

    private Button botaoView;
    private Button botaoImageView;
    private Button botaoCalendario;
    private Button botaoWebView;
    private Button botaoVideoView;
    private Button botaoProgressBar;
    private Button botaoProgressBarHorizontal;
    private Button botaoSeekBar;
    private Button botaoSeekBarDiscrete;
    private Button botaoRatingBar;
    private Button botaoSearchView;
    private Button botaoTextureView;
    private Button botaoSurfaceView;
    private Button botaoHorizontalDivider;
    private Button botaoVerticalDivider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botaoCalendario = (Button) findViewById(R.id.botaoCalendario);
        botaoCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, calendarview.class));
            }
        });

        botaoImageView = (Button) findViewById(R.id.botaoImageView);
        botaoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, imageview.class));
            }
        });

        botaoWebView = (Button) findViewById(R.id.botaoWebView);
        botaoWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, webview.class));
            }
        });

        botaoVideoView = (Button) findViewById(R.id.botaoVideoView);
        botaoVideoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, videoview.class));
            }
        });

        botaoView = (Button) findViewById(R.id.botaoView);
        botaoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, view.class));
            }
        });

        botaoProgressBar = (Button) findViewById(R.id.botaoProgressBar);
        botaoProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, progressbar.class));
            }
        });

        botaoProgressBarHorizontal = (Button) findViewById(R.id.botaoProgressBarHorizontal);
        botaoProgressBarHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, progressbarhorizontal.class));
            }
        });

        botaoSeekBar = (Button) findViewById(R.id.botaoSeekBar);
        botaoSeekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, seekbar.class));
            }
        });

        botaoSeekBarDiscrete = (Button) findViewById(R.id.botaoSeekBarDiscrete);
        botaoSeekBarDiscrete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, seekbardiscrete.class));
            }
        });

        botaoRatingBar = (Button) findViewById(R.id.botaoRatingBar);
        botaoRatingBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ratingbar.class));
            }
        });

        botaoSearchView = (Button) findViewById(R.id.botaoSearchView);
        botaoSearchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, searchview.class));
            }
        });

        botaoTextureView = (Button) findViewById(R.id.botaoTextureView);
        botaoTextureView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, textureview.class));
            }
        });

        botaoSurfaceView = (Button) findViewById(R.id.botaoSurfaceView);
        botaoSurfaceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, surfaceview.class));
            }
        });

        botaoHorizontalDivider = (Button) findViewById(R.id.botaoHorizontalDivider);
        botaoHorizontalDivider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, horizontaldivider.class));
            }
        });

        botaoVerticalDivider = (Button) findViewById(R.id.botaoVerticalDivider);
        botaoVerticalDivider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, verticaldivider.class));
            }
        });


    }
}
