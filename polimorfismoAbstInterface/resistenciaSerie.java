package polimorfismoAbstInterface;

public class resistenciaSerie implements operacion {//a comparacion del anterior tema fue por herencia, ahora se utilizo una interface
	//y para que nosotros podamos ocuparlo es nesesario que se declare con la palabra implements	
	double valor1;
	double valor2;
	double valor3;
	double valor4;

	

	public resistenciaSerie(double valor1, double valor2, double valor3, double valor4) {
		// corresponde al constructor de nuestra clase
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
	}



	@Override /// a esto se le llama que esta redefiniendo el metodo de nuestra interface
	public double calulaTotal() {
		return valor1+valor2+valor3+valor4; // regresamos un valor despues de hacer la operacion
	}

}
