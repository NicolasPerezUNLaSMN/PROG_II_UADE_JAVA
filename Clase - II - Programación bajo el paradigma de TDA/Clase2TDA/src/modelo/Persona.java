package modelo;

import interfaces.IPersona;

public class Persona implements IPersona {
	
    private String nombre;
    private String dni;
    private String fechaNacimiento;
    private String genero;
    private String nacionalidad;

    // Constructor
    public Persona(String nombre, String dni, String fechaNacimiento, String genero, String nacionalidad) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    // Implementación de métodos de la interfaz
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDNI() {
        return dni;
    }

    @Override
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}