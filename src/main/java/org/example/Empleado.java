package org.example;

public class Empleado extends Persona {
    private int salario;
    private Puesto puesto;
    private String fechaIngreso;
    private Departamento departamento;

    public Empleado(String nombre, String domicilio, int dni, int telefono, int salario, Puesto puesto, String fechaIngreso,
                    Departamento departamento) {
        super(nombre, domicilio, dni, telefono);
        this.salario = salario;
        this.puesto = puesto;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
    }

    public int getSalario(){
        return salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
    public Puesto getPuesto(){
        return puesto;
    }
    public void setPuesto(Puesto puesto){
        this.puesto = puesto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
