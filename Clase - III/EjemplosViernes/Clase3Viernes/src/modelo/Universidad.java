package modelo;

import java.util.Arrays;

public class Universidad {
	
	///Atributos
	private String nombre; 
	private String direccion;
	//Relacion Universidad con estudiantes!!!!
	//La Universidad tiene MUCHOS ESTUDIANTES ---- !!!
	//int[] arreglo = new int[3];
	//Maximo de estudiantes
	private Estudiante[]  arregloDeEstudiantes = new Estudiante[5];
	
	///atributo nuevo
	private int proximoEstudiante; //Contador de estudiantes
	//Get puede que sí.... el set NOOOOO!!!!!
	///Atributo calculable
	
	
	
	//Vale la pena --- NO VALE LA PENA
	public Universidad(String nombre, String direccion, 
			Estudiante[] arregloDeEstudiantes) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.arregloDeEstudiantes = arregloDeEstudiantes;
		this.proximoEstudiante  = 0; 
	}


	@Override
	public String toString() {
		return "Universidad [nombre=" + nombre + ", direccion=" 
	+ direccion + ", arregloDeEstudiantes="
				+ Arrays.toString(arregloDeEstudiantes) + "]";
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Universidad(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.proximoEstudiante  = 0; 
	}

	public Estudiante[] getArregloDeEstudiantes() {
		return arregloDeEstudiantes;
	}

	public void setArregloDeEstudiantes(Estudiante[] arregloDeEstudiantes) {
		this.arregloDeEstudiantes = arregloDeEstudiantes;
	}
	
	
	public void agregarEstudiante(Estudiante e) {
		
		///__e1___  _e2____ ____ __e4___ ____
		///0      1       2      3     4
		if (proximoEstudiante <5) {
			arregloDeEstudiantes[proximoEstudiante] = e; 
			proximoEstudiante = proximoEstudiante + 1;
		}
		
	}
	
	

}
