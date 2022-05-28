package com.curso;
import java.util.function.*;

public class Principal2 {

	public static void main(String[] args) {
		
		Principal2 prin2 = new Principal2();
		
		//System.out.println(prin2.getCantidadLetras("Hola"));
		
		//Function<String,Integer> f = s -> prin2.getCantidadLetras(s);
		Function<String,Integer> f = prin2::getCantidadLetras;
		System.out.println( f.apply("Hola") );
		
		
		Principal2 metdodReference=new Principal2();
		BiPredicate<Integer,Integer> x= metdodReference::esMayor10;
		System.out.println(x.test(20, 15));
		
		
		
	}
	
	int getCantidadLetras(String s) {
		return s.length();
	}
	
	boolean esMayor10(int x, int y) {
		return (x+y) > 10;
	}
	
	

}
