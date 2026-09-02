package org.example;
import java.util.List;
import java.util.ArrayList;
public class Proveedor extends Persona{
    private String razonSocial;
    private String cuit;
    private List<Producto> listaProductos;
public Proveedor(String nombre, String domicilio, int dni, int telefono,
                 String razonSocial, String cuit){
    super(nombre, domicilio, dni, telefono);
    this.razonSocial = razonSocial;
    this.cuit = cuit;
    this.listaProductos = new ArrayList<>();
}
public String getRazonsocial(){
    return razonSocial;
}
public void setRazonsocial(String razonSocial){
    this.razonSocial = razonSocial;
}
    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
}
