package gerardo_martinez.menu_class;

import java.util.Scanner;

public class FormulaGeneral {
    public static void calcular() {
        Scanner tcl = new Scanner(System.in);
        double a, b, c;
        double x1, x2;

        System.out.print("Ingresa el valor de a: ");
        a = tcl.nextDouble();

        System.out.print("Ingresa el valor de b: ");
        b = tcl.nextDouble();

        System.out.print("Ingresa el valor de c: ");
        c = tcl.nextDouble();

        x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        System.out.println("El resultado de x1 es: " + String.format("%.2f", x1));
        System.out.println("El resultado de x2 es: " + String.format("%.2f", x2));
    }
}