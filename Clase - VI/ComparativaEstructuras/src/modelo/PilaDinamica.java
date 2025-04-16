package modelo;

import interfaces.IPila;

public class PilaDinamica implements IPila {
    private static class Nodo {
        int valor;
        Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
        }
    }

    private Nodo tope;
    private int tamaño;

    public PilaDinamica() {
        tope = null;
        tamaño = 0;
    }

    public void apilar(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamaño++;
    }

    public int desapilar() {
        if (estaVacia()) throw new RuntimeException("Pila vacía");
        int valor = tope.valor;
        tope = tope.siguiente;
        tamaño--;
        return valor;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int tamaño() {
        return tamaño;
    }
}