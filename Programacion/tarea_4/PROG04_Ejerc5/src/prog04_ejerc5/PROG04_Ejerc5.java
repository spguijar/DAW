/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog04_ejerc5;
// Programa Java para leer datos de varios tipos usando la clase Scanner
import java.util.Scanner;

/**
 * Programa que divide y captura excepciones
 * @author SandraPerezGuijar
 */
public class PROG04_Ejerc5 {

    /**
     * Constructor que devuelve el resultado de una división
     * @param dividendo variable numérica que se va a dividir
     * @param divisor variable númérica que divide
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar el objeto e inicializar con el objeto de entrada estandar definido
        int dividendo=0;
        int divisor=0;
        int resultado=0;
        boolean salir;
        salir = false; // Incializamos Salir para evitar que el bucle se ejecute solo una vez
                
        Scanner in = new Scanner(System.in);
        
        System.out.print("\nIntroduce el dividendo: ");
        dividendo = in.nextInt();
        System.out.print("\nIntroduce el divisor: ");
        divisor = in.nextInt();
        
        do{
        
        if (dividendo != -1 & divisor != -1){
        
        //Introducimos la excepción de Try para capturar el error cuando se produzca la división
            try{
                resultado=dividendo/divisor;
                System.out.print("El resultado es "+resultado);
            }
            catch(ArithmeticException e){
                System.out.print("ERROR al dividir entre 0 ");
            }

        }else{
                    salir=true;
                    }
        
        }while(salir==false);
    }
    
}
