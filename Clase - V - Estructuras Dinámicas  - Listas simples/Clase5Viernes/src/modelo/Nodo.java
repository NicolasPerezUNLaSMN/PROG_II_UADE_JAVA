package modelo;

import interfaces.INodo;

public class Nodo implements INodo{
	
	/// 12    11
	private int dato;  ///lista vehiculos  private Vehiculo dato;
	private INodo siguiente;
	//private INodo anterior;
	
	
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public  INodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente( INodo siguiente) {
		this.siguiente = siguiente;
	}
	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", siguiente=" + siguiente + "]";
	}
	
	//priv retorno nombreMetodo(arg)
	//El constructor no es un método!!!
	///Constructor = reserva la memoria
	public Nodo(int dato) {
		super();
		this.dato = dato;
		this.siguiente = null;
	}
	
	///Destructores!!!!! No se hace lo resuelve JAVA
	
	

}
