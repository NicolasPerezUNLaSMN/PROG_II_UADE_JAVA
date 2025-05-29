package test;

import modelo.ListObject;

public class TestListObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ListObject lista = new ListObject();

	        lista.insertar(10);          // Integer
	        lista.insertar("Hola");      // String
	        lista.insertar(3.14);         // Double
	        lista.insertar(true);         // Boolean
	        lista.insertar('A');          // Character

	        lista.imprimir();

	}

}
