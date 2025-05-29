package interfaces;

import java.util.Arrays;

import modelo.Jugador;

public interface IEquipo {
	

	public String getNombre() ;
	public void setNombre(String nombre) ;
	public int getRank();
	public void setRank(int rank) ;
	
	
	
	
	
	@Override
	public String toString();
	
	
	
	
	public void setArrayJugadores(Jugador[] arrayJugadores);
	
	///alternativa -  add - append
	public void agregarJugador(Jugador jugadorNuevo) ;
	
	//Cómo harian el método sacarJugador, borrarJugador
	public void borrarJugador(int pos);
	

	

}
