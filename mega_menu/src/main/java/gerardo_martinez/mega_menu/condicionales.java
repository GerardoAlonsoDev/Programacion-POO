package gerardo_martinez.mega_menu;
import java.util.Scanner;

public class condicionales {
 public void multiplicar(){
     /*
     Crear un programa que multiplique dos numeros enteros de la siguiente forma: pedira 
     al usuario un primer numero entero. Si el numero que se que teclee es 0, escribira en 
     pantalla "El producto de 0 por cualquier numero es 0". Si se ha tecleado un numero 
     distinto de cero, se pedira al usuario un segundo numero y se mostrara el producto de 
     ambos. 
     */
     Scanner tcl = new Scanner(System.in);
     int numusu1;
     int numusu2;
     int operacion;
     String opcion2 = null;   
     do{
     System.out.println("===============================");
     System.out.println("= Operador de Numeros enteros =");
     System.out.println("===============================");
     
     System.out.println("ingresa un numero:");
     numusu1 = tcl.nextInt();
     
     
     if(numusu1 == 0){
         System.out.println("El producto de 0 por cualquier numero es 0");
     }else {
         System.out.println("Ingresa tu segundo numero");
         numusu2 = tcl.nextInt();
         
         operacion = numusu1 * numusu2;
         
         System.out.println("La multiplicacion es: " + operacion);
         
     }
     System.out.println("Deseas calcular otra operacion ¿Si o No?: ");
     opcion2 = tcl.next();
     }while(opcion2.equalsIgnoreCase("Si") || opcion2.equalsIgnoreCase("S"));
     
     System.out.println("Saliendo de la Operaciones numeros enteros... ");
     
     
 }
 public void divisiresnumeros(){
     /*
     Crear un programa que pida al usuario dos numeros reales. Si el segundo no es cero, 
     mostrara el resultado de dividir entre el primero y el segundo. Por el contrario, si el 
     segundo numero es cero, escribira “Error: No se puede dividir entre cero”.
     */
     Scanner tcl = new Scanner(System.in);
     float numero1;
     float numero2;
     float operacion;
     String opcion2 ;
    
     
     do{
     System.out.println("==================");
     System.out.println("= Numeros reales =");
     System.out.println("==================\n");
     
     System.out.print("Ingrese el primer numero: ");
     numero1 = tcl.nextFloat();
     System.out.println("Ingresa el segundo numero: ");
     numero2 = tcl.nextFloat();
     
     if(numero2 == 0){
         System.out.println("Error: No se puede dividir entre cero");
     }else{
         operacion = numero1 / numero2;
         System.out.println("El resulatado de tu operacion es:" + operacion);
     }
     
     System.out.println("Deseas realizar otra operacion ¿Si o No?: ");
     opcion2 = tcl.next();
     }while(opcion2.equalsIgnoreCase("Si") || opcion2.equalsIgnoreCase("S"));
     
     System.out.println("Salendo de calcualdora de numeros reales....");
     
     
 }
 public void numerospares(){
     /*
     Crear un programa que pida al usuario un numero entero y diga si es par (pista: habra 
     que comprobar si el resto que se obtiene al dividir entre dos es cero: if (x % 2 == 0) 
     …). 
     */
     
     Scanner tcl = new Scanner(System.in);
     double numero;
     String opcion;
     
     do{
     System.out.println("====================================");
     System.out.println("= Identificador de numeros enteros =");
     System.out.println("====================================\n");
     
     System.out.print("Ingresa un numero a identificar:");
     numero = tcl.nextInt();
     
     if(numero %2== 0){
         System.out.println("Tu numero es par");
     }else{
         System.out.println("Tu numero no es par ");
     }
     
     System.out.print("Quieres seguir operando (¿Si o No?): ");
     opcion = tcl.next();
     }while(opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));
     System.err.println("Saliendo del Numeros enteros...");
     
     
 }
 public void encontrarmayornum(){
    /*
     Crear un programa que pida al usuario dos numeros enteros y diga cual es el mayor de ellos. 
     */
    Scanner tcl = new Scanner(System.in);
    int numero1;
    int numero2;
    String opcion;
    
    do{
    System.out.println("==========================");
    System.out.println("= Encontrar Numero Mayor =");
    System.out.println("==========================\n");
    
    System.out.print("Ingresa un numero:");
    numero1 = tcl.nextInt();
    System.out.print("Ingresa otro numero:");
    numero2 = tcl.nextInt();
    
    
    if(numero1 > numero2){
        System.out.println("Tu primer numero es mayor");
    }else if(numero2 > numero1){
        System.out.print("Tu segundo numero es mayor");
    }else{
        System.out.println("Tu dos numeros son iguales");
    }
    
    System.out.print("Deseas conparar otros numeros (Si o NO?):");
    opcion = tcl.next();
    }while(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("S"));
    
    System.out.println("Saliendo de encontrar numeros Mayor...");
   
    
    
    
 }
 public void numeromultiplo(){
     /*
     Crear un programa que pida al usuario dos numeros enteros y diga si el primero es 
     multiplo del segundo (pista: igual que antes, habra que ver si el resto de la division es 
     cero: a % b == 0)
     */
     Scanner tcl = new Scanner(System.in);
     int Numero1;
     int Numero2;
     String validacion = null;
     
     do{
     System.out.println("=============");
     System.out.println("= Multiplos =");
     System.out.println("=============");
     
     
     System.out.print("Ingresa Un numero:");
     Numero1 = tcl.nextInt();
     System.out.print("Ingrsa el segundo numero:");
     Numero2 = tcl.nextInt();
     
     


        if (Numero1 % Numero2 == 0) {
            System.out.println(Numero1 + " es múltiplo de " + Numero2);
        } else {
            System.out.println(Numero1 + " no es múltiplo de "  + Numero2);
        }
      System.out.print("Quieres verificar otros numeros (¡Si o No?): ");
      validacion = tcl.next();
     }while(validacion.equalsIgnoreCase("Si") || validacion.equalsIgnoreCase("S"));
     
     System.out.println("Saliendo del validador de multiplos...");
 
      
      
      
     
 }
 public void vocales(){
     /*
     Crear un programa que pida una letra al usuario y diga si se trata de una vocal. 
     */
     
     Scanner tcl = new Scanner(System.in);
     String entrada;
     String opcion;
 
     
     do{
     System.out.println("=====================");
     System.out.println("= Verificador letra =");
     System.out.println("=====================\n");
     
     System.out.print("Ingresa una letra: ");
     entrada = tcl.next();
     
     if(entrada.equalsIgnoreCase("a")||
        entrada.equalsIgnoreCase("e")||
        entrada.equalsIgnoreCase("i")||
        entrada.equalsIgnoreCase("o")||
        entrada.equalsIgnoreCase("u")){
         System.out.println("Tu letra si es una vocal");
     }else{
         System.out.println("Tu letra no es una vocal");
     }
     
     System.out.print("¿Quieres verificar otra letra? Si o No: ");
     opcion = tcl.next();
     }while(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("S"));
     
     System.out.println("Saliendo del verificador de letras...");
     
     
     
 }
 public void evaluacionnumpos(){
     /*
     Crear un programa que pida al usuario dos numeros enteros y diga "Uno de los 
     numeros es positivo", "Los dos numeros son positivos" o bien "Ninguno de los numeros 
     es positivo", segun corresponda.
     */
     Scanner tcl = new Scanner(System.in);
     int numero1;
     int numero2;
     String Boleano = null;
     
       do{  
     System.out.println("=====================");
     System.out.println("= Numeros positivos =");
     System.out.println("=====================");
     
     
     System.out.println("Ingresa un numero: ");
     numero1 = tcl.nextInt();
     
     System.out.println("Ingresa otro numero: ");
     numero2 = tcl.nextInt();
     
if (numero1 > 0 && numero2 > 0) {
    System.out.println("Tus dos números son positivos");
} else if (numero1 < 0 && numero2 < 0) {
    System.out.println("Tus dos números son negativos");
} else if (numero1 < 0 && numero2 > 0) {
    System.out.println("Tu número 1 es negativo y tu número 2 es positivo");
} else if (numero1 > 0 && numero2 < 0) {
    System.out.println("Tu número 1 es positivo y tu número 2 es negativo");
} else {
    System.out.println("Al menos uno de tus números es cero");
}
    System.out.println("Quieres validad otro numeros(Si o No): ");
    Boleano = tcl.next();
     }while(Boleano.equalsIgnoreCase("Si") || Boleano.equalsIgnoreCase("S"));
     
       System.out.println("Saliendo del validador de numeros positivos...");
       
           
 }
 public void numerosreales(){
     /*
     Crear un programa que pida al usuario tres numeros reales y muestre cual es el mayor 
     de los tres.
     */
     
     
        Scanner tcl = new Scanner(System.in);
        double numero1;
        double numero2;
        double numero3;
        String opcion;

        do {
            System.out.println("================================");
            System.out.println("= Mayor de tres numeros reales =");
            System.out.println("================================\n");
            
            System.out.print("Ingresa el primer numero real: ");
            numero1 = tcl.nextDouble();
            
            System.out.print("Ingresa el segundo numero real: ");
            numero2 = tcl.nextDouble();
            
            System.out.print("Ingresa el tercer numero real: ");
            numero3 = tcl.nextDouble();

            if (numero1 >= numero2 && numero1 >= numero3) {
                System.out.println("El mayor de los tres es el primero: " + numero1);
            } else if (numero2 >= numero1 && numero2 >= numero3) {
                System.out.println("El mayor de los tres es el segundo: " + numero2);
            } else {
                System.out.println("El mayor de los tres es el tercero: " + numero3);
            }

            System.out.print("¿Deseas comparar otros numeros? (Si o No): ");
            opcion = tcl.next();
        } while (opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));

        System.out.println("Saliendo del verificador de numeros reales...");
    
     
     
 }
 public void evaluarnumeros(){
     /*
     Crear un programa que pida al usuario dos numeros enteros cortos y diga si son iguales 
     o, en caso contrario, cual es el mayor de ellos. 
     */
     Scanner tcl = new Scanner(System.in);
        short numero1;
        short numero2;
        String opcion;

        do {
            System.out.println("=====================================");
            System.out.println("= Enteros cortos: Iguales o mayor   =");
            System.out.println("=====================================");
            
            System.out.print("Ingresa el primer numero entero corto: ");
            numero1 = tcl.nextShort();
            
            System.out.print("Ingresa el segundo numero entero corto: ");
            numero2 = tcl.nextShort();

            if (numero1 == numero2) {
                System.out.println("Tus dos numeros son iguales.");
            } else if (numero1 > numero2) {
                System.out.println("El primer numero es mayor: " + numero1);
            } else {
                System.out.println("El segundo numero es mayor: " + numero2);
            }

            System.out.print("¿Deseas comparar otros numeros? (Si o No): ");
            opcion = tcl.next();
        } while (opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));

        System.out.println("Saliendo del comparador de enteros cortos...");
 }
 public void seguridad(){
     /*
     Crear un programa que pida al usuario su nombre, y le diga "Hola" si se llama "Juan", o 
     bien le diga "No te conozco" si teclea otro nombre. 
     */
     
    Scanner tcl = new Scanner(System.in);
        String nombre;
        String opcion;

        do {
            System.out.println("=====================================");
            System.out.println("=     Verificador de Nombre         =");
            System.out.println("=====================================");
            
            System.out.print("Ingresa tu nombre: ");
            nombre = tcl.next();

            if (nombre.equalsIgnoreCase("Juan")) {
                System.out.println("Hola");
            } else {
                System.out.println("No te conozco");
            }

            System.out.print("¿Deseas verificar otro nombre? (Si o No): ");
            opcion = tcl.next();
        } while (opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("S"));

        System.out.println("Saliendo del verificador de nombre...");
     
 }
}

