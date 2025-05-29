package modelo;

public class Nodo {
	
	private int dato;
	//Nuevo
	private Nodo siguiente;
	
	
	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", siguiente=" + siguiente + "]";
	}
	
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
