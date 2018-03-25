public class Mueble {
        private String tipo;
	private String ubicacion;
	private String color;
	private float precio;

	public Mueble(String tipo, String ubicacion, String color, float precio){
		this.tipo=tipo;	
                this.ubicacion=ubicacion;
		this.color=color;
		this.precio=precio;
	}

	public Mueble(){

	}

	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public String getTipo(){
		return tipo;
	}

	public void setUbicacion(String ubicacion){
		this.ubicacion=ubicacion;
	}
	public String getUbicacion(){
		return ubicacion;
	}

	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}

	public void setPrecio(float precio){
		this.precio=precio;
	}
	public float getPrecio(){
		return precio;
	}


	public void imprimePosicion(){
		System.out.println("El mueble se encuentra en:_"+ this.ubicacion);

	}
	public void imprimeCaracteristicas(){
		System.out.println("Tipo:_"+this.tipo);
		System.out.println("Ubicacion:_"+this.ubicacion);
		System.out.println("Color:_"+ this.color);
		System.out.println("Precio:_"+this.precio);

	}
}