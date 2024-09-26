/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_06_ejerc1;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import prog_06_ejercio1_util.Validaciones;

/**
 * Clase Principal que consiste en ejecutar la aplicación con las siguientes funcionalidades
 * Nada más abrir se ejecuta un menú a elegir diferentes opciones:
 *  Nuevo Vehículo.
 *   Lista Vehiculos
 *  Buscar Vehiculo.
 *   Modificar kms Vehículo.
 * @author SandraPerezGuijar
 */
public class Principal extends Concesionario {
    public static void main(String[] args) {
        int opcion;
        String marca; 
        String matricula;
        String descripcion;
        String propietario;
        String dni;
        int kilometros;
        int precio;
        String fechamatriculacion;
        LocalDate matriculacion;
        Vehiculo coche = null; // Inicializamos coche, para entrar al bucle
        int inserccionCoche;
        
        
        //Creamos el bucle do/while para que cuando se seleccione la opción del 9. salir finalice la aplicación.
        do{
            Scanner in = new Scanner(System.in);
            //Imprimimos en pantalla las opciones de gestión del vehículo
             System.out.println("\n 1. Nuevo Vehículo");
             
             System.out.println("\n 2.Listar Vehículos.");
             
             System.out.println("\n 3.Buscar Vehículo.");
             
             System.out.println("\n 4.Modificar kms Vehículo");
             
             System.out.println("\n 5.Salir.");
             
             System.out.print("\n ¿Que opción desea realizar?");
             
             
             opcion = in.nextInt();
             in.nextLine();
             switch (opcion){
                 //Opción 1, crear nuevo vehículo 
                case 1:
                    
                  
                    //___DATOS DE PRUEBA___
                    /*
                    propietario="Sandra Pérez";
                    dni="12430129D";
                    matricula="43CYB";
                    descripcion="Opel vectra de Sandra";
                    marca="Opel";
                    kilometros=2000;
                    precio=3000;
                    matriculacion=LocalDate.parse("01/01/1994", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    Concesionario.insertarVehiculo(marca,matricula,descripcion,propietario, dni, kilometros,precio,matriculacion);
                    propietario="Javier García";
                    dni="6666666J";
                    matricula="3040";
                    descripcion="Renault Laguna de Javi, (bebé laguna)";
                    marca="Renault laguna";
                    kilometros=2000;
                    precio=3000;
                    Concesionario.insertarVehiculo(marca,matricula,descripcion,propietario, dni, kilometros,precio,matriculacion);
                    
                    */

                    //Introducimos por teclado el nombre del propietario del vehículo
                    System.out.println("Introduce el nombre y los dos apellidos del propietario del vehículo");
                    propietario=in.nextLine();
                    
                    //Comprobamos si el nombre del propietario es correcto
                    if(Validaciones.check_nombrepropietario(propietario)==false){
                        System.out.println("Nombre del propietario incorrecto");
                        break;
                    }else
                    
                    ///Introducimos por teclado el dni del propietario del vehículo
                    System.out.println("Introduce el DNI del propietario del vehículo, en formato NNNNLLL");
                    dni=in.nextLine();
                    
                    if(Validaciones.check_dni(dni)==false){
                        System.out.println("Dni del propietario incorrecto");
                        break;
                    }
              
                    ///Introducimos por teclado la matricula del vehículo
                    System.out.println("Introduce la matricula del vehículo");
                    matricula=in.nextLine();
                    
                   

                     //Comprobamos si el formato de matricula es correcta sino sale del programa
                     if (Validaciones.check_matricula(matricula)==false){
                         System.out.println("La matrícula es incorrecta");
                         break;
                     }

                     //Comprobamos si la matricula existe en el inventario sino sale del programa
                     if(Concesionario.existeVehiculo(matricula)){
                         System.out.println("Ya existe la matrícula del coche en el inventario");
                         break;
                     }

                     //Introducimos por teclado la fecha de matriculacion del vehículo
                    System.out.println("Introduce la fecha de matriculacion del vehículo");
                    fechamatriculacion="03/01/1994";
                    //fechamatriculacion=in.nextLine();
                    matriculacion=LocalDate.parse(fechamatriculacion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    System.out.println(matriculacion);
                     

                     //Introducimos por teclado la descripción del vehículo
                     System.out.println("Introduce la descripcion del vehículo");
                     descripcion=in.nextLine();

                     //Introducimos por teclado la marca del vehículo
                     System.out.println("Introduce la marca del vehículo");
                     marca=in.nextLine();

                     //Introducimos por teclado los kilómetros del vehículo
                     System.out.println("Introduce los kilómetros del vehículo");
                     kilometros=in.nextInt();

                     //Introducimos por teclado el precio del vehículo
                     System.out.println("Introduce el precio del vehículo");
                     precio=in.nextInt();

                     inserccionCoche=Concesionario.insertarVehiculo(marca,matricula,descripcion,propietario, dni, kilometros,precio,matriculacion);
                    if(inserccionCoche==0){
                        System.out.println("La insercción del vehículo se ha realizado correctamente");
                    }

                    
                //Opcion 2, Listar vehículos    
                case 2:
                    System.out.println(Concesionario.listaVehículos());
                    break;
                    
                //Opción 3, Buscar Vehículos    

                case 3:
                    //matricula="3040";
                    //Introducimos por teclado la matricula del vehículo que desea buscar
                    System.out.println("Introduce la matrícula del vehículo que desea buscar");
                    matricula= in.nextLine();
                    System.out.println(Concesionario.BuscaVehiculo(matricula));
                    break;

                //Opción 4, modificar kilometros del vehículo        
                case 4:
                    //matricula="3040";
                    //kilometros=1;
                    //Introducimos por teclado la matricula del vehículo que desea actualizar los kiloemtros y los nuevos kilometros
                    System.out.println("Introduce la matrícula del vehículo que desea buscar");
                    matricula= in.next();
                    
                    System.out.println("Introduce el número de kilometros que desea actualizar");
                    kilometros=in.nextInt();
                    
                    System.out.print(Concesionario.actualizaKms(matricula,kilometros));
                    break;

             };
        }
            while(opcion!=5);
        
        
    
    
    
    
    
    }
    
}
