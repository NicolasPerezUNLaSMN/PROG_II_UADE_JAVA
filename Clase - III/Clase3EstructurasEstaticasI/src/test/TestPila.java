package test;

import modelo.Pila;

//Clase de prueba para la pila
public class TestPila {
 public static void main(String[] args) {
	 
     Pila pila = new Pila(); //Esto llama a iniciarPIla
     
    pila.apilar(2);
    pila.apilar(412);
    pila.apilar(6);

    System.out.println("Estoy desapilando: " +pila.desapilar());
    System.out.println("Verifico el tamaño: " +pila.tamanio());
    System.out.println("Verifico el llena: " +pila.pilaLlena());
    System.out.println("Verifico el vacia: " +pila.pilaVacia());
    System.out.println("Verifico el tope: " +pila.tope());
     
}

 
}