package herenciaMultiple;

public class cpacitoresParalelo extends calculoAbs implements calculoCorriente,claculoVoltaje{

	public cpacitoresParalelo(double valor1, double valor2, double valor3, double valor4) {
		super(valor1, valor2, valor3, valor4);

	}

	@Override
	public double ejecuta() { // este pertenece a la clase abstracta calculoAbs
		return valor1+valor2+valor3+valor4;
	}

	@Override
	public double CalculoVoltaje(double num) {// este pertenece de la interfaz de calculoVolatje 
		
		double res=num*(valor1+valor2+valor3+valor4)+1.589264;
		System.out.print("EL CALCULO DEL VOLTAJE DE LOS CAPACITORES ES DE ");
		return res;
	}

	@Override
	public double calculoC(double num) { //este es perteneciente a la interfaz de calcularCorriente 
		double res=num/(valor1+valor2+valor3+valor4)-1.59413;
		System.out.print("EL CALCULO DEL VOLTAJE DE LOS CAOACITORES  ES DE ");
		return res;
	}

	
	
}
