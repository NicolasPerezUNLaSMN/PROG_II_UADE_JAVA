package test;

import interfaces.INodo;
import interfaces.IArbol;
import modelo.Arbol;

public class TestArbolBinario {
	
	   public static void main(String[] args) {
	        IArbol arbol = new Arbol();
	        
	        arbol.insertarIterativo(50);
	        arbol.insertarIterativo(30);
	        arbol.insertarIterativo(70);
	        arbol.insertarIterativo(20);
	        arbol.insertarIterativo(40);
	        arbol.insertarIterativo(60);
	        arbol.insertarIterativo(80);
	        
	        System.out.println("Recorrido Inorden (recursivo):");
	        arbol.recorridoInorden();
	        
	        System.out.println("\n\nRecorrido Preorden:");
	        arbol.recorridoPreorden();
	        
	        System.out.println("\n\nRecorrido Postorden:");
	        arbol.recorridoPostorden();
	        
	        System.out.println("\n\nRecorrido Inorden (sin recursión):");
	        arbol.recorridoInordenSinRecursion();
	        
	        System.out.println("\n\nBuscando 60:");
	        INodo encontrado = arbol.buscar(60);
	        System.out.println(encontrado != null ? "Encontrado: " + encontrado.getDato() : "No encontrado");
	    }

}
