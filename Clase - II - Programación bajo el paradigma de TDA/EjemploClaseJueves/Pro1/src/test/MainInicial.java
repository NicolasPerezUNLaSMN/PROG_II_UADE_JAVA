package test;

import modelo.FuncionesDeArreglosEnteros;
import modelo.Persona;

public class MainInicial {//Inicia la clase
	
	//Adentro del Main (mi clase), voy a declarar las funciones
	
	
	public static void main(String[] args) {
		
		//Variables agrupadas por "Tipo"
		//Persona, Estudiante
		//Agrupar variables de Distinto tipo se llama
		//Crear una clase.... 
		//int edad;
		//String nombre; 
		
		
		
		//Defino las variables que necesito
		//TIPODEDATO   nombre de variable = inical;
		//int edad; //Declaro ----> BUg 
		//0aba11212  _ _ _ _ _ _
		//edad = 19; //carga 
		//System.out.println("----> EDAD: " +edad);
		
		int cantEstudiantes = 4;
		///Guardar 5 datos del mismo tipo - Arreglos - Array
		/// edad0  edad1  _  _  edad4
		/// 0 ------- 4
		///----> New ???----> Constructor ---> reserva la memoria
		//int[] variableArreglo = new int[5];
		int[] variableArreglo = new int[cantEstudiantes];
		
		///Esto seria sin el static!!!!!
		//MainInicial variableDelTipoClase = new MainInicial();	
		//variableDelTipoClase.cargarArregloDeEnteros(variableArreglo, cantEstudiantes);
		
		FuncionesDeArreglosEnteros f = new FuncionesDeArreglosEnteros();
		
		f.cargarArregloDeEnteros(variableArreglo, cantEstudiantes);
		
		f.mostrarArregloDeEnteros(variableArreglo, cantEstudiantes);
		
	
		
		

	}//Cierra el main

	
	
	
	
	

}///Cierra la clase
