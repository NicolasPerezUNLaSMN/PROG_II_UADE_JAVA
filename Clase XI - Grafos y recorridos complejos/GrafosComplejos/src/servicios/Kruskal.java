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

    public static void ejecutar(Grafo grafo) {
        Map<Integer, Nodo> nodos = grafo.getNodos();
        List<Arista> aristas = new ArrayList<>();
        UnionFind uf = new UnionFind(nodos.keySet());

        // Generar lista de aristas (sin duplicados)
        Set<String> vistas = new HashSet<>();
        for (Nodo nodo : nodos.values()) {
            List<INodo> vecinos = nodo.getVecinos();
            List<Integer> pesos = nodo.getPesos();

            for (int i = 0; i < vecinos.size(); i++) {
                int origen = nodo.getValor();
                int destino = vecinos.get(i).getValor();
                int peso = pesos.get(i);

                String clave = Math.min(origen, destino) + "-" + Math.max(origen, destino);
                if (!vistas.contains(clave)) {
                    vistas.add(clave);
                    aristas.add(new Arista(origen, destino, peso));
                }
            }
        }

        // Ordenar aristas por peso
        aristas.sort(Comparator.comparingInt(a -> a.peso));

        // Construir el árbol
        List<Arista> mst = new ArrayList<>();
        for (Arista arista : aristas) {
            if (uf.union(arista.origen, arista.destino)) {
                mst.add(arista);
            }
        }

        System.out.println("Árbol de expansión mínima (Kruskal):");
        for (Arista a : mst) {
            System.out.println(a.origen + " - " + a.destino + " (peso=" + a.peso + ")");
        }
    }

    private static class Arista {
        int origen, destino, peso;
        Arista(int o, int d, int p) {
            origen = o; destino = d; peso = p;
        }
    }

    private static class UnionFind {
        Map<Integer, Integer> padre;

        UnionFind(Set<Integer> nodos) {
            padre = new HashMap<>();
            for (int nodo : nodos) padre.put(nodo, nodo);
        }

        int find(int x) {
            if (padre.get(x) != x)
                padre.put(x, find(padre.get(x)));
            return padre.get(x);
        }

        boolean union(int x, int y) {
            int raizX = find(x);
            int raizY = find(y);
            if (raizX == raizY) return false;
            padre.put(raizX, raizY);
            return true;
        }
    }
}