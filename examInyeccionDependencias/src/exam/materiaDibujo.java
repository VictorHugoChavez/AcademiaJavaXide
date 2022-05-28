package exam;

import org.springframework.stereotype.Component;

@Component
public class materiaDibujo implements informeHackthon {

	@Override
	public String getFortune() {
		return "En la clase de Dibujo se cambiaron os temas ya que habra un evento en la escuela\n"
				+ "y dicho evento se llevara acabo dentro de las instalaciones de la escuela";
	}

}
