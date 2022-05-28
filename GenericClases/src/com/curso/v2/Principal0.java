package com.curso.v2;


public class Principal0 {

	public static void main(String[] args) {

		Bici bici = new Bici("Bici");
		Contenedor<Bici> cont = new Contenedor<>(bici);
		
		
		Moto moto = new Moto("Moto");
		Contenedor<Bici> cb = new Contenedor<>(bici);
		
		Contenedor<Moto> cm = new Contenedor<>(moto);
		
		Bici b = cont.getT();
		
		Moto m = cm.getT();

	}

}
