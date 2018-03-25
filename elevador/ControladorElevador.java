public class ControladorElevador {
    //COMPRUEBA QUE EL NUMERO DE PERSONAS NO SE MAYOR A 5
    public static boolean comprobarPersonas(int numPersonas){
        if(numPersonas>5){
            System.out.println("Ya no hay cupo en el elevador, espera el siguiente");
            return false;}
            else{return true;}
    }
    //QUE EXISTA EL PISO A DONDE QUIERA IR
    public static boolean comprobarPiso(int piso,int pisoActual){
        if(piso>6 || pisoActual>6){
            
            System.out.println("Error de destino");
            return false;
        }
        else
            return true;
    
    }
}
