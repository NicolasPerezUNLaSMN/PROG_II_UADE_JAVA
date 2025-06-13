package interfaces;

import modelo.Conjunto;

public interface IDiccionarioMultiple {
    /**
     * Inicializa el diccionario.
     * Precondición: Ninguna.
     * Postcondición: El diccionario se inicializa y está vacío.
     */
    void inicializarDiccionario();

    /**
     * Agrega una clave y un valor al diccionario.
     * Precondición: El diccionario debe estar inicializado.
     * Postcondición: Se agrega un nuevo par clave-valor al diccionario.
     * @param clave la clave a agregar.
     * @param valor el valor asociado a la clave.
     */
    void agregar(int clave, int valor);

    /**
     * Elimina la clave y todos sus valores del diccionario.
     * Precondición: El diccionario debe estar inicializado.
     * Postcondición: Se elimina la clave y todos los valores asociados a ella del diccionario.
     * @param clave la clave a eliminar.
     */
    void eliminar(int clave);

    /**
     * Elimina un valor asociado a una clave específica en el diccionario.
     * Precondición: El diccionario debe estar inicializado.
     * Postcondición: Se elimina el valor asociado a la clave, si existe.
     * @param clave la clave donde se eliminará el valor.
     * @param valor el valor a eliminar de la clave.
     */
    void eliminarValor(int clave, int valor);

    /**
     * Recupera todos los valores asociados a una clave.
     * Precondición: El diccionario debe estar inicializado y la clave debe existir en el diccionario.
     * Postcondición: Devuelve un conjunto con los valores asociados a la clave.
     * @param clave la clave cuyos valores se desean recuperar.
     * @return un conjunto con los valores asociados a la clave.
     */
    Conjunto recuperar(int clave);

    /**
     * Devuelve el conjunto de claves del diccionario.
     * Precondición: El diccionario debe estar inicializado.
     * Postcondición: Devuelve un conjunto con todas las claves del diccionario.
     * @return 
     * @return el conjunto de claves.
     */
     Conjunto claves();
}