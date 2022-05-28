package disign.observer.ejercicio;

public class Suscriptor1 extends Observer {
	
	private String espectaculos;

	public Suscriptor1(String espectaculos,Subject subject) {
		super(subject);
		this.espectaculos = espectaculos;
	}
	
	void showText() {
		System.out.println("Leyendo la seccion de espectaculos:  "+espectaculos);
	}

	@Override
	void update() {
		showText();
	}
	
	

}
