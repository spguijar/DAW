/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandr
 */
public class PROG02_Ejerc8 {
    
    public static void main(String[] args){
    //Número de alumnos    
    float alumnos_programacion= 8;
    float alumnos_entornosdesarrollo= 5;
    float alumnos_bbdd= 4;
    //Calculamos el porcentaje de alumnos en las clases suponiendo que su capacidad son 30
    float porc_programacion= (alumnos_programacion/30)*100;
    float porc_entornosdesarrollo= (alumnos_entornosdesarrollo/30)*100;
    float porc_bbdd= (alumnos_bbdd/30)*100;
    
    //Imprimir en pantalla
    System.out.printf("El porcentaje de alumnos del módulo de Programación es %.1f",porc_programacion);
    System.out.printf("\nEl porcentaje de alumnos del módulo de Entornos de desarrollo es %.1f",porc_entornosdesarrollo);
    System.out.printf("\nEl porcentaje de alumnos del módulo de Base de datos es %.1f",porc_bbdd);
    };
}
