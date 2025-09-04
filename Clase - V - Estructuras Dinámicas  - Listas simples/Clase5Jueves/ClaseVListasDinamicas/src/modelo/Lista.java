package modelo;

import interfaces.ILista;
import interfaces.INodo;

public class Lista implements ILista {
	
	//Atributos!!!!
	private INodo  primero;
	///private Nodo primero
	
	///int cant opcional!!!!
	///
	///
	///
	///

	
	public int busquedaLineal(int d) {
		
		//11   222    111   5      23 -->null   (buscando el 5) 
		//return 3
		
		if (! estaVacia()) {
			
			int pos = 0; 
			INodo  actual = primero; 
			while(actual.getDato()!=d  && actual.getSiguiente()!=null) {
				
				actual = actual.getSiguiente();
				pos++;
			}//cierra el while
			
			
			if ( pos>=0 && pos<cantidadElementos() ) {
				return pos;
			}
			else {
				System.out.println("no lo encontre!!!");
				return -1;
			}
			
		}//cierra el if
		else {
			System.out.println("Está vacia!!!");
			return -1;
		}
		
		
	};
	
	
	public int eliminarPrimero() {
		
		if (!estaVacia()) {
			
			///11  L--->  22   113
			int datoAEliminar = primero.getDato();
			primero = primero.getSiguiente();
			return datoAEliminar;
		}else {
			return -1;
		}
		
		
		
	}; 
	public int obtenerGenerico(int pos) {
		//(pos = 2)
		//23    333    1   25 -> null
		//return -> 1
		
		if(!estaVacia() && pos<cantidadElementos()) {
			int contador = 0; 
			//for ( contador = 0; contador <pos;contador++
			INodo  actual = this.primero;
			while(contador != pos) { //es lo mismo con el <
				actual = actual.getSiguiente();
				contador++;	
			}
			return actual.getDato();
			
		}else {
			System.out.println("Error!!!!no puedo sacar un elemento\n de esta lista.");
			return -1;
		}
		
		
	};
	
	
	public int cantidadElementos() {
		
		if(estaVacia()) {
			return 0;
			
		}else { ///111   222
		
			int cantidad = 1; 
			
			INodo  actual = this.primero;
			
			while(actual.getSiguiente()!=null) {
				actual = actual.getSiguiente();
				cantidad++;
			}
			
			return cantidad;
		}
		
	};
	
	public void agregarUltimo(int d) {
		///L-> 54 ---->- 11 -->-- 22 -->null   (44)->null
		///                             -------->
		INodo  nuevoNodo = new Nodo(d); //((44, null))
		
		if(!estaVacia()) {
			
			INodo  actual = this.primero;
			
			while (actual.getSiguiente()!=null) {	
				
				actual = actual.getSiguiente();
				//actual.siguiente; -- encapsulado!!!!
				///Setter??? !!!! NO se puede porque ni hay
				//////un setter que haga eso!!!
				//actual.setSiguiente(this.getPrimero());
				
			}
			
			//Actual que será? 22 (ultimo)
			actual.setSiguiente(nuevoNodo);
		}else { //Vacio el más facil siempre!!!
			agregarPrimero(d);
		}
		
	};
	
	
	public void agregarPrimero(int d) {
	//Lista --> |22| -->  |3| --->  |4|     (44)
	//Crear el nodo
	Nodo nuevoNodo = new Nodo(d); //nuevoNodo = (44, null)
	//primero = nuevoNodo()
	if ( !estaVacia()) {
		nuevoNodo.setSiguiente(this.primero);
		
		 //(44) -->  |22| -->  |3| --->  |4| 
		//primero = nuevoNodo;
		setPrimero(nuevoNodo); //validación
		
		//Lista --> (44) -->  |22| -->  |3| --->  |4| 
	}else { //está vacia
		
		//lista ---> null
		//null.setSiguiente NO ANDA!!!!
		///primero = nuevoNodo;
		setPrimero(nuevoNodo); 
	}
	
	};
	
	public boolean estaVacia() {
		/*
		if(primero == null) {
			return true;
		}else {
			return false;
		}*/
		
		/*
		boolean respuesta = (primero==null);
		
		return respuesta;
		*/
		return primero==null;
	};
	

	//Constructor de la lista!!!!
	public Lista(INodo  primero) {
		super();
		this.primero = primero;
	}	
	
	//Se usa este!!!!!!
	public Lista() {
		super();
		this.primero = null;
	}

	
	
	
	public INodo  getPrimero() {
		return primero;
	}

	public void setPrimero(INodo  primero) {
		//Validaciones!!!
		this.primero = primero;
	}

	@Override
	public String toString() {
		return "Lista [primero=" + primero + "]";
	}


	@Override
	public void agregarGenerico(int d, int pos) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int eliminar(int pos) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int eliminarUltimo() {
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
	public void mostrarLista() {
		// TODO Auto-generated method stub
		
	}	
	
	
	
	
	

}
