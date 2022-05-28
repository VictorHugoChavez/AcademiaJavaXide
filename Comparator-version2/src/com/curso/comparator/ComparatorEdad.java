package com.curso.comparator;

import java.util.Comparator;

import com.curso.pojo.Clientes;

public class ComparatorEdad implements Comparator<Clientes> {

	@Override
	public int compare(Clientes o1, Clientes o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
