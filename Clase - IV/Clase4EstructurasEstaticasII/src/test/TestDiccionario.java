package test;

import modelo.Diccionario;

public class TestDiccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diccionario d = new Diccionario();
		
		d.Agregar(1,11);
		d.Agregar(2,23);
		d.Agregar(3,500);
		
		
		d.Claves().mostrarConjunto();
		
		System.out.println("----> recupero valor con clave 2: " +d.Recuperar(2));

	}

}
