package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		Predicado pre1 = new ImplementarPredicado();
		boolean res = pre1.prueba("Hello");
		System.out.println(res);
		
	}
	
	private static class ImplementarPredicado implements Predicado {// esta dentro de la clase , que se crea, es de forma estatica
		@Override
		public boolean prueba(String x) {
			if (x.equals("Hello"))
				return true;
			return false;
		}

	}


}
