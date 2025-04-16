package modelo;

import interfaces.ILista;

public class ListaEstatica implements ILista {
	
    private int[] datos;
    private int tamaño;
    private static final int CAPACIDAD_INICIAL = 1000000;

    public ListaEstatica() {
        datos = new int[CAPACIDAD_INICIAL];
        tamaño = 0;
    }

    public void insertarInicio(int valor) {
        if (tamaño == datos.length) throw new RuntimeException("Lista llena");
        for (int i = tamaño; i > 0; i--) {
            datos[i] = datos[i - 1];
        }
        datos[0] = valor;
        tamaño++;
    }

    public void insertarFin(int valor) {
        if (tamaño == datos.length) throw new RuntimeException("Lista llena");
        datos[tamaño] = valor;
        tamaño++;
    }

    public boolean eliminar(int valor) {
        for (int i = 0; i < tamaño; i++) {
            if (datos[i] == valor) {
                for (int j = i; j < tamaño - 1; j++) {
                    datos[j] = datos[j + 1];
                }
                tamaño--;
                return true;
            }
        }
        return false;
    }

    public boolean contiene(int valor) {
        for (int i = 0; i < tamaño; i++) {
            if (datos[i] == valor) return true;
        }
        return false;
    }

    public int obtener(int indice) {
        if (indice < 0 || indice >= tamaño) throw new IndexOutOfBoundsException();
        return datos[indice];
    }

    public int tamaño() {
        return tamaño;
    }

    public void imprimir() {
        for (int i = 0; i < tamaño; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }
}