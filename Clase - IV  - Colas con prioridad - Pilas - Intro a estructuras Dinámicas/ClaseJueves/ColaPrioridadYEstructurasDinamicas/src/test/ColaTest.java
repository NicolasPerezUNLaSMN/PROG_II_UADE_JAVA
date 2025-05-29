package test;

import modelo.Cola;

public class ColaTest {

	
	public static void main(String[] args) {
		
		Cola c = new Cola();
		
		System.out.println(c);
		
		c.encolar(1, 2);
		c.encolar(2, 1);
		c.encolar(3, 11);
		c.encolar(4, 2);
		System.out.println(c);
		
		
	}
}
