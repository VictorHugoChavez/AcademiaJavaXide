package com.curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import com.curso.pojo.Clientes;

public class Principal3 {

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
		
	//	Comparator<Clientes> comparatorNombre = new Comparator<Clientes>(){
		//	@Override
			//public int compare(Clientes o1, Clientes o2) {
			//	return o1.getNombre().compareTo(o2.getNombre());
			//}
	//	};
		
//		Comparator<Clientes> comparatorEdad= new Comparator<Clientes>() {
	//		@Override
		//	public int compare(Clientes o1, Clientes o2) {
			//	return o1.getEdad() - o2.getEdad();
		//	}
			
	//	};
		
	//	Comparator<Clientes> ComparatorSueldo=new Comparator<Clientes>() {
		//	@Override
		//	public int compare(Clientes o1, Clientes o2) {
			//	return (int) (o1.getSueldo() - o2.getSueldo());
			//}
			
		//};
		
		System.out.println("ListaEmpleados por Nombre");		
		Collections.sort(listaEmpleados,new Comparator<Clientes>() {
			@Override
			public int compare(Clientes o1, Clientes o2) {
				return (int) (o1.getSueldo() - o2.getSueldo());
			}
			
		}
		);
		for (Clientes e:listaEmpleados) System.out.println(e);
		
		System.out.println("ListaEmpleados por Edad");		
		Collections.sort(listaEmpleados,new Comparator<Clientes>() {
			@Override
			public int compare(Clientes o1, Clientes o2) {
				return o1.getEdad() - o2.getEdad();
			}
			
		});
		for (Clientes e:listaEmpleados) System.out.println(e);
		
		System.out.println("ListaEmpleados por Sueldo");		
		Collections.sort(listaEmpleados,new Comparator<Clientes>() {
			@Override
			public int compare(Clientes o1, Clientes o2) {
				return (int) (o1.getSueldo() - o2.getSueldo());
			}
			
		});
		for (Clientes e:listaEmpleados) System.out.println(e);

	}
}
