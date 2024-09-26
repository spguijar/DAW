/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog04_ejerc3;
// Programa Java para leer datos de varios tipos usando la clase Scanner
import java.util.Scanner;

/**
 * Programa que te indica el Mínimo Común Multiplo (MCM) de dos números positivos
 * @author SandraPerezGuijar
 */
public class PROG04_Ejerc3 {

    /**
     * Constructor que devuelve el MCM
     * 
     * @param numero_1 Variable numérica para calcular el MCM
     * @param numero_2 Variable numérica para calcular el MCM
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar el objeto e inicializar con el objeto de entrada estandar definido
        Scanner in = new Scanner(System.in);
         int numero_1;
         int numero_2;
         int mcm=1;
         int i=2;
         
       
        System.out.print("\nIntroduce un numero: ");
        numero_1 = in.nextInt();
        System.out.print("\nIntroduce un segundo numero: ");
        numero_2 = in.nextInt();
        
        //Condicional if/else para detectar los números negativos
        if (numero_1<0 || numero_2<0){
            System.out.print("Algún dato introducido es negativo");
        
        }
        else{
          
        while(i <= numero_1 || i <= numero_2)
        {
            if(numero_1%i==0 || numero_2%i==0)
            {
            mcm=mcm*i;
            if(numero_1%i==0) numero_1=numero_1/i;
            if(numero_2%i==0) numero_2=numero_2/i;
            }
            else
                i=i+1;               
        }                        
                                                 
        }     
        System.out.println("El MCM  es = " +mcm);    
    }
         
        };
        
        
       
        
        
    
    

