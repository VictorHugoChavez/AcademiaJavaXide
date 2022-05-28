package exam;

import org.springframework.stereotype.Component;

@Component
public class materiaMatematicas implements informeHackthon {

	@Override
	public String getFortune() {
		return "Hoy se veran en la clase de matematicas el tema de algreba y trigonimetria";
	}

}
