package modelo;

import interfaces.ILista;
import interfaces.INodo;

public class Lista<T>  implements ILista<T> {
	
	///Para practicar tambien podrían hacer la lista
	///Con un puntero al ultimo nodo
	 private INodo<T> primero;

	    public Lista() {
	        this.primero = null;
	    }

	    @Override
	    public void insertar(INodo<T> nodo) {
	        if (esVacia()) {
	            primero = nodo;
	        } else {
	            INodo<T> actual = primero;
	            while (actual.getSiguiente() != null) {
	                actual = actual.getSiguiente();
	            }
	            actual.setSiguiente(nodo);
	            nodo.setAnterior(actual);
	        }
	    }

	    @Override
	    public boolean eliminar(T dato) {
	        if (esVacia()) {
	            return false;
	        }

	        INodo<T> actual = primero;
	        while (actual != null) {
	            if (actual.getDato().equals(dato)) {
	                if (actual.getAnterior() != null) {
	                    actual.getAnterior().setSiguiente(actual.getSiguiente());
	                } else {
	                    primero = actual.getSiguiente();
	                }
	                if (actual.getSiguiente() != null) {
	                    actual.getSiguiente().setAnterior(actual.getAnterior());
	                }
	                return true;
	            }
	            actual = actual.getSiguiente();
	        }
	        return false;
	    }

	    @Override
	    public INodo<T> buscar(T dato) {
	        INodo<T> actual = primero;
	        while (actual != null) {
	            if (actual.getDato().equals(dato)) {
	                return actual;
	            }
	            actual = actual.getSiguiente();
	        }
	        return null;
	    }

	    @Override
	    public void imprimir() {
	        INodo<T> actual = primero;
	        while (actual != null) {
	            System.out.print(actual.getDato() + " <-> ");
	            actual = actual.getSiguiente();
	        }
	        System.out.println("null");
	    }

	    @Override
	    public boolean esVacia() {
	        return primero == null;
	    }

	    @Override
	    public int tamanio() {
	        int contador = 0;
	        INodo<T> actual = primero;
	        while (actual != null) {
	            contador++;
	            actual = actual.getSiguiente();
	        }
	        return contador;
	    }

}
