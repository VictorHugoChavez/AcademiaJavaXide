package bigDecimal;

import java.math.BigDecimal;

public class main {

	public static void main(String[] args) {
		Cajero c = new Cajero();
		
		double r = c.operacion(0.02, 0.03);
		
		System.out.println("Resultado: "+r);

		BigDecimal b = c.operacionBig(
				new BigDecimal("0.02"), 
				new BigDecimal("0.03"));// se debe pasar con como un string, recomendacion manejar los tipos de datos 
		//preguntar por las variables porque los valores exactos es importante
		//asi que valores precisos por big_decimal y pregunatar 
		
		//Big numbers
		System.out.println("ResultadoBig: "+b);


	}

}
