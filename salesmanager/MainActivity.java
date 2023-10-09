package com.example.salesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchVerClientes(View v){
        Intent i = new Intent(this,VerClientesActivity.class);
        startActivity(i);
    }

    public void launchVerRopa(View v){
        Intent i = new Intent(this, VerRopaActivity.class);
        startActivity(i);
    }

    public void launchRealizarVenta(View v){
        Intent i = new Intent(this, RealizarVentaActivity.class);
        startActivity(i);
    }

    public void launchRealizarPago(View v){
        Intent i = new Intent(this, RealizarPagoActivity.class);
        startActivity(i);
    }
}