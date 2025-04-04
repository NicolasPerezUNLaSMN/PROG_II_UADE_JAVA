package modelo;

public class Nodo {
	
	///Atributos del nodo
	private int dato; ///Persona, Vehiculo
	private Nodo siguiente;
	
	public Nodo(int dato, Nodo siguiente) {
		super();
		this.dato = dato;
		this.siguiente = siguiente;
	}
	
	public Nodo(int dato) {
		super();
		this.dato = dato;
		this.siguiente = null;
	}
	
	


	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", siguiente=" + siguiente + "]";
	}

	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
	
	

}
