package modelo;

import interfaces.INodo;

public class Nodo implements INodo {
	
	///Atributos
	private int dato; //info 
	private INodo siguiente;
	
	
	

	public Nodo(int dato, INodo siguiente) {
		super();
		this.dato = dato;
		this.siguiente = siguiente;
	}
	
	public Nodo(int dato) {
		super();
		this.dato = dato;
		this.siguiente = null;
	}
	
	
	//Getters y setters
	@Override
	public int getDato() {
		return dato;
	}
	@Override
	public void setDato(int dato) {
		this.dato = dato;
	}
	
	@Override
	public INodo  getSiguiente() {
		return siguiente;
	}
	@Override
	public void setSiguiente(INodo  siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", siguiente=" + siguiente + "]";
	}
	
	

	
}
