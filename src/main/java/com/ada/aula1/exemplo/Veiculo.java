package com.ada.aula1.exemplo;

abstract class Veiculo {
    String nome;

    Veiculo(String nome) {this.nome = nome;}

    abstract void mover();

    public void exibirInfo(){System.out.println("Veículos: " + nome);}
}
