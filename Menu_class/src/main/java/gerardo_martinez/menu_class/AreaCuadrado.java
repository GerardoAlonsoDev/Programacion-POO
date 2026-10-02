package gerardo_martinez.menu_class;

import java.util.Scanner;



public class AreaCuadrado {
    
public static void calcular(){
       
    Scanner tcl = new Scanner(System.in);
    double lado;
    double area;
    
    System.out.print("Ingresa el lado de tus cuadrado:");
    lado = tcl.nextDouble();
    
    area = Math.pow(lado,2);
    
    System.out.print("El area del cuadrado es: \n" + area);
    
    
}   
}
