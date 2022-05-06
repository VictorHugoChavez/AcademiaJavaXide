package herenciaMultiple;

public class resistenciasSerie extends calculoAbs implements calculoCorriente {


	public resistenciasSerie(double valor1, double valor2, double valor3, double valor4) {
		super(valor1, valor2, valor3, valor4);
	}

	@Override
	public double ejecuta() {// este pertenece a la clase abstracta calculoAbs
		return valor1+valor2+valor3+valor4;
	}
	

	@Override
	public double calculoC(double num) {//este es perteneciente a la interfaz de calcularCorriente 
		double res=num/(valor1+valor2+valor3+valor4);
		System.out.print("EL CALCULO DE LA CORRIENTE DE LAS RESISTENCIAS ES DE ");
		return res;
	}
}
