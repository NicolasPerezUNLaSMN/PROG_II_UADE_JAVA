package modelo;

import interfaces.IPersona;

public class Persona implements IPersona{
	
	//Las variables internas de la Clase - "Atributos"
	//Public quiere decir que no está encapsulado
	private int edad;
	private String nombre;
	
	
	
	//Métodos (funciones y los procedimientos de la persona)
	public Persona(int e, String n) {
		//super(); //Objetos ----
		this.edad = e;
		this.nombre = n;
	}



	public Persona() {
		super();
	}



	public int getEdad() {
		return edad;
	}

	public void setEdad(int e) {
		
		if ( e>0) {
			this.edad = e;
		}else {
			System.out.println("Sos muy malo usando esto!!");
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}     

	
	///Metodos de acceso a la información...
	///getters ---- setters GET, y los SET
	///GET: obtener información
	///
	///SET: Modificar la información
	
	
	//toString(); Transsforma mi información a texto
	
}
