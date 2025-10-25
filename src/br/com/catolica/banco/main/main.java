package br.com.catolica.banco.main;

import br.com.catolica.banco.model.ContaCorrente;
import br.com.catolica.banco.model.GerenciadorDeImpostoDeRenda;
import br.com.catolica.banco.model.SeguroDeVida;

public class main {
    public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        ContaCorrente cc = new ContaCorrente();

        SeguroDeVida sv = new SeguroDeVida();

        cc.depositar(1000);

        gerenciador.adicionar(cc);
        gerenciador.adicionar(sv);

        System.out.printf("Total a pagar de impostos: R$%.2f",gerenciador.getTotal());

    }

}
