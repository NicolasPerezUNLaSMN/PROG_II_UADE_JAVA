package modelo;

import java.util.Arrays;
import java.util.Scanner;

import interfaces.IMateria;

public class Materia implements IMateria {
	
	//Unificar las clases....    Anidar estructuras!!!!
	//Materia tenga asociados    "muchos estudiantes"
	//Estructura Datos Arreglos
	
	private int codigo; 
	private String nombre;
	//Atributo arreglo!!!
	//private int[] arregloEnteros= new int[5];
	//Limitación de arreglos!!! --> TIPO FIJO :(
	//----------------------------> TAM FIJO 
	//Estructuras Estáticas 
	private Estudiante[] estudiantes = new Estudiante[3];
	private int indiceProx;
	
	
	public void ingresarEstudiante(Estudiante e) {
			//Estructuras estaticas--- indice
			//if indiceProx < 3
			estudiantes[indiceProx] =  e;
			indiceProx = indiceProx +1;
		 
	}
	
	///Método nuevo agrega estudiantes!!
	public void ingresarEstudiantes() {
		Scanner s = new Scanner(System.in);
		for ( int i = 0 ; i< 3; i++) {
			System.out.println("Ingresar el nombre:\n");
			String n = s.next(); 
			
			Estudiante est = new Estudiante(i,n,true);
			estudiantes[i] =  est;	
		}	
	}
	
	
	
	public Materia(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.indiceProx = 0 ; 
	}

	

	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre + ", \n\nestudiantes=" + Arrays.toString(estudiantes)
				+ "]";
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	} 
	
	
	
	
	

}
