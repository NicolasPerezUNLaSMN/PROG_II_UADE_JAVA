package test;

import modelo.Persona;

public class PersonaTest {
	
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Pérez", "12345678", "15/04/1990", "Masculino", "Argentina");
        Persona persona2 = new Persona("María López", "87654321", "22/07/1985", "Femenino", "México");

        System.out.println("----- Datos de Persona 1 -----");
        persona1.mostrarInformacion();

        System.out.println("\n----- Datos de Persona 2 -----");
        persona2.mostrarInformacion();
    }
}