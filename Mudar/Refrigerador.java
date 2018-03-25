public class Refrigerador {
    private float size;
	private float precio;
	private float color;
	private String modelo;
	private String posicion;

     public Refrigerador(float size, float precio, float color, String modelo, String posicion) {
        this.size = size;
        this.precio = precio;
        this.color = color;
        this.modelo = modelo;
        this.posicion = posicion;
    }

	public void setSize(float size){
		this.size=size;
	}

  
	public float getSize(){
		return size;
	}

	public void setPrecio(float precio){
		this.precio=precio;
	}
	public float getPrecio(){
		return precio;
	}

	public void setColor(float color){
		this.color=color;
	}
	public float getColor(){
		return color;
	}

	public void setModelo(String modelo){
		this.modelo=modelo;
	}
	public String getModelo(){
		return modelo;
	}

	public void setPosicion(String posicion){
		this.posicion=posicion;
	}
	public String getPosicion(){
		return posicion;
	}



	public void imprimePosicion(){
		System.out.println("El refrigerador se encuentra en: "+ this.posicion);
	}
	
	public void imprimeCaracteristicas(){
		System.out.println("Precio:_"+this.precio);
		System.out.println("Color:_"+this.color);
		System.out.println("Modelo:_"+this.modelo);
		System.out.println("Posicion:_"+this.posicion);
	}
}
