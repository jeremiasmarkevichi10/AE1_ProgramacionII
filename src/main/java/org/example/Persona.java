package org.example;

public class Persona {
    private String nombre;
    private String domicilio;
    private int dni;
    private int telefono;

    public Persona(String nombre, String domicilio, int dni, int telefono){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
