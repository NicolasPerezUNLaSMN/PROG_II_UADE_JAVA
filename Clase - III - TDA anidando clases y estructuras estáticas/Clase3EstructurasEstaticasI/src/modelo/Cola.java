package modelo;

import interfaces.ICola;

//Implementación de la clase Cola con estructura estática
public class Cola implements ICola {
	
 private static final int MAX_SIZE = 100;
 private int[] elementos;
 private int inicio, fin, cantidad;


 public Cola() {
     inicializarCola();
 }

 @Override
 public void inicializarCola() {
     elementos = new int[MAX_SIZE];
     inicio = 0;
     fin = 0;
     cantidad = 0;
 }

 @Override
 public void encolar(int x) {
     if (!colaLlena()) {
         elementos[fin] = x;
         fin = (fin + 1) % MAX_SIZE;
         cantidad++;
     } else {
         throw new RuntimeException("La cola está llena");
     }
 }

 @Override
 public int desacolar() {
     if (!colaVacia()) {
         int valor = elementos[inicio];
         inicio = (inicio + 1) % MAX_SIZE;
         cantidad--;
         return valor;
     } else {
         throw new RuntimeException("La cola está vacía");
     }
 }

 @Override
 public boolean colaVacia() {
     return cantidad == 0;
 }

 @Override
 public boolean colaLlena() {
     return cantidad == MAX_SIZE;
 }

 @Override
 public int primero() {
     if (!colaVacia()) {
         return elementos[inicio];
     } else {
         throw new RuntimeException("La cola está vacía");
     }
 }

 @Override
 public int tamanio() {
     return cantidad;
 }
 


}