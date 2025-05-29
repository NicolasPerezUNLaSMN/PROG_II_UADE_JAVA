package interfaces;

public interface IArbol {
	
	    void insertar(int dato);
	    INodo buscar(int dato);
	    
	    void recorridoInorden();
	    void recorridoPreorden();
	    void recorridoPostorden();
	    
	    public void eliminar(int dato);
	    
	    void recorridoInordenSinRecursion();
	    public void insertarIterativo(int dato);
	    
	   

}
