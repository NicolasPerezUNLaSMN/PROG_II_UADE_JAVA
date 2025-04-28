package modelo;

public class ListObject {
	///Lista super resumida, para explicar el máximo nivel de 
	///abstracción que se puede conseguir en java
	///Se animan a pasarlo a TDA? 
	private Node primero;

    private static class Node {
        Object dato;
        Node siguiente;

        Node(Object dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public ListObject() {
        this.primero = null;
    }

    public void insertar(Object dato) {
        Node nuevo = new Node(dato);
        if (primero == null) {
            primero = nuevo;
        } else {
            Node actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void imprimir() {
        Node actual = primero;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

}
