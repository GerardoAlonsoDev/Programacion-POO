package gerardo_martinez.menu_class;

import java.util.Scanner;

public class AreaCirculo {

    public static void calcular(){
        
        Scanner tcl = new Scanner(System.in);
        double radio;
        double area;
        
        System.out.print("Ingresa el valor del radio de tu circulo:");
        radio = tcl.nextDouble();
        
        area = Math.PI * Math.pow(radio,2);
        
        System.out.println("El valor del radio es: \n" + String.format("%.2f",area));
    }
}
