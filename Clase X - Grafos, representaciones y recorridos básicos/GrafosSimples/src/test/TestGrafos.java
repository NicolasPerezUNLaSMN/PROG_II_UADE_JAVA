package test;

import interfaces.IGrafo;
import modelo.Grafo;

public class TestGrafos {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		 	IGrafo grafo = new Grafo();

	        // Crear nodos
	        grafo.agregarNodo(1);
	        grafo.agregarNodo(2);
	        grafo.agregarNodo(3);
	        grafo.agregarNodo(4);
	        grafo.agregarNodo(5);
	        grafo.agregarNodo(6);

	        // Crear conexiones (aristas)
	        grafo.agregarArista(1, 2);
	        grafo.agregarArista(1, 3);
	        grafo.agregarArista(2, 4);
	        grafo.agregarArista(2, 5);
	        grafo.agregarArista(3, 1);
	        grafo.agregarArista(4, 6);
	        grafo.agregarArista(5, 5);
	        grafo.agregarArista(6, 5);

	        // Visualización y recorridos
	        grafo.mostrarMatrizAdyacencia();
	        grafo.mostrarListaAdyacencia();
	        grafo.bfs(1);
	        grafo.dfs(1);

	}

}
