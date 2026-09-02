package org.example;

public class Pago {
    private int monto;
    private String fecha;
    private FormaPago formapago;
    private Estado estado;

    public Pago(int monto, String fecha, FormaPago formapago,
                Estado estado){
        this.monto = monto;
        this.fecha = fecha;
        this.formapago = formapago;
        this.estado = estado;
    }
    public int getMonto(){
        return monto;
    }
    public String getFecha(){
        return fecha;
    }
    public FormaPago getFormapago(){
        return formapago;
    }
    public Estado getEstado(){
        return estado;
    }
}
