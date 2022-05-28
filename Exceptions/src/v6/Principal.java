package v6;

public class Principal {

	public static void main(String[] args){
		
		int x = 101;
		int y = 5;
		int res = 0;
		
		try {
			res = calculaDiv(x, y);
			System.out.println("Resultado: "+res);
		}catch(CeroException e){
			e.printStackTrace();
		}catch(negativeException e) {
			e.printStackTrace();
		}catch(UnsupportedOperationException e) {
			System.out.println("No estamos obligados a cacharlos");
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
		if(x>100)
			throw new UnsupportedOperationException("No se permite en x mayor a 100");
		return x/y;// las que heredan las de run time exceoption no estamos obligados a darle un tratamientos
	}

}





