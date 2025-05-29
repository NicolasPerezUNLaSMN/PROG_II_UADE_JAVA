package interfaces;

public interface IArbolAVL  {
	
    void insertar(int dato);
    INodo buscar(int dato);
    void recorridoInorden();
    void recorridoPreorden();
    void recorridoPostorden();
}