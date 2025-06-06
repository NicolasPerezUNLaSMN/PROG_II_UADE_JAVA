package servicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import interfaces.INodo;
import modelo.Grafo;
import modelo.Nodo;

public class Kruskal {

    // Método principal que ejecuta el algoritmo de Kruskal sobre el grafo dado
    public static void ejecutar(Grafo grafo) {
        // Se obtienen los nodos del grafo
        Map<Integer, Nodo> nodos = grafo.getNodos();

        // Lista que contendrá todas las aristas únicas del grafo
        List<Arista> aristas = new ArrayList<>();

        // Estructura Union-Find para detectar ciclos y manejar componentes conexas
        UnionFind uf = new UnionFind(nodos.keySet());

        // Conjunto auxiliar para evitar aristas duplicadas (en grafos no dirigidos)
        Set<String> vistas = new HashSet<>();

        // Recorremos todos los nodos para construir la lista de aristas
        for (Nodo nodo : nodos.values()) {
            List<INodo> vecinos = nodo.getVecinos(); // Vecinos del nodo actual
            List<Integer> pesos = nodo.getPesos();   // Pesos correspondientes a las aristas

            for (int i = 0; i < vecinos.size(); i++) {
                int origen = nodo.getValor();                 // ID del nodo actual
                int destino = vecinos.get(i).getValor();      // ID del vecino
                int peso = pesos.get(i);                      // Peso de la arista

                // Clave única para identificar la arista sin importar el orden (evita duplicados)
                String clave = Math.min(origen, destino) + "-" + Math.max(origen, destino);

                // Si esta arista no ha sido vista, la agregamos
                if (!vistas.contains(clave)) {
                    vistas.add(clave);
                    aristas.add(new Arista(origen, destino, peso));
                }
            }
        }

        // Ordenamos todas las aristas por peso (de menor a mayor)
        aristas.sort(Comparator.comparingInt(a -> a.peso));

        // Lista que almacenará las aristas seleccionadas para el Árbol de Expansión Mínima (MST)
        List<Arista> mst = new ArrayList<>();

        // Recorremos las aristas ya ordenadas
        for (Arista arista : aristas) {
            // Solo añadimos la arista si conecta dos componentes distintas (evita ciclos)
            if (uf.union(arista.origen, arista.destino)) {
                mst.add(arista);
            }
        }

        // Mostramos el resultado del Árbol de Expansión Mínima
        System.out.println("Árbol de expansión mínima (Kruskal):");
        for (Arista a : mst) {
            System.out.println(a.origen + " - " + a.destino + " (peso=" + a.peso + ")");
        }
    }

    // Clase interna que representa una arista del grafo con su origen, destino y peso
    private static class Arista {
        int origen, destino, peso;

        Arista(int o, int d, int p) {
            origen = o;
            destino = d;
            peso = p;
        }
    }

    // Clase que implementa el algoritmo Union-Find (también llamado Disjoint Set)
    private static class UnionFind {
        Map<Integer, Integer> padre;

        // Constructor: inicializa cada nodo como su propio padre (conjunto individual)
        UnionFind(Set<Integer> nodos) {
            padre = new HashMap<>();
            for (int nodo : nodos)
                padre.put(nodo, nodo);
        }

        // Encuentra la raíz del conjunto al que pertenece el nodo x (con compresión de caminos)
        int find(int x) {
            if (padre.get(x) != x)
                padre.put(x, find(padre.get(x))); // compresión de camino
            return padre.get(x);
        }

        // Une los conjuntos de x e y si no forman ciclo; devuelve true si se unieron
        boolean union(int x, int y) {
            int raizX = find(x);
            int raizY = find(y);
            if (raizX == raizY) return false; // ya están en el mismo conjunto (formarían ciclo)
            padre.put(raizX, raizY);          // unimos las raíces
            return true;
        }
    }
}