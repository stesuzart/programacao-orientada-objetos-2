package com.ada.aula1.exemplo;

public interface Navegavel {

     default void navegar() {
        System.out.println("Este veículo está navegando na agua...");
    }
}
