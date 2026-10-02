//realiza un programa que calcule el promedio, que pida cuantas calificaciones se van a introducir 
//luego solicite cada calificacion con un for, calcule el promedio y al final indique si aprobo
//o reprobo.
package gerardo_martinez.menu_for;

import java.util.Scanner;


public class promedio {

public void calcular(){
  Scanner tcl = new Scanner(System.in);
  double[] calificacion = new double[5];
  double suma = 0;
  double promedio;
  
  System.out.println("=======================");
  System.out.println("= Verificacion de Cal =");
  System.out.println("=======================");
    
    for(int i = 0; i < 5 ; i++){
        
        try{
        System.out.print("ingresa la primera calificacion:");
        calificacion[i] = tcl.nextDouble();
        suma += calificacion[i];
        }catch(Exception e){
            System.out.print("No puede contener letras una calificacion\n");
            tcl.next();
        }
    }
    promedio = suma/5;
    if(promedio <= 10 && promedio >= 6){
        System.out.print("Has aprobado\n");
    }else{
        System.out.print("Has reprobado\n");
    }   
}  
}
