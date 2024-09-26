/*
 *Programaque dada la edad de una persona, muestre un mensaje indicando si es mayor de edad. NO se puede utilizar el operador condicional if.

 */

/**
 *
 * @author sandr
 */


public class PROG02_Ejerc4 {
    
    public static void main(String[] args){
        //Variable con la edad de una persona
        int n=18;
        
        //Condicional (if) para indicar  la condición de cuando n sea mayor o igual que 18 es mayor de edad
        if(n>=18){
            //Impresión en pantalla
            System.out.println("la edad de "+n+" es mayor de edad");
    
    }
        else{ //Else para indicar que los excluyentes de la condición no son mayores de edad
            //Impresión en pantalla
            System.out.println("la edad de "+n+" NO es mayor de edad");
        }
    }
    
}
