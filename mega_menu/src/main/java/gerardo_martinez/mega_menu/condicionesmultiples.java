package gerardo_martinez.mega_menu;
import java.util.Scanner;

public class condicionesmultiples {
    public void menutriangulos(){
        /*
        Que muestre un menú donde las opciones sean “Equilátero”, “Isósceles” y “Escaleno”, 
        pida una opción y calcule el perímetro del triángulo seleccionado. 
        */
  
        Scanner tcl = new Scanner(System.in);
        int opcion;
        String continuar;

        do {
            System.out.println("=====================================");
            System.out.println("=      Calculadora de Perímetros    =");
            System.out.println("=====================================");
            System.out.println("1.- Equilátero");
            System.out.println("2.- Isósceles");
            System.out.println("3.- Escaleno");
            System.out.print("Selecciona una opción de triángulo: ");
            opcion = tcl.nextInt();

            switch(opcion) {
                case 1 -> {
                    System.out.print("Ingresa la medida de un lado del triángulo equilátero: ");
                    double lado = tcl.nextDouble();
                    double perimetro = lado * 3;
                    System.out.println("El perímetro del triángulo equilátero es: " + perimetro);
                }
                case 2 -> {
                    System.out.print("Ingresa la medida del lado repetido (igual): ");
                    double ladoIgual = tcl.nextDouble();
                    System.out.print("Ingresa la medida del tercer lado (diferente): ");
                    double ladoDiferente = tcl.nextDouble();
                    double perimetro = (ladoIgual * 2) + ladoDiferente;
                    System.out.println("El perímetro del triángulo isósceles es: " + perimetro);
                }
                case 3 -> {
                    System.out.print("Ingresa la medida del primer lado: ");
                    double l1 = tcl.nextDouble();
                    System.out.print("Ingresa la medida del segundo lado: ");
                    double l2 = tcl.nextDouble();
                    System.out.print("Ingresa la medida del tercer lado: ");
                    double l3 = tcl.nextDouble();
                    double perimetro = l1 + l2 + l3;
                    System.out.println("El perímetro del triángulo escaleno es: " + perimetro);
                }
                default -> {
                    System.out.println("Opción no válida.");
                }
            }

            System.out.print("¿Deseas calcular otro perímetro? (Si o No): ");
            continuar = tcl.next();
        } while(continuar.equalsIgnoreCase("Si") || continuar.equalsIgnoreCase("S"));

        System.out.println("Saliendo de la calculadora de perímetros de triángulos...");
    
        
        
    }
    public void valorabsoluto(){
        Scanner tcl = new Scanner(System.in);
        int numero;
        String opcion;

        do {
            System.out.println("=====================================");
            System.out.println("=      Valor Absoluto (Ternario)    =");
            System.out.println("=====================================");
            System.out.print("Ingresa un número (positivo o negativo): ");
            numero = tcl.nextInt();

            
            int resultado = (numero >= 0) ? numero : -numero;

            System.out.println("El valor absoluto es: " + resultado);

            System.out.print("¿Deseas calcular otro valor absoluto? (Si o No): ");
            opcion = tcl.next();
        } while(opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));

