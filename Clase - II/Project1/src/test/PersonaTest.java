package test;

import modelo.Persona;

public class PersonaTest {

	public static void main(String[] args) {
		//Constructor - vacia canonico
		Persona p1 = new Persona();
		//Constructor personal... yo lo tengo que crear
		Persona p2 = new Persona(19, "Agustina");
		//Violación del Encapsulamiento!!!!
		//System.out.println("EDAD: ----> " +p2.e);
		//p2.nombre = "Brenda";
		//System.out.println("NOMBRE: ----> " +p2.nombre);
		
		//Respete el encapsulamiento
		System.out.println("EDAD: ----> " +p2.getEdad());
		p2.setNombre("Priscila");
		System.out.println("NOMBRE: ----> " +p2.getNombre());
		
		//Si el dato era publico
		//p2.edad = -11;
		p2.setEdad(-11);
		
		System.out.print("......>" +p2);

	}

}
