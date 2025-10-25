package br.com.catolica.calcularareas.model;

import br.com.catolica.calcularareas.contracts.IAreaCalculavel;

public class Retangulo implements IAreaCalculavel {
    public double base;
    public double altura;


    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (this.base * this.altura);
    }

    @Override
    public String toString() {
        return String.format("Área do Retangulo = %.2f ", calculaArea());
    }
}
