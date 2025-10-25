package br.com.catolica.calcularareas.model;

import br.com.catolica.calcularareas.contracts.IAreaCalculavel;

public class Quadrado implements IAreaCalculavel {
    public double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return (this.lado * this.lado);
    }

    @Override
    public String toString() {
        return String.format("Área do Quadrado = %.2f ", calculaArea());
    }
}
