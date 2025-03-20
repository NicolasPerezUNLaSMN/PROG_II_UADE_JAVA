package interfaces;

//Definición de la interfaz IPila
public interface IPila {
 /**
  * Inicializa la pila dejándola vacía.
  * Precondición: ninguna.
  * Postcondición: la pila queda vacía.
  */
 void inicializarPila();

 /**
  * Agrega un elemento a la pila.
  * Precondición: la pila debe estar inicializada y no debe estar llena.
  * Postcondición: el elemento x es el nuevo tope de la pila.
  */
 void apilar(int x);

 /**
  * Elimina y devuelve el elemento en el tope de la pila.
  * Precondición: la pila no debe estar vacía.
  * Postcondición: el tope de la pila es el elemento anterior al desapilado.
  */
 public int desapilar() ;

 /**
  * Verifica si la pila está vacía.
  * Precondición: la pila debe estar inicializada.
  * Postcondición: retorna true si la pila no contiene elementos, false en caso contrario.
  */
 boolean pilaVacia();

 /**
  * Verifica si la pila está llena.
  * Precondición: la pila debe estar inicializada.
  * Postcondición: retorna true si la pila ha alcanzado su capacidad máxima, false en caso contrario.
  */
 boolean pilaLlena();

 /**
  * Devuelve el elemento en el tope de la pila sin eliminarlo.
  * Precondición: la pila no debe estar vacía.
  * Postcondición: se obtiene el elemento en el tope sin modificar la pila.
  */
 int tope();

 /**
  * Devuelve la cantidad de elementos en la pila.
  * Precondición: la pila debe estar inicializada.
  * Postcondición: devuelve el número de elementos en la pila.
  */
 int tamanio();
}