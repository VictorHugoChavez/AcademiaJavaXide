package v5;

public class Principal {

	public static void main(String[] args){
		
		int x = 10;
		int y = 0;
		int res = 0;
		
		try {
			res = calculaDiv(x, y);
			System.out.println("Resultado: "+res);
		}catch(CeroException e){
			e.printStackTrace();
		}catch(negativeException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Continua con el programa");
		}
		
		
		
		

	}
	
	private static int calculaDiv(int x, int y) throws CeroException,negativeException {
		if ( y==0)
			throw new CeroException("No se puede dividir entre 0");
		if(y<0)
			throw new negativeException("No se puede dividir entre numeros negativos");
		return x/y;
	}

}





