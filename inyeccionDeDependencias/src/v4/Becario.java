package v4;

public class Becario {

	private String nombre;
	private PC myPc;
	
	public PC getMyPc() {
		return myPc;
	}

	public void setMyPc(PC myPc) {
		this.myPc = myPc;
	}


	
	public Becario(String nombre, PC myPc) {
		this.nombre = nombre;
		this.myPc = myPc;
	}

	void encenderPc() {
		System.out.println(nombre);
		//BAJO ACOPLAMIENTO
		myPc.encender();
	}
	
	
}
