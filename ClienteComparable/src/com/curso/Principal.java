package com.curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Cliente> listaClientes = new ArrayList<>();
		listaClientes.add(new Cliente("Victor",28345,945.67));
		listaClientes.add(new Cliente("Ernesto",35858,756.67));
		listaClientes.add(new Cliente("Maya",17549,5640.50));
		listaClientes.add(new Cliente("Lucero",19877,9810.03));
		
		System.out.println("ListaEmpleados");
		
		Collections.sort(listaClientes);
		
		for (Cliente e:listaClientes) 
			System.out.println(e);

	}

}
