package servicios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import interfaces.INodo;
import modelo.Grafo;
import modelo.Nodo;

public class Dijkstra {

    // Método estático que ejecuta el algoritmo de Dijkstra desde un nodo origen
    public static void ejecutar(Grafo grafo, int origen) {
        // Mapa de nodos del grafo: clave = id del nodo, valor = objeto Nodo
        Map<Integer, Nodo> nodos = grafo.getNodos();

        // Mapa para guardar las distancias mínimas desde el nodo origen a cada nodo
        Map<Integer, Integer> distancias = new HashMap<>();

        // Conjunto para registrar qué nodos ya fueron visitados (optimiza el algoritmo)
        Set<Integer> visitados = new HashSet<>();

        // Cola de prioridad para seleccionar el nodo con menor distancia actual
        PriorityQueue<NodoDistancia> cola = new PriorityQueue<>();

        // Inicializa todas las distancias al valor máximo (infinito)
        for (Integer id : nodos.keySet()) {
            distancias.put(id, Integer.MAX_VALUE);
        }

        // La distancia al nodo origen es 0 (obvio)
        distancias.put(origen, 0);

        // Se añade el nodo origen a la cola con distancia 0
        cola.add(new NodoDistancia(origen, 0));

        // Mientras haya nodos por procesar en la cola...
        while (!cola.isEmpty()) {
            // Se toma el nodo con la menor distancia (gracias a la cola de prioridad)
            NodoDistancia actual = cola.poll();

            // Si ya fue visitado, se saltea para evitar ciclos o reprocesos
            if (visitados.contains(actual.id)) continue;

            // Marca el nodo como visitado
            visitados.add(actual.id);

            // Obtiene el nodo actual desde el mapa de nodos
            Nodo nodoActual = nodos.get(actual.id);

            // Obtiene la lista de vecinos y los pesos de las aristas desde el nodo actual
            List<INodo> vecinos = nodoActual.getVecinos();
            List<Integer> pesos = nodoActual.getPesos();

            // Recorre todos los vecinos del nodo actual
            for (int i = 0; i < vecinos.size(); i++) {
                int vecinoId = vecinos.get(i).getValor(); // ID del nodo vecino
                int peso = pesos.get(i);                  // Peso de la arista al vecino

                // Calcula la nueva distancia como la suma de la distancia actual + peso
                int nuevaDistancia = distancias.get(actual.id) + peso;

                // Si la nueva distancia es menor que la registrada, se actualiza
                if (nuevaDistancia < distancias.get(vecinoId)) {
                    distancias.put(vecinoId, nuevaDistancia); // Actualiza la distancia
                    cola.add(new NodoDistancia(vecinoId, nuevaDistancia)); // Agrega a la cola
                }
            }
        }

        // Imprime las distancias mínimas desde el nodo origen a todos los nodos
        System.out.println("Distancias mínimas desde " + origen + ":");
        for (Map.Entry<Integer, Integer> entry : distancias.entrySet()) {
            System.out.println("A " + entry.getKey() + " = " + entry.getValue());
        }
    }

    // Clase interna que representa un nodo junto con su distancia acumulada
    private static class NodoDistancia implements Comparable<NodoDistancia> {
        int id, distancia;

        // Constructor para crear el nodo con su respectiva distancia
        NodoDistancia(int id, int distancia) {
            this.id = id;
            this.distancia = distancia;
        }

        // Permite que los objetos de esta clase se ordenen por distancia en la PriorityQueue
        public int compareTo(NodoDistancia otro) {
            return Integer.compare(this.distancia, otro.distancia);
        }
    }
}