package interfaces;

//Definición de la interfaz IColaPrioridad
public interface IColaPrioridad {
 /**
  * Inicializa la cola de prioridad dejándola vacía.
  * Precondición: ninguna.
  * Postcondición: la cola de prioridad queda vacía.
  */
 void inicializarCola();

 /**
  * Agrega un elemento a la cola con una prioridad asociada.
  * Precondición: la cola debe estar inicializada y no debe estar llena.
  * Postcondición: el elemento x es agregado según su prioridad.
  */
 void encolar(int x, int prioridad);

 /**
  * Elimina y devuelve el elemento con mayor prioridad de la cola.
  * Precondición: la cola no debe estar vacía.
  * Postcondición: el elemento con mayor prioridad es eliminado de la cola.
  */
 int desencolar();

 /**
  * Verifica si la cola está vacía.
  * Precondición: la cola debe estar inicializada.
  * Postcondición: retorna true si la cola no contiene elementos, false en caso contrario.
  */
 boolean colaVacia();

 /**
  * Devuelve el elemento con mayor prioridad sin eliminarlo.
  * Precondición: la cola no debe estar vacía.
  * Postcondición: se obtiene el elemento con mayor prioridad sin modificar la cola.
  */
 int primero();
 
 /**
  * Muestra los elementos de la cola y sus prioridades.
  * Precondición: la cola no debe estar vacía.
  * Postcondición: no tiene retorno solo muestra por consola.
  */
 void mostrarCola(); // Método agregado para mostrar el estado de la cola
}
