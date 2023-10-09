package com.example.salesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CrearClienteActivity extends AppCompatActivity {
    String name;
    Main main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cliente);
    }

    public void launchCrearCliente(View v){
        EditText t= findViewById(R.id.idProducto);
        name = t.getText().toString();
        main.clientes.add(new Cliente(name));

        // onBackPressed();
        Intent i = new Intent(this,VerClientesActivity.class);
        startActivity(i);
        onBackPressed();
    }
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}