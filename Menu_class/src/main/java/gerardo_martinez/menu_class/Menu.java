package gerardo_martinez.menu_class;

import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {
       
    Scanner tcl = new Scanner(System.in);
    int opcion = 1;
    
    do{
    System.out.print("====================\n");
    System.out.print("=  Menu principal  =\n");
    System.out.print("====================\n");
     
     System.out.println("Selecciona una opcion\n");
     
     System.out.println("1)Area del circulo");
     System.out.println("2)Area del cuadrado");
     System.out.println("3)Area del trapecio");
     System.out.println("4)Distancia entre dos puntos");
     System.out.println("5)Calcular densidad");
     System.out.println("6)Calcular masa");
     System.out.println("7)Calcular volumen");
     System.out.println("8)Formula general");
     
     System.out.print("Selecciona una opcion: ");
     opcion = tcl.nextInt();
     
     
         switch(opcion) {
        case 1 -> AreaCirculo.calcular();
        case 2 -> AreaCuadrado.calcular();
        case 3 -> AreaTrapecio.calcular();
        case 4 -> CalcularDistancia.calcular();
        case 5 -> Densidad.calcular();
        case 6 -> Masa.calcular();
        case 7 -> Volumen.calcular();
        case 8 -> FormulaGeneral.calcular(); 
        default -> System.out.println("Opcion no valida");
   }
     
    }while(opcion != 0);
        
        
    }
}
