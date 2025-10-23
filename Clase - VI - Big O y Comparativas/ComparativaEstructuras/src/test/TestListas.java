package test;

import interfaces.ILista;
import modelo.Lista;
import modelo.ListaEstatica;

public class TestListas {
	public static void main(String[] args) {
        int N = 600000;

        ILista listaDinamica = new Lista();
        
        ILista listaEstatica = new ListaEstatica();

       

      
        System.out.println("== Buscar elemento al final ==");
        long inicio = System.nanoTime();
        listaDinamica.contiene(0); // ahora el último insertado quedó al final
        long fin = System.nanoTime();
        System.out.println("Dinamica: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        listaEstatica.contiene(0);
        fin = System.nanoTime();
        System.out.println("Estatica: " + (fin - inicio) + " ns");
    }
}