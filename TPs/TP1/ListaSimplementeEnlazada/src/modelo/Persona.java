package modelo;

public class Persona {
	
	private int dni;
	private String nombre;
	//Lo más importante del TP
	//anidado por medio de un array Vehiculo[3]
	private Lista listaVehiculos;
	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Prestar atención
	public Persona(int dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.listaVehiculos = new Lista();//solo se crea la lista
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre +"]";
	}
	
	public Lista getListaVehiculos() {
		return listaVehiculos;
	}
	public void setListaVehiculos(Lista listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	public void mostrarPersona() {
		
		System.out.println(this);
		listaVehiculos.mostrarLista();
		
	}
	
	

}
