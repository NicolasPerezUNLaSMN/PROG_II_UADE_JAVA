package interfaces;

public interface IArrayEnteros {
    int LONGITUD_MAXIMA = 100; //  Constante: Tamaño máximo del array

    void agregarElemento(int elemento);
    boolean eliminarElemento(int elemento);
    int buscarElemento(int elemento); // Búsqueda binaria si está ordenado
    void ordenar();
    double calcularPromedio();
    int obtenerMaximo();
    int obtenerMinimo();
    void mostrarArray();
}