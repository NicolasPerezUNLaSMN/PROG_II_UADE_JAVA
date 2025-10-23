package test;

import interfaces.ILista;
import modelo.Lista;
import modelo.Nodo;

public class TestListaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Test con Integer:");
			
	        ILista<Integer> listaEnteros = new Lista<Integer>();
	        
	        listaEnteros.insertar(new Nodo<>(10));
	        listaEnteros.insertar(new Nodo<>(20));
	        listaEnteros.insertar(new Nodo<>(30));
	        
	        listaEnteros.imprimir();
	        
	        System.out.println("Eliminar 20: " + listaEnteros.eliminar(20));
	        listaEnteros.imprimir();
	        System.out.println("Buscar 30: " + (listaEnteros.buscar(30) != null));

	        System.out.println("\nTest con String:");
	        
	        ILista<String> listaStrings = new Lista<String>();
	        
	        //INodo<String> nodo = new Nodo<string>();
	        
	        listaStrings.insertar(new Nodo<>("Hola"));
	        listaStrings.insertar(new Nodo<>("Nico el profe"));
	        listaStrings.insertar(new Nodo<>("Los saluda"));
	        listaStrings.imprimir();
	        
	        System.out.println("Eliminar 'Hola': " + listaStrings.eliminar("Hola"));
	        listaStrings.imprimir();
	        
	        System.out.println("Buscar 'Nico el profe': " + (listaStrings.buscar("Nico el profe") != null));

	        System.out.println("\nTest con Double:");
	        ILista<Double> listaDoubles = new Lista<>();
	        
	        listaDoubles.insertar(new Nodo<>(3.14));
	        listaDoubles.insertar(new Nodo<>(2.71));
	        listaDoubles.insertar(new Nodo<>(1.61));
	        listaDoubles.imprimir();
	        
	        System.out.println("Tamaño lista: " + listaDoubles.tamanio());
	        
	        //Ordenar y buscar pensar!!!!!
	        
	        //Para practicar para el parcial, tratar de hacer el tp1
	        //con T!!!!!
	        
	     

	}

}
