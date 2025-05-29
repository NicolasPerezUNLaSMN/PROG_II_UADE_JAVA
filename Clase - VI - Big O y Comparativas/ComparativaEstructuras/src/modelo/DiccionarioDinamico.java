package modelo;

import interfaces.IDiccionario;

public class DiccionarioDinamico implements IDiccionario {
    private static class Nodo {
        int clave;
        int valor;
        Nodo siguiente;

        Nodo(int clave, int valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }

    private Nodo cabeza;
    private int tamaño;

    public DiccionarioDinamico() {
        cabeza = null;
        tamaño = 0;
    }

    public void insertar(int clave, int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.clave == clave) {
                actual.valor = valor; // reemplazar si ya existe
                return;
            }
            actual = actual.siguiente;
        }
        Nodo nuevo = new Nodo(clave, valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        tamaño++;
    }

    public int obtener(int clave) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.clave == clave) return actual.valor;
            actual = actual.siguiente;
        }
        throw new RuntimeException("Clave no encontrada");
    }

    public boolean contiene(int clave) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.clave == clave) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    public void eliminar(int clave) {
        Nodo actual = cabeza, anterior = null;
        while (actual != null) {
            if (actual.clave == clave) {
                if (anterior == null) cabeza = actual.siguiente;
                else anterior.siguiente = actual.siguiente;
                tamaño--;
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        throw new RuntimeException("Clave no encontrada");
    }

    public int tamaño() {
        return tamaño;
    }
}
