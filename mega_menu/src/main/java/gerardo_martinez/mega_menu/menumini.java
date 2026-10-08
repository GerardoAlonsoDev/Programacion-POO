package gerardo_martinez.mega_menu;
import java.util.Scanner;


public class menumini {

public static void funcion1(){
 
    Scanner tcl = new Scanner(System.in);
    int opcion = 0;
    
 
    
    do{
 System.out.println("====================");
 System.out.println("=  Condicionales   =");
 System.out.println("====================\n");
 System.out.println("1.-Multiplicacion validar numero 0");
 
 System.out.println("Selecciona una opcion");
 opcion = tcl.nextInt();
 
 switch(opcion){
     case 1 ->{
         condicionales clasecon = new condicionales();
        clasecon.multiplicar();
     }
 }
 
 }while(opcion !=0);
 
 
}
public static void funcion2(){
    
}
public static void funcion3(){
    
}
    
}
