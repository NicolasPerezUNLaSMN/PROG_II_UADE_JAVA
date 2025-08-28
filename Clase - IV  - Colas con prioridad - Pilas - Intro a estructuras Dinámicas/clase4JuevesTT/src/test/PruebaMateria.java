package test;

import modelo.Estudiante;
import modelo.Materia;

public class PruebaMateria {

	public static void main(String[] args) {
		
		Materia m1 = new Materia(1212, "Programacion X");
		
		//m1.ingresarEstudiantes();
		Estudiante e1 = new Estudiante(111, "Nico", true);
		m1.ingresarEstudiante(e1);
		
		Estudiante e2 = new Estudiante(222, "brenda", true);
		m1.ingresarEstudiante(e2);
		
		Estudiante e3 = new Estudiante(333, "Macarena", true);
		m1.ingresarEstudiante(e3);

		System.out.println(m1);
		
		///Arrancamos con estructureas Dinamicas!!!!
		///-----> Lista
		///----> Cola 
		///----> Pila

	}

}
