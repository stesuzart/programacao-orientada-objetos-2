package com.ada.aula2;

import java.util.HashMap;

public class Aula2Main {
    public static void main(String[] args) {

        //clase generica
        ClasseGenerica<String> classe = new ClasseGenerica<>();
        classe.setObject("Olá, Generics!");
        System.out.println(classe.getObject());

        ClasseGenerica<Integer> classe2 = new ClasseGenerica<>();
        classe2.setObject(123);
        System.out.println(classe2.getObject());

        System.out.println();

        // metodo generico
        MetodoGenerico.imprimir("Olá, Metodo generico!");
        MetodoGenerico.imprimir(100);
        MetodoGenerico.imprimir(3.00);

        System.out.println();

        // gerenics key value

        Pair<Integer, String> pair = new Pair<>(1,"Marcos");
        System.out.printf("Id: %d - nome: %s", pair.getKey(), pair.getValue());

    }
}
