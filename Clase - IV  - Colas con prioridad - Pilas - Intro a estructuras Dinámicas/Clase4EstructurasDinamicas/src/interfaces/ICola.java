package interfaces;

public interface ICola {
    /**
     * Inicializa la cola.
     * Precondición: Ninguna.
     * Postcondición: La cola está vacía.
     */
    void InicializarCola();

    /**
     * Agrega un elemento al final de la cola.
     * Precondición: La cola debe estar inicializada.
     * Postcondición: El elemento se agrega al final de la cola.
     * @param elemento el elemento a agregar a la cola.
     */
    void Encolar(int elemento);

    /**
     * Elimina el primer elemento de la cola.
     * Precondición: La cola no debe estar vacía.
     * Postcondición: Se elimina el primer elemento de la cola.
     * @return el elemento eliminado de la cola.
     */
    int Desencolar();

    /**
     * Verifica si la cola está vacía.
     * Precondición: La cola debe estar inicializada.
     * Postcondición: Devuelve true si la cola está vacía, false en caso contrario.
     * @return true si la cola está vacía, false en caso contrario.
     */
    boolean ColaVacia();
}