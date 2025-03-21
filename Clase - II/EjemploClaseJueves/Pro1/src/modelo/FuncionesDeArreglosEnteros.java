package modelo;

import interfaces.IFuncionesDeArreglosEnteros;

///Qué pongo acá???--- implementación
public class FuncionesDeArreglosEnteros implements IFuncionesDeArreglosEnteros {
	
	
		@Override
		public void cargarArregloDeEnteros(int[] array, int tam) {
			//array.length(); tam
			///Cargar array
			for (int i = 0; i < tam; i++ ) {
				
				///i++ ----> i = i+1;
				///i+=3 ----> i = i+3;
				//variableArreglo[0] = 11; 
				array[i] = 18+2*i;//input()
				
			}
			
			
		} ///Cierra el procedimiento cargarArreglo
		
		
		
		///Mostrar arreglo
		@Override
		public void mostrarArregloDeEnteros(int[] array, int tam) {
			System.out.print("(");
			for (int i = 0; i < tam; i++ ) {
				
				System.out.print(" " +i +": " +array[i] +",");
				
			}
			System.out.print(")");
		} //Cierra el procedimiento mostrarArreglo


}
