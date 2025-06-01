package interfaces;

public interface IGrafo {
    void agregarNodo(int valor);
    void agregarArista(int origen, int destino, int peso);
    void mostrarListaAdyacencia();
}
