package com.curso.otro;

import java.util.function.BinaryOperator;


public class Utils {
	
	public static String transforma 
	  		(String s, String s2, BinaryOperator<String> uo) {
		
		return (uo.apply(s, s));
	}

}
