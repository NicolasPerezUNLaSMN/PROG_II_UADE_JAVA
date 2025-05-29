package interfaces;

import modelo.Conjunto;

public interface IDiccionario {
    /**
     * Inicializa el diccionario.
     * Precondición: Ninguna.
     * Postcondición: El diccionario se inicializa y está vacío.
     */
    void InicializarDiccionario();

    /**
     * Agrega una clave y su valor al diccionario.
     * Precondición: El diccionario debe estar inicializado.
     * Postcondición: Se agrega un nuevo par clave-valor al diccionario.
     * @param clave la clave a agregar.
     * @param valor el valor asociado a la clave.
     */
    void Agregar(int clave, int valor);

    /**
     * Elimina la clave y su valor del diccionario.
     * Precondición: El diccionario debe estar inicializado y la clave debe existir en el diccionario.
     * Postcondición: Se elimina el par clave-valor del diccionario.
     * @param clave la clave a eliminar.
     */
    void Eliminar(int clave);

    /**
     * Recupera el valor asociado a una clave.
     * Precondición: El diccionario debe estar inicializado y la clave debe existir en el diccionario.
     * Postcondición: Devuelve el valor asociado a la clave.
     * @param clave la clave cuyo valor se desea recuperar.
     * @return el valor asociado a la clave.
     */
    int Recuperar(int clave);

    /**
     * Devuelve el conjunto de claves del diccionario.
     * Precondición: El diccionario debe estar inicializado.
     * Postcondición: Devuelve un conjunto con todas las claves del diccionario.
     * @return el conjunto de claves.
     */
    Conjunto Claves();
}