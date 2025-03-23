package test;

import modelo.Jugador;

public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un jugador
		Jugador variable1 = new Jugador(2.3f, "Messi");
		//Violación de el encapsulamiento!!! --- GET SET
		variable1.setNombreDelJugador("Antonela");
		
		System.out.println(variable1 );

	}

}
