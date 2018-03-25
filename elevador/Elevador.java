import static java.lang.Thread.sleep;
public class Elevador {
    private int pisoActual;

    
    private int numPersonas;
    private int piso;
    private boolean comprobarPiso;

    public Elevador(int numPersonas, int piso, int pisoActual) throws InterruptedException {
        this.numPersonas = numPersonas;
        this.piso = piso;
        this.pisoActual=pisoActual;
 
        
        if(ControladorElevador.comprobarPersonas(this.numPersonas)==false){
            
        }else if(ControladorElevador.comprobarPiso(this.piso,this.pisoActual)==false){
           
        }else{
        if(piso>pisoActual){
            subir(piso,pisoActual);
        }else{
            bajar(piso,pisoActual);
        }
        }
   
    }
    //COMPRUEBA QUE EL NUMERO DE PERSONAS NO SE MAYOR A 5
    private boolean comprobarPersonas(int numPersonas){
        if(numPersonas>5){
            
            return false;}
            else{return true;}
    }
    //QUE EXISTA EL PISO A DONDE QUIERA IR
    private boolean comprobarPiso(int piso,int pisoActual){
        if(piso>6 || pisoActual>6)
            return false;
        else
            return true;
    
    }
    
    //METODOS PARA SUBIR Y BAJAR 
    public void subir(int piso, int pisoActual) throws InterruptedException {
        System.out.println("Subiendo...");
        for(int i=pisoActual;i<=piso;i++){
           System.out.println(i);
           sleep(1000);
       }
         System.out.println("Llegaste a tu piso");
    }
    public void bajar(int piso, int pisoActual) throws InterruptedException{
        System.out.println("Bajando...");
        for(int i=pisoActual;i>=piso;i--){
           System.out.println(i);
           sleep(1000);
       }
        System.out.println("Llegaste a tu piso");
  
    }
    
    
    
}
