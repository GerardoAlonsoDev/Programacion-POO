package gerardo_martinez.mega_menu;
import java.util.Scanner;

public class menumini {

    public static void funcion1(){
        Scanner tcl = new Scanner(System.in);
        int opcion = 0;
        String salida = "";
        do {
            System.out.println("=============================================");
            System.out.println("=       10 Ejercicios de Condicionales      =");
            System.out.println("=============================================");
            System.out.println("1. Multiplicacion validando cero");
            System.out.println("2. Division de numeros reales");
            System.out.println("3. Verificar si un numero es par");
            System.out.println("4. Encontrar el mayor de dos enteros");
            System.out.println("5. Verificar si es multiplo");
            System.out.println("6. Verificador de vocal");
            System.out.println("7. Evaluacion de numeros positivos");
            System.out.println("8. Mayor de tres numeros reales");
            System.out.println("9. Enteros cortos (iguales o mayor)");
            System.out.println("10. Verificador de nombre Juan");
            System.out.print("Selecciona una opcion: ");
            opcion = tcl.nextInt();

            condicionales c = new condicionales();
            switch(opcion){
                case 1 -> c.multiplicar();
                case 2 -> c.divisiresnumeros();
                case 3 -> c.numerospares();
                case 4 -> c.encontrarmayornum();
                case 5 -> c.numeromultiplo();
                case 6 -> c.vocales();
                case 7 -> c.evaluacionnumpos();
                case 8 -> c.numerosreales();
                case 9 -> c.evaluarnumeros();
                case 10 -> c.seguridad();
                default -> System.out.println("Opcion no valida.");
            }

            System.out.print("Quieres salir del menu secundario (Si o No): ");
            salida = tcl.next();
        } while(salida.equalsIgnoreCase("No") || salida.equalsIgnoreCase("N"));
        System.out.println("Saliendo del menu secundario.");
    }

    public static void funcion2(){
        Scanner tcl = new Scanner(System.in);
        int opcion = 0;
        String salida = "";
        do {
            System.out.println("=====================================");
            System.out.println("=   Condicionales Multiples / Switch =");
            System.out.println("=====================================");
            System.out.println("1.- Perimetro triangulo");
            System.out.println("2.- Valor absoluto (operador)");
            System.out.println("3.- Menor de dos (operador)");
            System.out.println("4.- Tipo caracter switch (vocal/cifra/consonante)");
            System.out.println("5.- Tipo caracter switch (puntuacion/otro)");
            System.out.println("6.- Tipo caracter con if");
            System.out.println("7.- Tipo caracter puntuacion con if");
            System.out.println("8.- Mes del anio (1-12)");
            System.out.println("9.- Dia de la semana (1-7)");
            System.out.print("Selecciona una opcion: ");
            opcion = tcl.nextInt();

            switch(opcion){
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                }
                case 8 -> {
                }
                case 9 -> {
                }
            }

            System.out.print("quieres salir del menu secundario (Si o No): ");
            salida = tcl.next();
        } while(salida.equalsIgnoreCase("No") || salida.equalsIgnoreCase("N"));
        System.out.println("Saliendo del menu secundario.");
    }

    public static void funcion3(){
        Scanner tcl = new Scanner(System.in);
        int opcion = 0;
        String salida = "";
        do {
            System.out.println("=====================================");
            System.out.println("=        Bucles y Ciclos            =");
            System.out.println("=====================================");
            System.out.println("1.- Contrasena clave (while)");
            System.out.println("2.- Numeros 1 al 10 (while)");
            System.out.println("3.- Pares 26 al 10 descendentemente (while)");
            System.out.println("4.- Cifras de un numero entero");
            System.out.println("5.- Suma de positivos hasta cero/negativo");
            System.out.println("6.- Numeros 1 al 10 (do-while)");
            System.out.println("7.- Pares 26 al 10 descendentemente (do-while)");
            System.out.println("8.- Pedro y Peter (do-while)");
            System.out.println("9.- Numeros 15 al 5 descendiendo");
            System.out.println("10.- Primeros ocho numeros pares");
            System.out.print("Selecciona una opcion: ");
            opcion = tcl.nextInt();

            switch(opcion){
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                }
                case 8 -> {
                }
                case 9 -> {
                }
                case 10 -> {
                }
            }

            System.out.print("quieres salir del menu secundario (Si o No): ");
            salida = tcl.next();
        } while(salida.equalsIgnoreCase("No") || salida.equalsIgnoreCase("N"));
        System.out.println("Saliendo del menu secundario.");
    }
}