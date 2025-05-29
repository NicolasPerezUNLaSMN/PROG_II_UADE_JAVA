package test;

import modelo.ColaPrioridadEstatico;

public class TestColaPrioridadEstatico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColaPrioridadEstatico c = new ColaPrioridadEstatico();
		System.out.println(c);	
		
		c.encolar(1, 10);
		c.encolar(2, 5);
		
		System.out.println(c); //1 - 2     c:2 ul:2  prim: 0
		
		c.encolar(3, 7); //1 -3 -  2      c:3    ul:3  prim: 0
		
		System.out.println(c);
		
		System.out.println("SAQUE AL:" +c.desencolar());
		
		System.out.println(c);
	}

}
