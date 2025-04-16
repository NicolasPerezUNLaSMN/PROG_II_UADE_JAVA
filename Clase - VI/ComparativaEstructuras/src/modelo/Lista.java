package modelo;

import interfaces.ILista;

public class Lista implements ILista {
	
	//---HAGO EL NODO acá para simplificar, 
	//recordemos que no se hace acá, separarlo!!!
    private static class Nodo {
       private  int valor;
       private  Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }
    
    
    private Nodo cabeza;//Primero de la lista
    private Nodo cola; // Nuevo
    private int tamaño;

    public Lista() {
        cabeza = null;
        cola = null;
        tamaño = 0;
    }

    public void insertarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        if (cola == null) {
            cola = nuevo;
        }
        tamaño++;
    }

    public void insertarFin(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
        }
        tamaño++;
    }

    public boolean eliminar(int valor) {
        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null) {
            if (actual.valor == valor) {
                if (anterior == null) {
                    cabeza = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                if (actual == cola) {
                    cola = anterior;
                }
                tamaño--;
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return false;
    }

    public boolean contiene(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.valor == valor) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    public int obtener(int indice) {
        if (indice < 0 || indice >= tamaño) throw new IndexOutOfBoundsException();
        Nodo actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual.valor;
    }

    public int tamaño() {
        return tamaño;
    }

    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}