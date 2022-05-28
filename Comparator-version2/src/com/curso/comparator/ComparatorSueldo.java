package com.curso.comparator;

import java.util.Comparator;

import com.curso.pojo.Clientes;

public class ComparatorSueldo implements Comparator<Clientes> {

	@Override
	public int compare(Clientes o1, Clientes o2) {
		return (int) (o1.getSueldo() - o2.getSueldo());
	}

}
