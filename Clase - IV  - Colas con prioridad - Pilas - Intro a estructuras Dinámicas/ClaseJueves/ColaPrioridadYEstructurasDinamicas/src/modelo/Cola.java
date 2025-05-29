package modelo;

import java.util.Arrays;

public class Cola {
	//No va ningun setter!!!!!
	private int primero;
	private int ultimo;
	///atributo calculable
	private int cantidad;  //Cantidad!!!!!!
	private int elementos[] = new int[10];
	///Nueva
	private int prioridades[] = new int[10];
	
	@Override
	public String toString() {
		return "Cola [primero=" + primero + ", ultimo=" + ultimo + ", cantidad=" + cantidad + ", \nelementos="
				+ Arrays.toString(elementos) + ", \nprioridades=" + Arrays.toString(prioridades) + "]";
	}
	
	
	
	public Cola() {
		super();
		this.primero = 0; //-1
		this.ultimo = 0; //-1 Flag 
		this.cantidad = 0;
	}



	//Encolar
	public void encolar(int dato, int prio) {
		//if ( cantidad < 10;
		int i = cantidad - 1 ; //pos del "ultimo"
		///cantidad = 3
		///1         54   
		while(i>= 0 && prioridades[i] < prio ) {
			//if()
			//1    54    77(2)   77(2) 
			elementos[i+1] =elementos[i];
			prioridades[i+1] = prioridades[i];
			i = i- 1; 
		}
		
		elementos[i + 1 ] = dato;
		prioridades[i +1] = prio;
		cantidad = cantidad + 1; 
		ultimo = ultimo +1;
		
		//Clase pasada!!
		//elementos[ultimo] = dato;
		//cantidad = cantidad + 1;
		//ultimo = ultimo +1; 
		
	}
	
	//desencolar
	public int desencolar() {
		
		//Si cantidad > 0 !!!!
		int variableDeRetorno = elementos[primero];
		primero = primero + 1; //primero++;
		cantidad = cantidad - 1; //Cantidad--;
		
		return variableDeRetorno;
	}
	
	

}
