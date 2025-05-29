package interfaces;

import modelo.Nodo;

public interface IColaDinamica {
	
	//Encolar

    /**
     * Precondición:
     * - La cola debe estar correctamente inicializada.
     * 
     * Postcondición:
     * - Se agrega un nuevo nodo con 'dato' al final de la cola.
     * - Si la cola estaba vacía, 'primero' y 'ultimo' apuntan al nuevo nodo.
     * - La cantidad de elementos en la cola se incrementa en 1.
     * 
     * Axiomas:
     * 1. Si cantidad == 0, entonces después de encolar(dato):
     *    - primero == ultimo
     *    - primero.dato == dato
     * 2. Después de encolar(dato):
     *    - ultimo.dato == dato
     * 3. Después de encolar(dato):
     *    - cantidad == cantidad_anterior + 1
     */
	
	public void encolar(int dato);
	
	//Desencolar
	/**
     * Precondición:
     * - La cola no debe estar vacía (cantidad > 0).
     * 
     * Postcondición:
     * - Se elimina y retorna el nodo que estaba en la cabeza de la cola.
     * - Si la cola queda vacía después de la operación:
     *    - primero == null
     *    - ultimo == null
     * - La cantidad de elementos en la cola se decrementa en 1.
     * 
     * Axiomas:
     * 1. Si cantidad == 1, después de desencolar():
     *    - primero == null
     *    - ultimo == null
     *    - cantidad == 0
     * 2. Después de desencolar():
     *    - primero apunta al siguiente nodo del que era primero antes de la operación.
     * 3. Después de desencolar():
     *    - cantidad == cantidad_anterior - 1
     */
	public Nodo desencolar();
	
}
