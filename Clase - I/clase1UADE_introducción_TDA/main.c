#include <stdio.h>
#include <stdlib.h>

///Tipo de retorno , nombre de función (tipoPara para...)
///Interfaz
int funcionSumar(int numero1, int numero2);
void mostrarSuma(float resultado);

///Implementación!!!!
int funcionSumar(int numero1, int numero2)
    { //Arranca la función
        int variable = numero1 + numero2;
        return variable;
        //return numero1 + numero2;
    }; //Cierra la función

///procedimiento
void mostrarSuma(float resultado){

        printf("!!!Resultado: %f", resultado);
}

int main(){ //Abre el main

    /*
    //#print("Hola")
    printf("Hello world!\n");

    ///Asignación estática !!!!
    //#edad_nico = 35
    //#altura_nico = 1.81
    int edadNico = 35; ///int entero
    float alturaNico = 1.81;  ///Float - decimal Double

    ///Asignaciones Dinamicas
    //#variable = input("Ingreso...")
    ///scanf()

    ///#print(f,"----- {edad_nico}")
    printf("La edad de nico es: %d", edadNico);

    ///
    /// int edadNico; ///declara la variable
    /// reserva memoria : 32432HE  _ _ _
    /// edadNico = 35;

    ///Punteros y manejo de memoria
    ///Variable del tipo puntero
    int * punteroEdad; ///32432HE
    ///&dame la ubicación de donde está la variable
    punteroEdad = &edadNico;

    printf("-----> Donde está guardado:%x ", punteroEdad);
    */


    return 0;

}//Termina el main
