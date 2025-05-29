package modelo;

import interfaces.IEstudiante;

public class Estudiante implements IEstudiante{
	
	///Estructura de la clase - Atributos
	private String nombre; 
	private int legajo; 
	private float promedio;
	
	///Comportamiento - Métodos (Funciones y procedimientos)
	public Estudiante(String nombre, int legajo, float promedio) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.promedio = promedio;
	}

	public Estudiante(String nombre, int legajo) {
		super(); 
		this.nombre = nombre;
		this.legajo = legajo;
	
	}

	///Getters y setters --- opino!!!
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int getLegajo() {
		return legajo;
	}
	@Override
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	@Override
	public float getPromedio() {
		return promedio;
	}

	@Override
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "-->Estudiante [nombre=" + nombre + ", legajo=" + legajo + ", promedio=" + promedio + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
