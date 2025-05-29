package modelo;

public class Cola {
	
	//Atributos
	private int primero; 
	private int ultimo;  //La pos donde yo voy a agregar
	private int [] colaDatos = new int[100];//Estatica!!!
	
	//Atributos!!! 
	private int cantidad;
	public int getPrimero() {
		return primero;
	}
	public void setPrimero(int primero) {
		this.primero = primero;
	}
	public int getUltimo() {
		return ultimo;
	}
	public void setUltimo(int ultimo) {
		this.ultimo = ultimo;
	}
	public int[] getColaDatos() {
		return colaDatos;
	}
	public void setColaDatos(int[] colaDatos) {
		this.colaDatos = colaDatos;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	//No lo usaremos
	public Cola(int primero, int ultimo, int[] colaDatos, int cantidad) {
		super();
		this.primero = primero;
		this.ultimo = ultimo;
		this.colaDatos = colaDatos;
		this.cantidad = cantidad;
	}
	
	public Cola() {
		super();
		this.cantidad = 0; 
		this.primero = 0 ;  //Cuidado!!!
		this.ultimo = 0;  
		
	}
	@Override
	public String toString() {
		return "Cola [primero=" + primero + ", ultimo=" + ultimo + ", cantidad=" + cantidad + "]";
	}
	
	//Métodos!!!!
	public void encolar(int numero) {
		
		//Ultimo a tope... 100
		//ultimo = (  (ultimo +1) % 100 -1 ) //cola circular
		
		this.colaDatos[ultimo] = numero;
		ultimo = ultimo + 1; 
		cantidad = cantidad +1; 
		//primero = 0; Primero fijo cuando agrego elementos!!! 
		
	}
	
	//Desencolar retorna elementos de la cola..
	public int desencolar() {
		
		cantidad = cantidad - 1; 
		int primeroAntesDeSacar = primero;
		primero = primero + 1; 
		
		return colaDatos[primeroAntesDeSacar];
		
	}
	
	//Utiles y alternativos
	//boolean estaVacia() //true o false... 
	//estaNulo()
	//estaLleno()
	
	///Definición de COLA... NO EXISTE EL RECORRER
	///No se DEBE HACER ESTO!!!
	public void mostrarCola() {
		
		for ( int i = 0; i< ultimo-1;i++) {
			
			System.out.println(colaDatos[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
