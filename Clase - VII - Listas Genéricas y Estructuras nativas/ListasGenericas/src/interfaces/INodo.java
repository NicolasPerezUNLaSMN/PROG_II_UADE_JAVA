package interfaces;

public interface INodo<T> {
	
		T getDato();
	    void setDato(T dato);

	    INodo<T> getSiguiente();
	    
	    void setSiguiente(INodo<T> nodo);

	    INodo<T> getAnterior();
	    
	    void setAnterior(INodo<T> nodo);

}
