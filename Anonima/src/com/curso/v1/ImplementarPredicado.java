package com.curso.v1;

public class ImplementarPredicado implements Predicado {

	@Override
	public boolean prueba(String x) {
		if (x.length() > 5)
			return true;
		return false;
	}

}
