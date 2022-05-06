package PolimorfismoAbstraccion;

public abstract class operacion {//esta es la clase abstracta por lo que no se pueden crear objetos
	double valor1;//Se crea las variobles e instancia de caracter publico y tipo double
	double valor2;//Se crea las variobles e instancia de caracter publico y tipo double
	double valor3;//Se crea las variobles e instancia de caracter publico y tipo double
	double valor4;//Se crea las variobles e instancia de caracter publico y tipo double
	
	
	
	public operacion(double valor1, double valor2, double valor3, double valor4) {// se crea el constructor de la clase 
		this.valor1 = valor1; 
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
	}

	public abstract double calulaTotal();//esta es un metodo abstracto por lo que no contiene una accion y quien la define son las subclases

	@Override
	public String toString() {// es el metodo to string para revisar los valores que se iniciaron del objeto
		return "operacion [valor1=" + valor1 + ", valor2=" + valor2 + ", valor3=" + valor3 + ", valor4=" + valor4 + "]";
	}


}
