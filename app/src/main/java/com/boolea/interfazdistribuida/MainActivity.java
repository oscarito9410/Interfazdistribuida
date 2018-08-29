package com.boolea.interfazdistribuida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
            mTvTitulo.setText("IPN creará el Centro de Investigación en Cambio Climático");
            mTvAutor.setText("Lizbeth Lopez");
            mTvFecha.setText("28/08/2018");
            mTvNoticia.setText("El Instituto Politécnico Nacional (IPN) informó que creará un Centro de Investigación en Cambio Climático y se instalará una nueva unidad ..");
        } else {
            mTvTitulo.setText("Busca el IPN aumentar su matrícula en el corto plazoo");
            mTvAutor.setText("Juanito Pérez");
            mTvFecha.setText("29/08/2018");
            mTvNoticia.setText("CIUDAD DE MÉXICO. El Instituto Politécnico Nacional (IPN) impulsa una estrategia que permita aumentar su matrícula en el corto plazo, con ...");
        }
        countNoticia++;
    }
}
