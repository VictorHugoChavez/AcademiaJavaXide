package v8;

public class Principal {

	public static void main(String[] args){
		
		int x = 1001;
		int y = 1;
		int res = 0;
		///todo esto es el manejo de excepciones
		try {
			res = calculaDiv(x, y);
			System.out.println("Resultado: "+res);
		} catch (CeroException | NegativoException | UnsupportedOperationException e) { // aqui se puede haber varios multicatch
			e.printStackTrace();
		} finally {
			System.out.println("Paso por finally");
		}
		
		System.out.println("Continua con el programa");

	}
	
	private static int calculaDiv(int x, int y) 
					throws CeroException, NegativoException{
		if (y==0)
			throw new CeroException("No se puede dividir entre 0");
		if (y<0)
			throw new NegativoException("No se permiten negativos en y");
		if (x>100)
			throw new UnsupportedOperationException("No se permite en x mayor a 100");
		return x/y;
	}

}





