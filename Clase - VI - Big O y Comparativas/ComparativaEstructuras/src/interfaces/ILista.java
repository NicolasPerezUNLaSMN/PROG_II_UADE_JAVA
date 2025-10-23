package interfaces;

public interface ILista {
	
	
    void insertarInicio(int valor);
    void insertarFin(int valor);
    boolean eliminar(int valor);
    boolean contiene(int valor);
    
    int obtener(int indice); // obtener elemento por índice
    int tamaño();
    void imprimir(); // opcional para debug
    
    
}