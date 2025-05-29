package test;

import modelo.Equipo;
import modelo.Jugador;

public class TestEquipo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lista.append(j1)
		
		Jugador j1 = new Jugador("Pepe", 11, 1.87f);
		Jugador j2 = new Jugador("Ronaldo", 3, 1.67f);
		
		Equipo e1 = new Equipo("Boca", 2);
		//Equipo e2 = new Equipo("River", 7, 50);//50 elementos
		e1.agregarJugador(j1);
		e1.agregarJugador(j2);
		
		
	
		
		System.out.println(e1);
		
	}

}
