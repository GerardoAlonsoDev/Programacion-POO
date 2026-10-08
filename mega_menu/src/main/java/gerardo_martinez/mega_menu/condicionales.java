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
     int opcion = 0;
    
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
     menuprincipal.main(new String[]{});
     
 }
 public void divisiresnumeros(){
     
 }
 public void numerospares(){
     
 }
 public void encontrarmayornum(){
     
 }
 public void numeromultiplo(){
     
 }
 public void vocales(){
     
 }
 public void evaluacionnumpos(){
     
 }
 public void numerosreales(){
     
 }
 public void evaluarnumeros(){
     
 }
 public void compararnumeros(){
     
 }
 public void compararnombres(){
     
 }    
}
