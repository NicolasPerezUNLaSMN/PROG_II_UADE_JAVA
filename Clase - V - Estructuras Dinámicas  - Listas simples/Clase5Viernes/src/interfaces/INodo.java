package interfaces;



public interface INodo {
	//Solo los métodos
	public int getDato();
	public void setDato(int dato);
	public  INodo getSiguiente();
	public void setSiguiente( INodo siguiente) ;
	@Override
	public String toString();
}
