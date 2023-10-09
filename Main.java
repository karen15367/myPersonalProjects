package com.example.salesmanager;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ArrayList<Producto> productos = new ArrayList<Producto>();

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public Cliente buscarCliente(String name){
        for(int i=0;i<clientes.size();i++){
            if(clientes.get(i).nombre.equals(name)){
                return clientes.get(i);
            }
        }
        return null;
    }

    public Producto buscarProducto(String id){
        for(int i=0;i<productos.size();i++){
            if(productos.get(i).id.equals(id)){
                return productos.get(i);
            }
        }
        return null;
    }

    public void agregarProductoALista(Producto producto){
        productos.add(producto);
    }
}
