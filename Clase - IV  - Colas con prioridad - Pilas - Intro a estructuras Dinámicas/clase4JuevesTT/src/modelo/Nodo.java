package modelo;

public class Nodo {
	
	//Nodo Lista Simplemente enlazada
	private int dato; ///Persona, Estudiante Vehiculo
	private Nodo siguiente;
	
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
	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", siguiente=" + siguiente + "]";
	}
	
	public Nodo(int dato, Nodo siguiente) {
		
		this.dato = dato;
		this.siguiente = siguiente;
	}
	
	//Ultimo por eso el siguiente en null
	public Nodo(int dato) {
		
		this.dato = dato;
		this.siguiente = null;
	}
	
	
	
	
}
