package modelo;

import interfaces.IJugador;

public class Jugador implements IJugador  {
	
	///Atributos
	private String nombre;
	private int nro;
	private float altura;
	
	///Comportamiento 
	///- Constructores
	//Cosntructor
	public Jugador(String nombre, int nro, float altura) {
		super();
		this.nombre = nombre;
		this.nro = nro;
		this.altura = altura;
	}

	public Jugador() {
		super();
		this.nombre = "";
		this.nro = -1; 
		this.altura = -1;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public void setNombre(String n) {
		//if (n.noArrancaConN){
		//}
		this.nombre = n;
	}
	@Override
	public int getNro() {
		return nro;
	}
	@Override
	public void setNro(int nroNuevo) {
		this.nro = nroNuevo;
	}
	@Override
	public float getAltura() {
		return altura;
	}
	@Override
	public void setAltura(float alturaNueva) {
		this.altura = alturaNueva;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", nro=" + nro + ", altura=" + altura + "]";
	} 
	
	@Override
	//Metodos propios!!!
	public void correr() {
		System.out.println("Está corriendo!!!");
	}
	
	///Puedo crear un método que no esté en la interface
	public void metodoExtra() {
		System.out.println("Extra!!!");
	};
	
	
	
	
	
	
	
	
	
	
	
	

}
