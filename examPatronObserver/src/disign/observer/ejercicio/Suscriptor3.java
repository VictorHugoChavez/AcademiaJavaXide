package disign.observer.ejercicio;

public class Suscriptor3 extends Observer {
	
	private String deportes;

	public Suscriptor3(String deportes, Subject subject) {
		super(subject);
		this.deportes = deportes;
	}
	
	void showImage() {
		System.out.println("Leyendo la seccion de deportes "+deportes);
	}

	@Override
	void update() {
		showImage();
	}
	
	

}
