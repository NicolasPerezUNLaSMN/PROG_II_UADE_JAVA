package test;

import modelo.Cola;

public class TestCola {

	 public static void main(String[] args) {
		 
	     Cola cola = new Cola(); //Esto llama a iniciarPIla
	     
	    cola.encolar(11);
	    cola.encolar(-101);
	    cola.encolar(22);
	
	    System.out.println("Estoy desencolando: " +cola.desacolar());
	    System.out.println("Verifico el tamaño: " +cola.tamanio());
	    System.out.println("Verifico el llena: " +cola.colaLlena());
	    System.out.println("Verifico el vacia: " +cola.colaVacia());
	 
	     
	}
	
	


}
