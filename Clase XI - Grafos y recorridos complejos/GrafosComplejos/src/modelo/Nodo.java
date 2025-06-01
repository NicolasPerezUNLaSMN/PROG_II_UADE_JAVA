package modelo;

import java.util.ArrayList;
import java.util.List;

import interfaces.INodo;

public class Nodo implements INodo {
	
    private int valor;
    
    private List<INodo> vecinos = new ArrayList<>();
    private List<Integer> pesos = new ArrayList<>();
    

    public Nodo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void agregarVecino(INodo vecino, int peso) {
        vecinos.add(vecino);
        pesos.add(peso);
    }

    public List<INodo> getVecinos() {
        return vecinos;
    }

    public List<Integer> getPesos() {
        return pesos;
    }
}
