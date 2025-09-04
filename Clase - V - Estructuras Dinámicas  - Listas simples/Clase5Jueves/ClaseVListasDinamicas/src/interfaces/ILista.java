package interfaces;

import modelo.Nodo;

public interface ILista {
	
	public INodo  getPrimero(); 
	public void setPrimero(INodo  primero) ;
	public String toString() ;
	
	//////////-------PRIMITIVAS--------///////
	///Agregar
	public void agregarUltimo(int d); //Cola -Pila encolar - apilar
	public void agregarPrimero(int d);
	public void agregarGenerico(int d, int pos);
	
	///Aliminar (retornar un Nodo o int)
	public int eliminar(int pos);
	public int eliminarPrimero(); //Cola --- desencolar
	public int eliminarUltimo(); //pila ---- desapilar
	
	///Obtener elemento (retornar un Nodo o int)
	public int obtenerPrimero(); //Cola
	public int obtenerUltimo(); //pila
	public int obtenerGenerico(int pos);
	
	//////////-------EXTRAS--------///////
	public boolean estaVacia();
	public int cantidadElementos();
	public void mostrarLista();
	
	///------ Metodos más complejos ------
	///// 22   32   33   11  22   (Buscando el 11)!! true - false
	///retornar el Nodo
	///retorn pos!!!!! 
	
	public int busquedaLineal(int d);
	

}
