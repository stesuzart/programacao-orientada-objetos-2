package com.ada.exemplo;

public interface Navegavel {

     default void navegar() {
        System.out.println("Este veículo está navegando na agua...");
    }
}
