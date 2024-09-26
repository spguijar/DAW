/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prog03.figuras;

/**
 *
 * @author sandr
 */

//Creación clase Principal
public class Principal {
    
    
    //Metodo main
    public static void main(String[] args) {
    
    Rectangulo objRectangulo1  = new Rectangulo();  //Instancia un objeto de la clase Fecha denominado objRectangulo1 con el primer constructor.
    objRectangulo1.setaltura(12);
    objRectangulo1.setbase(12);
    
    //Impresión en pantalla
    System.out.print(objRectangulo1.toString()+"\n");
    System.out.print(objRectangulo1.isCuadrado()?"Es cuadrado\n":"No es cuadrado \n");
    
    Rectangulo objRectangulo2  = new Rectangulo();  //Instancia un objeto de la clase Fecha denominado objRectangulo2 con el primer constructor.
    objRectangulo2.setaltura(5);
    objRectangulo2.setbase(8);
    
    //Impresión en pantalla
    System.out.print(objRectangulo2.toString()+"\n");
    System.out.print(objRectangulo2.isCuadrado()?"Es cuadrado\n":"No es cuadrado \n");
    }
    
    
}
