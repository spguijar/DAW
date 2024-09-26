/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandr
 */
public class PROG02_Ejerc6 {
    //Generación de una enumeración con las razas de perro
    public enum RazasPerro {Mastín , Terrier , Bulldog , Pekines , Caniche , Galgo};
    
    //generación de dos enumeradores con dos razas de perro distintas
    public enum var1 {Mastín};
    public enum var2 {Bulldog};
    
    
    public static void main(String[] args){
        //Obtenemos el texto del primer valor de los 2 enum(var1 y var2)
        
        var1 text1= var1.values()[0];
        var2 text2= var2.values()[0];
        //Convertimos en Sring el texto 
        
        String String1=text1.toString();
        String String2=text2.toString();
        //Obtenemos las posiciones de los dos textos en el enum RazasPerro
        
        int posicion_1=RazasPerro.valueOf(String1).ordinal();
        int posicion_2=RazasPerro.valueOf(String2).ordinal();
        
        //Obtenemos los caracteres del texto introducido
        int String1_number=String1.length();
        int String2_number=String2.length();
        
        //Impresión en pantalla
        System.out.print("El texto var1  "+String1 +"  se encuentra en la posicion nº"+posicion_1+"  de RazasPerro y tiene el nºcaracteres  "+String1_number+
                "\n El texto var2  "+String2 +"  se encuentra en la posicion nº"+posicion_2+ "  de RazasPerro y tiene el nºcaracteres  "+String2_number+
                "\n");
        
        
    }
}
