/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_06_ejerc1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import java.lang.*;

/**
 ** Clase Concesionario que gestiona los vehiculos con los métodos de insertar vehículo, buscar vehiculo, actualiza kilometros,
 * existe vehiculo, lista vehiculos y numeros vehiculos.
 * las entidades que necesita esta clase son: propietario,matriculacion, kilómetros, descripción y precio.
 * @param propiterario variable de texto para indicar el propietario del vehículo
 * @param dni variable de texro para indicar el dni del propietario
 * @param matricula variable de texto para indicar la matricula del vehículo
 * @param descripcion variable de texto para indicar la descripción del vehículo
 * @param marca variable de texto para indicar la marca del vehículo
 * @param kilometros variable numérica para indicar los kilométros del vehículo
 * @param precio variable númerica para indicar el precio del vehículo
 * @param matriculacion variable de fecha para indicar la fecha de matriculación en formato  dd/MM/yyyy
 * @author SandraPerezGuijar
 * 
 */
public class Concesionario  {
    
    Vehiculo coche = null;
    static ArrayList<Vehiculo> cars = new ArrayList<Vehiculo>();
    String coche_txt;
    static int numeroCoches=0;
    static int maximo_num_coches=50;
    static String message="";
    static int cocheEncontrado=0;
    static boolean EsEncontradoElCoche;
 
    
    
    public static int insertarVehiculo (String marca, String matricula, String descripcion,String Propietario, String dni,  int kilometros,
        int precio,LocalDate  matriculacion) {
        /**
        * Método  BuscaVehiculo, en el array almacenado de vehiculos
        * @param marca, marca del coche
        * @param matricula, matricula del coche
        * @param descripcion, descripcion del coche
        * @param Propietario, Propietario del coche
        * @param dni, dni del Propietario
        * @param kilometros, kilometros del coche
        * @param precio, precio del coche
        * @param matriculacion, matriculacion del coche
        * return -2 si no existe el vehiculo, 0 si ha insertado bien el vehículo
        */
        
        System.out.print("insertando vehiculo...");

       int limit = 15;
        if (cars.size() < limit) {
            
            for (Vehiculo coche : cars) {
                 if(matricula==coche.getMatricula()){
                     System.out.println("el coche ya existe");
                     return -2;
                 };
                 }
              }
           
            Vehiculo vehiculo = new Vehiculo(Propietario,dni,matricula,descripcion,marca,kilometros,precio,matriculacion);
            cars.add(vehiculo);
            
            return 0;
        
            };
    public static String listaVehículos(){
         /**
        * Método listaVehiculos muestralos vechiculos que hay dentro de cars
        * return message
         */
        if (numeroVehiculos()==0){
            message="NO hay vehiculos en el concesionario";
        }
        for(Vehiculo coche : cars){
            message+=coche.to_String();
        }
        return message;
        }
    
    public static int numeroVehiculos(){
        /**
        * Método actualizaKms que actualiza los kilómetros del matricula insertado
        * return numero de coches
        */
        for(Vehiculo coche : cars){
            numeroCoches++;
        }
        return numeroCoches;
    }
    
    public static String BuscaVehiculo(String matricula){
        /**
        * Método  BuscaVehiculo, en el array almacenado de vehiculos
        * @param matricula, matricula del coche
        * return message
        */
        cocheEncontrado=0;
        for(Vehiculo coche : cars){
            if (coche.getMatricula().equals(matricula)){
                System.out.println("ENCONTRADO");
                cocheEncontrado++;
                message= coche.to_String();
            }
        }
        if (cocheEncontrado==0){
            message="La matricula no se encuentra en el inventario de coches";
        }
        return message;
    }
    public static boolean existeVehiculo(String matricula){
        /**
        * Método  existeVehiculo, devuelve true o false si ya existe el vehiculo en el inventario
        * @param matricula, matricula del coche
        * return EsEncontrsdoElCochce en booleano,
        */
        
        for(Vehiculo coche : cars){
            if (coche.getMatricula() ==  matricula){
                EsEncontradoElCoche=true;
                cocheEncontrado++;
            }
            if (cocheEncontrado==0){
                EsEncontradoElCoche=false;
            }
        }
         return EsEncontradoElCoche;
    }
    
    public static String actualizaKms(String matricula,int kilometros){
         /**
            * Método //Método actualizaKms que actualiza los kilómetros del matricula insertado
            * @param matricula, matricula del coche
            * @param kilometros, kilometros del coche
            * return mensaje informativo
            */
        
       cocheEncontrado=0;
         if (numeroVehiculos()==0){
            message= "NO hay vehiculos en el concesionario";
        }else{
            for (Vehiculo coche : cars) {
                if(coche.getMatricula().equals(matricula)){
                    System.out.println("Actualizando km del coche..");
                    coche.setKilometros(kilometros);
                    cocheEncontrado++;
            }
             if (cocheEncontrado==0){
                message="La matricula no se encuentra en el inventario de coches";
            }else{
                 message= "Kilómetros actualizados";
             }
         }
         }
         return message;
         }
    }

    
    