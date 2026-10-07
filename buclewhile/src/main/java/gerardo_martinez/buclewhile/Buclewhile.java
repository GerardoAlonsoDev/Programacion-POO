package gerardo_martinez.buclewhile;
import java.util.Scanner;

public class Buclewhile {

    public static void main(String[] args) {
    
        int opcion = 0;
        String opcion2;
        Scanner tcl = new Scanner(System.in);
        
        do{
            System.out.println("==============");
            System.out.println("= Menu while =");
            System.out.println("==============");
            
            System.out.println("Selecciona una opcion:");
            System.out.println("1.-incremento");
            System.out.println("2.-decremento");
            System.err.println("3.-dos en dos");
            
        System.out.println("Selecciona una opcion valida:");
        opcion = tcl.nextInt();

        switch(opcion){
            case 1 ->{
                ejerciciosfor metodo1 = new ejerciciosfor();
                metodo1.decremento();
            }
            case 2 ->{
                ejerciciosfor metodo2 = new ejerciciosfor();
                metodo2.dosendos();
            }
            
            case 3 ->{
                ejerciciosfor metodo3 = new ejerciciosfor();
                metodo3. dosendos();
                 
            }
        }
    
        
            System.out.println("¿Deseas Slir programa? Si o NO");
            opcion2 = tcl.next();
           
                        
            if (opcion2.equalsIgnoreCase("SI")|| opcion2.equalsIgnoreCase("S")) {
                opcion = 0;
                System.out.println("Saliendo del programa... ¡Hasta luego!");
            }
   
        }while(opcion != 0);

        
    }
}
