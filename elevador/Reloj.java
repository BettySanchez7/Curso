
public class Reloj {
    private int hora;
    private int segundos;
    private int minutos;
    
    public void MostrarHora(){
        hora= (int) (Math.random() * 23) + 1;
        minutos= (int) (Math.random() * 60) + 1;
        segundos= (int) (Math.random() * 60) + 1;
        
        System.out.println(hora+":"+minutos+":"+segundos);
   
    }
}
