package test;

import interfaces.ILista;
import modelo.Lista;

public class TestLista {

	public static void main(String[] args) {
        ILista lista = new Lista();

        System.out.println("¿Lista vacía?: " + lista.esVacia());

        lista.insertarPrimero(10);
        lista.insertarUltimo(30);
        lista.insertarPosicion(20, 1);
        lista.insertarUltimo(40);
        lista.insertarUltimo(5);

        System.out.println("Lista después de inserciones:");
        lista.mostrarLista();

        System.out.println("Primer elemento: " + lista.obtenerPrimero());
        System.out.println("Último elemento: " + lista.obtenerUltimo());
        System.out.println("Elemento en posición 2: " + lista.obtenerPosicion(2));

        int buscado = 30;
        int posicion = lista.buscarSecuencial(buscado);
        System.out.println("Elemento " + buscado + " está en la posición: " + (posicion >= 0 ? posicion : "no encontrado"));

        System.out.println("Cantidad de elementos: " + lista.cantidadElementos());

        lista.eliminarPrimero();
        System.out.println("Lista después de eliminar el primero:");
        lista.mostrarLista();

        lista.eliminarUltimo();
        System.out.println("Lista después de eliminar el último:");
        lista.mostrarLista();

        lista.eliminarPosicion(1);
        System.out.println("Lista después de eliminar en posición 1:");
        lista.mostrarLista();

        lista.insertarUltimo(15);
        lista.insertarUltimo(2);
        lista.insertarUltimo(25);
        System.out.println("Lista antes de ordenar:");
        lista.mostrarLista();

        lista.ordenarLista();
        System.out.println("Lista después de ordenar:");
        lista.mostrarLista();

        System.out.println("¿Lista vacía?: " + lista.esVacia());
        System.out.println("Cantidad final de elementos: " + lista.cantidadElementos());
    }

}
