package test;

import modelo.Equipo;
import modelo.Jugador;

public class TestEquipoConJugadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador j1 = new Jugador(0.2f, "Romero");//Capitan
		
		Jugador j2 = new Jugador(1.1f, "Carrizo");
		Jugador j3= new Jugador(2.3f, "Gomez");
		
		Equipo e1 = new Equipo("Velez", 14, "CABA", j1,25 );
	
		e1.agregarJugador(j2);
		e1.agregarJugador(j3);
		
		System.out.println(e1);
		
		Equipo e2 = new Equipo("Porvenir", 22, "Gerli", j1,3 );
		System.out.println(e2);

	}

}
