public class Zapato {
        private String color;
	private float size;
	private String ocacion;
	private float precio;

    public Zapato(String color, float size, String ocacion, float precio) {
        this.color = color;
        this.size = size;
        this.ocacion = ocacion;
        this.precio = precio;
    }
    public Zapato(){
        
    }

	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}

	public void setSize(float size){
		this.size=size;
	}
	public float getSize(){
		return size;
	}

        public String getOcacion() {
            return ocacion;
        }

        public void setOcacion(String ocacion) {
            this.ocacion = ocacion;
        }

	

	public void setPrecio(float precio){
		this.precio=precio;
	}
	public float getPrecio(){
		return precio;
	}

	public void imprimeCaracteristicas(){
		System.out.println("Color:_"+this.color);
		System.out.println("Tamaño:_"+this.size);
		System.out.println("Ocacion:_"+this.ocacion);
		System.out.println("Precio:_"+this.precio);	
	}

}
