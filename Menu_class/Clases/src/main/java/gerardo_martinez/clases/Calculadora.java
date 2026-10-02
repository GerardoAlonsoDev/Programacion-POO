package gerardo_martinez.clases;

import java.util.Scanner;

public class Calculadora {
    
    public double Suma(){
        
        Scanner tcl = new Scanner(System.in);
        
        double numero1;
        double numero2;
  

        
       System.out.println("===========");
       System.out.println("=  Suma   =");
       System.out.println("===========\n");
        System.out.print("Ingesa el numero uno: ");
        numero1 = tcl.nextDouble();
        
        System.out.print("ingresa el segundo numero: ");
        numero2 = tcl.nextDouble();
        
        return numero1 + numero2;
        
    }
    
    public double resta(){
        
        
        for(int i=0;i>20;i++){
            System.out.println("\n");
        }
        
        Scanner tcl = new Scanner(System.in);
        double numero1;
        double numero2;
       
        
        
System.out.println("===========");
System.out.println("=  Resta  =");
System.out.println("===========\n");
    
        System.out.print("Ingresa el primer numero: ");
        numero1 = tcl.nextDouble();
       
        System.out.print("Ingresa el segundo numero: ");
        numero2 = tcl.nextDouble();
       
        
        
        
        return numero1 - numero2;
        
    }
    
    
        public double division(){
        
        Scanner tcl = new Scanner(System.in);
        double numero1;
        double numero2;
        
        
        System.out.println("==============");
        System.out.println("=  Division  =");
        System.out.println("============\n");
    
        System.out.print("Ingresa el primer numero: ");
        numero1 = tcl.nextDouble();
       
        System.out.print("Ingresa el segundo numero: ");
        numero2 = tcl.nextDouble();
       
        if(numero2 == 0){
            System.out.println("Tu numero no es divisible entre 0");
            return 0;
        }else{
            
            return numero1 / numero2;
         }
        }
        
        public double multiplicacion(){
            Scanner tcl = new Scanner(System.in);
            
            System.out.println("====================");
            System.out.println("=  Multiplicacion  =");
            System.out.println("====================");
             
            double numero1;
            double numero2;
            
            System.out.print("Ingresa el primer numero: ");
            numero1 = tcl.nextDouble();
            numero2 = tcl.nextDouble();
            
            return numero1 * numero2;
        }

       
    
    
    
}
