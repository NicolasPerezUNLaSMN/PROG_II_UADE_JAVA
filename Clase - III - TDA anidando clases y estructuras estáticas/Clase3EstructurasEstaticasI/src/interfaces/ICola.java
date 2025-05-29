package interfaces;

//Definición de la interfaz ICola
public interface ICola {
 /**
  * Inicializa la cola dejándola vacía.
  * Precondición: ninguna.
  * Postcondición: la cola queda vacía.
  */
 void inicializarCola();

 /**
  * Agrega un elemento a la cola.
  * Precondición: la cola debe estar inicializada y no debe estar llena.
  * Postcondición: el elemento x se agrega al final de la cola.
  */
 void encolar(int x);

 /**
  * Elimina y devuelve el primer elemento de la cola.
  * Precondición: la cola no debe estar vacía.
  * Postcondición: el primer elemento de la cola se elimina y se devuelve.
  */
 int desacolar();

 /**
  * Verifica si la cola está vacía.
  * Precondición: la cola debe estar inicializada.
  * Postcondición: retorna true si la cola no contiene elementos, false en caso contrario.
  */
 boolean colaVacia();

 /**
  * Verifica si la cola está llena.
  * Precondición: la cola debe estar inicializada.
  * Postcondición: retorna true si la cola ha alcanzado su capacidad máxima, false en caso contrario.
  */
 boolean colaLlena();

 /**
  * Devuelve el primer elemento de la cola sin eliminarlo.
  * Precondición: la cola no debe estar vacía.
  * Postcondición: se obtiene el primer elemento sin modificar la cola.
  */
 int primero();

 /**
  * Devuelve la cantidad de elementos en la cola.
  * Precondición: la cola debe estar inicializada.
  * Postcondición: devuelve el número de elementos en la cola.
  */
 int tamanio();
}