package test;

import modelo.Cola;

public class TestCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cola colaDelBanco = new Cola();
		
		//Incorporar al 23
		colaDelBanco.encolar(23);
		colaDelBanco.encolar(33);
		colaDelBanco.encolar(1);
		colaDelBanco.encolar(-21);
		colaDelBanco.encolar(55);
		colaDelBanco.encolar(14);
		colaDelBanco.encolar(54);
		colaDelBanco.encolar(-101);
		/// 23   33   1   -21  55  14   54  -101
		colaDelBanco.desencolar(); //<---23 ----
		colaDelBanco.desencolar();//<---- 33 
		colaDelBanco.desencolar();//<---- 1 
		
		System.out.println("--->" +colaDelBanco.desencolar());//-21
		
		/// 23!!   33!!   1!!   -21!!  55  14   54  -101  ___
		System.out.println(colaDelBanco); // primero 4  ultimo 8 cantidad 4
		
		colaDelBanco.mostrarCola();
		
		//System.out.println(colaDelBanco); //primero = 0 ultimo 4, cant 4
		//int ultimoElementoDesencolado = colaDelBanco.desencolar();
		//System.out.println(colaDelBanco); //primero = 1 ultimo 4, cant 3
		//System.out.println(ultimoElementoDesencolado);
		//ultimoElementoDesencolado = colaDelBanco.desencolar();
		//System.out.println(ultimoElementoDesencolado);
		
	}

}