        System.out.println("Saliendo del valor absoluto...");
    }
    public void menordedos(){
        Scanner tcl = new Scanner(System.in);
        int num1, num2;
        String opcion;

        do {
            System.out.println("=====================================");
            System.out.println("=      Menor de Dos (Ternario)      =");
            System.out.println("=====================================");
            System.out.print("Ingresa el primer número: ");
            num1 = tcl.nextInt();
            System.out.print("Ingresa el segundo número: ");
            num2 = tcl.nextInt();

            
            int menor = (num1 < num2) ? num1 : num2;

            System.out.println("El número menor es: " + menor);

            System.out.print("¿Deseas comparar otros números? (Si o No): ");
            opcion = tcl.next();
        } while(opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));

        System.out.println("Saliendo del comparador de menor...");
    }
    public void tipocaracterswitch(){
        Scanner tcl = new Scanner(System.in);
        char caracter;
        String opcion;

        do {
            System.out.println("=====================================");
            System.out.println("=   Vocal, Cifra o Consonante (Char) =");
            System.out.println("=====================================");
            System.out.print("Ingresa una letra o carácter: ");
            
            caracter = tcl.next().charAt(0);

          
            char cMin = Character.toLowerCase(caracter);

            switch(cMin) {
                case 'a', 'e', 'i', 'o', 'u' -> {
                    System.out.println("Se trata de una vocal.");
                }
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                    System.out.println("Se trata de una cifra numérica.");
                }
                default -> {
                   
                    if ((cMin >= 'a' && cMin <= 'z')) {
                        System.out.println("Se trata de una consonante.");
                    } else {
                        System.out.println("Es otro tipo de carácter.");
                    }
                }
            }

            System.out.print("¿Deseas evaluar otro carácter? (Si o No): ");
            opcion = tcl.next();
        } while(opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));

        System.out.println("Saliendo del verificador de caracteres...");
    }
    public void pedircontrasena(){
        /*
        Crear un programa que pida al usuario su contrasena. Debera terminar cuando 
        introduzca como contrasena la palabra "clave", pero volversela a pedir tantas veces 
        como sea necesario. 
        */
        Scanner tcl = new Scanner(System.in);
        String contrasena;
        String opcion;

        do {
            System.out.println("=====================================");
            System.out.println("=     Validador de Contraseña       =");
            System.out.println("=====================================");

            // Ciclo interno para insistir hasta que atine la contraseña
            do {
                System.out.print("Introduce la contraseña: ");
                contrasena = tcl.next();

                if(!contrasena.equals("clave")){
                    System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
                }
            } while(!contrasena.equals("clave"));

            System.out.println("¡Contraseña correcta! Acceso concedido.");

            // Pregunta si desea repetir todo el ejercicio de nuevo
            System.out.print("¿Quieres verificar otra vez la contraseña? (Si o No): ");
            opcion = tcl.next();

        } while(opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));

        System.out.println("Saliendo del validador de contraseña...");
    }
    public void numerosdelunoaldez(){
        /*
        Crea un programa que escriba en pantalla los numeros del 1 al 10, usando "while". 
        */
        
        Scanner tcl = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("=====================================");
            System.out.println("=       Números del 1 al 10 (while) =");
            System.out.println("=====================================");

            int i = 1;
            while(i <= 10) {
                System.out.println(i);
                i++;
            }

            System.out.print("¿Quieres repetir el conteo? (Si o No): ");
            opcion = tcl.next();

        } while(opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));

        System.out.println("Saliendo del conteo del 1 al 10...");
    }
    public void paresdesentientes(){
        /*
        Crea un programa que escriba en pantalla los numeros pares del 26 al 10 
        (descendiendo), 
        usando "while". 
        */
Scanner tcl = new Scanner(System.in);
        int i = 26;
        String opcion;
        do {
            System.out.println("===============================");
            System.out.println("= numeros descendientes pares =");
            System.out.println("===============================");
            
            while (i >= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
            System.out.print("¿Deseas repetir el conteo? (Si o No): ");
            opcion = tcl.next();

        } while(opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));

        System.out.println("Saliendo del conteo descendiente...");
    }
    public void contarcifras(){
        /*
        Que pida un número del 1 al 12 y diga el nombre del mes correspondiente. 
        */
        
        Scanner tcl = new Scanner(System.in);
        int numero;
        String opcion;

        do {
            System.out.println("=====================================");
            System.out.println("=       Contador de Cifras          =");
            System.out.println("=====================================");
            System.out.print("Ingresa un numero entero positivo: ");
            numero = tcl.nextInt();

            int cifras = 0;
            int aux = numero;

            while (aux > 0) {
                cifras++;
                aux = aux / 10;
            }
            
            if (numero == 0) {
                cifras = 1;
            }

            System.out.println("El numero " + numero + " tiene " + cifras + " cifras.");

            System.out.print("¿Deseas contar las cifras de otro numero? (Si o No): ");
            opcion = tcl.next();
        } while (opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));

        System.out.println("Saliendo del contador de cifras...");
    }
    public void incremeto(){
        /*
        Crear un programa que pida numeros positivos al usuario, y vaya calculando la suma 
        de todos ellos (terminara cuando se teclea un numero negativo o cero). 
        */
        Scanner tcl = new Scanner(System.in);
        int numero1;
        int suma = 0;
        
        System.out.println("=====================");
        System.out.println("=  Suma de Numeros  =");
        System.out.println("=====================");
        
        System.out.print("Ingres un primer numero: ");
        numero1 = tcl.nextInt();
        
        while(numero1 > 0){
            suma += numero1;
            System.out.println("Ingresa un numero: ");
            numero1 = tcl.nextInt();
        }
          System.out.println("La suma total de tus numeros es: " + suma);
        
        
    }
    public void contoneten(){
        /*
        Crea un programa que escriba en pantalla los numeros del 1 al 10, usando "do..while". 
        */
        int i= 26;
        System.out.println("======================");
        System.out.println("= Conteo del 1 al 10 =");
        System.out.println("======================");
        
        do{
            System.out.println(i++);
        }while(i <= 10);
    }
    public void decrementogrande(){
    int i = 26;
    System.out.println("====================");
    System.out.println("= Conteo de 2 en 2 =");
    System.out.println("====================");

    do {
    System.out.println(i);
    i -= 2; // Decrementa de 2 en 2
    } while (i >= 10);
        }
    public void acceso(){
        Scanner scanner = new Scanner(System.in);
        String usuario, password;

        do {
            System.out.print("Nombre de usuario: ");
            usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            password = scanner.nextLine();
        } while (!usuario.equals("Pedro") || !password.equals("Peter"));

        System.out.println("¡Acceso concedido, bienvenido Pedro!");
    
    }
    public void Conteo15al5() {
    
        int i = 15;
        while (i >= 5) {
            System.out.println(i);
            i--;
        }
    }
    public void OchoPares() {
        int i = 1;
        while (i <= 8) {
            System.out.println(i * 2);
            i++;
    }
}
    public void diasdelasemana(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número no válido. Debe ser del 1 al 7.");
        }
    }
}
    
    


