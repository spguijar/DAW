/*
 * Programa Java  que dado un número de segundos, muestre en pantalla cuántos minutos, horas y días contiene.

 */

/**
 *
 * @author sandra
 */
public class PROG02_Ejerc5 {
    
    public static void main(String[] args){
        //Variable con los segundos que queremos transformar
        
        int SegundosTotal=500000;
        
        //Sucesión de calculos para desglosar los segundos en días, horas, minutos y segundos
        int dias = SegundosTotal / 86400;
        int diasFinal = SegundosTotal % 86400;
        int horas = diasFinal / 3600;
        int horasFinal = diasFinal % 3600;
        int minutos = horasFinal / 60;
        int segundos = horasFinal % 60;
        
        //Impresión en pantalla del resultado
        System.out.println("Los segundos introducidos dan un total de   "+dias+" dias "+horas+" horas "+minutos+"  minutos y" +segundos+"  segundos");
    
    
    }
    
}
