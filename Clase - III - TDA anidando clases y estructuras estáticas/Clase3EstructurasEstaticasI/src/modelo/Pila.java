package modelo;

import interfaces.IPila;

//Implementación de la clase Pila con estructura estática
public class Pila implements IPila {
	
	
 private static final int MAX_SIZE = 100;
 private int[] elementos;
 private int tope;

 
 public Pila() {
     inicializarPila();
 }

 @Override
 public void inicializarPila() {
     elementos = new int[MAX_SIZE];
     tope = -1;
 }

 @Override
 public void apilar(int x) {
     if (!pilaLlena()) {
         elementos[++tope] = x;
     } else {
         throw new RuntimeException("La pila está llena");
     }
 }

 @Override
 public int desapilar() {
     if (!pilaVacia()) {
         return elementos[tope--];
     } else {
         throw new RuntimeException("La pila está vacía");
     }
 }

 @Override
 public boolean pilaVacia() {
     return tope == -1;
 }

 @Override
 public boolean pilaLlena() {
     return tope == MAX_SIZE - 1;
 }

 @Override
 public int tope() {
     if (!pilaVacia()) {
         return elementos[tope];
     } else {
         throw new RuntimeException("La pila está vacía");
     }
 }

 @Override
 public int tamanio() {
     return tope + 1;
 }
}
