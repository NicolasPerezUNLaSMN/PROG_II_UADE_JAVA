package interfaces;

import modelo.Persona;

public interface IVehiculo {
    int KILOMETROS_MANTENIMIENTO = 10000; // Constante para el mantenimiento obligatorio

    void asignarConductor(Persona conductor);
    Persona obtenerConductor();

    void registrarViaje(double distancia, double tiempo);
    double calcularVelocidadPromedio();
    boolean necesitaMantenimiento();

    void mostrarInformacion();
}