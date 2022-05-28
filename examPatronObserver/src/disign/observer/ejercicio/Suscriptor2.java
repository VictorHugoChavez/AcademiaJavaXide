package disign.observer.ejercicio;

public class Suscriptor2 extends Observer {
	
	private String cultura;

	public Suscriptor2(String cultura, Subject subject) {
		super(subject);
		this.cultura = cultura;
	}
	
	void moveGif() {
		System.out.println("Leyendo la seccion de cultura: "+cultura);
	}

	@Override
	void update() {
		moveGif();
	}
	
	

}
