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

//Creación clase Fecha
public class Fecha {
    public enum enumMes {enero, febrero, marzo, abril, mayo, junio, julio,agosto,septiembre,octubre, noviembre,diciembre}; //Creación del enum enumMes para los meses del año
    enumMes mes;
    int dia; //Creación de la variable dia        
    int anio; //Creación de la variable año
    Fecha(enumMes mes){ //Inicializamos el constructor vacío
        dia=0;
        anio=0;
        this.mes=mes;
    }        
    
    Fecha (int dia, enumMes mes, int anio){ //Inicializamos los atributos de la clase
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
       
    }

   
    public int getDia(){ //Método para obtener el valor del atributo dia
        return dia;
    }
    public void setDia(int dia){ //Método para actualizar el atributo dia
        this.dia=dia;
    
    }
    public enumMes getMes(){ //Método para obtener el valor del atributo mes
        return mes;
    }
    
    public void setMes(enumMes mes){ //Método para actualizar el atributo mes
        this.mes=mes;
    
    }
    public int getAnio(){ //Método para obtener el valor del atributo año
        return anio;
    }
    
    public void setAnio(int anio){ //Método para actualizar el atributo año
        this.anio=anio;    
    }
    
    public boolean isSummer(){ //Método para obtener si la fecha es en verano o no, de tipo booleano
        return (dia >=21 && mes == enumMes.junio) || mes == enumMes.julio || mes == enumMes.agosto ||(dia <=21 && mes == enumMes.septiembre);
        }  
    
    @Override
    public String toString(){ //Método para que devuelva el dato a una cadena de texto
        return dia +" de "+mes+" del "+anio;
    
    
    }
        };
  
    
    
    

    

