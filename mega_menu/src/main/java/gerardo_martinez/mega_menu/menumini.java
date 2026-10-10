package gerardo_martinez.mega_menu;

import java.util.Scanner;

public class menumini{
    
    public void funcion1(){
        
        condicionales clase1 = new condicionales();
        Scanner tcl = new Scanner(System.in);
        int opcion;
        
        
        System.out.println("=====================");
         System.out.println("  condicionales IF =");
          System.out.println("===================\n");
          System.out.println("1.- Mulpiplicacion.");
          System.out.println("2.- Numeros Reales.");
          System.out.println("4.- Numeros pares.");
          System.out.println("5.- Encontrar Numero Mayor.");
          System.out.println("6.- Verificador de letras.");
          System.out.println("7.- Numeros Positivos.");
          System.out.println("8.- Mayor de los 3 numoero Reales.");
          System.out.println("9.- Enteros cortos.");
          System.out.println("10.-Verificador de nombr.\n");
          
          System.out.print("Ingesa una opcion para calcular: ");
          
          opcion = tcl.nextInt();
          
          switch(opcion){
              case 1 ->clase1.multiplicar();
              case 2 ->clase1. divisiresnumeros();
              case 3 ->clase1.numerospares();
              case 4 ->clase1.encontrarmayornum();
              case 5 ->clase1.numeromultiplo();
              case 6 ->clase1.vocales();
              case 7 ->clase1.evaluacionnumpos();
              case 8 ->clase1.numerosreales();
              case 9 ->clase1.evaluarnumeros();
              case 10 ->clase1.seguridad();
              }
          }
     
          
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
