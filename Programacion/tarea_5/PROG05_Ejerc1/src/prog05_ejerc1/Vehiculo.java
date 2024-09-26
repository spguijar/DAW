/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog05_ejerc1;
//Insercción de paquete para la clase Date
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 ** Clase Vehículo con las entidades: propietario,matricula, kilómetros, descripción y precio.
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
public class Vehiculo {
    //Declarar el objeto e inicializar con el objeto de entrada estandar definido
    private String propietario;
    private String dni;
    private String matricula;
    private String descripcion;
    private String marca;
    private int kilometros;
    private float precio;
    private LocalDate matriculacion;
   
    
    //Constructor
    
    Vehiculo(String propieatrio, String dni,String matricula,String descripcion, String marca,int kilometros,
            float precio,LocalDate matriculacion){
        
        this.propietario=propieatrio;
        this.dni=dni;
        this.matricula=matricula;
        this.descripcion=descripcion;
        this.marca=marca;
        this.kilometros=kilometros;
        this.precio=precio;
        this.matriculacion=matriculacion;
    }
        
    //Método getMatricula para obtener el dato de la matricula
    public String getMatricula(){
    
       return matricula;
    }
    //Método getKilometros para obtener el dato de los kilómetros
    public int getKilometros(){
       return kilometros;
    }
    
    //Método setKilometros para introducir los kilometros, 
    //se introduce el parámetro += para usmar kilómetros
    public void setKilometros(int kilometros){
       this.kilometros+=kilometros;
    }
    //Método getPropietario para obtener el propiterario del vehículo
    public String getPropietario(){
        return propietario;
    }
    
    //Método getDescripcion() para obtener la descripción del vehículo
    public String getDescripcion(){
        return descripcion;
    }
    
    //Método getprecio() para obtener el precio del vehículo
    public float getprecio(){
        return precio;
    }
    //Método getDni para obtener el dni del propietario
    public String getDni(){
        return dni;
    }
    //Método get_anios() para obtener los años que han pasado desde la matriculación hasta la fecha actual
    public int get_Anios(){
        int resultado;
        resultado = (int) ChronoUnit.YEARS.between(this.matriculacion, LocalDate.now());
        return resultado;
    }
    
    }
    
    
    
        
    
    
    
    
    
    
    
    

