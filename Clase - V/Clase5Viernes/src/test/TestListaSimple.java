package test;

import interfaces.ILista;
import modelo.Lista;


public class TestListaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///Listas DINAMICAS
		ILista l = new Lista(); //Altamente recomendable!!!
		System.out.println("Vacia: "+l.estaVacia() );
		System.out.println("Cantidad: "+ l.cantidadElementos());
		System.out.println(l);
		
		l.insertarPrimero(11);
		l.insertarPrimero(2);
		l.insertarPrimero(23);
		l.insertarUltimo(100);
		l.insertarUltimo(1);
		System.out.println("Vacia: "+l.estaVacia() );
		System.out.println(l); //23   2   11  100  1
		System.out.println("Cantidad: "+ l.cantidadElementos());
		
		System.out.println("Agarrar el elemento 2: " +l.obtenerGenerico(-1));
		
		System.out.println("Buscar un elemento 100: " +l.buscar(100));
		
		l.eliminarPrimero();
		System.out.println(l); //   2   11  100  1
	}

}
