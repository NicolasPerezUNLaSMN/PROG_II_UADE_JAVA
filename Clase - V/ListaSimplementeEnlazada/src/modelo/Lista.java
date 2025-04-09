package modelo;

import interfaces.ILista;
import interfaces.INodo;

public class Lista implements ILista {
    private INodo primero;

    public Lista() {
        this.primero = null;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    @Override
    public void insertarPrimero(int dato) {
        INodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(primero);
        primero = nuevo;
    }

    @Override
    public void insertarUltimo(int dato) {
        INodo nuevo = new Nodo(dato);
        if (esVacia()) {
            primero = nuevo;
        } else {
            INodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    @Override
    public void insertarPosicion(int dato, int posicion) {
        if (posicion == 0) {
            insertarPrimero(dato);
            return;
        }

        INodo nuevo = new Nodo(dato);
        INodo actual = primero;
        int contador = 0;

        while (actual != null && contador < posicion - 1) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (actual == null) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }

        nuevo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevo);
    }

    @Override
    public void eliminarPrimero() {
        if (!esVacia()) {
            primero = primero.getSiguiente();
        }
    }

    @Override
    public void eliminarUltimo() {
        if (esVacia()) return;

        if (primero.getSiguiente() == null) {
            primero = null;
            return;
        }

        INodo actual = primero;
        while (actual.getSiguiente().getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(null);
    }

    @Override
    public void eliminarPosicion(int posicion) {
        if (esVacia()) return;

        if (posicion == 0) {
            eliminarPrimero();
            return;
        }

        INodo actual = primero;
        int contador = 0;

        while (actual.getSiguiente() != null && contador < posicion - 1) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (actual.getSiguiente() == null) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }

        actual.setSiguiente(actual.getSiguiente().getSiguiente());
    }

    @Override
    public int obtenerPrimero() {
        if (esVacia()) throw new IllegalStateException("Lista vacía");
        return primero.getDato();
    }

    @Override
    public int obtenerUltimo() {
        if (esVacia()) throw new IllegalStateException("Lista vacía");

        INodo actual = primero;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    @Override
    public int obtenerPosicion(int posicion) {
        INodo actual = primero;
        int contador = 0;

        while (actual != null && contador < posicion) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (actual == null) throw new IndexOutOfBoundsException("Posición fuera de rango");

        return actual.getDato();
    }

    @Override
    public int cantidadElementos() {
        int contador = 0;
        INodo actual = primero;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }

        return contador;
    }

    @Override
    public int buscarSecuencial(int dato) {
        INodo actual = primero;
        int posicion = 0;

        while (actual != null) {
            if (actual.getDato() == dato) {
                return posicion;
            }
            actual = actual.getSiguiente();
            posicion++;
        }

        return -1; // no encontrado
    }

    @Override
    public void ordenarLista() {
        if (esVacia() || primero.getSiguiente() == null) return;

        boolean cambiado;
        do {
            cambiado = false;
            INodo actual = primero;
            while (actual.getSiguiente() != null) {
                if (actual.getDato() > actual.getSiguiente().getDato()) {
                    int temp = actual.getDato();
                    actual.setDato(actual.getSiguiente().getDato());
                    actual.getSiguiente().setDato(temp);
                    cambiado = true;
                }
                actual = actual.getSiguiente();
            }
        } while (cambiado);
    }

    @Override
    public void mostrarLista() {
        INodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }
}