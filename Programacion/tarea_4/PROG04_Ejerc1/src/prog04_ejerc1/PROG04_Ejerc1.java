/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog04_ejerc1;
// Programa Java para leer datos de varios tipos usando la clase Scanner
import java.util.Scanner;
/**
 * Programa que muestra la tabla de un número leído desde teclado
 * @autor SandraPerezGuijar
 * 
 */
public class PROG04_Ejerc1 {

    /**
     * Constructor que devuelve la información de la tabla de multiplicar
     * @param number variable numérica con la que se mostrará la información de su tabla de multiplicar
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println ("Introduce un numero");
       //Declarar el objeto e inicializar con el objeto de entrada estandar definido
        Scanner sc = new Scanner (System.in);

        int number;
        int n=1;
        int n1=1;
        //Introducción de entradas numéricos
        number= sc.nextInt ();
        //Condicional if/else para seleccionar solo los numeros menores que 30
        if (number>=30){
            System.out.println ("El número introducido tiene que ser menor que 30");
        }else {
            System.out.println("Tabla del " + number);
            //Bucle for para recorrer todos los valores hasta el número 10 e imprimir en pantalla
            System.out.println("bucle for");
            for(int i = 1; i<=10; i++){
             System.out.println(number + " * " + i + " = " + number*i);                                                     
        }
            //Bucle while para recorrer todos los valores hasta el número 10 e imprimir en pantalla
            System.out.println("bucle while");
            while(n<=10)
            {
            System.out.println(number + " * " + n + " = " + number*n);
            n++;
            }
            n=1;
            System.out.println("\nbucle do/while  \n");  
            //Bucle do/while para recorrer todos los valores hasta el número 10 e imprimir en pantalla
            do{
              
            System.out.println(number + " * " + n + " = " + number*n);
            n++;
            }while(n<=10);
           
            }
            
    }
    
}
