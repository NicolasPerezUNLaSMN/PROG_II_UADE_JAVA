package test;

import modelo.Grafo;
import servicios.AStar;
import servicios.Dijkstra;
import servicios.FloydWarshall;
import servicios.Kruskal;
import servicios.Prim;

public class TestGrafos {
    public static void main(String[] args) {

        // Crear una instancia de grafo vacío
        Grafo grafo = new Grafo();

        // Agregar nodos al grafo (identificados por enteros del 1 al 5)
        grafo.agregarNodo(1);
        grafo.agregarNodo(2);
        grafo.agregarNodo(3);
        grafo.agregarNodo(4);
        grafo.agregarNodo(5);

        // Agregar aristas con pesos entre los nodos (grafo dirigido o no, depende de tu implementación)
        grafo.agregarArista(1, 2, 3); // 1 -> 2 con peso 3
        grafo.agregarArista(1, 3, 1); // 1 -> 3 con peso 1
        grafo.agregarArista(2, 4, 2); // 2 -> 4 con peso 2
        grafo.agregarArista(3, 4, 4); // 3 -> 4 con peso 4
        grafo.agregarArista(4, 5, 2); // 4 -> 5 con peso 2

        // Mostrar la lista de adyacencia del grafo (vecinos y pesos de cada nodo)
        grafo.mostrarListaAdyacencia();

        // Ejecutar y mostrar el resultado del algoritmo de Dijkstra desde el nodo 1
        System.out.println("\n--- Dijkstra desde 1 ---");
        Dijkstra.ejecutar(grafo, 1);

        // Ejecutar y mostrar la matriz de distancias mínimas usando Floyd-Warshall
        System.out.println("\n--- Floyd-Warshall ---");
        FloydWarshall.ejecutar(grafo);

        // Ejecutar y mostrar el Árbol de Expansión Mínima usando el algoritmo de Kruskal
        System.out.println("\n--- Kruskal ---");
        Kruskal.ejecutar(grafo);
        
        // Prim para árbol de expansión mínima
        System.out.println("\n--- Prim ---");
        Prim.ejecutar(grafo);
        
        System.out.println("\n--- A* desde 1 hasta 5 ---");
        AStar.ejecutar(grafo, 1, 5, (actual, destino) ->  Math.abs(destino - actual)); // Heurística trivial = 0 (igual que Dijkstra)
    }
}