package test;

import modelo.ArregloDeEnteros;

///Paradigma de TDA ---
///Separado en Interfaces  y implementación ( Desarrollo)!!!
///PRE - POST - AXIOMAS 
///Encapsulamiento de datos !!!!!!

public class MainTest { //Abre mi clase

	public static void main(String[] args) { //Es un procedimiento
		//que ejecuta cosas __main__.py
		// TODO Auto-generated method stub
		//int - float - double - String
		//int edad; //Declarar una variable - bug
		//reservar memoria para guardar un entero
		//1h1h001 _ _ _ _ _ 
		//edad = 19;
		
		///Print
		//System.out.print("---->: " +edad );
		///Arreglo para guardar edades
		///Arreglo: pos_ , pos_ , pos_ 
		///En un arreglo una guarda mucha info DEL MISMO TIPO
		/////Voy a guardar MUCHOS enteros -
		int tam = 6; 
		int[] edades = new int[tam] ; //variable en plural!!!!
		///constructor canonico _  Reserva memoria para 6 enteros
		/// ____  _____  _____ _____ _____ ______
		///  0      1      2      3     4     5
		/*
		 * Comentarios de más de una linea
		 */
		ArregloDeEnteros a = new ArregloDeEnteros();
		a.cargarArreglo(edades, tam); //Necesito el procedimiento static
		a.mostrarArreglo(edades, tam);
		
		
		
		
	} //Termina el main 
	
	

} //Cierra la clase
