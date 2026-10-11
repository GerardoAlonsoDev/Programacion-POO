package gerardo_martinez.mega_menu;
import java.util.Scanner;

public class menuprincipal {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        menumini claseM = new menumini();
        int opcion = 0;
        String opcion2 = null;
        
        do {
            System.out.println("=============");
            System.out.println("= Mega Menu =");
            System.out.println("=============\n");
            
            System.out.println("1.- Menu condicionales IF");
            System.out.println("2.- Menu condicionales Multiples");
            System.out.println("0.- Salir del sistema\n");
            
            System.out.print("Selecciona una opcion: ");
            opcion = tcl.nextInt();
            
            switch(opcion) {
                case 1 -> claseM.funcion1();
                case 2 -> claseM.funcion2();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Selecciona una opcion valida por favor.");
            }
            
            // Si no eligió salir (0), pregunta si desea continuar en el menú principal
            if (opcion != 0) {
                System.out.print("¿Deseas regresar al menú principal? (Si/No): ");
                opcion2 = tcl.next();
            } else {
                opcion2 = "No"; 
            }
            
        } while(opcion2.equalsIgnoreCase("S") || opcion2.equalsIgnoreCase("Si"));
        
        System.out.println("Hasta la Próxima. ¡Descansa!");
    }
}