package com.example.salesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class CrearProductoActivity extends AppCompatActivity {
    String id;
    String descripcion;
    double precio;

    Main main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_producto);
    }

    public void handleText(View v){
        EditText t= findViewById(R.id.idProducto);
        id = t.getText().toString();

        t = findViewById(R.id.descripcion);
        descripcion=t.getText().toString();

        t=findViewById(R.id.precioProducto);
        String aux= t.getText().toString();
        precio = Double.valueOf(aux);
        Producto nPro = new Producto(id, descripcion, precio);
        main.agregarProductoALista(nPro);
        // onBackPressed();
        Intent i = new Intent(this,VerRopaActivity.class);
        startActivity(i);
        onBackPressed();
    }

    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}