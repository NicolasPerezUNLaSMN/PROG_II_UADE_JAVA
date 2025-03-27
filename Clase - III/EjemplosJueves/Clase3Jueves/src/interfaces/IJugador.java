package interfaces;

public interface IJugador {
	
	//Solo los métodos!!!
	//Ni atributos ni constructores
	///Atributos en la interface!!!! Hay una sola forma!!!
	///son atributos constantes!!!!
	///
	
	public String getNombre();

	public void setNombre(String n);

	public int getNro() ;

	public void setNro(int nroNuevo) ;

	public float getAltura() ;

	public void setAltura(float alturaNueva) ;

	@Override
	public String toString() ;
	
	//Metodos propios!!!
	public void correr();

}
