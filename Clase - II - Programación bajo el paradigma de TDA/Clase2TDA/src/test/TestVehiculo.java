package test;

import modelo.Persona;
import modelo.Vehiculo;

public class TestVehiculo {
	
	    public static void main(String[] args) {
	        // Crear un conductor
	        Persona conductor = new Persona("Carlos Díaz", "11223344", "20/02/1995", "Masculino", "Chile");

	        // Crear un vehículo
	        Vehiculo auto = new Vehiculo("Toyota", "Corolla", "ABC123","SE11123JH23");

	        // Asignar conductor al vehículo
	        auto.asignarConductor(conductor);

	        // Registrar viajes
	        auto.registrarViaje(200, 3); // 200 km en 3 horas
	        auto.registrarViaje(800, 10); // 800 km en 10 horas

	        // Mostrar información del vehículo
	        auto.mostrarInformacion();
	    }

}
