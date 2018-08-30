package com.boolea.interfazdistribuida;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvAutor;
    private TextView mTvTitulo;
    private TextView mTvNoticia;
    private TextView mTvFecha;

    private int countNoticia = 0;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        cambiarNoticia(null);
    }

    private void initView () {
        mTvAutor = findViewById(R.id.tv_autor);
        mTvFecha = findViewById(R.id.tv_fecha);
        mTvNoticia = findViewById(R.id.tv_noticia_descripcion);
        mTvTitulo = findViewById(R.id.tv_titulo);
    }

    public void cambiarNoticia (View view) {
        if (countNoticia % 2 == 0) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        }
        countNoticia++;
    }
}
