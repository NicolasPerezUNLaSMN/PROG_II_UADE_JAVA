package modelo;

import interfaces.IEstudiante;

public class Estudiante implements IEstudiante {
	
	//Atributos
	private int legajo;
	private String nombre;
	private boolean activo;
	
	public Estudiante(int legajo, String nombre, boolean activo) {
		//super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.activo = activo;
	}
	@Override
	public int getLegajo() {
		return legajo;
	}
	
	//Metodo personal!!!!
	public int getLegajoPersonal() {
		return legajo;
	}
	@Override
	public void setLegajo(int legajoNuevo) {
		this.legajo = legajoNuevo;
	}
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public boolean isActivo() {
		return activo;
	}
	@Override
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Estudiante [legajo=" + legajo + ", nombre=" + nombre + ", activo=" + activo + "]";
	}
	
	
	
	
	
	

}
