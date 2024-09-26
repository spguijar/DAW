/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog05_ejerc1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import PROG05_Ejerc1_util.validaciones;

/**
 * Clase Principal que consiste en ejecutar la aplicación con las siguientes funcionalidades
 * Nada más abrir se ejecuta un menú a elegir diferentes opciones:
 *  Nuevo Vehículo.
 *   Ver Matrícula.
 *  Ver Número de Kilómetros.
 *   Actualizar Kilómetros.
 *   Ver años de antigüedad.
 *   Mostrar propietario.
 *   Mostrar descripción.
 *   Mostrar Precio.
 *   Salir.
 * @author SandraPerezGuijar
 */
public class Principal {
    
     public static void main(String[] args) {
         
        int opcion;
        String marca; 
        String matricula;
        String descripcion;
        String propietario;
        String dni;
        int kilometros;
        int precio;
        LocalDate matriculacion;
        Vehiculo coche = null; // Inicializamos coche, para entrar al bucle
        
        
        //Creamos el bucle do/while para que cuando se seleccione la opción del 9. salir finalice la aplicación.
        do{
            Scanner in = new Scanner(System.in);
            //Imprimimos en pantalla las opciones de gestión del vehículo
             System.out.print("\n 1. Nuevo Vehículo");
             
             System.out.print("\n 2.Ver Matrícula.");
             
             System.out.print("\n 3.Ver Número de Kilómetros.");
             
             System.out.print("\n 4.Actualizar Kilómetros.");
             
             System.out.print("\n 5.Ver años de antigüedad.");
             
             System.out.print("\n 6.Mostrar propietario.");
             
             System.out.print("\n 7.Mostrar descripción.");
             
             System.out.print("\n 8.Mostrar Precio.");
             
             System.out.print("\n 9.Salir.\n");
             
             System.out.print("\n ¿Que opción desea realizar?");
             
             
             opcion = in.nextInt();
             in.nextLine();
             
             //Creamos condicional if para que salte una notificacion si pide los datos de un vehiculo y no hay registrado ningún dato
              if (opcion != 1 & coche == null & opcion != 9){ 
                System.out.println("No hay ningun coche creado\n");
            }
            else{
                  // declaración switch para indicar las diferentes opciones señalizadas del programa
                switch (opcion){
                    case 1: // Elección de un nuevo vehiculo
                        System.out.println("\n_CREACIÓN DE UN NUEVO VEHICULO_\n");
                        
                        //Insercción de datos de la marca del vehículo
                        System.out.println("\nIntroduzca la marca del vehículo");
                        marca = in.next();
                        in.nextLine();
                        //Insercción de datos de la matricula del vehículo
                        System.out.println("\nIntroduzca la matricula del vehículo");
                        matricula = in.next();
                        in.nextLine();
                        //Insercción de datos de los números de kilómetros del vehículo
                        System.out.println("\nIntroduzca el número de kilometros");
                        kilometros=in.nextInt();
                        //condicional para detectar que el número introducido es positivo
                        if (kilometros<0){
                             System.out.println("ATENCION!! El número de kilometros tiene que ser un dato positivo \n");
                             break;
                        };
                        in.nextLine();
                        
                        
                        System.out.println("\nIntroduzca la fecha de matriculación fecha dd/MM/yyyy");
                        
                         matriculacion=LocalDate.parse(in.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                         //Condicional  para indicar si la fecha introducida es anterior a la fecha de hoy
                        if(matriculacion.isBefore(LocalDate.now()) == false){
                              System.out.println("ATENCION!! Tiene que haberse matriculado antes de hoy.\n");
                              break;
                          }
                        
                        //Insercción de datos de la descripción del vehículo
                        System.out.println("\nIntroduzca descripción");
                        descripcion = in.next();
                        in.nextLine();
                        
                        //Insercción de datos del precio del vehículo
                        System.out.println("\nIntroduzca el precio del vehículo");
                        precio = in.nextInt();
                        in.nextLine();
                        
                        //Insercción de datos del nombre del propietario del vehículo
                        System.out.println("\nIntroduzca el nombre del propietario del vehículo");
                        propietario = in.next();
                        in.nextLine();
                        
                        //Insercción de datos del dni del propietario del vehículo
                        System.out.println("\nIntroduzca el dni del propietario del vehículo");
                        dni = in.next();
                        in.nextLine();
                        
                        try{ // Hacemos la verificación de que el DNI es correcto
                            //llamamos  a la clase de validaciones al método validarNIF
                            validaciones.validarNIF(dni);
                        }catch(Exception e){
                            System.out.println("_EL DNI INSERTADO NO ES CORRECTO_\n");
                            break;
                        }
                         //Introduce en la variable coche los datos del vehículo
                        coche = new Vehiculo(propietario,dni,matricula,descripcion,marca, kilometros, precio,matriculacion);
                        
                 
                        System.out.println("\n Se ha creado el vehiculo de forma correcta");
                        break;
                        
                    case 2: //Opción de ver matricula
                        
                        System.out.println("\nLa matricula del vehiculo es "+coche.getMatricula());
                        break;
                        
                    case 3: //Ver Número de kilómetros por pantalla
                        
                        System.out.println("\n El nº de kilometros del vehiculo es "+coche.getKilometros());
                        break;
                        
                    case 4: //Actualizar kilometros
                        System.out.println("\n El vehiculo tiene "+coche.getKilometros()+" kilometros¿Cuantos kilómetros desea actualizar?");
                        kilometros=in.nextInt();
                        coche.setKilometros(kilometros);
                        System.out.println("El coche tiene ahora "+coche.getKilometros()+" kilometros");
                        break;
                        
                        
                    case 5: //Ver años de antigüedad
                        System.out.println("\nLos años que tiene el vehículo son "+coche.get_Anios());
                        break;
                        
                    case 6: //Mostrar propietario
                        System.out.println("\nEl propietario del vehículo es "+coche.getPropietario());
                        break;
                    
                    case 7: //Mostrar Descripción
                        System.out.println("\n La descripción del vehículo es "+coche.getDescripcion());
                        break;
                        
                    case 8: //Mostrar precio
                        System.out.println("\n El precio del vehículo es "+coche.getprecio());
                        break;
             
             
             }
              }
                         
        }
        
        while(opcion!=9);
        
        System.out.println("Aplicación finalizada");
         
         
     }
}

    


