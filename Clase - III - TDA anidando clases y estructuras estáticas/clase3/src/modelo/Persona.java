package modelo;

import interfaces.IPersona;

public class Persona implements IPersona{
	
	///""Estructura"" ---- 
	private int dni;
	private String nombre;  
	private float altura;
	
	///toString!!!
	@Override
	public String toString() {
		return "-->Persona [dni=" + dni + ", nombre=" + nombre + ", altura=" + altura + "]";
	}

	
	
	
	
	public Persona() {
		super();
	}


	

	public Persona(int dni, String nombre, float altura) {
		super(); ///No lo necesitamos en TDA--- OO :(
		// HERENCIA 
		this.dni = dni;
		this.nombre = nombre;
		this.altura = altura;
	}
	
	
	
	
	
	public Persona(int dni, float altura) {
		super();
		this.dni = dni;
		this.altura = altura;
	}


	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	

}
