package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		Bici bici = new Bici("Bici");
		Contenedor cont = new Contenedor();
		cont.bici = bici;
		
		Moto moto = new Moto("Moto");
		ContenedorBici cb = new ContenedorBici(bici);
		
		ContenedorMoto cm = new ContenedorMoto(moto);

	}

}
