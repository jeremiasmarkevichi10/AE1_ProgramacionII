package org.example;

public class ItemComercial {
    private int codigo;
    private String nombre;
    private int precio;
    private Proveedor proveedor;

    public ItemComercial(int codigo, String nombre,
                         int precio, Proveedor proveedor){
      this.codigo = codigo;
      this.nombre = nombre;
      this.precio = precio;
      this.proveedor = proveedor;
    }
    public String getTipo(){
        return "Item";
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
