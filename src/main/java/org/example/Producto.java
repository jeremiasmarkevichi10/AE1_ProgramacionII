package org.example;

public class Producto extends ItemComercial {

public Producto(int codigo, String nombre,
                int precio, Proveedor proveedor){
    super(codigo, nombre, precio, proveedor);
}
@Override
public String getTipo(){
    return "Producto";
}
}
