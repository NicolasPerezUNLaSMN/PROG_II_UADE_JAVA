package modelo;

import java.util.Scanner;

public class ClaseArreglosEnteros  {
	
	static int ingresarEntero() { //Inicia la funcion
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor ingresar un entero: \n");
		
		int variable = s.nextInt();
		
		return variable; 
		
	}; //Cierra la funcion
	
	 //Cargue el arreglo.... muestre el arreglo .... sume el arreglo!!!!
	//Procedimiento que cargue el arreglo!!!
	 public static void cargarArregloEnterosPorTeclado(int[] arreglo, int tam){
		
		for ( int i = 0; i<tam; i++) {
			
			//Scanner ... 
			arreglo[i] = ingresarEntero();
		}
		
		//return no hay retorno!!!
	};
	
	//
	 public static void mostrarArregloDeEnteros(int[] arreglo, int tam) {
		
		System.out.print("ARREGLO: [ ");
		for ( int i = 0; i<tam; i++) {
			
			System.out.print(" " +arreglo[i]);
		}
		System.out.print("] \n");
	};
	


}
