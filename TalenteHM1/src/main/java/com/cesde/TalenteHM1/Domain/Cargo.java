package com.cesde.TalenteHM1.Domain;

public class Cargo extends Empleado{
    private int id;
    private String nombre;
    private String descripcion;

    public Cargo (){

    }

    public Cargo(String documento, int id, String nombre, double salario, String descripcion, int id1, String nombre1) {
        super(documento, id, nombre, salario);
        this.descripcion = descripcion;
        this.id = id1;
        this.nombre = nombre1;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "descripcion='" + descripcion + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
