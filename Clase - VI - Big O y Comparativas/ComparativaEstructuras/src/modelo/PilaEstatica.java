package modelo;

import interfaces.IPila;

public class PilaEstatica implements IPila {
    private int[] datos;
    private int tope;

    public PilaEstatica() {
        datos = new int[1000000]; // capacidad fija
        tope = -1;
    }

    public void apilar(int valor) {
        if (tope + 1 >= datos.length) throw new RuntimeException("Pila llena");
        datos[++tope] = valor;
    }

    public int desapilar() {
        if (estaVacia()) throw new RuntimeException("Pila vacía");
        return datos[tope--];
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public int tamaño() {
        return tope + 1;
    }
}