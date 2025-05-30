package interfaces;

public interface IGrafo {
	
		void agregarNodo(int valor); // pre: el valor no debe estar ya en el grafo
	    void agregarArista(int origen, int destino); // pre: nodos deben existir
	    void mostrarMatrizAdyacencia(); // Muestra la matriz de adyacencia
	    void mostrarListaAdyacencia(); // Muestra la lista de adyacencia
	    void bfs(int inicio); // pre: el nodo inicio debe existir
	    void dfs(int inicio); // pre: el nodo inicio debe existir

}
