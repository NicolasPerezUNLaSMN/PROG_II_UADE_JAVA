package modelo;

import interfaces.IColaDinamica;

public class ColaDinamica implements IColaDinamica {
	
	//Cola: una colección de nodos... primer nodo,
	//y cual es el ultimo nodo
	//Crear un nodo
	private Nodo primero; //1   3     4    55    12
	private Nodo ultimo;
	private int cantidad; //optativa!!!!
	//No necesito el array!!!
	
	@Override
	public String toString() {
		return "ColaDinamica [primero=" + primero + ", ultimo=" + ultimo + ", cantidad=" + cantidad + "]";
	}
	
	public ColaDinamica() {
		super();
		this.primero = null;
		this.ultimo = null;
		this.cantidad = 0;
	}
	
	//Encolar
	public void encolar(int dato) {
		
		Nodo nuevoNodo = new Nodo(dato); //dato, null	
		//ultimo = nuevoNodo;
		// 1   3   4 ------>  (8)
		if ( ultimo!=null) {//si la cola no está vacia
			ultimo.setSiguiente(nuevoNodo);
			}else {	
				primero = nuevoNodo;	
			}
		ultimo = nuevoNodo;
		cantidad++;
	}
	
	
	//Desencolar
	
	public Nodo desencolar() {
		
		Nodo retorno = new Nodo (primero.getDato()); //dato, null
		
		primero = primero.getSiguiente();
		
		return retorno;
	}
	
	
	
}
