package test;

import modelo.Grafo;
import servicios.Dijkstra;
import servicios.FloydWarshall;
import servicios.Kruskal;

public class TestGrafos {
    public static void main(String[] args) {
    	
        Grafo grafo = new Grafo();

        grafo.agregarNodo(1);
        grafo.agregarNodo(2);
        grafo.agregarNodo(3);
        grafo.agregarNodo(4);
        grafo.agregarNodo(5);

        grafo.agregarArista(1, 2, 3);
        grafo.agregarArista(1, 3, 1);
        grafo.agregarArista(2, 4, 2);
        grafo.agregarArista(3, 4, 4);
        grafo.agregarArista(4, 5, 2);

        grafo.mostrarListaAdyacencia();

        System.out.println("\n--- Dijkstra desde 1 ---");
        Dijkstra.ejecutar(grafo, 1);

        System.out.println("\n--- Floyd-Warshall ---");
        FloydWarshall.ejecutar(grafo);

        System.out.println("\n--- Kruskal ---");
        Kruskal.ejecutar(grafo);
    }
    
    
    }
