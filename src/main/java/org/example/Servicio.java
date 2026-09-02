package org.example;

public class Servicio extends ItemComercial {

    public Servicio(int codigo, String nombre,
                    int precio, Proveedor proveedor){
        super(codigo, nombre, precio, proveedor);
    }
    @Override
    public String getTipo(){
        return "Servicio";
    }
}