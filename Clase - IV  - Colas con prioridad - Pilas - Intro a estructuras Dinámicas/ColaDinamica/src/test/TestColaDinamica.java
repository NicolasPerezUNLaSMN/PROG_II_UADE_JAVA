package test;

import modelo.ColaDinamica;

public class TestColaDinamica {
	//Cola - pila - lista - conj - direccionas 
	//arboles - arboles binarios - grafos (nodos)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColaDinamica c = new ColaDinamica();
		System.out.println(c);
		
		c.encolar(1);
		c.encolar(2);
		c.encolar(3);
		c.encolar(1);
	
		
		System.out.println(c);
		
		System.out.println("SACO:" +c.desencolar());
		System.out.println(c);

	}

}
