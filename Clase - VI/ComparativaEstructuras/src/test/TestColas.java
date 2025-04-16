package test;
import interfaces.ICola;
import modelo.ColaDinamica;
import modelo.ColaEstatica;
public class TestColas {
    public static void main(String[] args) {
        int N = 100000;

        Runtime runtime = Runtime.getRuntime();

        System.out.println("== Cola Dinámica ==");

        runtime.gc();
        long memInicio = runtime.totalMemory() - runtime.freeMemory();
        ICola colaDinamica = new ColaDinamica();

        long inicio = System.nanoTime();
        for (int i = 0; i < N; i++) colaDinamica.encolar(i);
        for (int i = 0; i < N; i++) colaDinamica.desencolar();
        long fin = System.nanoTime();
        long memFin = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Tiempo: " + (fin - inicio) / 1_000_000 + " ms");
        System.out.println("Memoria usada: " + (memFin - memInicio) / 1024 + " KB");

        System.out.println("\n== Cola Estática ==");

        runtime.gc();
        memInicio = runtime.totalMemory() - runtime.freeMemory();
        ICola colaEstatica = new ColaEstatica();

        inicio = System.nanoTime();
        for (int i = 0; i < N; i++) colaEstatica.encolar(i);
        for (int i = 0; i < N; i++) colaEstatica.desencolar();
        fin = System.nanoTime();
        memFin = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Tiempo: " + (fin - inicio) / 1_000_000 + " ms");
        System.out.println("Memoria usada: " + (memFin - memInicio) / 1024 + " KB");
    }
}