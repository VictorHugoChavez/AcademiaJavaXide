package com.curso;

import java.util.function.*;

public class Principal {

	public static void main(String[] args) {

		Mecanico instanciaMecanico = new Mecanico();
		Carro insCarro8 = new Carro();
		insCarro8.id = 8;
		
		//instanciaMecanico.arreglar(insCarro8);
		//Consumer<Carro> consumerCarro = c -> instanciaMecanico.arreglar(c);
		Consumer<Carro> consumerCarro = instanciaMecanico::arreglar;
		consumerCarro.accept(insCarro8);
			
		
		BiConsumer<Mecanico,Carro> biConsumerCarro=(m,c)-> m.arreglar(c);
		biConsumerCarro.accept(instanciaMecanico, insCarro8);
		
		
		
	}
}

class Carro{
	int id;
	String color;
}
class Mecanico {
	void arreglar(Carro c) {
		System.out.println("Arreglando carro id: "+c.id);
	}
}



