package com.cesde.TalenteHM1.Domain;

import java.time.LocalDate;

public class Nomina {
    private int id;
    private LocalDate fecha;
    private double salarioBase;

    public Nomina (){

    }

    public Nomina(LocalDate fecha, int id, double salarioBase) {
        this.fecha = fecha;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "fecha=" + fecha +
                ", id=" + id +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
