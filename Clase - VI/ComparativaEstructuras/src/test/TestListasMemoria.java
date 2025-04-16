package test;

import interfaces.ILista;
import modelo.Lista;
import modelo.ListaEstatica;

public class TestListasMemoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 90000;

        // Test Lista Dinámica
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();
        ILista listaDinamica = new Lista();
        for (int i = 0; i < N; i++) listaDinamica.insertarInicio(i);
        long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Lista Dinámica - Memoria usada: " + (memoriaDespues - memoriaAntes) / 1024 + " KB");

        // Test Lista Estática
        runtime.gc();
        memoriaAntes = runtime.totalMemory() - runtime.freeMemory();
        ILista listaEstatica = new ListaEstatica();
        for (int i = 0; i < N; i++) listaEstatica.insertarInicio(i);
        memoriaDespues = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Lista Estática - Memoria usada: " + (memoriaDespues - memoriaAntes) / 1024 + " KB");

	}

}
