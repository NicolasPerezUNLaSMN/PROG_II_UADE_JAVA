package test;

import java.util.Scanner;

import modelo.ClaseArreglosEnteros;


public class Prueba3Mejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidad = 5; //ingresarEntero!!
		int[] arregloVariable = new int[cantidad];
		
		ClaseArreglosEnteros c = new ClaseArreglosEnteros(); //Instancia de la clase
		
		
		c.cargarArregloEnterosPorTeclado(arregloVariable, cantidad);// Necesita sus argume
		
		c.mostrarArregloDeEnteros(arregloVariable, cantidad);
		
		///Calcular el promedio!!! ----> Funcion: float 
		
		
	   
	   
	} //Cierra el main
	
	///Funciones y Procedimientos!!!!
	 
	//Un procedimiento no retorna nada!!!
	//def nombreFuncion(arg1, arg2):
	//		contenido
	
	//Funcion retorna un valor!!!!
	//def nombreFuncion2(arg1, arg2):
	//		contenido
	//   	return variable
	
	///Pide un entero por teclado!!!
	///datoDeRetorno nombreDeLaFuncion ( argumentos)
	

}
