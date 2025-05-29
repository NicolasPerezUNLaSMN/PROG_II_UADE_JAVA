package modelo;

import interfaces.IColaPrioridad;

//Implementación de la clase ColaPrioridad con estructura estática
public class ColaPrioridad implements IColaPrioridad {
 private static final int MAX_SIZE = 100;
 private int[] elementos;
 private int[] prioridades;
 private int cantidad;

 public ColaPrioridad() {
     inicializarCola();
 }

 @Override
 public void inicializarCola() {
     elementos = new int[MAX_SIZE];
     prioridades = new int[MAX_SIZE];
     cantidad = 0;
 }

 @Override
 public void encolar(int x, int prioridad) {
     if (cantidad < MAX_SIZE) {
         int i = cantidad - 1;
         while (i >= 0 && prioridades[i] < prioridad) {
             elementos[i + 1] = elementos[i];
             prioridades[i + 1] = prioridades[i];
             i--;
         }
         elementos[i + 1] = x;
         prioridades[i + 1] = prioridad;
         cantidad++;
     } else {
         throw new RuntimeException("La cola de prioridad está llena");
     }
 }

 @Override
 public int desencolar() {
     if (!colaVacia()) {
         return elementos[--cantidad];
     } else {
         throw new RuntimeException("La cola de prioridad está vacía");
     }
 }

 @Override
 public boolean colaVacia() {
     return cantidad == 0;
 }

 @Override
 public int primero() {
     if (!colaVacia()) {
         return elementos[cantidad - 1];
     } else {
         throw new RuntimeException("La cola de prioridad está vacía");
     }
 }
 
 @Override
 public void mostrarCola() {
     System.out.println("Estado de la cola:");
     for (int i = cantidad - 1; i >= 0; i--) {
         System.out.println("Elemento: " + elementos[i] + " - Prioridad: " + prioridades[i]);
     }
 }
}