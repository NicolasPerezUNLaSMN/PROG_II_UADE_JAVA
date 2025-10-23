package interfaces;

public interface ILista<T> {
	
	 	void insertar(INodo<T> nodo);
	 	//void insertar(T dato); :) se puede!!!
	 	
	    boolean eliminar(T dato);
	    
	    INodo<T> buscar(T dato);
	    
	    void imprimir();  
	    
	    boolean esVacia();
	    
	    int tamanio();
	    
	    //Crear todas las primitivas que vimos en clase
	    ///Todos los insertar, todos los eliminar, todos los obtener
	    ///el ordenamiento y la busqueda binaria.
	    ///Pensar tambien las Complejidades Algoritmicas

}
