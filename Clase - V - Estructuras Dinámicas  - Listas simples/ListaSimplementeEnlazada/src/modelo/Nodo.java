package modelo;

import interfaces.INodo;

public class Nodo implements INodo {
    private int dato;
    private INodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    @Override
    public int getDato() {
        return dato;
    }

    @Override
    public void setDato(int dato) {
        this.dato = dato;
    }

    @Override
    public INodo getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(INodo nodo) {
        this.siguiente = nodo;
    }
}




//iriarte