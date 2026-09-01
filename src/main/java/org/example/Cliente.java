package org.example;
import java.util.List;
import java.util.ArrayList;
public class Cliente extends Persona {
    private int limiteCredito;
    private Categoria categoria;
    private List<Factura> historialCompras;

    public Cliente(String nombre, String domicilio, int dni, int telefono,
                   int limiteCredito, Categoria categoria) {
        super(nombre, domicilio, dni, telefono);
        this.limiteCredito = limiteCredito;
        this.categoria = categoria;
        this.historialCompras = new ArrayList<>();
    }

    public int getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    public Categoria getCategoria(){
        return categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
    public List<Factura> getHistorialCompras(){
        return historialCompras;
    }

}




