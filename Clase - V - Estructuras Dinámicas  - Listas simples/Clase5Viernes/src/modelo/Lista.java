package modelo;

import interfaces.ILista;
import interfaces.INodo;

public class Lista implements ILista {
	
	/// -->23 ->  34  ->  4  -> 11 
	///Lista: primero
	///Atributos!!!!
	private INodo primero;
	//cantidad!!! opcional!!!

	public INodo getPrimero() {
		return primero;
	}

	public void setPrimero(INodo primero) {
		this.primero = primero;
	}

	@Override
	public String toString() {
		return "Lista [primero=" + primero + "]";
	}
	
	//Crear una lista
	public Lista() {
		super();
		this.primero = null;
	}
	
	public int eliminarPrimero() {
		
		///L->23  ->  444  -> 51 -> 23  ->null  
		if ( !estaVacia()) {
			int datoQueVoyAPerder = primero.getDato();
			//destructor(primero); --- JAVA - JVM
			primero = primero.getSiguiente();
			///Nodo: (23)   L->  444  -> 51 -> 23  ->null 
			///(23, ---> 444) //Sigue ocupando memoria??
			
			return datoQueVoyAPerder;
			
		}else {
			System.out.println("No puedo sacar en una lista vacia");
			return -1;
		}
		
	};
	
	
	
	
	
	public int buscar(int d) {
		//retornar la pos
		int contador = 0 ; 
		//12   22   33    23
		if ( !estaVacia()) {
			INodo actual = primero;
			while (actual.getDato()!=d && actual.getSiguiente()!=null ) {	
				actual = actual.getSiguiente();
				contador++;
			}//cierra el while
			//Lo encontre..
			if(actual.getDato()==d) {
				return contador;
			}
			//no lo encontre y llegue al null
			else {
				System.out.println("No lo encontre!!!");
				return -1; 
			}		
		}//cierra el if
		else { //lista vacia
			System.out.println("No lo encontre!!!");
			return -1; 
			
		}
		
		
	};
	
	public int obtenerGenerico(int pos) {
		///L: ->23 -> 22  -> 12 ->  1  -> 23 ->null  //pos: 2 //retorno: 12
		//int p = -1; 
		int cont = 0;
		//pos < cantidadDeElementos
		if ( !estaVacia()  && pos<cantidadElementos() && pos>=0) {
			INodo actual = primero; 
			while ( cont < pos && actual.getSiguiente()!=null ) {
				actual = actual.getSiguiente();
				cont++;
			}
			return actual.getDato();
		}else {
			//try
			System.out.println("Error no puedo agarrarlo");
			return -1; //error
		}
	};
	
	
	public boolean estaVacia() {
		boolean respuesta;
		if(primero ==null) {
			respuesta = true;
		}else {
			respuesta = false;
		}
		return respuesta;
	}
	
	public void insertarPrimero(int d) {
		///L-> 23 ->  42  ->  11 ->NUll     (2)
		Nodo nuevoNodo = new Nodo(d);//(2, null)
		if(!estaVacia()) { //NOT es !
			///L--------->  
			/// (2) ->   23 ->  42  ->  11 ->NUll   
			nuevoNodo.setSiguiente(primero);  
			primero = nuevoNodo;
		}else { //Lista vacia
			primero = nuevoNodo;
		}	
	};
	
	public void insertarUltimo(int d) {
		///L-> 23 ->  42  ->  11 ->NUll     (2)
		Nodo nuevoNodo = new Nodo(d); //resreve memoria
		if(!estaVacia()) {
			INodo actual = primero;
			while (actual.getSiguiente()!=null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevoNodo);
		}else {
			primero = nuevoNodo;
		}
	};
	
	public int cantidadElementos() {
		
		int cantidad = 0 ; 
		if(estaVacia()) {
			return cantidad;
		}else {
			//cantidad = 1; 
			INodo actual = primero;
			while ( actual.getSiguiente()!=null) {
				actual = actual.getSiguiente();
				cantidad++;
			}	
			return cantidad + 1 ; 	
		}
		
		
	}

	@Override
	public void insertarGenerico(int d, int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int eliminarUltimo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarGenerico(int pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int obtenerPrimero() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int obtenerUltimo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ordenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	};
	
	

}
