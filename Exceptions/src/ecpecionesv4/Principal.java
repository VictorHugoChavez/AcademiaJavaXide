package ecpecionesv4;

public class Principal {

	public static void main(String[] args) throws CeroException {
		
		int x = 10;
		int y = 0;
		int res = 0;
		
		res = calculaDiv(x, y);
		System.out.println("Resultado: "+res);
		
		System.out.println("Continua con el programa");

	}
	
	private static int calculaDiv(int x, int y) throws CeroException {
		if ( y==0)
			throw new CeroException("No se puede dividir entre 0");
		return x/y;
	}

}





