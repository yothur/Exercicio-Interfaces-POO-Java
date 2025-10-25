package br.com.catolica.banco.model;

import br.com.catolica.banco.contracts.ITributavel;

public class ContaCorrente extends Conta implements ITributavel {

    public ContaCorrente(){}

    @Override
    public double calculaTributos() {
        return (this.getSaldo() * 0.01);
    }
}
