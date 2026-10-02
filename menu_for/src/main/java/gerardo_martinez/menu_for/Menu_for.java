package gerardo_martinez.menu_for;

import java.util.Scanner;

public class Menu_for {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);   
        int opcion;
   
        do{
        System.out.println("====================");
        System.out.println("=  Menu bucle for  =");
        System.out.println("====================\n\n");
        
        System.out.println("selecciona una opcion chida");
        System.out.println("1.-Lista de numeros desendentes");
        System.out.println("2.-Lista de numeros");
        System.out.println("3.-Numeros pares");
        System.out.println("4.-Calcular promedio\n\n");
        System.out.println("Presiona numero 0 para salir :-) \n\n");
        
        System.out.print("Ingresa una opcion valida:");
        
        opcion = tcl.nextInt();
             
            
        switch (opcion){
            
            case 1 ->{
                desendente clase1 = new desendente();
                clase1.calcular();
            }
            case 2 ->{
                lista clase2 = new lista();
                clase2.calcular();
            }
            case 3 ->{
                pares clase3 = new pares();
                clase3.calcular();
            }
            case 4 ->{
            promedio clase4 = new promedio();
            clase4.calcular();
        }
            case 0 ->{
                System.out.println("Saliendo del sistema...");
            }
            default ->{
                System.out.print("Opcion invalida");
            }
        }
        }
        while(opcion != 0);
        
        
    }
}
