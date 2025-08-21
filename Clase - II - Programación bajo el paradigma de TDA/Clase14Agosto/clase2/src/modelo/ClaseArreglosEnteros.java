package modelo;

import java.util.Scanner;

import interfaces.IClaseArreglosEnteros;

public class ClaseArreglosEnteros  implements  IClaseArreglosEnteros{
	
	 @Override
	 public int ingresarEntero() { //Inicia la funcion
		 
		 ///static: ----> 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor ingresar un entero: \n");
		
		int variable = s.nextInt();
		
		return variable; 
		
	}; //Cierra la funcion
	
	 //Cargue el arreglo.... muestre el arreglo .... sume el arreglo!!!!
	//Procedimiento que cargue el arreglo!!!
	 @Override
	 public void cargarArregloEnterosPorTeclado(int[] arreglo, int tam){
		
		for ( int i = 0; i<tam; i++) {
			
			//Scanner ... 
			arreglo[i] = ingresarEntero();
		}
		
		//return no hay retorno!!!
	};
	
	//
	 @Override
	 public void mostrarArregloDeEnteros(int[] arreglo, int tam) {
		
		 
		System.out.print("ARREGLO: [ ");
		for ( int i = 0; i<tam; i++) {
			
			System.out.print(" " +arreglo[i]);
		}
		System.out.print("] \n");
	}

	
	
	//Puedo hacer funciones y procedimientos propios!!!!!
	public int funcionCopada() {
		return 0;
	}


}
