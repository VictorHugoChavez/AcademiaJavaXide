package herenciaMultiple;

public class resitenciaSerieParalelo extends calculoAbs implements claculoVoltaje{

	public resitenciaSerieParalelo(double valor1, double valor2, double valor3, double valor4) {
		super(valor1, valor2, valor3, valor4);
	}

	@Override
	public double ejecuta() {// este pertenece a la clase abstracta calculoAbs
		return ((valor1)*(valor4))/(valor1+valor4)+valor2+valor3;
	}

	@Override
	public double CalculoVoltaje(double num) {// este pertenece de la interfaz de calculoVolatje 

		double res=num/(((valor1)*(valor4))/(valor1+valor4)+valor2+valor3);
		System.out.print("EL CALCULO DEL VOLTAJE DE LAS RESISTENCIAS ES DE ");
		return res;
	}






}
