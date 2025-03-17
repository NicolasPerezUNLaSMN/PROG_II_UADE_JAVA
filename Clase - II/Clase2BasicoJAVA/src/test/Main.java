package test;

import java.util.Random;

import funciones.ArreglosEnteros;

public class Main {

    /// Método para cargar edades aleatorias en el array
    /// Pre: 
    /// - edades ≠ null  (el array no debe ser nulo)
    /// - edades.length > 0 (el array debe tener al menos una posición)
    /// Post:
    /// - ∀ i ∈ [0, edades.length), edades[i] ∈ [17, 99] (todas las posiciones tendrán valores entre 17 y 99)
    /// Axiomas:
    /// - La cantidad de estudiantes permanece constante durante la ejecución del método.
    static void cargarEdades(int[] edades) {
        

        Random random = new Random();
        for (int i = 0; i < edades.length; i++) {
            edades[i] = random.nextInt(83) + 17; // Números entre 17 y 99
        }
    }

    /// Método para mostrar las edades almacenadas en el array
    /// Pre:
    /// - edades ≠ null (el array no debe ser nulo)
    /// - edades.length > 0 (el array debe contener datos)
    /// Post:
    /// - Se imprimen todos los valores de edades en consola con su respectiva posición
    /// - El array edades permanece inalterado después de la ejecución
    /// Axiomas:
    /// - La cantidad de estudiantes permanece constante durante la ejecución del método.
    static void mostrarEdades(int[] edades) {
    	System.out.print("---------------\n");
    	
        for (int i = 0; i < edades.length; i++) {
            System.out.print(i + ": " + edades[i] +",");
        }
        
        System.out.print("\n---------------\n");
    }
    
  /// Método para ordenar edades en orden descendente usando el algoritmo de burbuja
    /// Pre: 
    /// - edades ≠ null (el array no debe ser nulo)
    /// - edades.length > 0 (el array debe tener al menos un elemento)
    /// Post:
    /// - El array edades estará ordenado en orden descendente: ∀ i, j ∈ [0, edades.length), si i < j → edades[i] ≥ edades[j]
    /// - La cantidad de elementos en edades permanece inalterada
    /// Axiomas:
    /// - La cantidad de iteraciones del algoritmo depende del tamaño del array (O(n²) en el peor caso)
    /// - Se preservan los mismos elementos en edades, solo se reordenan
    static void ordenarEdades(int[] edades) {
        int aux; 

        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades.length - 1; j++) {
                if (edades[j] < edades[j + 1]) { // Orden descendente
                    aux = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = aux;
                }
            }
        }
    }
    
    
    ///Acá se prueba todo lo que se hace, por eso el main() va en paquete test
    public static void main(String[] args) {
        int cantidadEstudiantes = 6;
        int[] edades = new int[cantidadEstudiantes];

        cargarEdades(edades);
        mostrarEdades(edades);
        
        ordenarEdades(edades);
        mostrarEdades(edades);
        
        ///Instancia de una clase, la clase está declarando sus métodos en la interface
        ArreglosEnteros arreglosFunciones = new ArreglosEnteros();
        
        ///LLamo al método de la clase y lo uso.
        arreglosFunciones.cargarAleatorio(edades, 10, 20);
        mostrarEdades(edades);
    }
}