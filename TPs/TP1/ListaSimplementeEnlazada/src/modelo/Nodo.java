package modelo;

;

public class Nodo  {
    //private int dato;
	private Vehiculo dato;
    private Nodo siguiente; //INodo
    //private Nodo anterior; SIIIII

    public Nodo(Vehiculo dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    
    public Vehiculo getDato() {
        return dato;
    }

  
    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    
    public Nodo getSiguiente() {
        return siguiente;
    }

   
    public void setSiguiente(Nodo nodo) {
        this.siguiente = nodo;
    }
}




//iriarte