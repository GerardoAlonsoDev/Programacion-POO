package gerardo_martinez.mega_menu;
import java.util.Scanner;

public class menuprincipal {
    
    public static void main(String[] args){
        
        int opcion = 0;
        Scanner tcl = new Scanner(System.in);
        String salida = "";
        
        do {
            System.out.println("=======================");
            System.out.println("= MEGA MENU PRINCIPAL =");
            System.out.println("=======================\n");
            System.out.println("1.- Condicionales Basicos");
            System.out.println("2.- Condicionales Multiples / Switch");
            System.out.println("3.- Bucles y Ciclos");
            System.out.print("Selecciona una opcion: ");
            opcion = tcl.nextInt();
            
            switch(opcion){
                case 1 -> {
                    condicionales clase1 = new condicionales();
                    clase1.numerosreales();
                    
                }
                case 2 -> {
                    menumini.funcion2();
                }
                case 3 -> {
                    menumini.funcion3();
                }
                default -> {
                    System.out.println("Opcion no valida.");
                }
            }
            
            System.out.print("Quieres salir del mega menu principal (Si o No): ");
            salida = tcl.next();
            
        } while(salida.equalsIgnoreCase("No") || salida.equalsIgnoreCase("N"));
        
        System.out.println("Saliendo del programa. ¡Hasta luego!");
    }
}