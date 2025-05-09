package test;

import interfaces.INodo;
import interfaces.IArbol;
import modelo.Arbol;

public class TestArbolBinarioIterativo {
	
	   public static void main(String[] args) {
	        IArbol arbol = new Arbol();
	        
	        arbol.insertar(50);
	        arbol.insertar(30);
	        arbol.insertar(70);
	        arbol.insertar(20);
	        arbol.insertar(40);
	        arbol.insertar(60);
	        arbol.insertar(80);
	        
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
