package modelo;

import interfaces.ICola;
import interfaces.INodo;

public class Cola implements ICola {
    private INodo frente;
    private INodo fin;

    @Override
    public void InicializarCola() {
        frente = null;
        fin = null;
    }

    @Override
    public void Encolar(int elemento) {
        INodo nuevoNodo = new Nodo(elemento);
        if (fin != null) {
            fin.setSiguiente(nuevoNodo);
        } else {
            frente = nuevoNodo; // Si la cola está vacía, el nuevo nodo es el primero
        }
        fin = nuevoNodo; // El nuevo nodo es ahora el último
    }

    @Override
    public int Desencolar() {
        if (ColaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = frente.getInfo();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null; // Si la cola queda vacía, el final también es null
        }
        return valor;
    }

    @Override
    public boolean ColaVacia() {
        return frente == null;
    }
}