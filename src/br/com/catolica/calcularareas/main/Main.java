package br.com.catolica.calcularareas.main;

import br.com.catolica.calcularareas.contracts.IAreaCalculavel;
import br.com.catolica.calcularareas.model.Circulo;
import br.com.catolica.calcularareas.model.Quadrado;
import br.com.catolica.calcularareas.model.Retangulo;


public class Main {
    public static void main(String[] args) {

        IAreaCalculavel[] areas = new IAreaCalculavel[5];

        areas[0] = new Circulo(7);
        areas[1] = new Quadrado(4);
        areas[2] = new Retangulo(4, 8);
        areas[3] = new Circulo(9);
        areas[4] = new Quadrado(5);

        for (int i = 0; i < areas.length; i++) {
            System.out.println(areas[i]);
        }
    }
}
