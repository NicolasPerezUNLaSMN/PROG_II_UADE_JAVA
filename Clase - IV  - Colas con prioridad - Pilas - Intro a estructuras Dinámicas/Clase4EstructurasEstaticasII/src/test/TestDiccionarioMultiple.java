package test;

import modelo.Diccionario;
import modelo.DiccionarioMultiple;

public class TestDiccionarioMultiple {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiccionarioMultiple d = new DiccionarioMultiple();
		
		d.agregar(1,11);
		d.agregar(2,23);
		d.agregar(2,101);
		d.agregar(1,55);
		d.agregar(3,500);
		
		
		d.claves().mostrarConjunto();
		
		System.out.println("----> recupero valor con clave 2: " );
		d.recuperar(1).mostrarConjunto();

	}

}
