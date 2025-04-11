package interfaces;

import modelo.Nodo;

public interface INodo {

	
	//Getters y setters
	public int getDato() ;
	public void setDato(int dato);
	public INodo  getSiguiente() ;
	public void setSiguiente(INodo  siguiente) ;
	public String toString() ;
	
	
}
