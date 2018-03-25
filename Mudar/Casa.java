import java.util.Scanner;

/**
 *
 * @author betys
 */
public class Casa {
    

	public  static Mueble crearMueble(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Datos del mueble:_");
		return new Mueble(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
	}

	public static Mueble crearMueble(String tipo, String ubicacion, String color, float precio){		
        return new Mueble(tipo, ubicacion, color, precio);	
	}
        
	public static Zapato crearZapato(){
		Scanner s=new Scanner(System.in);
		System.out.println("Datos del zapato:_");
                String var1= s.nextLine();
                float var2= s.nextFloat();
                String var3= s.nextLine();
                s.nextLine();
                float var4= s.nextFloat();
		return new Zapato(var1,var2,var3,var4);
	}
	public static Zapato crearZapato(String color, float size, String ocacion, float precio){
             return new Zapato(color,size,ocacion,precio); 
	}  
        
        public static void costoEstimado(float precio){
            
        }
        
        public static void main(String[] args) {
            System.out.println("MUEBLES:");
            Mueble a= Casa.crearMueble("Madera","Recamara","Cafe",435);
            a.imprimeCaracteristicas();
            a.imprimePosicion();
            Mueble c= Casa.crearMueble();
            c.imprimeCaracteristicas();
            c.imprimePosicion();
            Mueble b= Casa.crearMueble("Ropero","Recamara","Azul",435);
            b.imprimeCaracteristicas();
            b.imprimePosicion();
            Mueble d=Casa.crearMueble();
            d.imprimeCaracteristicas();
            d.imprimePosicion();
            
            
            System.out.println("ZAPATOS:");
            Zapato z= Casa.crearZapato("Negro",54,"Recamara",54);
            z.imprimeCaracteristicas();
            Casa.crearZapato().imprimeCaracteristicas();
            Zapato z2= Casa.crearZapato("Blanco",24,"Cama",543);
            z2.imprimeCaracteristicas();
            Casa.crearZapato().imprimeCaracteristicas();
            
            System.out.println("REFRIGERADOR:");
            Refrigerador rf= new Refrigerador(43,43,43,"das","dasd");
            rf.imprimeCaracteristicas();
            rf.imprimePosicion();
            
            
            
            //Casa.costoEstimado(Casa.crearMueble().getPrecio());
            
            
            
		
	}
    
}
