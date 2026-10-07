package gerardo_martinez.buclewhile;

public class ejerciciosfor {

public void incremento(){
        
        System.out.println("====================================");
        System.out.println("= Lista de numeros desde el 0 - 20 =");
        System.out.println("====================================");
        
        for(int i = 0; i < 20 ; i++){
        System.out.println(i);
 }
}

public void decremento(){
    System.out.println("===============");
    System.out.println("= Desendentes =");
    System.out.println("===============");
    
    for(int i=10; i>=0;i--){
        System.out.println(i);
  }
}

public void dosendos(){
        System.out.println("=========");
        System.out.println("= pares =");
        System.out.println("=========");
       
        for (int i=0;i<11;i++){
            System.out.println(""+(i*2));
        }
 }
}
