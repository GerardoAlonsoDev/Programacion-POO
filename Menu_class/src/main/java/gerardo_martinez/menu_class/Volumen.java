package gerardo_martinez.menu_class;

import java.util.Scanner;

public class Volumen {
    public static void calcular() {
        Scanner tcl = new Scanner(System.in);
        double masa, densidad, volumen;

        System.out.print("Ingresa el valor de la masa: ");
        masa = tcl.nextDouble();

        System.out.print("Ingresa el valor de la densidad: ");
        densidad = tcl.nextDouble();

        volumen = masa / densidad;

        System.out.println("El volumen es: ");
        System.out.println(String.format("%.2f", volumen));
    }
}