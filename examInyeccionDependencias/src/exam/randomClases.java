package exam;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class randomClases implements informeHackthon { //implementa la interfaz de fortuneService

	// create an array of strings
	private String[] data = { // crea un arreglo ded tipo string donde almacena diferentes frases
			"Hay clases de matematicas de 10 a 11",
			"La clase de Dibujo tecnico cambio de horarios",
			"El dia de hoy na va ver clases",
			"La clase de Circuitos Electronicos dejaron hacer un poryecto de un multiplexor"
	};
	
	// crea un numero aleatroio  con Random
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() { //implementa el metodo del informeHackthon
		// pick a random string from the array
		int index = myRandom.nextInt(data.length); // la variable de referencias obtiene un valor del 0- 3
		
		String theFortune = data[index];//obtendra el valor de la posicion de data index
		
		return theFortune;
	}

}


