package modelo;

import interfaces.INodo;

public class Nodo implements INodo {
    private int info;
    private INodo siguiente;

    public Nodo(int info) {
        this.info = info;
        this.siguiente = null; // Al principio, no hay siguiente nodo
    }

    @Override
    public int getInfo() {
        return info;
    }

    @Override
    public INodo getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(INodo siguiente) {
        this.siguiente = siguiente;
    }
}