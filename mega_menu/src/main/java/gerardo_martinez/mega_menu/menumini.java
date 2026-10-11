package gerardo_martinez.mega_menu;

import java.util.Scanner;

public class menumini {
    
    public void funcion1(){
        condicionales clase1 = new condicionales();
        Scanner tcl = new Scanner(System.in);
        int opcion;
        String opcion2 = null;
        
        do {
            System.out.println("=====================");
            System.out.println("= Condicionales IF  =");
            System.out.println("=====================\n");
            System.out.println("1.- Multiplicacion.");
            System.out.println("2.- Numeros Reales.");
            System.out.println("3.- Numeros pares."); // Corregido el número que faltaba
            System.out.println("4.- Encontrar Numero Mayor.");
            System.out.println("5.- Verificador de letras.");
            System.out.println("6.- Numeros Positivos.");
            System.out.println("7.- Mayor de los 3 numeros reales.");
            System.out.println("8.- Enteros cortos.");
            System.out.println("9.- Verificador de nombre.");
            System.out.println("0.- Regresar al Menu Principal.\n");
            
            System.out.print("Ingresa una opcion para calcular: ");
            opcion = tcl.nextInt();
            
            switch(opcion) {
                case 1 -> clase1.multiplicar();
                case 2 -> clase1.divisiresnumeros();
                case 3 -> clase1.numerospares();
                case 4 -> clase1.encontrarmayornum();
                case 5 -> clase1.numeromultiplo();
                case 6 -> clase1.vocales();
                case 7 -> clase1.evaluacionnumpos();
                case 8 -> clase1.numerosreales();
                case 9 -> clase1.evaluarnumeros();
                case 10 -> clase1.seguridad();
                case 0 -> System.out.println("Regresando al menú principal...");
                default -> System.out.println("Selecciona una opcion valida por favor.");
            }
            
            // Si no eligió salir (0), pregunta si desea repetir el submenú de IF
            if (opcion != 0) {
                System.out.print("\n¿Deseas realizar otra operacion en este menu? (Si/No): ");
                opcion2 = tcl.next();
            } else {
                opcion2 = "No"; // Rompe el ciclo para volver al main
            }
            
        } while(opcion2.equalsIgnoreCase("S") || opcion2.equalsIgnoreCase("Si"));
        
        System.out.println("Saliendo de Condicionales IF...\n");
    } 

    public void funcion2(){
        condicionesmultiples clase2 = new condicionesmultiples();
        Scanner tcl = new Scanner(System.in);
        int opcion;
        String opcion2 = null;
        
        do {
            System.out.println("================================");
            System.out.println("= Menu condicionales multiples =");
            System.out.println("================================\n");
            
            System.out.println("1.- Menu triangulos");
            System.out.println("2.- Valores Absolutos");
            System.out.println("3.- Menor de dos");
            System.out.println("4.- Es una vocal? (Switch)");
            System.out.println("5.- Seguridad (Contraseña)");
            System.out.println("6.- Conteo basico con while");
            System.out.println("7.- Pares descendientes");
            System.out.println("8.- Contar cifras");
            System.out.println("9.- Incremento (Suma)");
            System.out.println("10.- Conteo basico con do-While");
            System.out.println("11.- Contar cifras (Opcion extra)");
            System.out.println("12.- Decremento grande");
            System.out.println("13.- Validador de acceso");
            System.out.println("14.- Decremento del 15 al 5");
            System.out.println("15.- Conteo de 2 en 2 (8 Pares)");
            System.out.println("16.- Detector de dia de la semana");
            System.out.println("0.- Regresar al Menu Principal\n");
            
            System.out.print("Selecciona una opcion: ");
            opcion = tcl.nextInt();
            
            switch (opcion) {
                case 1 -> clase2.menutriangulos();
                case 2 -> clase2.valorabsoluto();
                case 3 -> clase2.menordedos();
                case 4 -> clase2.tipocaracterswitch();
                case 5 -> clase2.pedircontrasena();
                case 6 -> clase2.numerosdelunoaldez();
                case 7 -> clase2.paresdesentientes();
                case 8 -> clase2.contarcifras();
                case 9 -> clase2.incremeto();
                case 10 -> clase2.contoneten();
                case 11 -> clase2.contarcifras();
                case 12 -> clase2.decrementogrande();
                case 13 -> clase2.acceso();
                case 14 -> clase2.Conteo15al5();
                case 15 -> clase2.OchoPares();
                case 16 -> clase2.diasdelasemana();
                case 0 -> System.out.println("Regresando al menú principal...");
                default -> System.out.println("Selecciona una opcion valida.");
            }
            
            if (opcion != 0) {
                System.out.print("\n¿Deseas realizar otra operacion en este menu? (Si/No): ");
                opcion2 = tcl.next();
            } else {
                opcion2 = "No"; // Rompe el ciclo para regresar al main
            }
            
        } while(opcion2.equalsIgnoreCase("Si") || opcion2.equalsIgnoreCase("S"));
        
        System.out.println("Saliendo de condicionales múltiples...\n");
    }
}