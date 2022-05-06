package polimorfismoAbstInterface;

public class capacitoresParalelo implements operacion{
	//a comparacion del anterior tema fue por herencia, ahora se utilizo una interface
	//y para que nosotros podamos ocuparlo es nesesario que se declare con la palabra implements	
	double valor1;
	double valor2;
	double valor3;
	double valor4;
	


	public capacitoresParalelo(double valor1, double valor2, double valor3, double valor4) {
		// corresponde al constructor de nuestra clase
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
	}



	@Override  /// a esto se le llama que esta redefiniendo el metodo de nuestra interface
	public double calulaTotal() {// es el metodo de la interfaz y desde qeui ya definimos lo que hara dicho metodo 
		System.out.println("Para calcular la capacitores total es sumar todos los valores");
		return valor1+valor2+valor3+valor4; // regresamos un valor despues de hacer la operacion
	}

}
