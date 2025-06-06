package servicios;

import java.util.*;

import interfaces.INodo;
import modelo.Grafo;
import modelo.Nodo;

public class AStar {

    // Heurística: función estimada de distancia
    // Acá uso distancia Euclidiana
    public interface Heuristica {
        int estimar(int nodoActual, int nodoDestino);
    }

    public static void ejecutar(Grafo grafo, int inicio, int objetivo, Heuristica heuristica) {
        Map<Integer, Nodo> nodos = grafo.getNodos();

        Map<Integer, Integer> gCost = new HashMap<>(); // costo desde inicio al nodo
        Map<Integer, Integer> fCost = new HashMap<>(); // costo estimado total (g + h)
        Map<Integer, Integer> padres = new HashMap<>(); // para reconstruir camino
        Set<Integer> abiertos = new HashSet<>();
        Set<Integer> cerrados = new HashSet<>();

        // Inicializar costos con infinito
        for (Integer id : nodos.keySet()) {
            gCost.put(id, Integer.MAX_VALUE);
            fCost.put(id, Integer.MAX_VALUE);
        }

        gCost.put(inicio, 0);
        fCost.put(inicio, heuristica.estimar(inicio, objetivo));

        // Cola priorizada por fCost
        PriorityQueue<NodoCosto> cola = new PriorityQueue<>();
        cola.add(new NodoCosto(inicio, fCost.get(inicio)));
        abiertos.add(inicio);

        while (!cola.isEmpty()) {
            NodoCosto actual = cola.poll();
            int idActual = actual.id;

            if (idActual == objetivo) {
                // Reconstruir camino desde objetivo hasta inicio
                List<Integer> camino = new ArrayList<>();
                while (padres.containsKey(idActual)) {
                    camino.add(idActual);
                    idActual = padres.get(idActual);
                }
                camino.add(inicio);
                Collections.reverse(camino);
                System.out.println("Camino encontrado: " + camino);
                System.out.println("Costo total: " + gCost.get(objetivo));
                return;
            }

            abiertos.remove(idActual);
            cerrados.add(idActual);

            Nodo nodoActual = nodos.get(idActual);
            List<INodo> vecinos = nodoActual.getVecinos();
            List<Integer> pesos = nodoActual.getPesos();

            for (int i = 0; i < vecinos.size(); i++) {
                int vecinoId = vecinos.get(i).getValor();
                if (cerrados.contains(vecinoId)) continue;

                int tentativeG = gCost.get(idActual) + pesos.get(i);
                if (tentativeG < gCost.get(vecinoId)) {
                    padres.put(vecinoId, idActual);
                    gCost.put(vecinoId, tentativeG);
                    fCost.put(vecinoId, tentativeG + heuristica.estimar(vecinoId, objetivo));

                    if (!abiertos.contains(vecinoId)) {
                        cola.add(new NodoCosto(vecinoId, fCost.get(vecinoId)));
                        abiertos.add(vecinoId);
                    }
                }
            }
        }

        System.out.println("No se encontró camino desde " + inicio + " hasta " + objetivo);
    }

    private static class NodoCosto implements Comparable<NodoCosto> {
        int id;
        int fCost;

        NodoCosto(int id, int fCost) {
            this.id = id;
            this.fCost = fCost;
        }

        @Override
        public int compareTo(NodoCosto otro) {
            return Integer.compare(this.fCost, otro.fCost);
        }
    }
}