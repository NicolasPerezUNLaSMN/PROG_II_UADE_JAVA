package modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import interfaces.IGrafo;
import interfaces.INodo;

public class Grafo implements IGrafo {
	
    private Map<Integer, Nodo> nodos = new HashMap<>();

    public void agregarNodo(int valor) {
        nodos.putIfAbsent(valor, new Nodo(valor));
    }

    public void agregarArista(int origen, int destino, int peso) {
        Nodo nodoOrigen = nodos.get(origen);
        Nodo nodoDestino = nodos.get(destino);
        if (nodoOrigen != null && nodoDestino != null) {
            nodoOrigen.agregarVecino(nodoDestino, peso);
            nodoDestino.agregarVecino(nodoOrigen, peso); // Si es no dirigido
        }
    }

    public void mostrarListaAdyacencia() {
        for (Nodo nodo : nodos.values()) {
            System.out.print(nodo.getValor() + ": ");
            List<INodo> vecinos = nodo.getVecinos();
            List<Integer> pesos = nodo.getPesos();
            for (int i = 0; i < vecinos.size(); i++) {
                System.out.print("(" + vecinos.get(i).getValor() + ", peso=" + pesos.get(i) + ") ");
            }
            System.out.println();
        }
    }
    
    public Nodo getNodo(int valor) {
        return nodos.get(valor);
    }

    public Map<Integer, Nodo> getNodos() {
        return nodos;
    }
}