
public class Departamento {
    //El departamento cuenta con 1-4 personas
   

    int numPersonas=(int) (Math.random() * 4) + 1;
    private  Persona [] persona= new Persona[numPersonas];
    
   
    public static Persona generaPersona(){
		return new Persona(); 
	}
    //CONSTRUCTORES
    public Departamento(int numDepto) {
        System.out.println("El departamento "+ numDepto +"tiene: " + numPersonas +" habitantes");
    }
    public Departamento(){
        
    }
    public int numPersonas(){//Constructor de Departamento
            return this.numPersonas; //Llenamos el departamento aleatoriamente de 1 a 4 personas
	}
    
}
