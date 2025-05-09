package modelo;

import java.util.Stack;

import interfaces.IArbol;
import interfaces.INodo;

public class Arbol implements IArbol {
    private INodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    @Override
    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    private INodo insertarRec(INodo nodo, int dato) {
        if (nodo == null) {
            return new Nodo(dato);
        }
        if (dato < nodo.getDato()) {
            nodo.setIzquierdo(insertarRec(nodo.getIzquierdo(), dato));
        } else if (dato > nodo.getDato()) {
            nodo.setDerecho(insertarRec(nodo.getDerecho(), dato));
        }
        return nodo;
    }

    @Override
    public INodo buscar(int dato) {
        return buscarRec(raiz, dato);
    }

    private INodo buscarRec(INodo nodo, int dato) {
        if (nodo == null || nodo.getDato() == dato) {
            return nodo;
        }
        if (dato < nodo.getDato()) {
            return buscarRec(nodo.getIzquierdo(), dato);
        } else {
            return buscarRec(nodo.getDerecho(), dato);
        }
    }

    @Override
    public void recorridoInorden() {
        inordenRec(raiz);
    }

    private void inordenRec(INodo nodo) {
        if (nodo != null) {
            inordenRec(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            inordenRec(nodo.getDerecho());
        }
    }

    @Override
    public void recorridoPreorden() {
        preordenRec(raiz);
    }

    private void preordenRec(INodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            preordenRec(nodo.getIzquierdo());
            preordenRec(nodo.getDerecho());
        }
    }

    @Override
    public void recorridoPostorden() {
        postordenRec(raiz);
    }

    private void postordenRec(INodo nodo) {
        if (nodo != null) {
            postordenRec(nodo.getIzquierdo());
            postordenRec(nodo.getDerecho());
            System.out.print(nodo.getDato() + " ");
        }
    }

    @Override
    public void recorridoInordenSinRecursion() {
        Stack<INodo> pila = new Stack<>();
        INodo actual = raiz;

        while (actual != null || !pila.isEmpty()) {
            while (actual != null) {
                pila.push(actual);
                actual = actual.getIzquierdo();
            }
            actual = pila.pop();
            System.out.print(actual.getDato() + " ");
            actual = actual.getDerecho();
        }
    }
    
    
   
    public void insertarIterativo(int dato) {
        if (raiz == null) {
            raiz = new Nodo(dato);
            return;
        }
        INodo actual = raiz;
        INodo padre = null;

        while (actual != null) {
            padre = actual;
            if (dato < actual.getDato()) {
                actual = actual.getIzquierdo();
            } else if (dato > actual.getDato()) {
                actual = actual.getDerecho();
            } else {
                // El dato ya existe, no se inserta duplicado
                return;
            }
        }
        // Ya tenemos el nodo padre al que se le debe colgar el nuevo nodo
        if (dato < padre.getDato()) {
            padre.setIzquierdo(new Nodo(dato));
        } else {
            padre.setDerecho(new Nodo(dato));
        }
    }
    
    
   
    public void eliminar(int dato) {
        raiz = eliminarRec(raiz, dato);
    }

    private INodo eliminarRec(INodo nodo, int dato) {
        if (nodo == null) return null;

        if (dato < nodo.getDato()) {
            nodo.setIzquierdo(eliminarRec(nodo.getIzquierdo(), dato));
        } else if (dato > nodo.getDato()) {
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), dato));
        } else {
            // Caso 1: nodo sin hijos
            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
                return null;
            }
            // Caso 2: un solo hijo
            if (nodo.getIzquierdo() == null) {
                return nodo.getDerecho();
            }
            if (nodo.getDerecho() == null) {
                return nodo.getIzquierdo();
            }

            // Caso 3: dos hijos
            INodo sucesor = encontrarMinimo(nodo.getDerecho());
            nodo.setDato(sucesor.getDato());
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), sucesor.getDato()));
        }
        return nodo;
    }

    private INodo encontrarMinimo(INodo nodo) {
        while (nodo.getIzquierdo() != null) {
            nodo = nodo.getIzquierdo();
        }
        return nodo;
    }
    
    
    
    
}