package interfaces;

public interface IDiccionario {
	
	 void insertar(int clave, int valor);
	    int obtener(int clave);
	    boolean contiene(int clave);
	    void eliminar(int clave);
	    int tamaño();

}
