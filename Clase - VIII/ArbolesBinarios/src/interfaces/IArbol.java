package interfaces;

public interface IArbol {
	
	    void insertar(int dato);
	    INodo buscar(int dato);
	    
	    void recorridoInorden();
	    void recorridoPreorden();
	    void recorridoPostorden();
	    
	    void recorridoInordenSinRecursion();
	    public void insertarIterativo(int dato);
	    
	    public void eliminar(int dato);

}
