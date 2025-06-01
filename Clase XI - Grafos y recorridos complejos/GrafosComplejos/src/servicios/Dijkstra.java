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

    public static void ejecutar(Grafo grafo, int origen) {
        Map<Integer, Nodo> nodos = grafo.getNodos();
        Map<Integer, Integer> distancias = new HashMap<>();
        Set<Integer> visitados = new HashSet<>();
        PriorityQueue<NodoDistancia> cola = new PriorityQueue<>();

        for (Integer id : nodos.keySet()) {
            distancias.put(id, Integer.MAX_VALUE);
        }
        distancias.put(origen, 0);
        cola.add(new NodoDistancia(origen, 0));

        while (!cola.isEmpty()) {
            NodoDistancia actual = cola.poll();
            if (visitados.contains(actual.id)) continue;

            visitados.add(actual.id);
            Nodo nodoActual = nodos.get(actual.id);

            List<INodo> vecinos = nodoActual.getVecinos();
            List<Integer> pesos = nodoActual.getPesos();

            for (int i = 0; i < vecinos.size(); i++) {
                int vecinoId = vecinos.get(i).getValor();
                int peso = pesos.get(i);
                int nuevaDistancia = distancias.get(actual.id) + peso;

                if (nuevaDistancia < distancias.get(vecinoId)) {
                    distancias.put(vecinoId, nuevaDistancia);
                    cola.add(new NodoDistancia(vecinoId, nuevaDistancia));
                }
            }
        }

        System.out.println("Distancias mínimas desde " + origen + ":");
        for (Map.Entry<Integer, Integer> entry : distancias.entrySet()) {
            System.out.println("A " + entry.getKey() + " = " + entry.getValue());
        }
    }

    private static class NodoDistancia implements Comparable<NodoDistancia> {
        int id, distancia;

        NodoDistancia(int id, int distancia) {
            this.id = id;
            this.distancia = distancia;
        }

        public int compareTo(NodoDistancia otro) {
            return Integer.compare(this.distancia, otro.distancia);
        }
    }
}