package modelo;

import interfaces.ICola;

public class ColaEstatica implements ICola {
    private int[] datos;
    private int frente;
    private int fin;
    private int tamaño;
    private int capacidad;

    public ColaEstatica() {
        capacidad = 10000000; // fijo o configurable
        datos = new int[capacidad];
        frente = 0;
        fin = 0;
        tamaño = 0;
    }

    public void encolar(int valor) {
        if (tamaño == capacidad) throw new RuntimeException("Cola llena");
        datos[fin] = valor;
        fin = (fin + 1) % capacidad;
        tamaño++;
    }

    public int desencolar() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");
        int valor = datos[frente];
        frente = (frente + 1) % capacidad;
        tamaño--;
        return valor;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public int tamaño() {
        return tamaño;
    }
}