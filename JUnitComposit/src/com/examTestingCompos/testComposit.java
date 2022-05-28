package com.examTestingCompos;


import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class testComposit {

	//Patron Composit lo que hace es consutruir objetos complejos a partir de otros mas simples y similares entre si.
	//se puede ver como la estructura en forma de arbol.
	
	//Para este caso vamos a manejar las operaciones simples en donde  tendremos 4 clases(suma,resta,multiplicacion,resta) podemos tener mas operaciones
	
	
	
	@Test
	public void testoperacionCompleja() {
		double testValorA=320.9; // este es un valor constante  de tipo double que se define para realizar la prueba
		double testValorB=15.6; // este es un valor constante  de tipo double que se define para realizar la prueba
		double testValorC=16.5; // este es un valor constante  de tipo double que se define para realizar la prueba
		double testValorD=3.2; // este es un valor constante  de tipo double que se define para realizar la prueba
		double testValorE=83.0;// este es un valor constante  de tipo double que se define para realizar la prueba
		double testValorF=97.1; // este es un valor constante  de tipo double que se define para realizar la prueba
		double testValorG=239.8; // este es un valor constante  de tipo double que se define para realizar la prueba
		double operacionResultado=(testValorF/testValorG)*((testValorA-testValorE)+(testValorD/testValorG)+(testValorB));
		//operacionResultado es para realizar la operacion  de y el resultado de la operacion (F/C)*((A-E)+(D/G)+B)
		
		Expresion opera= new Multi(
				new Division(new Constante(testValorF),new Constante(testValorG)),
				(new Suma(new Resta(new Constante(testValorA),new Constante(testValorE)),
						(new Division(new Constante(testValorD),new Constante(testValorG))),new Constante(testValorB))));
		//se declara 
		
		assertEquals(operacionResultado,opera.getValor(),0.0);
		// el assertEquals signbifica que es lo que esperamos en el momento de ejecucion, el primer parametro es el resultado
		// y el segundo es cuando se ejecuta la operacion de get.valor y el ultimos parametro es la diferencia que puede haber entre
		//entre ambos resultados, en si el tercer paramatro se modifica a un 0.9 como ejemplo, y al momento de hacer la prueba unitaria
		//esta en el rango de +-0.9 este sera correcto
	}
	
	@Test // en este caso se realiza un testing donde realizamos la prueba y ponemos sobre el rango que puede tener, 
	//en este caso es de +-0.6 si nuestrso valores son iguales y se encuentran dentro del rango, sera correcto en el testing
	//ya que sera un valor esperado
	public void suma() {
		double testValorA=320.9; // este es un valor constante  de tipo double que se define para realizar la prueba
		double testValorB=15.6; // este es un valor constante  de tipo double que se define para realizar la prueba
		double testValorF=97.1; // este es un valor constante  de tipo double que se define para realizar la prueba
		double resultado=testValorA+testValorB+testValorF-0.5;//se realiza la operacion resultado de la seuma de tres valores
		Expresion sumatoria=new Suma(new Constante(testValorA),new Constante(testValorB),new Constante(testValorF));// se crea un objeto de tipo suma con variable de referencia Expresion
		//al declara la suma, tenemos como valores tres nuevos objetos de Constante, que por mi constructor debe de ser inicializados
		
		assertEquals(resultado,sumatoria.getValor(),0.6);//realiza la comparacion 
		
		
		//*La imporntancia del del testing es probar nuestros programar y que todo valla marchando correctamente a lo que nosotros esperamos
		//ademas de que el testing  nos ayuda a verificar si se presenta una falla en el programa y revisar que es lo que paso 
	}
	
	
	
}
