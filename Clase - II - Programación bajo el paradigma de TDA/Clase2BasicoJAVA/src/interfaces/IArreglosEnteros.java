package interfaces;

public interface IArreglosEnteros {
	
	///Agregar el cargarEdades y el mostrarEdades a esta interface, y sacarlo del Main.
	
	/// 1. Cargar un arreglo con valores aleatorios dentro de un rango
    public  void cargarAleatorio(int[] arr, int min, int max);

    /// 2. Mostrar los valores del arreglo en consola
    public  void mostrarArreglo(int[] arr);

    /// 3. Ordenar el arreglo en orden ascendente (Bubble Sort)
    public void ordenarAscendente(int[] arr);

    /// 4. Ordenar el arreglo en orden descendente
    public void ordenarDescendente(int[] arr);

    /// 5. Buscar un número en el arreglo (Búsqueda lineal)
    public boolean buscarNumero(int[] arr, int num);

    /// 6. Buscar un número en el arreglo (Búsqueda binaria, requiere ordenamiento previo)
    public  int busquedaBinaria(int[] arr, int num);

    /// 7. Encontrar el valor máximo en el arreglo
    public int encontrarMaximo(int[] arr);

    /// 8. Encontrar el valor mínimo en el arreglo
    public  int encontrarMinimo(int[] arr);

    /// 9. Calcular la suma de todos los elementos del arreglo
    public  int sumaElementos(int[] arr);

    /// 10. Calcular el promedio de los elementos del arreglo
    public double calcularPromedio(int[] arr);

    /// 11. Invertir el contenido del arreglo (Ejemplo: [1,2,3] → [3,2,1])
    public  void invertirArreglo(int[] arr);

    /// 12. Contar cuántas veces aparece un número en el arreglo
    public  int contarOcurrencias(int[] arr, int num);

    /// 13. Eliminar un número del arreglo (debe desplazar los elementos)
    public  int[] eliminarElemento(int[] arr, int num);

    /// 14. Comprobar si el arreglo está ordenado de forma ascendente
    public boolean estaOrdenado(int[] arr);

    /// 15. Crear una copia del arreglo
    public  int[] copiarArreglo(int[] arr);

}
