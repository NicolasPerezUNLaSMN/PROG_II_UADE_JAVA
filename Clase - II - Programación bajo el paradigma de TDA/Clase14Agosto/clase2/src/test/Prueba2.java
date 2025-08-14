package test;
//import affas from adsdsa;
import java.util.Scanner;

public class Prueba2 { ///Inicio de la clase

	public static void main(String[] args) { //inicimo el main
		
		//accceso!!! tipo nombreDeVariable = asignación;
		int edad = 35; //Asignación estatica...
		///Double, String, float...
		
		///Asignación dinamica
		///Scanner es una clase que no es mia :( )
		///Sobrecarga del metodo constructor!!!!
		Scanner ingresoDeDato = new Scanner(System.in);
		
		//ejercicio seria: Pedir la edad de todos los del aula!!!
		
		int cantidad = 4; //En el aula.... 61
		int edades  = 0; 
		//lista_de_edades = {}
		
		///Calcular el promedio de edades!!!
		///cantidad :) 
		int sumaDeEdades = 0; ///Iniciar en "ELEMENTO NEUTRO DE LA OPERACIÓN"
		float promedio; 
		
		for ( int a = 0; a < cantidad; a++ ) { //Abre el for
			System.out.printf("Por favor dame tu edad: \n");
			///Lista!!!! 
			//a++  ---> a = a + 1; 
			
			edades = ingresoDeDato.nextInt();
			//lista_de_edades.add(edades)
			
			sumaDeEdades = sumaDeEdades + edades;
			//sumaDeEdades += edades;
			
		} //cierra el for!!!
		
		//Casteos!!!: 
		//edad =  (int) input("Por favor ingresar la edad")
		
		promedio = ((float) sumaDeEdades)/ cantidad; 
		
		System.out.printf("Promedio: "+ promedio);
		
		//lista_de_edades[2] --- Acceder
		
		
		

	}//Cierre del main

} //Cierre de la clase
