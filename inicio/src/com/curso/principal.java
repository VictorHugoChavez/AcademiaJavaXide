package com.curso;

public class principal {
	public static void main(String[]args) {
		Emplado patronas= new Emplado();
		patronas.setNombre("Tercio");
		Emplado andronico=new Emplado();
		andronico.setNombre("Tercio");
		
		Emplado mexi=new Emplado("Tercio",20);
		System.out.println(mexi.getNombre());
		System.out.println(mexi.getEdad());
		
		
		System.out.println(patronas==andronico);
		System.out.println(patronas.equals(andronico));
		
		
		estudiante victor=new estudiante();
		estudiante ernesto=new estudiante();
		estudiante Luis=new estudiante("Luis",25,6);
		estudiante Nayli=new estudiante();
		System.out.println(Luis.nombre);
		System.out.println(Luis.edad);
		System.out.println(Luis.grado);
		
		System.out.println(Nayli.nombre);
		System.out.println(Nayli.edad);
		
		//System.out.println(victor==ernesto);
		//System.out.println(victor.equals(ernesto));
		
		int x= 5;
		int z=x;
		z=10;
		System.out.println("El slor de x " + x);
	}
}
