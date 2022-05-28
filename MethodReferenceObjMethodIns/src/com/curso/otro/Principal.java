package com.curso.otro;



public class Principal {

	public static void main(String[] args) {

		String cadena1 = "Hello ";
		String cadena2 = "World Java";
		
		//UnaryOperator<String> uo = x -> cadena1.concat(x);
		
		//String res = uo.apply(cadena2);
		//String res = Utils.transforma(cadena2, uo);
		
		
		
		String res = Utils.transforma(cadena1,cadena2, String::concat);
		
		System.out.println(res);
		
		
	}

}
