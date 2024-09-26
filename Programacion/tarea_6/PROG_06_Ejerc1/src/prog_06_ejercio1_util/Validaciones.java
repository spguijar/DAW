/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_06_ejercio1_util;

import java.util.regex.*;

/**
* Clase Validaciones, contiene: 
* Validacion del nombre del propietario
* Validación del NIF 
* Validación del patron de matricula
 * @author SandraPerezGuijar
 */
public class Validaciones {
    
    //Creamos la variable propietario_sinespaciosblanco que se usará para el método check_nombrepropietario()
    static String propietario_sinespaciosblanco;
    // Declaramos la constante que contiene la cadena de las Letras del DNI.
    private static Pattern patronDNI = Pattern.compile("[XYxy]?[0-9]{7,8}[A-Za-z]");
    private static Pattern patronMatricula = Pattern.compile("[0-9]{4}[A-Z]{3}");
    static Matcher isMatricula;
    static Matcher isDni;
    
    public static boolean check_nombrepropietario(String propietario){
        /**
        * Método //Método check_nombrepropietario que actualiza los kilómetros del matricula insertado
        * @param propietario, nombre del propietario
        * return mensaje informativo
        */
        if(propietario.length()>40){
            return false;
        }else{
            System.out.println(propietario);
          propietario_sinespaciosblanco=propietario.replace(" ","");
          if((propietario.length()-propietario_sinespaciosblanco.length())!=2){
              return false;
          }
          }
        return true;
}
    public static boolean check_matricula(String matricula){
         /**
        * Método check_matricula para comprobar que la matrícula insertada cumple la condicion NNNNLLL
            * @param matricula, que desea comprobar
            * return true si coincide con la expresion regular o false en el caso de que no coincidiera
            */
         isMatricula= patronMatricula.matcher(matricula);
         return isMatricula.matches();
    }
    
    public static boolean check_dni(String dni){
          /**
        * Método check_dni para comprobar que el dni insertado contiene el formato correcto
            * @param dni, que desea comprobar
            * return true si coincide con la expresion regular o false en el caso de que no coincidiera
            */
        
        isDni= patronDNI.matcher(dni);
         return isDni.matches();
    }
    }

