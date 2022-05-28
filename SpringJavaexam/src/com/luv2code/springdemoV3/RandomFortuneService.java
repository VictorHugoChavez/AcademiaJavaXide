package com.luv2code.springdemoV3;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements climaMexico {

	//se crea un arraylist donde contiene 3 valores es decir de  0,1,2 con cierta informacion
	private String[] data = { 
			"Octogato de gitHub nada durante las mañanas",
			"Es un dia hermoso para nadar en una alberca",
			"Hoy no se nada ya que hay tarea por hacer"
	};
	
	// create a random number generator
	private Random myRandom = new Random(); /// se genera un numero aleatorio
		
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);//genera un numero aleatorio ya se 0,1,2 
		
		String theFortune = data[index];//obtiene ese valor y llama a lo que contiene el arreglo
		
		return theFortune;//regresas el valor que obtuvo de The fortune
	}

}


