package modelo;

//Implementación del Grafo
import java.util.*;

import interfaces.IGrafo;
import interfaces.INodo;

public class Grafo implements IGrafo {
	
	//(clave, valor)
	//Clave valor como diccionarios de python
	private Map<Integer, Nodo> nodos = new HashMap<>(); // Mapa de valor -> Nodo

	
	
	 // Agrega un nodo al grafo si no existe aún
	
	 public void agregarNodo(int valor) {
	     if (!nodos.containsKey(valor)) {
	         nodos.put(valor, new Nodo(valor));
	     }
	 }

 // Agrega una arista (conexión) entre dos nodos existentes
 public void agregarArista(int origen, int destino) {
     if (nodos.containsKey(origen) && nodos.containsKey(destino)) {
         Nodo nodoOrigen = nodos.get(origen); //Agarro el nodo que tiene
         //como clave al origen... get retorna el NODO
         Nodo nodoDestino = nodos.get(destino);
         
         nodoOrigen.agregarVecino(nodoDestino);
         
         nodoDestino.agregarVecino(nodoOrigen); // Grafo no dirigido
     }
 }

 // Muestra la matriz de adyacencia del grafo
 public void mostrarMatrizAdyacencia() {
     System.out.println("Matriz de Adyacencia:");
     List<Integer> claves = new ArrayList<>(nodos.keySet());
     
     Collections.sort(claves); // Ordenar nodos por valor

     // Encabezado
     System.out.print("   ");
     for (int i : claves) System.out.print(i + " ");
     System.out.println();

     // Filas de la matriz
     for (int i : claves) { /// 1--- 2  ---- 3 Columnas
         System.out.print(i + ": ");
         for (int j : claves) {  /// 1 , 2, 3 --- Filas
             Nodo nodoI = nodos.get(i);
             Nodo nodoJ = nodos.get(j);
             System.out.print(nodoI.getVecinos().contains(nodoJ) ? "1 " : "0 ");
         }
         System.out.println();
     }
 }

 // Muestra la lista de adyacencia del grafo
 public void mostrarListaAdyacencia() {
     System.out.println("Lista de Adyacencia:");
     
     for (Map.Entry<Integer, Nodo> entrada : nodos.entrySet()) {
    	 
         System.out.print(entrada.getKey() + ": ");
         List<INodo> vecinos = entrada.getValue().getVecinos();
         
         for (INodo vecino : vecinos) {
             System.out.print(vecino.getValor() + " ");
         }
         System.out.println();
     }
 }

 // Recorrido en anchura (Breadth First Search)
 public void bfs(int inicio) {
	 
     if (!nodos.containsKey(inicio)) return; // precondición

     ///Lista y cola
     Set<Integer> visitados = new HashSet<>(); // Conjunto de nodos visitados
     Queue<Nodo> cola = new LinkedList<>(); // Cola para el recorrido

     Nodo nodoInicio = nodos.get(inicio);
     cola.add(nodoInicio);
     visitados.add(inicio);

     System.out.println("Recorrido BFS:");
     while (!cola.isEmpty()) {
         Nodo actual = cola.poll();
         System.out.print(actual.getValor() + " ");

         for (INodo vecino : actual.getVecinos()) {
             if (!visitados.contains(vecino.getValor())) {
                 visitados.add(vecino.getValor());
                 cola.add((Nodo) vecino);
             }
         }
     }
     System.out.println();
 }

 // Recorrido en profundidad (Depth First Search)
 public void dfs(int inicio) {
     if (!nodos.containsKey(inicio)) return; // precondición

     Set<Integer> visitados = new HashSet<>();
     System.out.println("Recorrido DFS:");
     dfsRec(nodos.get(inicio), visitados); //Pila!!!!
     System.out.println();
 }

// Función recursiva auxiliar para DFS
 private void dfsRec(Nodo actual, Set<Integer> visitados) {
     visitados.add(actual.getValor());
     System.out.print(actual.getValor() + " ");
     
     List<INodo> vecinos = actual.getVecinos();
     for (int i = vecinos.size() - 1; i >= 0; i--) {
         INodo vecino = vecinos.get(i);
         if (!visitados.contains(vecino.getValor())) {
             dfsRec((Nodo) vecino, visitados);
         }
     }
 }
}
