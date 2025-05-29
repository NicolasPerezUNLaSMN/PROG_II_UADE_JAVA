package modelo;

import java.util.Arrays;

public class Equipo {

	//__________________ATRIBUTOS____________________________________//
	private String nombreDeEquipo;
	private int posEnEltorneo;
	private String provincia;
	
	//Tiene un capitán
	private Jugador jugadorCapitan;
	
	//Muchos jugadores - Array
	private Jugador[] jugadores;
	//Panorama 1... sabemos cuantos jugadores hay como mucho (3)
	//Panorama 2... No sabemos cuantos jugadores son !!!!

	
	private int cantidadDeJugadores;//Variable calculable!!!
	private int cantidadMaximaDeJugadores;//Calcuble o derivable
	
	//__________________METODOS____________________________________//
	
	
	public Jugador getJugadorCapitan() {
		return jugadorCapitan;
	}

	public void setJugadorCapitan(Jugador jugadorCapitan) {
		this.jugadorCapitan = jugadorCapitan;
	}

	
	
	public Equipo(String nombreDeEquipo, int posEnEltorneo, String provincia, Jugador jugadorCapitan, int cantidadMaximaDeJugadores) {
		super();
		this.nombreDeEquipo = nombreDeEquipo;
		this.posEnEltorneo = posEnEltorneo;
		this.provincia = provincia;
		this.jugadorCapitan = jugadorCapitan;
		this.cantidadDeJugadores = 0; 
		this.cantidadMaximaDeJugadores = cantidadMaximaDeJugadores;
		this.jugadores = new Jugador[cantidadMaximaDeJugadores];
	}

	public Equipo(String nombreDeEquipo, int posEnEltorneo, String provincia, int cantidadMaximaDeJugadores) {
		super();
		this.nombreDeEquipo = nombreDeEquipo;
		this.posEnEltorneo = posEnEltorneo;
		this.provincia = provincia;
		this.cantidadDeJugadores = 0; 
		this.cantidadMaximaDeJugadores = cantidadMaximaDeJugadores;
		this.jugadores = new Jugador[cantidadMaximaDeJugadores];
	}

	public Equipo() {
		super();
		this.cantidadDeJugadores = 0; 
	}

	public String getNombreDeEquipo() {
		return nombreDeEquipo;
	}

	public void setNombreDeEquipo(String nombreDeEquipo) {
		this.nombreDeEquipo = nombreDeEquipo;
	}

	public int getPosEnEltorneo() {
		return posEnEltorneo;
	}

	public void setPosEnEltorneo(int posEnEltorneo) {
		this.posEnEltorneo = posEnEltorneo;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	
	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	/*
	public Equipo(String nombreDeEquipo, int posEnEltorneo, String provincia, Jugador jugadorCapitan,
			Jugador[] jugadores) {
		super();
		this.nombreDeEquipo = nombreDeEquipo;
		this.posEnEltorneo = posEnEltorneo;
		this.provincia = provincia;
		this.jugadorCapitan = jugadorCapitan;
		this.jugadores = jugadores;
	}
	*/

	@Override
	public String toString() {
		return "Equipo [nombreDeEquipo=" + nombreDeEquipo + ", posEnEltorneo=" + posEnEltorneo + ", provincia="
				+ provincia + ", \njugadorCapitan=" + jugadorCapitan + ", \n\njugadores=" + Arrays.toString(jugadores) + "]";
	}

	
	
	public int getCantidadDeJugadores() {
		return cantidadDeJugadores;
	}

	public void agregarJugador(Jugador j) {
		
		///Chequear que el contador no supera a 3 if else
		jugadores[cantidadDeJugadores]= j; 
		cantidadDeJugadores = cantidadDeJugadores + 1; 
		
	}
	
	
	
	
	
	
	
	

}
