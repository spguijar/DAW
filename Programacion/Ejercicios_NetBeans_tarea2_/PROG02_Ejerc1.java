/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandra
 */
public class PROG02_Ejerc1 { //Creación de una clase
    
    
    

   //5.Enumeración variable SEXO         
   public  enum  sexo { V , M } 
    
    
    public static void main(String[] args) { // creación del main
        //VARIABLES
         // 1.Valor máximo no modificable: 5000. Con el parametro final,
         //La variable para que sea no modifiable(final) y el tipo de dato (int) porque su valor es 5000
        final int numero = 5000;
        
        //2. Si el nuevo empleado tiene carnet de conducir o no.
        //El tipo de dato es Boolean para indicar si un elemento es True o False
        boolean carnet_empleado = true; 
        
        //3. Un mes del año en formato numérico y como cadena.
        //Por lo que incluimos la variable int y String respectivamente.
        int julio=06; 
        String julio_str="06";
        
        //4. El nombre y apellidos de una persona.
        //La variable que vamos a definir es String para el tipo de dato
        String persona="sandra pérez";
        
        //5. Sexo: con dos valores posibles 'V' o 'M'.
        //Se ha generado una enumeración denominada sexo con dos valores 'V' y 'M' 
        //y creamos una variable denominada el genero que asigne un valor al enum sexo
        sexo genero = sexo.M;
        
        //6.Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
        //La variable es de tipo Long
        long distancia_tierra_jupiter  = 591000000;
        
        
        //7.Saldo de una cuenta bancaria.
        //La variable de una cuenta variable tiene dos decimales, por lo que le asignamos el tipo float
        float total_banco=(float) 58785.25;
        
        //8.Distancia en kms desde la Tierra a Júpiter.
        //El tipo de dato long es un entero de complemento de dos de 64 bits.
        long miliseg = 1640000000000000L; 
        
        //Impresión en pantalla
        System.out.print("1.Valor máximo no modificable: "+ numero);
        System.out.print("\n2.Si el nuevo empleado tiene carnet de conducir o no, el resultado es : "+ carnet_empleado);
        System.out.print("\n3.Un mes del año(julio) en formato numérico  "+julio+"  y como cadena  "+julio_str);
        System.out.print("\n4.El nombre y apellidos de una persona. "+ persona);
        System.out.print("\n5.el valor de la vaiable sexo  es "+ genero);
        System.out.print("\n6.Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días. "+ miliseg);
        System.out.print("\n7.Saldo de una cuenta bancaria. "+ total_banco);
        System.out.print("\n8.el valor de la vaiable distancia_tierra_jupiter  es "+ distancia_tierra_jupiter);
    
    }
    
    
}
