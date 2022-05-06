package PolimorfismoAbstraccion;

public class resistenciaParalelo extends operacion {// realizamos herencia  de la clase operacion
	//por lo que al hacer eso se debe implementar el metodo de la clase padre ademas de que tambien 
	//el constructor de esta clase debe ocupar el de la clase padre por lo que se utiliza el super

	public resistenciaParalelo(int valor1, int valor2, int valor3, int valor4) {
		super(valor1, valor2, valor3, valor4); // son los atributos de la clase padre
	}

	@Override   /// a esto se le llama que esta redefiniendo el metodo
	public double calulaTotal() {/// este es el metodo de la clase padre, como se definio como 
		//clase abstracta desde el padre, el hijo debe implementar ese metodo y  deciridr que es lo que hara
		//ademas recordar que las clases abstractas no pueden ser 100% abstractas como las interfaces
		System.out.println("Para calcular la resistencia en paralelo total es sumar la division de cada uno de los valores (1/resistencia) y sacar el inversor  ");
		return 1/((1/valor1)+(1/valor2)+(1/valor3)+(1/valor4)); // regresamos un valor despues de hacer la operacion
	}
	
}
