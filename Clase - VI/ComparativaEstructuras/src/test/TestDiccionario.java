package test;


import interfaces.IDiccionario;
import modelo.DiccionarioDinamico;

public class TestDiccionario {
	
	public static void main(String[] args) {
        int N = 100000;
        Runtime runtime = Runtime.getRuntime();

        IDiccionario diccionario = new DiccionarioDinamico();

        System.out.println("== Test Diccionario Dinámico ==");

        // Recolectar basura para tener medición limpia
        runtime.gc();
        long memInicio = runtime.totalMemory() - runtime.freeMemory();

        // Insertar N elementos
        long inicio = System.nanoTime();
        for (int i = 0; i < N; i++) {
            diccionario.insertar(i, i * 10);
        }

        // Buscar N elementos
        for (int i = 0; i < N; i++) {
            diccionario.obtener(i);
        }

        // Eliminar N elementos
        for (int i = 0; i < N; i++) {
            diccionario.eliminar(i);
        }

        long fin = System.nanoTime();
        long memFin = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Tiempo total: " + (fin - inicio) / 1_000_000 + " ms");
        System.out.println("Memoria usada: " + (memFin - memInicio) / 1024 + " KB");
        System.out.println("Tamaño final: " + diccionario.tamaño());
    }

}
