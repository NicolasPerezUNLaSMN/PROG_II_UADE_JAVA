package modelo;

import java.util.HashMap;
import java.util.Set;

import interfaces.IDiccionarioMultiple;

public class DiccionarioMultiple implements IDiccionarioMultiple {
    private HashMap<Integer, Conjunto> diccionario;
    
    
    public DiccionarioMultiple() {
    	
    	inicializarDiccionario();
    	
    }
    @Override
    public void inicializarDiccionario() {
        diccionario = new HashMap<>();
    }

    @Override
    public void agregar(int clave, int valor) {
        Conjunto valores = diccionario.get(clave);
        if (valores == null) {
            valores = new Conjunto();
            diccionario.put(clave, valores);
        }
        valores.agregar(valor);
    }

    @Override
    public void eliminar(int clave) {
        diccionario.remove(clave);
    }

    @Override
    public void eliminarValor(int clave, int valor) {
        Conjunto valores = diccionario.get(clave);
        if (valores != null) {
            valores.sacar(valor);
        }
    }

    @Override
    public Conjunto recuperar(int clave) {
        return diccionario.get(clave);
    }

    @Override
    public Conjunto claves() {
        Conjunto claves = new Conjunto();
        Set<Integer> clavesSet = diccionario.keySet();
        for (Integer clave : clavesSet) {
            claves.agregar(clave);
        }
        return claves;
    }
}