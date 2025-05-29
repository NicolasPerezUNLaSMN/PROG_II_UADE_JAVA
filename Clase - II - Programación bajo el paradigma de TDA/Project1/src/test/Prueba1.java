package test;

import modelo.Arreglos;

///Mejora a la programación ... Paradigma de TDA
///Interfaz
///Implementación
///Pre - post - axiomas
///Encapsulamiento de datos


public class Prueba1 { //Abre la clase

	public static void main(String[] args) { //Abre main
		// TODO Auto-generated method stub
		
		
		/*int edad;
		edad = 11; 
		String nombre = "Nico";
		float altura = 1.81f;
		*/
		
		//Arreglos!!!
		int tam = 5; //Random, input
		int[] edades = new int[tam];//Constructor!!!
		//_ _ _ _ _
		Arreglos a = new Arreglos();
		
		a.cargarArreglo(edades, tam);
		
		a.mostrarArreglo(edades, tam);
		
		
		

	}//Cierra main
	
	
	

}//Cierra la clase
