/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_04_ejerc2;
// Programa Java para leer datos de varios tipos usando la clase Scanner
import java.util.Scanner;

/**
 *Programa que te permite introducir 5 numeros y te dicen si son primos o no 
 * @author SandraPerezGuijar
 */
public class PROG_04_Ejerc2 {

    /**
     * constructor que te devuelve la información de si un número es primo o no
     * @param numero: Variable numérica para analizar si el número es primo
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar el objeto e inicializar con el objeto de entrada estandar definido
         Scanner in = new Scanner(System.in);
         
         int numero;
         //Creamos la variable contador para que solo se ejecute el programa cinco veces
        int contador = 0;
        
        do {
            System.out.println("Introduce un numero: ");
            numero = in.nextInt();
            int contador_primo = 0;
            //Cada vez que se ejecute una vez el programa suma 1 valor al contador
            contador++;
            
            //Condicional If para controlar si el número introducido es negativo
            if (numero<0){
                System.out.println("El numero es negativo ");
            }
            else{
                // bucle for para calcular si el numero es divisible por otros numeros que no sean el 1 y el mismo numero
                for(int i=2;i<numero;i++) {
                    if(numero%i==0)
                        //Si entra en la condicional la variable contador_primo suma 1
                        contador_primo++;
                }
                //Creamos condicional para ver si ha entrado en la condicional de si era primo o no el valor número y que imprima en pantalla
                if(contador_primo>0){
                    System.out.print("El numero NO es primo ");
                }
                else{
                    System.out.print("El numero es primo ");
                }
                };
         // Expresión lógica para que se ejecute el programa 5 veces
        } while (contador < 5);
        
    }
}
