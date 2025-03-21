package modelo;

import interfaces.IArregloDeEnteros;

//Relaciono la clase con la interfaz
public class ArregloDeEnteros implements IArregloDeEnteros {
	
	///Funciones de la Clase
		///Static quiere decir que no depende de instancias de la clase!!
		public void cargarArreglo(int[] arreglo, int t ){//t seria el tmaño, arreglo el arreglo
			//Cargar el arreglo 
			for (int i = 0; i<t; i++ ) {//abre el for
				//i++ ---> i =  i+1;
				arreglo[i] = 20 + i; //input ... random
			}//cierra el for
		} //Cierra el procedimiento
		
		//NO AMIGO, no lo voy a poner static--
		//Lo siento eclipse
		public void mostrarArreglo(int[] arreglo, int t ){
			//Mostrar el arreglo!!!
			for (int i = 0; i<t; i++ ) {
				System.out.print(" - "+arreglo[i] +", ");
			}	
		}

}
