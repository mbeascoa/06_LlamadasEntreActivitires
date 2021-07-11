package com.example.a06_llamadasentreactivitires;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;



public class Ventana2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
    }

    public void cerrarVentana(View view) {
        finish();
    }
}

