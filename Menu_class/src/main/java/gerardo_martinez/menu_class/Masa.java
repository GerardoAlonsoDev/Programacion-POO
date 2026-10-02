package gerardo_martinez.menu_class;

import java.util.Scanner;

public class Masa {
    public static void calcular() {
        Scanner tcl = new Scanner(System.in);
        double densidad, volumen, masa;

        System.out.print("Ingresa el valor de la densidad: ");
        densidad = tcl.nextDouble();

        System.out.print("Ingresa el valor del volumen: ");
        volumen = tcl.nextDouble();

        masa = densidad * volumen;

        System.out.println("La masa es: ");
        System.out.println(String.format("%.2f", masa));
    }
}