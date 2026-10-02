//Realiza un programa que pida un numero al usuario he indique si es impar o importar
package gerardo_martinez.sentencias_decicion;

import java.util.Scanner;

public class NumerosImpares {
    
    public static void main(String[] args){
        Scanner Tcl = new Scanner(System.in);
        int numero;
        
        System.out.print("Ingresa un numero: \n");
        numero = Tcl.nextInt();
        System.out.print("Validando el su numero espere por favor...\n");
        
        
        
        if(numero % 2== 0){
            System.out.print("Tu numero es par");
        }else {
            System.out.print("Tu numero es impar");
        }
        
        
        
        
    }
    
}
