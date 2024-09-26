/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandr
 */
public class PROG02_Ejerc9 {
    public static void main(String[] args){
        
     //Variable del año a analizar   
     int anio=1900;
     
     
    //Generación de la condición if para que el año bisiesto sea divisible por 4
    //pero no por 100 salvo que sea divisible por 400
     if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
         //Impresión en pantalla
	System.out.println("El año "+ anio +" es bisiesto");
     
     else//Else para los excluyentes
         
         //Impresión en pantalla
	System.out.println("El año "+ anio + " no es bisiesto");
    
    
    };
    
}
