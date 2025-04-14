package test;

import modelo.Persona;
import modelo.Vehiculo;

///Listas simplemente enlazadas N - > sig,  ant
///Listas doblemete enlazadas (int)
///Persona que tiene una lista de Vehiculos!!!!

public class TestPersonaVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p = new Persona(11111, "Nico Perez");//Se crea la lista nula!!
		Vehiculo v = new Vehiculo("11AA222", "Fiat Uno");
		
		//Dos formas de insertar en la lista
		//La primera por parametos, la segunda por referencia
		p.getListaVehiculos().insertarPrimero(new Vehiculo("xxx111", "Toyota"));
		p.getListaVehiculos().insertarPrimero(v);
		
		//Muestro la persona, y sus vehiculos concatenados
		//Atentos a cómo manejo el toString de ambos y los
		//procedimientos de mostrar. 
		p.mostrarPersona();
		///Notar que toda la información quedó guardada en la persona
		///
		///NOTAS: 
		///esto es una ayuda para el tp1, pero tienen muchas cosas que mejorar
		///1 - Hacer y usar una lista doblemente enlazada
		///2 - Testear más metodos, incluso algunos sofisticados como 
		///ordenar y buscar vehiculos
		///3 - El nodo tiene que tener el anterior, ojo que eso modifica los métodos
		///4 - Yo omiti las interfaces para hacer más rapido el ejemplo
		///Ustedes tienen que poner las interfaces y usarlas bien
		///Ningún items es obligatorio, pero cuanto más completo más nota. 
		

	}

}
