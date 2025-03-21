package modelo;

import interfaces.IPersona;

public class Persona implements IPersona {
	
	///Variables ----- Atributos...
	/////Los atributos tienen que ser private "Encapslamiento"
	private int edad;
	private String nombre;
	

	
	///Acciones de la persona
	///rendirExamen()
	///Mostrar 
	@Override
	public void mostrarPersona() {
		
		System.out.print("NOMBRE: "+this.nombre +" EDAD: "+this.edad);
		
	}
	
	///Crear los constructores de la Persona, personalizados!!!
	

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}

	
	///Acceso a la información privada...
	///Generar los get y sets
	@Override
	public int getEdad() {
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//@Override no va en los Constructores
	
	public Persona(int edad, String nombre) {
		
		this.edad = edad;
		this.nombre = nombre;
	}
	
	
	public Persona( String nombre) {
	
		this.nombre = nombre;
	}
	
	//Interfaz no hace falta
	public void duplicarEdad() {
		this.edad = 2*this.edad; 
	}
	
	
	

}
