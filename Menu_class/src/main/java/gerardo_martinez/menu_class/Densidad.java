package gerardo_martinez.menu_class;

import java.util.Scanner;

public class Densidad {
    public static void calcular() {
        Scanner tcl = new Scanner(System.in);
        double masa, volumen, densidad;

        System.out.print("Ingresa el valor de la masa: ");
        masa = tcl.nextDouble();

        System.out.print("Ingresa el valor del volumen: ");
        volumen = tcl.nextDouble();

        densidad = masa / volumen;

        System.out.println("La densidad es: ");
        System.out.println(String.format("%.2f", densidad));
    }
}