package com.cesde.TalenteHM1.Domain;

import java.time.LocalDate;

public class Pago extends Nomina{

    private int id;
    private double valor;

    public Pago (){

    }

    public Pago(LocalDate fecha, int id, double salarioBase, int id1, double valor) {
        super(fecha, id, salarioBase);
        this.id = id1;
        this.valor = valor;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", valor=" + valor +
                '}';
    }
}
