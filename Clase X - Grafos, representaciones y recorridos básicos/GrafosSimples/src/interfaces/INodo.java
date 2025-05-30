package interfaces;

import java.util.List;

public interface INodo {
	
    int getValor(); // Devuelve el valor almacenado en el nodo
    void setValor(int valor); // Establece el valor del nodo
    void agregarVecino(INodo vecino); // Agrega un nodo vecino a la lista de adyacencia interna
    List<INodo> getVecinos(); // Obtiene la lista de vecinos del nodo
    
}
