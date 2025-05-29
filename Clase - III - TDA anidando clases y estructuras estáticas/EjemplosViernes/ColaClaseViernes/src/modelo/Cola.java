package modelo;

import java.util.Arrays;

public class Cola {
	
	private int primero; 
	private int ultimo; 
	//Opcional
	private int cantidad; 
	
	//cantidad la dejo FIJA por ahora!!!
	//Estructuras Estaticas!!!!
	private int[] colaDatos = new int[10];

	

	

	@Override
	public String toString() {
		return "Cola [primero=" + primero + ", ultimo=" + ultimo + ", cantidad=" + cantidad + "]";
	}

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

	/* No se usa!!!!!
	public Cola(int primero, int ultimo, int[] colaDatos) {
		super();
		this.primero = primero;
		this.ultimo = ultimo;
		this.colaDatos = colaDatos;
	}
	*/

	public Cola() {
		super();
		this.ultimo = 0;
		this.primero = 0; //Observaciones!!!!
		this.cantidad = 0 ; 
		
	}
	
	public void encolar(int n){
		
		//prodrian agregar la validación de cantidad< 10
		colaDatos[ultimo] = n;
		ultimo = ultimo + 1; 
		cantidad = cantidad + 1;
		
		
	}
	
	//Método desencolar
	public int desencolar() {
		
		primero = primero +1; 
		cantidad = cantidad -1;
		
		return colaDatos[primero-1];
		
	}
	
	//Buscar el maximo de la cola!!!
	/*
	public int maximoDeLaCola() {
		int maximo = colaDatos[0];
		for ( int i= 0; i<10; i++) {
			
			if ( colaDatos[i]> maximo) {
				
				maximo = colaDatos[i];	 
			}
		}
		return maximo; 
	}
	*/
	
	

}
