

import java.util.Scanner;
public class Test {
    
    
    
    public static void main(String[] args)  throws InterruptedException  {
        Edificio e = new Edificio();
	e.imprimeEdificio();
        
       Scanner sc=new Scanner(System.in); 
        System.out.println("Piso actual:_");
        int pisoActual= sc.nextInt();
        System.out.println("Piso de destino:_");
        int pisoDestino= sc.nextInt();
        System.out.println("Cuantas personas son:_");
        int numPersonas= sc.nextInt();
        Elevador el= new Elevador(numPersonas,pisoDestino,pisoActual);
                
    }
}
