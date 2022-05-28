package bigDecimal;

import java.math.BigDecimal;

public class Cajero {
	double operacion(double importe1, double importe2){ // este es para calcular con double
		return importe2 - importe1;
	}
	
	BigDecimal operacionBig(BigDecimal importe1, BigDecimal importe2){// este es correscopndiente de bigDecimal
		return importe2.subtract(importe1);
	}

}
