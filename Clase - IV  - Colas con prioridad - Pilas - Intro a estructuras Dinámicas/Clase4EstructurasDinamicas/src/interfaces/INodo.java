package interfaces;

public interface INodo {
    /**
     * Obtiene el valor del nodo.
     * @return el valor del nodo.
     */
    int getInfo();

    /**
     * Obtiene el siguiente nodo.
     * @return el siguiente nodo.
     */
    INodo getSiguiente();

    /**
     * Establece el siguiente nodo.
     * @param siguiente el nodo siguiente.
     */
    void setSiguiente(INodo siguiente);
}
