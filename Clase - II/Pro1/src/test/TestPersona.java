package test;

import modelo.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Datos de una persona
		Persona p1 = new Persona(19, "Brenda");
		Persona p2 = new Persona("Julieta");
		
		
		System.out.println(p1);
		
		///Esto así esta mal. es horrible... 
		//p1.edad = 44;
		//System.out.println(p1.edad);
		
		///Esto así esta BIEN 
		p1.setEdad(22);
		System.out.println(p1.getEdad());
		
		
		p1.mostrarPersona();

	}

}
