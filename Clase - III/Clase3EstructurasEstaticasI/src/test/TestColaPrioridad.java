package test;

import modelo.ColaPrioridad;

public class TestColaPrioridad {
	
	public static void main(String[] args) {
		
		ColaPrioridad cola = new ColaPrioridad();
		
		cola.encolar(1,12);
		cola.encolar(23,11);
		cola.encolar(1,11);
		cola.encolar(5023,100);
		
		cola.mostrarCola();
		
		System.out.println("Estoy desencolando: " +cola.desencolar());
	    System.out.println("Verifico el primero: " +cola.primero());
	    System.out.println("Verifico el vacia: " +cola.colaVacia());
		
		
	}

}
