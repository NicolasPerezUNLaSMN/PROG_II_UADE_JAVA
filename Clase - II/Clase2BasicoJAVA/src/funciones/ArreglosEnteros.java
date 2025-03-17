package funciones;

import java.util.Random;

import interfaces.IArreglosEnteros;

public class ArreglosEnteros implements IArreglosEnteros {
	

	/// 1. Cargar un arreglo con valores aleatorios dentro de un rango
	@Override
    public  void cargarAleatorio(int[] arr, int min, int max) {
    	Random r = new Random();
    	for ( int i =0; i<arr.length; i++) {
    		
    		arr[i] = min+ r.nextInt(max-min);
    	}
    	
    	
    }

	@Override
	public void mostrarArreglo(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarAscendente(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarDescendente(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean buscarNumero(int[] arr, int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int busquedaBinaria(int[] arr, int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int encontrarMaximo(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int encontrarMinimo(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sumaElementos(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPromedio(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void invertirArreglo(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int contarOcurrencias(int[] arr, int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] eliminarElemento(int[] arr, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean estaOrdenado(int[] arr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int[] copiarArreglo(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	

  
	

}
