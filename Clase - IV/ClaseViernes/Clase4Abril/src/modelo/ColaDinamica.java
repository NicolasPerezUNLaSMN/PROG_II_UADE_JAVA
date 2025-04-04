package modelo;

public class ColaDinamica {

	//Atributos
	private Nodo primero;
	private Nodo ultimo; 
	
	private int cantidad; //Opcional!!!
	//Array NO VA MAS :) 
	
	
	public void encolar(int dato) {
		Nodo nuevoNodo = new Nodo(dato);
		//Si la cola existe, es decir no es vacia
		if(primero != null) { //La cola existe!!!
				 ///11, null
				//ultimo.siguiente = nuevoNodo; //Encapsulamiente
				ultimo.setSiguiente(nuevoNodo);
				//setUltimo(nuevoNodo); No estaria mal pasar por el setteo estan las validaciones
			
		}else { //La cola está vacia!!!!
			primero = nuevoNodo;

		}
		ultimo = nuevoNodo;
		cantidad = cantidad +1;
	
	}
	
	public Nodo desencolar() {
		
		//(23) cola --->     22    1     3 ---> null
		if(cantidad>0) {
			//Nodo  elementoDesencolado  = primero; //OBS: 
			Nodo  elementoDesencolado = new Nodo(primero.getDato()); //11, null
			
			primero = primero.getSiguiente();
			cantidad = cantidad -1; 
			//elementoDesencolado.setSiguiente(null); //Importante la ubicación!!!
			
			return elementoDesencolado;
		}else {
			
			System.out.println("Error no hay elementos");
			return null;
			
		}
		
	}
	
	
	

	public Nodo getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	public Nodo getUltimo() {
		return ultimo;
	}

	public void setUltimo(Nodo ultimo) {
		//Validaciones!!!
		this.ultimo = ultimo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ColaDinamica() {
		super();
		this.primero = null;
		this.ultimo = null;
		this.cantidad = 0;
	}

	@Override
	public String toString() {
		return "ColaDinamica [primero=" + primero + ", ultimo=" + ultimo + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
}
