
package gerardo_martinez.menu_class;

import java.util.Scanner;


public class CalcularDistancia {
  public static void calcular(){
        
        Scanner tcl = new Scanner(System.in);
        double distancia;
        double x1,x2;
        double y1,y2;
        
        System.out.print("Ingresa el valor de x2: ");
        x2 = tcl.nextDouble();
        
        System.out.print("Ingresa el valor del x1: ");
        x1 = tcl.nextDouble();
        
        System.out.print("Ingresa el valor de y1: ");
        y1 = tcl.nextDouble();
        
        System.out.print("Ingresa el valor de y2: ");
        y2 = tcl.nextDouble();
        
        distancia = Math.sqrt( Math.pow((x2-x1),2)  +  Math.pow((y2-y1),2));
        
        System.out.println("La distancia es: \n" + String.format("%.2f",distancia));
        
    }
}
