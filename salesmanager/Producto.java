package com.example.salesmanager;

public class Producto {
    String id;
    String descripcion;
    double precio;
    boolean disponible;

    Producto(String id, String descripcion, double precio){
        this.id=id;
        this.descripcion=descripcion;
        this.precio=precio;
        disponible=true;
    }

    public void vender(){
        disponible=false;
    }

}
