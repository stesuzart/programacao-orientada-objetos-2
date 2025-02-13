package com.ada.aula2;

// Definição de classe genérica
public class ClasseGenerica<T> {
    private T object;

    public T getObject() {return object;}

    public void setObject(T object) {
        this.object = object;
    }
}
