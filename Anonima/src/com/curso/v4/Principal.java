package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		Predicado pre1 =  x -> x.length() > 5;
		Predicado pre2 =  x -> x.equals("Hello");
		Predicado pre3 =  x -> x.endsWith("World");
		
		Predicado pre4 = x-> {
			System.out.println("Colocar varias lines de codigo");
			if(x.equals("Hello")||x.endsWith("World"))
				return true;
			return false;
		};
		
		boolean res = pre3.prueba("Hello World");
		System.out.println(res);
		
	}
	


}
