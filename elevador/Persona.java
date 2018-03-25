
public class Persona{
	private String nombre;
	private String edad;
	private String curp;

	public Persona(String nombre, String edad, String curp){
		this.nombre=nombre;
		this.edad=edad;
		this.curp=curp;
	}

	public Persona(){
	}
        
	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setEdad(String edad){
		this.edad=edad;
	}

	public String getEdad(){
		return edad;
	}

	public void setCurp(String curp){
		this.curp=curp;
	}

	public String getCurp(){
		return curp;
	}

}
