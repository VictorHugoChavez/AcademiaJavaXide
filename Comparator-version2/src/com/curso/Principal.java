package com.curso;

import java.util.*;

import com.curso.comparator.*;
import com.curso.pojo.Clientes;

public class Principal {

	public static void main(String[] args) {
		
		List<Clientes> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Clientes("Ernesto",28,264.67));
		listaEmpleados.add(new Clientes("Hugo",35,159.67));
		listaEmpleados.add(new Clientes("Jesus",19,456.50));
		listaEmpleados.add(new Clientes("Takato",22,470.03));
		listaEmpleados.add(new Clientes("Alan",45,980.67));
		listaEmpleados.add(new Clientes("Victor",32,106.67));
		listaEmpleados.add(new Clientes("Daniel",29,400.50));
		listaEmpleados.add(new Clientes("Kevin",18,550.03));
		
		System.out.println("ListaEmpleados por Nombre");		
		Collections.sort(listaEmpleados,new ComparatorNombre());
		for (Clientes e:listaEmpleados) System.out.println(e);
		
		System.out.println("ListaEmpleados por Edad");		
		Collections.sort(listaEmpleados,new ComparatorEdad());
		for (Clientes e:listaEmpleados) System.out.println(e);
		
		System.out.println("ListaEmpleados por Sueldo");		
		Collections.sort(listaEmpleados,new ComparatorSueldo());
		for (Clientes e:listaEmpleados) System.out.println(e);

		
	}

}
