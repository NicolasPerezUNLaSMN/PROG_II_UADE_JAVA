package modelo;

import interfaces.ICola;

public class ColaDinamica implements ICola {
    private static class Nodo {
        int valor;
        Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
        }
    }

    private Nodo frente;
    private Nodo fin;
    private int tamaño;

    public ColaDinamica() {
        frente = fin = null;
        tamaño = 0;
    }

    public void encolar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        tamaño++;
    }

    public int desencolar() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");
        int valor = frente.valor;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        tamaño--;
        return valor;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public int tamaño() {
        return tamaño;
    }
}
