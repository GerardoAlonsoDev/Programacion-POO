
package gerardo_martinez.mega_menu;
import java.util.Scanner;

public class menuprincipal {
    
    public static void main(String[] args){
        
        
        int opcion = 0;
        Scanner tcl = new Scanner(System.in);
        
        menumini minimenu = new menumini();
        
        
      
        System.out.println("=======================");
        System.out.println("= MEGA MENU PRINCIPAL =");
        System.out.println("=======================\n");
        System.out.println("1.-Condicionales");
        System.out.println("2.-Condicionales multiples");
        System.out.println("3.-Bucles");
        opcion = tcl.nextInt();
        
        switch(opcion){
            case 1 -> {
               minimenu.funcion1();

            }  
        }
       
        
    }
    
    
}
