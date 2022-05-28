package exam;

import org.springframework.stereotype.Component;

@Component
public class materiaCalculoIntegral implements informeHackthon { //este solo  implemente el metodo del getfortune de mi interface materiaClaculoIntegral

	@Override
	public String getFortune() {
		return "Calculo integral se vio sobre las integrales triples\n"
				+ "para el calculo de un sistema de tres lineas y en la probabilidad de 1 a 100000";
	}

}
