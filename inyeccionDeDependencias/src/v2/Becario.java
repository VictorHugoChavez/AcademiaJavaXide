package v2;

public class Becario {

	private String nombre;
	PC myPc;
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderPc() {
		System.out.println(nombre);
		//BAJO ACOPLAMIENTO
		myPc.encender();
	}
	
	
}
