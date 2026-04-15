package com.cesde.TalenteHM1.Domain;

public class Empleado {
    private int id;
    private String nombre;
    private String documento;
    private double salario;

    public Empleado() {

    }

    public Empleado(String documento, int id, String nombre, double salario) {
        this.documento = documento;
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "documento='" + documento + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
