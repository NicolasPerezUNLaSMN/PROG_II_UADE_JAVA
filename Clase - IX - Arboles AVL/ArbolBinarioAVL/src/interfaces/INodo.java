package interfaces;

public interface INodo {
	
    int getDato();
    void setDato(int dato);
    INodo getIzquierdo();
    void setIzquierdo(INodo izquierdo);
    INodo getDerecho();
    void setDerecho(INodo derecho);
    int getAltura();
    void setAltura(int altura);
}