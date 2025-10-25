package br.com.catolica.banco.model;

import br.com.catolica.banco.contracts.ITributavel;

public class SeguroDeVida implements ITributavel {

    @Override
    public double calculaTributos() {
        return 42;
    }
}
