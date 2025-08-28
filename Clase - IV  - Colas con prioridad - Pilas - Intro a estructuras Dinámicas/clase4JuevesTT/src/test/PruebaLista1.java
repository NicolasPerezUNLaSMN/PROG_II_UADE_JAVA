package test;

import modelo.Lista;

public class PruebaLista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista lista1 = new Lista();//Lista sin nada
		
		///insertarPrimero(5)   --> 1 2  4  11
		///  5    1  2  4  11
		//Primer primitiva de Lista
		lista1.insertarPrimero(11);
		lista1.insertarPrimero(23);
		lista1.insertarPrimero(35);
		
		lista1.insertarUltimo(-1);
	
		
		// 35--->23---->11----> null
		
		System.out.println(lista1);
		

	}

}
