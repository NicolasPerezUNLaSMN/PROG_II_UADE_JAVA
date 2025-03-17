package modelo;

import java.util.Arrays;

import interfaces.IArrayEnteros;

public class ArrayEnteros implements IArrayEnteros {
	
    private int[] datos;
    private int cantidad;

    public ArrayEnteros() {
        this.datos = new int[LONGITUD_MAXIMA];
        this.cantidad = 0;
    }

    @Override
    public void agregarElemento(int elemento) {
        if (cantidad < LONGITUD_MAXIMA) {
            datos[cantidad++] = elemento;
        } else {
            System.out.println("El array está lleno.");
        }
    }

    @Override
    public boolean eliminarElemento(int elemento) {
        int indice = buscarElemento(elemento);
        if (indice >= 0) {
            for (int i = indice; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];
            }
            cantidad--;
            return true;
        }
        return false;
    }

    @Override
    public int buscarElemento(int elemento) {
        for (int i = 0; i < cantidad; i++) {
            if (datos[i] == elemento) {
                return i;
            }
        }
        return -1; // No encontrado
    }

    @Override
    public void ordenar() {
        Arrays.sort(datos, 0, cantidad);
    }

    @Override
    public double calcularPromedio() {
        if (cantidad == 0) return 0;
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += datos[i];
        }
        return (double) suma / cantidad;
    }

    @Override
    public int obtenerMaximo() {
        if (cantidad == 0) throw new IllegalStateException("El array está vacío");
        int max = datos[0];
        for (int i = 1; i < cantidad; i++) {
            if (datos[i] > max) max = datos[i];
        }
        return max;
    }

    @Override
    public int obtenerMinimo() {
        if (cantidad == 0) throw new IllegalStateException("El array está vacío");
        int min = datos[0];
        for (int i = 1; i < cantidad; i++) {
            if (datos[i] < min) min = datos[i];
        }
        return min;
    }

    @Override
    public void mostrarArray() {
        System.out.print("Array: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }
}

