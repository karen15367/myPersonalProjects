package com.example.salesmanager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class VerClientesActivity extends AppCompatActivity {

    Main main;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_clientes);
    }


    public void launcheBuscarCliente(View v){
        EditText t= findViewById(R.id.idProducto);
        name = t.getText().toString();
        Cliente c = main.buscarCliente(name);
        Toast.makeText(this,"holi", Toast.LENGTH_LONG).show();
        if(c==null){
            Toast.makeText(this,"No se puedo encontrar cliente", Toast.LENGTH_LONG).show();
        }
        else{
            Intent i = new Intent(this,VerClienteActivity.class);
           // i.putExtra("clienteBuscado", (P arcelable) c);
            startActivity(i);
        }
    }
    public void launchCrearCliente(View v){
        Intent i = new Intent(this, CrearClienteActivity.class);
        startActivity(i);

    }
}

