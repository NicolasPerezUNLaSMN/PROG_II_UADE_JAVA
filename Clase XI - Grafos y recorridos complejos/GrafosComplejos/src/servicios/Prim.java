package servicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import interfaces.INodo;
import modelo.Grafo;
import modelo.Nodo;

public class Prim {

    public static void ejecutar(Grafo grafo) {
        Map<Integer, Nodo> nodos = grafo.getNodos();
        Set<Integer> visitados = new HashSet<>();
        PriorityQueue<Arista> cola = new PriorityQueue<>(Comparator.comparingInt(a -> a.peso));
        List<Arista> mst = new ArrayList<>();

        // Comenzamos desde el primer nodo disponible
        int inicio = nodos.keySet().iterator().next();
        visitados.add(inicio);

        // Agregar las aristas del nodo inicial a la cola
        agregarAristas(grafo.getNodo(inicio), visitados, cola);

        // Mientras haya aristas y no se haya completado el MST
        while (!cola.isEmpty() && visitados.size() < nodos.size()) {
            Arista arista = cola.poll();

            // Si el destino ya fue visitado, se descarta (evita ciclos)
            if (visitados.contains(arista.destino)) continue;

            // Agregar arista al MST
            mst.add(arista);
            visitados.add(arista.destino);

            // Agregar nuevas aristas desde el nuevo nodo visitado
            agregarAristas(grafo.getNodo(arista.destino), visitados, cola);
        }

        // Mostrar el árbol de expansión mínima
        System.out.println("Árbol de expansión mínima (Prim):");
        for (Arista a : mst) {
            System.out.println(a.origen + " - " + a.destino + " (peso=" + a.peso + ")");
        }
    }

    // Agrega a la cola todas las aristas desde un nodo no visitado
    private static void agregarAristas(Nodo nodo, Set<Integer> visitados, PriorityQueue<Arista> cola) {
        List<INodo> vecinos = nodo.getVecinos();
        List<Integer> pesos = nodo.getPesos();
        int origen = nodo.getValor();

        for (int i = 0; i < vecinos.size(); i++) {
            int destino = vecinos.get(i).getValor();
            int peso = pesos.get(i);
            if (!visitados.contains(destino)) {
                cola.add(new Arista(origen, destino, peso));
            }
        }
    }

    // Clase interna para representar una arista
    private static class Arista {
        int origen, destino, peso;

        Arista(int o, int d, int p) {
            origen = o;
            destino = d;
            peso = p;
        }
    }
}