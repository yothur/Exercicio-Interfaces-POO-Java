package br.com.catolica.calcularareas.model;

import br.com.catolica.calcularareas.contracts.IAreaCalculavel;

public class Circulo implements IAreaCalculavel {
    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return (this.raio * this.raio) * 3.14;
    }

    @Override
    public String toString() {
        return String.format("Área do Circulo = %.2f ", calculaArea());
    }
}
