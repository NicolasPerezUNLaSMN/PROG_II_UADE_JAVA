package test;

import modelo.Cola;

public class TestCola {
	
	 public static void main(String[] args) {
	        Cola cola = new Cola();
	        cola.InicializarCola();

	        cola.Encolar(10);
	        cola.Encolar(20);
	        cola.Encolar(30);

	        while (!cola.ColaVacia()) {
	            System.out.println(cola.Desencolar());
	        }
	    }

}
