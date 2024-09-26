/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog04_ejerc4;
// Programa Java para leer datos de varios tipos usando la clase Scanner
import java.util.Scanner;

/**
 *Programa juego JAVA que permite al usuario adivinar un número oculto 
 * @author SandraPerezGuijar
 */
public class PROG04_Ejerc4 {

    /**
     * Constructor que devuelve la funcionalidad del juego
     * @param opcion_juego variable numerica para indicar que funcionalidad del juego desea
     * @param numInt variable numérica para indicar el numero de intentos del juego
     * @param numMax variable numérica  para indicar el máximo generado
     * @param num variable numérica para  adivinar el número
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declarar el objeto e inicializar con el objeto de entrada estandar definido
        int opcion_juego=0;
        int numInt=0;
        int numInt_2=0;
        int numMax=0;
        int num;
        boolean acertado = false;
        Scanner in = new Scanner(System.in);
        
        
        //Creamos el bucle do/while para que cuando se seleccione la opción del juego=salir, se termine el juego.
        do{
            int seleccion_config=0;
            //Condicional if para que se inicialice por defecto
            if (opcion_juego==0){
                System.out.println("¡Bienvenido al juego de adivinar número oculto!");
                System.out.println(" (1. Configurar, 2. Jugar, 3. Salir)");
                System.out.println(" Introduce el modo de juego  ");
                opcion_juego= in.nextInt();
            
            }
           //condicional if, para cuando se seleccione la opción de configuración
            if(opcion_juego==1){
                System.out.println(" Introduce el número de intentos");
                numInt = in.nextInt();
                System.out.println("Introduce el número máximo generado");
                numMax = in.nextInt();
                
                seleccion_config++;
            }
                
            
            //Condicional if, para cuando se seleccione la opción de jugar
            if(opcion_juego==2){
                //Si anteriormente no se ha seleccionado la configuración se inicializa el nº de intentos y maximo por defecto
                if(seleccion_config==0){
                    numInt=5;
                    numMax=10;                
                };               
                numInt_2=numInt;
                int numOculto = (int)Math.floor(Math.random()*numMax+1); //genera un número aleatorio entre 0 y 20, ambos incluidos
                System.out.print(numOculto);
                do {
                    
                        System.out.print("\n***EMPIEZA EL JUEGO***");
			System.out.println("Te quedan "+numInt+" intentos");
			System.out.print("Introduce el numero a adivinar: ");
			
			num=in.nextInt();	
			numInt--;
			
			if(num == numOculto) {
				acertado = true;
			} else if(numOculto > num ){
				System.out.println("El numero a adivinar es mayor.");
			} else {
				System.out.println("El numero a adivinar es menor.");
			}
		} while(numOculto > 0 && !acertado);
		
		if(acertado)
			System.out.println("Enhorabuena! Has acertado! has necesitado  "+(numInt_2-numInt)+"  intentos");
		else
			System.out.println("Lo siento, no has acertado. El número era: " + numOculto);
                opcion_juego=0;
                }
                
        }while(opcion_juego!=3);
    }
    
}
