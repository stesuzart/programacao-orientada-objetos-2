package com.ada;

import com.ada.exemplo.Aviao;
import com.ada.exemplo.Barco;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // classe empregado implementando interface
        Empregado joao = new Empregado("Joao", 100, BigDecimal.valueOf(2000d));
        Empregado maria = new Empregado("Maria", 200, BigDecimal.valueOf(2000d));
        Empregado paulo = new Empregado("Paulo", 150, BigDecimal.valueOf(2000d));

        List<Empregado> empregadoList = new ArrayList<>();
        ArrayList<Empregado> empregados1 = new ArrayList<>();

        empregadoList.add(joao);
        empregadoList.add(maria);
        empregadoList.add(paulo);

        System.out.printf(">>>> Antes da ordenação.%n%n");
        for (Empregado empregado : empregadoList) {
            System.out.println(empregado.toString());
        }

        Collections.sort(empregadoList);

        System.out.printf(">>>> Depois da ordenação.%n%n");
        for (Empregado empregado : empregadoList) {
            System.out.println(empregado.toString());
        }

        // intanciando classe extendendo classe abstrata + interface
        Barco barco = new Barco("Titanic");
        barco.exibirInfo();
        barco.mover();
        barco.navegar();

        Aviao aviao = new Aviao("Boing 749");
        aviao.exibirInfo();
        aviao.voar();
    }
}