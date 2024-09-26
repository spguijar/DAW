/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_06_ejerc1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author sandr
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
    
    Vehiculo(String propietario, String dni,String matricula,String descripcion, String marca,int kilometros,
            float precio,LocalDate matriculacion){
        this.propietario=propietario;
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
    //Método setMatricula para introducir los datos de la matricula
    public void setmatricula(String matricula){
        this.matricula=matricula;
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
    //Método setPropietario para introducir el propiteratio del vehículo
    
    public void setpropietario(String propietario){
        this.propietario=propietario;
    }
    
    //Método getDescripcion() para obtener la descripción del vehículo
    public String getDescripcion(){
        return descripcion;
    }
    //Método setdescripcion() para introducir la descripción del vehículo
    
    public void setdescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    //Método getprecio() para obtener el precio del vehículo
    public float getprecio(){
        return precio;
    }
    //Método setprecio() para introducir la descripción del vehículo
    
    public void setprecio(int precio){
        this.precio=precio;
    }
    //Método getDni para el precio del vehículo
    public String getDni(){
        return dni;
    }
    //Método get_anios() para obtener los años que han pasado desde la matriculación hasta la fecha actual
    public int get_Anios(){
        int resultado;
        resultado = (int) ChronoUnit.YEARS.between(this.matriculacion, LocalDate.now());
        return resultado;
    }
    
    //metodo set_anios() para insertar la fecha de matriculacion
    
    public String to_String(){
        
        return "\n El propiertario del vehiculo "+marca + 
                ", con descripcion  "+descripcion+", cuya matricula es "+ matricula  +" con los Kilómetros "+kilometros +
                "y precio "+precio + " es "+propietario + " con DNI "+ dni;
    
    }
    
    }
    
    

