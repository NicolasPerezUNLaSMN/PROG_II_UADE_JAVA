package interfaces;

import modelo.Estudiante;

public interface IMateria {
	
	
	@Override
	public String toString();
	public int getCodigo() ;
	public void setCodigo(int codigo);
	public String getNombre();
	public void setNombre(String nombre);
	
	public Estudiante[] getEstudiantes() ;

	public void setEstudiantes(Estudiante[] estudiantes) ;
	public void ingresarEstudiantes();

}
