package test;

import interfaces.IPila;
import modelo.PilaDinamica;
import modelo.PilaEstatica;

public class TestPilas {
    public static void main(String[] args) {
        int N = 100000;

        Runtime runtime = Runtime.getRuntime();

        System.out.println("== Pila Dinámica ==");

        runtime.gc();
        long memInicio = runtime.totalMemory() - runtime.freeMemory();
        IPila pilaDinamica = new PilaDinamica();

        long inicio = System.nanoTime();
        for (int i = 0; i < N; i++) pilaDinamica.apilar(i);
        for (int i = 0; i < N; i++) pilaDinamica.desapilar();
        long fin = System.nanoTime();
        long memFin = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Tiempo: " + (fin - inicio) / 1_000_000 + " ms");
        System.out.println("Memoria usada: " + (memFin - memInicio) / 1024 + " KB");

        System.out.println("\n== Pila Estática ==");

        runtime.gc();
        memInicio = runtime.totalMemory() - runtime.freeMemory();
        IPila pilaEstatica = new PilaEstatica();

        inicio = System.nanoTime();
        for (int i = 0; i < N; i++) pilaEstatica.apilar(i);
        for (int i = 0; i < N; i++) pilaEstatica.desapilar();
        fin = System.nanoTime();
        memFin = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Tiempo: " + (fin - inicio) / 1_000_000 + " ms");
        System.out.println("Memoria usada: " + (memFin - memInicio) / 1024 + " KB");
    }
}