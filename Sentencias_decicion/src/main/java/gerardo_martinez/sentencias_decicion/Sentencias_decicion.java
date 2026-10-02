//realiza un programa que calcule la edad si es menor o mayor; 


package gerardo_martinez.sentencias_decicion;
import java.util.Scanner;


public class Sentencias_decicion {

    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        int fecha_nan;
        int fecha_actual;
        int cal_edad;
        
        System.out.print("Ingresa tu anio de nacimiento: \n");
        fecha_nan = tcl.nextInt();
        
        System.out.print("Ingresa el anio actual");
        fecha_actual = tcl.nextInt();
        
        cal_edad = fecha_nan - fecha_actual;
        
        if(cal_edad < 60){
            System.out.print("Eres muy grande");
            
        }else if(cal_edad < 30){
            System.out.print("Eres un adulto");
        }else {
            System.out.print("Eres joven todavia");
        }
            
        

        

        
        
    }
}
