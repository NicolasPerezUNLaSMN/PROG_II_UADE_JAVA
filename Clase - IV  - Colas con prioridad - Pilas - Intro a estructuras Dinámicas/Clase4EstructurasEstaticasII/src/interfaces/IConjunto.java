package interfaces;

//Definición de la interfaz IConjunto

public interface IConjunto {
	
 void inicializarConjunto();
 boolean conjuntoVacio();
 void agregar(int x);
 int elegir();
 void sacar(int x);
 boolean pertenece(int x);
 void mostrarConjunto(); // Método agregado para mostrar el conjunto
 
}
