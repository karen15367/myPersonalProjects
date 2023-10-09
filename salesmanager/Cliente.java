package com.example.salesmanager;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Cliente {
    String nombre;
    double deuda;
    ArrayList<Pago> pagos = new ArrayList<Pago>();
    ArrayList<Compra> compras = new ArrayList<Compra>();

    Cliente(String nombre){
        this.nombre=nombre;
        deuda=0;
    }
    void realizaUnPago(@NonNull Pago pago){
        deuda-=pago.monto;
        pagos.add(pago);
    }

    void realizarUnaCompra(@NonNull Compra compra){
        deuda+=compra.producto.precio;
        compra.producto.vender();
        compras.add(compra);
    }
}
