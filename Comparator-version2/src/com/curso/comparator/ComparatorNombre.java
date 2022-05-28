package com.curso.comparator;

import java.util.Comparator;

import com.curso.pojo.Clientes;

public class ComparatorNombre implements Comparator<Clientes> {

	@Override
	public int compare(Clientes o1, Clientes o2) {
		return o2.getNombre().compareTo(o1.getNombre());
	}

}
