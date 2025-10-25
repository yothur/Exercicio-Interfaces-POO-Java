package br.com.catolica.banco.model;

import br.com.catolica.banco.contracts.ITributavel;

public class GerenciadorDeImpostoDeRenda {
    private double total;

    public void adicionar(ITributavel tributavel){

        this.total += tributavel.calculaTributos();
    }

    public double getTotal() {
        return this.total;
    }
}
