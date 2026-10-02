package gerardo_martinez.clases;

import java.util.Scanner;


public class Menuprincipal {

    public void menu() {
      
        Scanner tcl = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int Opcion;
        
        do{
        System.out.println("==========================");
        System.out.print("=    Menu en Java POO    =\n");
        System.out.print("==========================\n");
        
        System.out.print("1)Suma \n");
        System.out.print("2)resta \n");
        System.out.print("3)multiplicacion \n");
        System.out.print("4)Division \n\n");
        
        System.out.print("Preciona '0' para salir\n\n");
        System.out.print("Seleciona una opcion: \n");
        Opcion = tcl.nextInt();
        
        
                switch(Opcion)
        {
            case 0 ->{
                System.out.println("Saliendo del Menu");
                    }        
            case 1 ->{
                System.out.println("El resultado de la suma es: " + calculadora.Suma());
        }
            case 2 ->{
                System.out.println("El resultado de tu resta es:  "+ calculadora.resta());
            }
           
                case 3 -> {
                System.out.println("El resultado es: " + calculadora.multiplicacion());
            }
            case 4 ->{
                System.out.println("El resultado de tu division es: " + calculadora.division());
            }
            default ->{
                System.out.println("Opcion invalidad por favor selecciona una opcion valida");
            }
        }
                for(int i=0;i<20;i++){
                    System.out.println("\n");
                }
                
                
                
        }while(Opcion !=0);
      
    }
}
