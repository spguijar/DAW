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

//Creación clase Rectangulo
public class Rectangulo {
    /**
     * @param args the command line arguments
     */
    
    float base;
    float altura;
    float area;
    Rectangulo(){ //Inicializamos 
        base=0;
        altura=0;
    }
    public Rectangulo(float base,float altura){ //Declara un constructor que inicialice base y altura.
        this.base=base;
        this.altura=altura;
    }
    public float getbase(){ //Método para obtener el valor del atributo base
     return base;
    }
    
    public void setbase(float base){ //Método para actualizar el atributo base
        this.base=base;    
    }
    
    public float getaltura(){ //Método para obtener el valor del atributo altura
     return altura;
    }
    
    public void setaltura(float altura){ //Método para actualizar el atributo altura
        this.altura=altura;    
    }
    public float getArea(){ //Método para obtener el valor del atributo area
        area=base*altura;
        return area;
    
    }
    public String toString(){ //Método para que devuelva el dato a una cadena de texto
        area=getArea(); 
        return " El rectangulo tiene  de altura "+altura+" y de area "+area;
    
    }
    
     public boolean isCuadrado(){
        return (base == altura);
        } 
    
    
    
    

    
}
