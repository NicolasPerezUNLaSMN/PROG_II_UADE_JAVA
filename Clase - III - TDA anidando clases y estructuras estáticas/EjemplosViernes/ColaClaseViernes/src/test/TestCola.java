package test;

import modelo.Cola;

public class TestCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear cola
		Cola colaDeEnteros = new Cola();
		
		colaDeEnteros.encolar(5);
		colaDeEnteros.encolar(-11);
		colaDeEnteros.encolar(101);
		colaDeEnteros.encolar(53);
		
		///___ COLA:   5    -11   101    53   -    -   -    -   - -  
		System.out.println(colaDeEnteros); 
		
		int numero = colaDeEnteros.desencolar();
		
		System.out.println(colaDeEnteros);
		//primero 1 --- ultimo 4 ---- cantidad  3--- [5,-11, 101,53----]
		

	}

}
