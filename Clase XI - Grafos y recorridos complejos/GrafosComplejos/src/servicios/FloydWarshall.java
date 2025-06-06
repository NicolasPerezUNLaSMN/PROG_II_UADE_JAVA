package servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import modelo.Grafo;

public class FloydWarshall {

    // Método principal para ejecutar el algoritmo de Floyd-Warshall sobre un grafo
    public static void ejecutar(Grafo grafo) {
        // Obtener los nodos del grafo
        Map<Integer, modelo.Nodo> nodos = grafo.getNodos();

        // Obtener las claves (IDs de los nodos) y ordenarlas para mantener el orden consistente en la matriz
        List<Integer> claves = new ArrayList<>(nodos.keySet());
        Collections.sort(claves);

        int n = claves.size(); // Cantidad de nodos

        // Matriz de distancias, inicializada con "infinito"
        int[][] dist = new int[n][n];
        final int INF = 1_000_000; // Usamos un número muy grande como infinito

        // Inicialización: distancia a sí mismo = 0; el resto = infinito
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF); // Llena cada fila con INF
            dist[i][i] = 0;             // Costo de un nodo a sí mismo es 0
        }

        // Rellenar la matriz con las distancias directas desde el grafo
        for (int i = 0; i < n; i++) {
            modelo.Nodo nodo = nodos.get(claves.get(i));       // Nodo actual
            List<interfaces.INodo> vecinos = nodo.getVecinos(); // Vecinos del nodo
            List<Integer> pesos = nodo.getPesos();              // Pesos de las aristas

            // Para cada vecino, se actualiza la distancia directa en la matriz
            for (int j = 0; j < vecinos.size(); j++) {
                int idxVecino = claves.indexOf(vecinos.get(j).getValor()); // Índice del vecino en la matriz
                dist[i][idxVecino] = pesos.get(j);                         // Peso directo entre nodo y vecino
            }
        }

        // Algoritmo de Floyd-Warshall
        // Se verifica si pasando por k se obtiene un camino más corto de i a j
        for (int k = 0; k < n; k++) {       // Nodo intermedio
            for (int i = 0; i < n; i++) {   // Nodo origen
                for (int j = 0; j < n; j++) { // Nodo destino
                    // Si la suma de los caminos es menor al actual, se actualiza
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Mostrar la matriz de distancias mínimas entre todos los pares de nodos
        System.out.println("Matriz de distancias mínimas (Floyd-Warshall):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Mostrar INF si no hay camino
                System.out.print((dist[i][j] == INF ? "INF" : dist[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
