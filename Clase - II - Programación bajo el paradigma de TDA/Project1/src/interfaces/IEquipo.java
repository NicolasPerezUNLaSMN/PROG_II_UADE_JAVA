package interfaces;

public interface IEquipo {
	
	public String getNombreDeEquipo() ;

	public void setNombreDeEquipo(String nombreDeEquipo) ;

	public int getPosEnEltorneo() ;

	public void setPosEnEltorneo(int posEnEltorneo) ;

	public String getProvincia();

	public void setProvincia(String provincia) ;
	
	@Override
	public String toString() ;
}
