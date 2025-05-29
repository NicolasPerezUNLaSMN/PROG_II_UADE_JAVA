package test;

import modelo.ColaDinamica;

public class TestColaDinamica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColaDinamica c = new ColaDinamica();
		System.out.println(c);
		
		c.encolar(11);
		c.encolar(2);
		c.encolar(3);
		
		System.out.println(c);    /// 11                  2    3
		
		System.out.println("\n--------\nSAQUE: " +c.desencolar());
		
		System.out.println(c);

	}

}
