package com.pruebas;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class testComposit {

	@Test
	void test() {// es es de pruebas unitarias
		double a=5.1;
		double b=4.8;
		assertEquals(a,b,0.5);
	}

	@Test
	public void testConstante() {
		double testContanat=3.0;
		Expresion e=new Constante(testContanat);
		assertEquals(testContanat,e.getValor(),0.0);
		
	}
	
	@Test
	public void testSuma() {
		double testValorA=2.0;
		double tetsValorB=3.0;
		
		
		Expresion izquierda=new Constante(testValorA);
		Expresion derecha=new Constante(tetsValorB);
		Expresion suma = new Suma(izquierda,derecha);
	//	assertEquals(testValorA,tetsValorB, suma.getValor(),0.0);
	
	}
	@Test 
	public void testsumacompleja() {
		double testValorA=2.0;
		double tetsValorB=3.0;
		double tetsValorC=4.0;
		double tetsValorD=5.0;
		
		 
	}
	
	@Test
	public void testoperacionCompleja() {
		double testValorA=4.0;
		double testValorB=6.0;
		double testValorC=200.0;
		double testValorD=3.0;
		double testValorE=83.0;
		double res=(((testValorA+testValorB)*(testValorC))/(testValorD+testValorE));
		Expresion div=new division(new multi(new Suma(new Constante(testValorA),new Constante(testValorB)),new Constante(testValorC)),new Suma(new Constante(testValorD),new Constante(testValorE)));
		
		assertEquals(res,div.getValor(),0.0);
	}
	
	
}
