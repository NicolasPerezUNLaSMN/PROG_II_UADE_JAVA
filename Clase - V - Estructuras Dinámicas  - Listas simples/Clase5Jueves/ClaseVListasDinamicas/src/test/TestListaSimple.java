package test;

import modelo.Lista;
import interfaces.ILista;
//Lista simplemente enlazada!!!!
public class TestListaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pensar!!! 
		ILista l = new Lista();
		
		System.out.println("Es vacia: " +l.estaVacia());
		
		System.out.println(l);
		
	
		
		l.agregarPrimero(11);
		l.agregarPrimero(22);
		l.agregarPrimero(33);
		l.agregarUltimo(100);
		
		
		System.out.println(l);
		System.out.println("Es vacia: " +l.estaVacia());
		//33 22 11 100 . cantidad 4
		System.out.println("Cantidad: " +l.cantidadElementos());
		
		System.out.println("Elemento 2: " +l.obtenerGenerico(2));
		
		// 22 11 100 . cantidad 3
		System.out.println("ELIMANDO:" +l.eliminarPrimero());
		System.out.println(l);
		
		System.out.println("Busco el : 100: -->" +l.busquedaLineal(100));

	}
}
