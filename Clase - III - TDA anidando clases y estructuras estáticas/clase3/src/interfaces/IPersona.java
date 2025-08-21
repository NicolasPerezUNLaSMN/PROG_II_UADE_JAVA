package interfaces;

public interface IPersona {
	
	//Atributo final
	//public static final int dni = 0;
	
	
	///Los constructores no se ponene en la interface!!!
	//public Persona(int dni, String nombre, float altura);
	//Pre
	//Post
	//Aximo
	public int getDni();
	
	//Pre
	//Post
	//Aximo
	public void setDni(int dni);
	
	//Pre
	//Post
	//Aximo
	public String getNombre() ;
	
	//Pre
	//Post
	//Aximo
	public void setNombre(String nombre) ;

	//Pre
	//Post
	//Aximo
	public float getAltura();
	
	//Pre
	//Post
	//Aximo
	public void setAltura(float altura) ;
	
	//Pre
	//Post
	//Aximo
	public String toString() ;
	
	

}
