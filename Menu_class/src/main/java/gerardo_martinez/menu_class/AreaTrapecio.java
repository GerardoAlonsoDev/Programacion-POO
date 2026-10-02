package gerardo_martinez.menu_class;

import java.util.Scanner;



public class AreaTrapecio {
    public static void calcular(){
        
        Scanner tcl = new Scanner(System.in);
        double baseM;
        double basem;
        double altura;
        double area;
        
        System.out.print("Ingresa la Base mayor del Trapecio:");
        baseM = tcl.nextDouble();
        
        System.out.print("Ingresa la Base menor del Trapecio:");
        basem = tcl.nextDouble();
        
        System.out.print("Ingresa la altura del Trapecio:");
        altura = tcl.nextDouble();
        
        area = ((baseM * basem)*altura)/2;
        
        System.out.println("El area del trapecio es: \n" + area);
       
        
    }
    
    
}
