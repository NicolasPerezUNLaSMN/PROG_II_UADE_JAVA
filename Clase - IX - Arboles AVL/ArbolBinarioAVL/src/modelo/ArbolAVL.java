package modelo;

import interfaces.IArbolAVL;
import interfaces.INodo;

public class ArbolAVL implements IArbolAVL {
	
    private INodo raiz;

    public ArbolAVL() {
        this.raiz = null;
    }

    @Override
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private INodo insertarRecursivo(INodo nodo, int dato) {
        // Paso 1: Realizar la inserción normal (como en un árbol binario de búsqueda)
        if (nodo == null) {
            return new Nodo(dato);
        }

        if (dato < nodo.getDato()) {
            nodo.setIzquierdo(insertarRecursivo(nodo.getIzquierdo(), dato));
        } else if (dato > nodo.getDato()) {
            nodo.setDerecho(insertarRecursivo(nodo.getDerecho(), dato));
        } else {
            return nodo; // No se permiten duplicados
        }

        // Paso 2: Actualizar la altura del nodo actual
        nodo.setAltura(1 + Math.max(getAltura(nodo.getIzquierdo()), getAltura(nodo.getDerecho())));

        // Paso 3: Obtener el balance (factor de equilibrio)
        int balance = getBalance(nodo);

        // Paso 4: Balancear el árbol si es necesario (4 casos)
        // Rotación izquierda
        if (balance > 1 && dato < ((Nodo) nodo.getIzquierdo()).getDato()) {
            return rotacionDerecha(nodo);
        }

        // Rotación derecha
        if (balance < -1 && dato > ((Nodo) nodo.getDerecho()).getDato()) {
            return rotacionIzquierda(nodo);
        }

        // Rotación doble izquierda-derecha
        if (balance > 1 && dato > ((Nodo) nodo.getIzquierdo()).getDerecho().getDato()) {
            nodo.setIzquierdo(rotacionIzquierda(nodo.getIzquierdo()));
            return rotacionDerecha(nodo);
        }

        // Rotación doble derecha-izquierda
        if (balance < -1 && dato < ((Nodo) nodo.getDerecho()).getIzquierdo().getDato()) {
            nodo.setDerecho(rotacionDerecha(nodo.getDerecho()));
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }

    private int getAltura(INodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.getAltura();
    }

    private int getBalance(INodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return getAltura(nodo.getIzquierdo()) - getAltura(nodo.getDerecho());
    }

    private INodo rotacionIzquierda(INodo y) {
        INodo x = y.getDerecho();
        INodo T2 = x.getIzquierdo();

        // Rotar
        x.setIzquierdo(y);
        y.setDerecho(T2);

        // Actualizar alturas
        y.setAltura(Math.max(getAltura(y.getIzquierdo()), getAltura(y.getDerecho())) + 1);
        x.setAltura(Math.max(getAltura(x.getIzquierdo()), getAltura(x.getDerecho())) + 1);

        return x;
    }

    private INodo rotacionDerecha(INodo x) {
        INodo y = x.getIzquierdo();
        INodo T2 = y.getDerecho();

        // Rotar
        y.setDerecho(x);
        x.setIzquierdo(T2);

        // Actualizar alturas
        x.setAltura(Math.max(getAltura(x.getIzquierdo()), getAltura(x.getDerecho())) + 1);
        y.setAltura(Math.max(getAltura(y.getIzquierdo()), getAltura(y.getDerecho())) + 1);

        return y;
    }

    @Override
    public INodo buscar(int dato) {
        return buscarRecursivo(raiz, dato);
    }

    private INodo buscarRecursivo(INodo nodo, int dato) {
        if (nodo == null || nodo.getDato() == dato) {
            return nodo;
        }
        if (dato < nodo.getDato()) {
            return buscarRecursivo(nodo.getIzquierdo(), dato);
        } else {
            return buscarRecursivo(nodo.getDerecho(), dato);
        }
    }

    @Override
    public void recorridoInorden() {
        recorridoInordenRecursivo(raiz);
    }

    private void recorridoInordenRecursivo(INodo nodo) {
        if (nodo != null) {
            recorridoInordenRecursivo(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            recorridoInordenRecursivo(nodo.getDerecho());
        }
    }

    @Override
    public void recorridoPreorden() {
        recorridoPreordenRecursivo(raiz);
    }

    private void recorridoPreordenRecursivo(INodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            recorridoPreordenRecursivo(nodo.getIzquierdo());
            recorridoPreordenRecursivo(nodo.getDerecho());
        }
    }

    @Override
    public void recorridoPostorden() {
        recorridoPostordenRecursivo(raiz);
    }

    private void recorridoPostordenRecursivo(INodo nodo) {
        if (nodo != null) {
            recorridoPostordenRecursivo(nodo.getIzquierdo());
            recorridoPostordenRecursivo(nodo.getDerecho());
            System.out.print(nodo.getDato() + " ");
        }
    }
}