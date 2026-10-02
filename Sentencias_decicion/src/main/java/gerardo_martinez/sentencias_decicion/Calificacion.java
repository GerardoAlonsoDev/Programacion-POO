/*
realiza un prgorama que solicite la calificacionde 5 materias y calcule el promedio y si el promedio es mayor o igual a nueve diga alumno de excelencia pero si la calificaicon es mayor o iguala 8 que diga muy bien; 
Si el promedio es igual que seis que diga a aprobado de lo contrario que mande mensaje de reprobado
*/
package gerardo_martinez.sentencias_decicion;
import java.util.Scanner;



public class Calificacion{
    public static void main(String[] args){
        
        Scanner tcl = new Scanner(System.in);
        double[] Calificaciones;
        Calificaciones = new double[5];
        int suma = 0;
        double promedio;
        
        System.out.print("===Sistematizacion de Calificaciones===\n");
        
        for(int i=0; i<5;i++){
             System.out.printf("Ingrese la calificacion #%d: ", (i + 1));
            Calificaciones[i] = tcl.nextDouble();
            suma += Calificaciones[i];
        }
        
        promedio = suma/Calificaciones.length;
        
        
        if(promedio == 10 || promedio == 9){
            System.out.print("Muy bien tu promedio es EXCELENTE: " + promedio);
            
        }else if(promedio == 8 || promedio == 7){
            System.out.print("Excelente Tu promedo es Bueno: " + promedio);
        }else if(promedio == 6){
            System.out.print("Tu caliciacion es deplorable echale ganas: " + promedio);
        }else{
            System.out.println("Ya hijo echale ganas no sea menso");
        }
        

            
            
        
    }
    
    
}