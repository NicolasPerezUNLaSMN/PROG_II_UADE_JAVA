package modelo;

import interfaces.IJugador;

public class Jugador implements IJugador {
	
	///Atributos de la clase
	private float promedioDeGol;
	private String nombreDelJugador;
	
	//Constructor Personallizado
	public Jugador(float promedioDeGol, String nombreDelJugador) {
		super();
		this.promedioDeGol = promedioDeGol;
		this.nombreDelJugador = nombreDelJugador;
	}
	
	//Constructor Personallizado
	public Jugador( String nombreDelJugador) {
			super();
			this.promedioDeGol = 0;
			this.nombreDelJugador = nombreDelJugador;
		}

	public Jugador() {
		super();
	}

	@Override
	public float getPromedioDeGol() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPromedioDeGol(float promedioDeGol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNombreDelJugador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNombreDelJugador(String nombreDelJugador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Jugador [promedioDeGol=" + promedioDeGol + ", nombreDelJugador=" + nombreDelJugador + "]";
	}

	
	
	
	
	
	
	

	
}
