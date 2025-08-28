package interfaces;

import modelo.Nodo;

public interface ILista {
	
	//Primitivas!!!
	public void insertarPrimero(int dato);
	public void insertarUltimo(int dato);
	public void insertar(int dato, int pos);
	
	public void eliminarPrimero();
	public void eliminarUltimo();
	public void eliminar(int pos);
	
	public Nodo obtenerPrimero();
	public Nodo obtenerUltimo();
	public Nodo obtener(int pos);
	
	public int obtenerTam();
	public boolean esVacia();
	
	
	
	//Set y get

}
