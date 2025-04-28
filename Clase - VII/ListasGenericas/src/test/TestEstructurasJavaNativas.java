package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TestEstructurasJavaNativas {

	public static void main(String[] args) {
			
			///Por suerte todo lo visto en la materia ya alguien lo ha creado
			///En JAVA podríamos solamente utilizarlo
			///Para el TPO pueden usar las librerias ya existentes
			///Acá un breve ejemplo de cada una
			///OJO, para el parcial y el final hay que saber HACERLAS, no USARLAS
			
		 	System.out.println("===== TEST LISTA =====");
	        testLista();
	        
	        System.out.println("\n===== TEST COLA =====");
	        testCola();
	        
	        System.out.println("\n===== TEST PILA =====");
	        testPila();
	    }
	    
	    public static void testLista() {
	        List<String> lista = new ArrayList<>();
	        
	        lista.add("Manzana");
	        lista.add("Banana");
	        lista.add("Cereza");
	        
	        System.out.println("Contenido de la lista: " + lista);
	        
	        lista.remove("Banana");
	        System.out.println("Después de eliminar Banana: " + lista);
	        
	        System.out.println("¿Contiene Cereza? " + lista.contains("Cereza"));
	    }
	    
	    public static void testCola() {
	        Queue<Integer> cola = new LinkedList<>();
	        
	        cola.add(1);
	        cola.add(2);
	        cola.add(3);
	        
	        System.out.println("Contenido de la cola: " + cola);
	        
	        int primero = cola.poll(); // Saca el primero
	        System.out.println("Elemento removido: " + primero);
	        System.out.println("Cola después de remover: " + cola);
	        
	        System.out.println("Próximo en la cola (peek): " + cola.peek());
	    }
	    
	    public static void testPila() {
	        Stack<Double> pila = new Stack<>();
	        
	        pila.push(1.1);
	        pila.push(2.2);
	        pila.push(3.3);
	        
	        System.out.println("Contenido de la pila: " + pila);
	        
	        double tope = pila.pop(); // Saca el tope
	        System.out.println("Elemento removido (pop): " + tope);
	        System.out.println("Pila después del pop: " + pila);
	        
	        System.out.println("Elemento en el tope (peek): " + pila.peek());
	    }
	    
}