public class Mujer extends Humano implements Acciones{

	public void cabelloLargo(){
		System.out.println("Tengo cabello largo");
		super.miGenero("Mujer");

	}
	public void comer(){
		System.out.println("Yo como");

	}
	public void comer(String comida){
		System.out.println("Yo como "+ comida);
	}
	public void dormir(){
		System.out.println("Yo duermo");
	}

	public static void main(String[] args) {
		Mujer m=new Mujer();
		Humano hum=new Mujer();
		hum.miGenero("Mujer");
		m.cabelloLargo();
		m.comer();
		m.comer("lasagna");
		m.dormir();

	}

}