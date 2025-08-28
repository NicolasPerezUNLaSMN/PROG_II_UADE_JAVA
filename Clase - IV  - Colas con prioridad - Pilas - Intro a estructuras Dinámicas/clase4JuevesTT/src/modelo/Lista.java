package modelo;

public class Lista {
	
	private Nodo primero;
	
	
	public Lista() {
		
		this.primero = null;
	}

	public Nodo getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	@Override
	public String toString() {
		return "Lista [primero=" + primero + "]";
	}
	
	//Metodo insertarPrimero    ---> 5
	public void insertarPrimero(int datoNuevo) {
		///Lista:  3 ->   11 -> 12 ->   43
		Nodo nuevoNodo = new Nodo(datoNuevo,primero);
		// ---- (5, -->3) Apunta al que ANTES
		//Era el primero nuevoNodo.setProximo(primero)
		primero = nuevoNodo;
		//Lista = 5  --> 3
		
	};
	
	//------------------------> 5
	public void insertarUltimo(int dato){
		// 1    3    11  --> null    (5)
		//i = 0...... i=2 
		//-----------CAMBIAR----- 
		Nodo nuevoNodo = new Nodo(dato);
		//(5, null) 
		Nodo aux = primero;
		while(aux.getSiguiente() != null) {
			aux = aux.getSiguiente();
		}
		//aux --- 11 -> null
		aux.setSiguiente(nuevoNodo);

	}
	
	

}
