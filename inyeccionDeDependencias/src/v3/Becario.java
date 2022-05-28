package v3;

public class Becario {

	private String nombre;
	private PC myPc;
	
	
	
	public PC getMyPc() {
		return myPc;
	}

	public void setMyPc(PC myPc) {
		this.myPc = myPc;
	}

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderPc() {
		System.out.println(nombre);
		//BAJO ACOPLAMIENTO
		myPc.encender();
	}
	
	
}
