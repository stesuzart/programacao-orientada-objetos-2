package com.ada.aula1.exemplo;

public class Barco extends Veiculo implements Navegavel{

    public Barco(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está se movendo na água!");
    }

    @Override
    public void navegar() {
        System.out.println(nome + " está navegando na água!");
    }
}
