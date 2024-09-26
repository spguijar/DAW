/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;

/**
 *
 * @author sandr
 */

//Creación clase Principal
public class Principal {
    /**
     * @param args the command line arguments
     */
    
    
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Fecha objFecha1  = new Fecha(20,Fecha.enumMes.febrero,2000); //Instancia un objeto de la clase Fecha denominado objFecha1 con el primer constructor.
        //Impresión en pantalla
        System.out.print("Primer fecha inicializada con el primer constructor\n La Fecha es:"+objFecha1.toString()+"\n");
        System.out.print(objFecha1.isSummer()?"Es verano\n":"No es verano \n");
        
        
        Fecha objFecha2  = new Fecha(15,Fecha.enumMes.julio,2015);//Instancia un objeto de la clase Fecha denominado objFecha2 con el primer constructor.
        //Impresión en pantalla
        System.out.print("Segunda fecha inicializada con el segundo constructor\n La Fecha es:"+objFecha2.toString()+"\n");
        System.out.print(objFecha2.isSummer()?"Es verano\n":"No es verano \n");    
    } 
}
