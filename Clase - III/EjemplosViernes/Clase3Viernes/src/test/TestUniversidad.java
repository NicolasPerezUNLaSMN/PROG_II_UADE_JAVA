package test;

import modelo.Estudiante;
import modelo.Universidad;

public class TestUniversidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante e1 = new Estudiante("Chino", 111, 6.5f);
		Estudiante e2 = new Estudiante("Julieta", 222, 1.2f);
		//Tengo que agregar al arreglo al e1
		
		Universidad u1 = new Universidad("UADE", "Lima 757");
		
		u1.agregarEstudiante(e1); //Deberia agregar al array!!!!
		u1.agregarEstudiante(e2); //Deberia agregar al array!!!!
		
		System.out.println(u1);

	}

}
