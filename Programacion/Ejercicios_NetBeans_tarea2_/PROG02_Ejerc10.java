/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandr
 */
public class PROG02_Ejerc10 {
    public static void main(String[] args){
        
     System.out.println("\n------- Conversiones entre enteros y coma flotante -------");   
     //Creación de variables float
     float x = (float)4.5 ;
     float y=(float)3.0;
     int i=2;
     //Conversión explicita int
     int j= (int) (i*x);
     
     System.out.println("Producto de int por float: j= i*x ="+j);
     
     //Creación de variables double
     double dx= 2.0;
     double dz= dx*y;
     
     System.out.println("Producto de float por double: dz=dx * y = "+dz);
    
     System.out.println("\n------- Operaciones con byte -------");
     
     //Creación de variables byte
     byte bx=5;
     byte by=2;
     byte bz=(byte) (bx - by);
     
     System.out.println("byte:  "+bx+" - "+by+" = "+bz);
     
     bx=-128;
     by=1;
     bz=(byte)(bx-by);
     
     System.out.println("byte "+bx+" - "+by+" = "+bz);
     
     
     //Conversión explicita int
     int bi=(int)(bx-by);
     
     System.out.println("(int) ("+bx+" - "+by+") = "+bi);
     
       
    
     System.out.println("\n------- Operaciones con short -------");
     //Creación de variables short
     short sx=5;
     short sy=2;
     short sz=(short)(sx - sy);
     System.out.println("short  "+sx+" - "+sy+" = "+sz);
     
     
     sx=32767;
     sy=1;
     sz=(short)(sx + sy);
     System.out.println("short  "+sx+" + "+sy+" = "+sz);

     
     System.out.println("\n------- Operaciones con char ------ ");
     //Creación de variables char
     char cx = '\u000F';
     char cy='\u0001';
     
     //Conversión explicita int
     int z = (int)(cx-cy); 
     System.out.println("char: - = "+z);

     z = ((int) cx) - 1;
     System.out.printf("char(0x000F)-1 =" +z);
     
     cx='\uFFFF';
     z=cx;
     System.out.print("\n(int)= "+z);
     //Conversión explicita short
     sx=(short)cx;
     System.out.println("\n(short)( ) = "+sx);
     sx=-32768;
     //Conversión explicita char
     cx=(char)sx;
     //Conversión explicita int
     z=(int)cx;
     System.out.println(sx+"  short-char-int = "+z);
     
     //Conversión explicita short
     sx=(short)-1;
     //Conversión explicita char
     cx=(char) sx;
      //Conversión explicita int
     z=(int)cx;
     System.out.println(sx+" short-char-int = "+z);
     
    };
    
}
