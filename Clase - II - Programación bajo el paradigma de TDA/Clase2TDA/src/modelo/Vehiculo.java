package modelo;

import interfaces.IVehiculo;
public class Vehiculo implements IVehiculo {
    private String marca;
    private String modelo;
    private String patente;
    private Persona conductor;
    private double distanciaTotal;
    private double tiempoTotal;

    private final String numeroSerieMotor; // 🔥 Variable privada sin getter

    public Vehiculo(String marca, String modelo, String patente, String numeroSerieMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.numeroSerieMotor = numeroSerieMotor; // Se inicializa en el constructor
        this.distanciaTotal = 0;
        this.tiempoTotal = 0;
    }

    @Override
    public void asignarConductor(Persona conductor) {
        this.conductor = conductor;
    }

    @Override
    public Persona obtenerConductor() {
        return conductor;
    }

    @Override
    public void registrarViaje(double distancia, double tiempo) {
        if (distancia > 0 && tiempo > 0) {
            this.distanciaTotal += distancia;
            this.tiempoTotal += tiempo;
        }
    }

    @Override
    public double calcularVelocidadPromedio() {
        return (tiempoTotal > 0) ? distanciaTotal / tiempoTotal : 0;
    }

    @Override
    public boolean necesitaMantenimiento() {
        return distanciaTotal >= KILOMETROS_MANTENIMIENTO; // 🔥 Uso de la constante de la interfaz
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Vehículo: " + marca + " " + modelo + " (Patente: " + patente + ")");
        System.out.println("Kilómetros recorridos: " + distanciaTotal + " km");
        System.out.println("Velocidad promedio: " + calcularVelocidadPromedio() + " km/h");
        System.out.println("¿Necesita mantenimiento? " + (necesitaMantenimiento() ? "Sí" : "No"));

        if (conductor != null) {
            System.out.println("Conductor: " + conductor.getNombre() + " - DNI: " + conductor.getDNI());
        } else {
            System.out.println("No hay conductor asignado.");
        }
        
        // ❌ No hay getter para "numeroSerieMotor", por lo que no se puede acceder desde fuera de la clase.
    }
}