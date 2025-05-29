package test;

import interfaces.IArbolAVL;
import interfaces.INodo;
import modelo.ArbolAVL;
public class TestArbolAVL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 IArbolAVL arbolAVL = new ArbolAVL();
	
		        // Insertamos nodos en el árbol
		        arbolAVL.insertar(50);
		        arbolAVL.insertar(30);
		        arbolAVL.insertar(70);
		        arbolAVL.insertar(20);
		        arbolAVL.insertar(40);
		        arbolAVL.insertar(60);
		        arbolAVL.insertar(80);
	
		        // Recorridos
		        System.out.println("Recorrido Inorden:");
		        arbolAVL.recorridoInorden();
	
		        System.out.println("\nRecorrido Preorden:");
		        arbolAVL.recorridoPreorden();
	
		        System.out.println("\nRecorrido Postorden:");
		        arbolAVL.recorridoPostorden();
	
		        // Búsqueda
		        System.out.println("\nBuscando 40:");
		        INodo nodo = arbolAVL.buscar(40);
		        System.out.println(nodo != null ? "Encontrado: " + nodo.getDato() : "No encontrado");

	}

}
