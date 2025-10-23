package modelo;

import interfaces.INodo;

public class Nodo implements INodo {
	
    private int dato; //Persona ---> T ----> Objets
    
    private INodo izquierdo;
    private INodo derecho;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
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
    public INodo getIzquierdo() {
        return izquierdo;
    }

    @Override
    public void setIzquierdo(INodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    @Override
    public INodo getDerecho() {
        return derecho;
    }

    @Override
    public void setDerecho(INodo derecho) {
        this.derecho = derecho;
    }
}