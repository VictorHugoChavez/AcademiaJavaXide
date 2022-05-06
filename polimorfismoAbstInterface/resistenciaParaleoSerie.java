package polimorfismoAbstInterface;

public class resistenciaParaleoSerie implements operacion{//a comparacion del anterior tema fue por herencia, ahora se utilizo una interface
	//y para que nosotros podamos ocuparlo es nesesario que se declare con la palabra implements	
	double valor1;
	double valor2;
	double valor3;
	double valor4;
	

	public resistenciaParaleoSerie(double valor1, double valor2, double valor3, double valor4) {
		// corresponde al constructor de nuestra clase
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
	}


	@Override  /// a esto se le llama que esta redefiniendo el metodo de nuestra interface
	public double calulaTotal() {// es el metodo de la interfaz y desde qeui ya definimos lo que hara dicho metodo 
		System.out.println("Para calcular Resistencia total, es nesesario sumar dos valores y los otros dos la suma de las divisiones a la menos uno");
		return ((valor1)*(valor4))/(valor1+valor4)+valor2+valor3; // regresamos un valor despues de hacer la operacion
	}

}
