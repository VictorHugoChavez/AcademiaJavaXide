package herenciaMultiple;

public abstract class calculoAbs implements Operacion {
	double valor1; // son los atributos e tipo double con acceso publico, este puedo hacerlo por privado
	double valor2;// y me llevaria utilizar los get y setter
	double valor3;
	double valor4;
	

	
	public calculoAbs(double valor1, double valor2, double valor3, double valor4) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
	}



	@Override
	public String toString() {
		return "calculoAbs [valor1=" + valor1 + ", valor2=" + valor2 + ", valor3=" + valor3 + ", valor4=" + valor4
				+ "]";
	}





}
