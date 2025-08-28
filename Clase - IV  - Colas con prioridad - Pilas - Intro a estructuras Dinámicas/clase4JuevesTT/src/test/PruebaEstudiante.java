package test;

import modelo.Estudiante;

public class PruebaEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante e1 = new Estudiante(111, "Nico", true);
		
		e1.setNombre("Brenda");
		System.out.println("-->" +e1.getLegajo()); //<----111
		
		System.out.println(e1);
	}

}
