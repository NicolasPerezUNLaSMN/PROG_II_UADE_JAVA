package modelo;

import java.util.Arrays;

public class ColaPrioridadEstatico {
	
	///Atributos
	private int primero;
	private int ultimo;
	private int cantidad; 
	
	private int arregloCola[] = new int[5]; ///Array tam FIJO (ESTATICO)
	//Nuevo!!!!!
	private int arregloPrioridades[] = new int[5];
	
	
	public void encolar(int dato, int prioridad) {
		
		//if (cantidad < 5); <---- SUPER IMPORTANTE!
		
			
		
		//if ( cantidad < 5)
		// C: 12   41     22     22  -> 23
		// P: 10    5      2      2  ->  1   <------ 11, 4
		int i  = cantidad -1;  //Pos con la que comparo
		///Como cambiar la cantidad por ultimo!!!!!!!!!!!!
		//AND ---- && ---- OR: || --- NOT: ! ¬
		while (  i>=0 &&    arregloPrioridades[i]<prioridad) {
			
			arregloCola[i+1] = arregloCola[i];
			arregloPrioridades[i+1] = arregloPrioridades[i];
			i = i -1;
			
		}
		arregloCola[i+1] = dato; 
		arregloPrioridades[i+1] = prioridad; 
		cantidad = cantidad +1; //OJO!!!!!!
		ultimo = ultimo + 1; 
		
		
		
		
	}
	
	public int desencolar() {
		//if ( canti > 0)
		int elemento = arregloCola[primero];
		primero++;
		cantidad--;
		
		return elemento; 
	}
	
	
	
	
	public ColaPrioridadEstatico() {
		super();
		this.primero = 0; //No está del todo bien!!!
		this.ultimo = 0;
		this.cantidad = 0;
		//No va lo de abajo
		//this.arregloCola = arregloCola;
		//this.arregloPrioridades = arregloPrioridades;
	}
	
	
	public ColaPrioridadEstatico(int primero, int ultimo, int cantidad, int[] arregloCola, int[] arregloPrioridades) {
		super();
		this.primero = primero;
		this.ultimo = ultimo;
		this.cantidad = cantidad;
		this.arregloCola = arregloCola;
		this.arregloPrioridades = arregloPrioridades;
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int[] getArregloCola() {
		return arregloCola;
	}
	public void setArregloCola(int[] arregloCola) {
		this.arregloCola = arregloCola;
	}
	public int[] getArregloPrioridades() {
		return arregloPrioridades;
	}
	public void setArregloPrioridades(int[] arregloPrioridades) {
		this.arregloPrioridades = arregloPrioridades;
	}
	@Override
	public String toString() {
		return "ColaPrioridadEstatico [primero=" + primero + ", ultimo=" + ultimo + ", cantidad=" + cantidad
				+ ", \n\narregloCola=" + Arrays.toString(arregloCola) + ", \n\narregloPrioridades="
				+ Arrays.toString(arregloPrioridades) + "]\n-------------\n";
	}
	
	
	
	
	
	
	
	

}
