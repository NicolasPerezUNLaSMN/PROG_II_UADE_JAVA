package interfaces;

public interface ILista {

    // Pre: -
    // Pos: Retorna true si la lista no contiene elementos
    // Ax: esVacia() <=> cantidadElementos() == 0
    public boolean esVacia();

    // Pre: dato definido
    // Pos: Inserta el dato al inicio de la lista
    public  void insertarPrimero(int dato);

    // Pre: dato definido
    // Pos: Inserta el dato al final de la lista
    public void insertarUltimo(int dato);

    // Pre: posicion >= 0 y <= cantidadElementos(), dato definido
    // Pos: Inserta el dato en la posición indicada
    public void insertarPosicion(int dato, int posicion);

    // Pre: La lista no debe estar vacía
    // Pos: Elimina el primer elemento de la lista
    public void eliminarPrimero();

    // Pre: La lista no debe estar vacía
    // Pos: Elimina el último elemento de la lista
    public void eliminarUltimo();

    // Pre: posicion >= 0 y < cantidadElementos()
    // Pos: Elimina el elemento en la posición indicada
    public  void eliminarPosicion(int posicion);

    // Pre: La lista no debe estar vacía
    // Pos: Retorna el primer elemento de la lista
    public int obtenerPrimero();

    // Pre: La lista no debe estar vacía
    // Pos: Retorna el último elemento de la lista
    public int obtenerUltimo();

    // Pre: posicion >= 0 y < cantidadElementos()
    // Pos: Retorna el elemento en la posición indicada
    public  int obtenerPosicion(int posicion);

    // Pre: -
    // Pos: Retorna la cantidad de elementos en la lista
    public int cantidadElementos();

    // Pre: dato definido
    // Pos: Devuelve la posición del dato si existe, -1 si no se encuentra
    public  int buscarSecuencial(int dato);

    // Pre: -
    // Pos: Ordena los elementos de la lista en forma ascendente
    public  void ordenarLista();

    // Pre: -
    // Pos: Muestra por consola los elementos de la lista en orden
    public void mostrarLista();
}