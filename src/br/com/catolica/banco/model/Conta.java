package br.com.catolica.banco.model;

abstract class Conta {
    private double saldo;

    public void sacar(double sacar){
        this.saldo =  this.saldo - sacar;
    }

    public void depositar(double depositar){
        this.saldo = this.saldo + depositar;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
