package modelo;

import java.util.HashMap;
import java.util.Set;

import interfaces.IDiccionario;

public class Diccionario implements IDiccionario{
    private HashMap<Integer, Integer> diccionario;
    
    public Diccionario() {
    	InicializarDiccionario();
    }


    @Override
    public void InicializarDiccionario() {
        diccionario = new HashMap<>();
    }

    @Override
    public void Agregar(int clave, int valor) {
        diccionario.put(clave, valor);
    }

    @Override
    public void Eliminar(int clave) {
        diccionario.remove(clave);
    }

    @Override
    public int Recuperar(int clave) {
        if (diccionario.containsKey(clave)) {
            return diccionario.get(clave);
        } else {
            throw new RuntimeException("La clave no existe en el diccionario.");
        }
    }

    @Override
    public Conjunto Claves() {
        Conjunto claves = new Conjunto();
        Set<Integer> clavesSet = diccionario.keySet();
        for (Integer clave : clavesSet) {
            claves.agregar(clave);
        }
        return claves;
    }
}