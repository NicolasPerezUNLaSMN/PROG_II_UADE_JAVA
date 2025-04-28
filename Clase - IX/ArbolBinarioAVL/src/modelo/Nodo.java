package modelo;

import interfaces.INodo;

public class Nodo implements INodo {
	
    private int dato;
    private INodo izquierdo;
    private INodo derecho;
    private int altura;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
        this.altura = 1; // La altura de un nodo hoja es 1
    }

    // Getters y setters
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public INodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(INodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public INodo getDerecho() {
        return derecho;
    }

    public void setDerecho(INodo derecho) {
        this.derecho = derecho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}