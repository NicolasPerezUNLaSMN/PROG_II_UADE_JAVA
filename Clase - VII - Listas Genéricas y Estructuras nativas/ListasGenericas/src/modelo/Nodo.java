package modelo;

import interfaces.INodo;

public class Nodo<T> implements INodo<T>  {
	
		private T dato;
		
	    private INodo<T> siguiente;
	    
	    private INodo<T> anterior;

	    public Nodo(T dato) {
	        this.dato = dato;
	        this.siguiente = null;
	        this.anterior = null;
	    }

	    @Override
	    public T getDato() {
	        return dato;
	    }

	    @Override
	    public void setDato(T dato) {
	        this.dato = dato;
	    }

	    @Override
	    public INodo<T> getSiguiente() {
	        return siguiente;
	    }

	    @Override
	    public void setSiguiente(INodo<T> nodo) {
	        this.siguiente = nodo;
	    }

	    @Override
	    public INodo<T> getAnterior() {
	        return anterior;
	    }

	    @Override
	    public void setAnterior(INodo<T> nodo) {
	        this.anterior = nodo;
	    }
	    
	    

}
