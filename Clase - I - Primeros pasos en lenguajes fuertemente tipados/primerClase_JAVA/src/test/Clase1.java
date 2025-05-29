package test;
import java.util.Scanner;

interface Persona {
	//Pre
	//Post
    void mostrarPersona();
}

public class Clase1 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Variables
        int numero = 10;
        String nombre = "Juan";
        float pi = 3.1416f;
        boolean esEstudiante = true;

        // Entrada de datos
        System.out.print("¿Cómo te llamas? ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombreUsuario + ", tienes " + edad + " años.");

        // Condicionales
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // Bucle for
        System.out.println("\nContando del 1 al 5 con for:");
        
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }

        // Bucle while
        System.out.println("\nContando con while:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // Funciones
        saludar("Ana");
        int resultado = suma(5, 3);
        System.out.println("La suma de 5 y 3 es: " + resultado);

        // Uso de la interfaz Persona
        Persona p = new Persona() {
            String nombre = "Carlos";
            String apellido = "Gomez";
            
            @Override
            public void mostrarPersona() {
                System.out.println("\nPersona creada: " + nombre + " " + apellido);
            }
        };

        p.mostrarPersona();

        // Mostrar tamaño y tipo de las variables
        mostrarTamanoYTipo(numero, "int");
        mostrarTamanoYTipo(nombre, "String");
        mostrarTamanoYTipo(pi, "float");
        mostrarTamanoYTipo(esEstudiante, "boolean");

        scanner.close();
    }

    static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    static int suma(int a, int b) {
        return a + b;
    }

    static void mostrarTamanoYTipo(Object variable, String tipo) {
        switch (tipo) {
            case "int":
                System.out.println("Tipo: int, Tamaño: " + Integer.BYTES + " bytes");
                break;
            case "String":
                System.out.println("Tipo: String, Tamaño variable según contenido");
                break;
            case "float":
                System.out.println("Tipo: float, Tamaño: " + Float.BYTES + " bytes");
                break;
            case "boolean":
                System.out.println("Tipo: boolean, Tamaño depende de la JVM");
                break;
            default:
                System.out.println("Tipo desconocido.");
        }
    }
}