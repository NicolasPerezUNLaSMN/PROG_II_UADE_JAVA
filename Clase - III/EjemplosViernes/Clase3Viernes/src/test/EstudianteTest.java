package test;

import modelo.Estudiante;

public class EstudianteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un estudiante - instanciar un estudiante!!!
		//LLamado al constructo
		Estudiante estudiante1 = new Estudiante("Brenda",111,7.2f);
		Estudiante estudiante2 = new Estudiante("Nico",112);
		
		System.out.println(estudiante1);
		System.out.println(estudiante2);
		System.out.println("SOLO NOMBRE: "+estudiante2.getNombre());

	}

}
