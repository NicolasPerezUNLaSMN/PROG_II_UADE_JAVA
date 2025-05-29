package test;

import interfaces.ILista;
import modelo.Lista;
import modelo.ListaEstatica;

public class TestListas {
	public static void main(String[] args) {
        int N = 90000;

        ILista listaDinamica = new Lista();
        ILista listaEstatica = new ListaEstatica();

        System.out.println("== Test insertarInicio (" + N + " elementos) ==");

        long inicio = System.nanoTime();
        for (int i = 0; i < N; i++) listaDinamica.insertarInicio(i);
        long fin = System.nanoTime();
        System.out.println("Dinamica: " + (fin - inicio) / 1_000_000 + " ms");

        inicio = System.nanoTime();
        for (int i = 0; i < N; i++) listaEstatica.insertarInicio(i);
        fin = System.nanoTime();
        System.out.println("Estatica: " + (fin - inicio) / 1_000_000 + " ms");

        System.out.println("== Buscar elemento al final ==");
        inicio = System.nanoTime();
        listaDinamica.contiene(0); // ahora el último insertado quedó al final
        fin = System.nanoTime();
        System.out.println("Dinamica: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        listaEstatica.contiene(0);
        fin = System.nanoTime();
        System.out.println("Estatica: " + (fin - inicio) + " ns");
    }
}