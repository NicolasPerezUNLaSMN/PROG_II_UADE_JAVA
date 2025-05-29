package modelo;

import java.util.Arrays;

public class Equipo {
	
	private String nombre;
	private int rank;
	
	//Equipo tenga muchos muchos jugadores!!!
	//Array arreglo de jugadores!!!!
	//int [] vector = new int[5] -----
	//Obligando a que todos los equipos tengan 3 jugadores
	private Jugador[]  arrayJugadores = new Jugador[3]; //Clases anidadas!!
	
	//Nuevo atributo---
	private int posDeCompra;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", rank=" + rank + ", \narrayJugadores=" + Arrays.toString(arrayJugadores)
				+ "]";
	}
	public Equipo(String nombre, int rank) {
		super();
		this.nombre = nombre;
		this.rank = rank;
		this.posDeCompra = 0 ; 
	}
	
	//Mejor!!!!!
	public Equipo(String nombre, int rank, int tam) {
		super();
		this.nombre = nombre;
		this.rank = rank;
		this.arrayJugadores = new Jugador[tam];
		this.posDeCompra = 0 ;
	}
	
	public Equipo() {
		super();
		this.posDeCompra = 0 ;
	
	}
	public Jugador[] getArrayJugadores() {
		return arrayJugadores;
	}
	
	public void setArrayJugadores(Jugador[] arrayJugadores) {
		this.arrayJugadores = arrayJugadores;
	}
	
	///alternativa -  add - append
	public void agregarJugador(Jugador jugadorNuevo) {
		
		//this.arrayJugadores.length //da el tamaño
		if( posDeCompra < 3) {
			this.arrayJugadores[posDeCompra] = jugadorNuevo;
			posDeCompra = posDeCompra + 1;
		}
		
	}
	
	//Cómo harian el método sacarJugador, borrarJugador
	public void borrarJugador(int pos) {
		this.arrayJugadores[pos] = new Jugador();
		//Borar al 2 --- posCompra = 3; 
		//1: PePE ---- 2: Vacio  ---- 3: NIco --- Vacia
		//posCompra ---> busqueda de pos vacias
	}
	
	
	
	

}
