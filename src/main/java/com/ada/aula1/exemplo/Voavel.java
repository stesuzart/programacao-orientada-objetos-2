package com.ada.aula1.exemplo;

public interface Voavel {

    default void voar() {
        System.out.println("Este veículo está voando no céu...");
    }
}
