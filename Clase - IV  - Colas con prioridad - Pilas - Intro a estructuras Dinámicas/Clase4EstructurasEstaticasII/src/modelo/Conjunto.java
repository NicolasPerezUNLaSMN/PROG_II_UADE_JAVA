package modelo;

import interfaces.IConjunto;

//Implementación de la clase Conjunto con estructura estática
public class Conjunto implements IConjunto {
 private static final int MAX_SIZE = 100;
 private int[] elementos;
 private int cantidad;

 public Conjunto() {
     inicializarConjunto();
 }

 @Override
 public void inicializarConjunto() {
     elementos = new int[MAX_SIZE];
     cantidad = 0;
 }

 @Override
 public boolean conjuntoVacio() {
     return cantidad == 0;
 }

 @Override
 public void agregar(int x) {
     if (!pertenece(x) && cantidad < MAX_SIZE) {
         elementos[cantidad++] = x;
     }
 }

 @Override
 public int elegir() {
     if (!conjuntoVacio()) {
         return elementos[cantidad - 1];
     } else {
         throw new RuntimeException("El conjunto está vacío");
     }
 }

 @Override
 public void sacar(int x) {
     for (int i = 0; i < cantidad; i++) {
         if (elementos[i] == x) {
             elementos[i] = elementos[cantidad - 1];
             cantidad--;
             return;
         }
     }
 }

 @Override
 public boolean pertenece(int x) {
     for (int i = 0; i < cantidad; i++) {
         if (elementos[i] == x) {
             return true;
         }
     }
     return false;
 }

 @Override
 public void mostrarConjunto() {
     System.out.print("Elementos del conjunto: ");
     for (int i = 0; i < cantidad; i++) {
         System.out.print(elementos[i] + " ");
     }
     System.out.println();
 }
}