package interfaces;



public interface ILista {
	
	public INodo getPrimero() ;
	public void setPrimero(INodo primero);

	@Override
	public String toString() ;
	
	///Primitivas!!!!
	/// 12   2     3     1     (34)
	///INSERTAR - AGREGAR
	public void insertarPrimero(int d);
	public void insertarUltimo(int d); //Cola -Pila
	public void insertarGenerico(int d, int pos);//Tarea
	
	///ELIMINAR
	///Nodo - int 
	public int eliminarPrimero(); //Cola
	public int eliminarUltimo();//-Pila
	public int eliminarGenerico(int pos);
	
	///Obetener
	///Nodo - int
	public int obtenerPrimero(); //Cola
	public int obtenerUltimo(); //Cola -Pila
	public int obtenerGenerico(int pos);
	
	//9:45
	///Métodos - extras
	public boolean estaVacia();
	public int cantidadElementos();
	
	public void ordenar(); //selec - inse -burbu 
	public void mostrar();
	public int buscar(int d);  //retorna la pos
	

}
