package test;

import modelo.ArrayEnteros;

public class TestArrayEnteros {
    public static void main(String[] args) {
        ArrayEnteros array = new ArrayEnteros();

        array.agregarElemento(10);
        array.agregarElemento(20);
        array.agregarElemento(5);
        array.agregarElemento(15);
        array.mostrarArray();

        System.out.println("Máximo: " + array.obtenerMaximo());
        System.out.println("Mínimo: " + array.obtenerMinimo());
        System.out.println("Promedio: " + array.calcularPromedio());

        array.ordenar();
        array.mostrarArray();

        System.out.println("Índice de 15: " + array.buscarElemento(15));
        array.eliminarElemento(15);
        array.mostrarArray();
    }
}
