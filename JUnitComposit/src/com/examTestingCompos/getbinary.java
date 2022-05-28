package com.examTestingCompos;

public abstract class getbinary implements Expresion{ // en mi getBinary se declara como una clase abstracta en donde le decimos que implementa lo que dice expresion
	//pero en este caso como es clase abstracta no lo va implementar el metodo hasta que se encuentra con una clase  que no sea abtracta
	Expresion izquierda; //se definen dos variables 
	Expresion derecha;
	Expresion enMedio;
	
	public getbinary(Expresion izquierda, Expresion derecha) { // es mi constructor que tiene dos variables 
		this.izquierda = izquierda;
		this.derecha = derecha;
	}

	public getbinary(Expresion izquierda, Expresion derecha, Expresion enMedio) { // // es mi constructor que tiene tres variables 
		this.izquierda = izquierda;
		this.derecha = derecha;
		this.enMedio = enMedio;
	}

	
	
	
}
