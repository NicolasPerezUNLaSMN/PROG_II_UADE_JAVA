package test;

import modelo.Conjunto;

public class TestConjunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conjunto c = new Conjunto();
		
		c.agregar(4);
		c.agregar(11);
		c.agregar(4);
		c.agregar(21);
		c.agregar(-101);
		
		c.mostrarConjunto();
		
		System.out.print(c.pertenece(22));

	}

}
