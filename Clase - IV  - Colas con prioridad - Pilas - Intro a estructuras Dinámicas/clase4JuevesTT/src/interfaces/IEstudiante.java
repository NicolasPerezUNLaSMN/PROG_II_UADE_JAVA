package interfaces;

public interface IEstudiante {
	
	///Pre - Post!!!!
	///Los atributos no van, y los constructores tampoco
	/// Casos particulares de atributos:
	/// Constantes para todas las instancias!!!
	
	public int getLegajo() ;
	public void setLegajo(int legajoNuevo);

	public String getNombre();
	public void setNombre(String nombre);
	
	public boolean isActivo();
	public void setActivo(boolean activo) ;

	@Override
	public String toString() ;
	

}
