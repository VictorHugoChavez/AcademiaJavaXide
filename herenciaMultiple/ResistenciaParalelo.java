package herenciaMultiple;

public class ResistenciaParalelo extends calculoAbs implements calculoCorriente,claculoVoltaje{
	

	public ResistenciaParalelo(double valor1, double valor2, double valor3, double valor4) {
		super(valor1, valor2, valor3, valor4);
	}

	@Override
	public double ejecuta() {// este pertenece a la clase abstracta calculoAbs
		return 1/((1/valor1)+(1/valor2)+(1/valor3)+(1/valor4));
	}

	@Override
	public double CalculoVoltaje(double num) { // este pertenece de la interfaz de calculoVolatje 
		double T=1/((1/valor1)+(1/valor2)+(1/valor3)+(1/valor4));
		double res=num*T;
		System.out.print("EL CALCULO DEl VOLTAJE DE LAS RESISTENCIAS ES DE ");
		return res;
	}

	@Override
	public double calculoC(double num) {//este es perteneciente a la interfaz de calcularCorriente 
		double T=1/((1/valor1)+(1/valor2)+(1/valor3)+(1/valor4));
		System.out.print("EL CALCULO DE LA CORRIENTE DE LAS RESISTENCIAS ES DE ");
		double res=num/T;
		return res;
		
	}
}
