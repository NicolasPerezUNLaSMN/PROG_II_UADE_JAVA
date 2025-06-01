package servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import modelo.Grafo;

public class FloydWarshall {

    public static void ejecutar(Grafo grafo) {
        Map<Integer, modelo.Nodo> nodos = grafo.getNodos();
        List<Integer> claves = new ArrayList<>(nodos.keySet());
        Collections.sort(claves);

        int n = claves.size();
        int[][] dist = new int[n][n];
        final int INF = 1_000_000;

        // Inicializar la matriz de distancias
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int i = 0; i < n; i++) {
            modelo.Nodo nodo = nodos.get(claves.get(i));
            List<interfaces.INodo> vecinos = nodo.getVecinos();
            List<Integer> pesos = nodo.getPesos();

            for (int j = 0; j < vecinos.size(); j++) {
                int idxVecino = claves.indexOf(vecinos.get(j).getValor());
                dist[i][idxVecino] = pesos.get(j);
            }
        }

        // Algoritmo Floyd-Warshall
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Imprimir resultado
        System.out.println("Matriz de distancias mínimas (Floyd-Warshall):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((dist[i][j] == INF ? "INF" : dist[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
