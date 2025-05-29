package modelo;

import interfaces.IArreglos;

public class Arreglos implements IArreglos{
	
	public void metodoNuevo() {
		System.out.println("HOLA"); 
	}
	
	@Override
	 public void mostrarArreglo(int[] a, int t) {
		// TODO Auto-generated method stub
		//Mostrar
		for ( int i = 0; i<t; i++) {
			//i++ i = i +1
			System.out.println(a[i]);
		}
		
	}

	@Override
	public void cargarArreglo(int[] a, int t) {
		// TODO Auto-generated method stub
		for ( int i = 0; i<t; i++) {
			//i++ i = i +1
			a[i] =19 + i;
		}
	}

}
