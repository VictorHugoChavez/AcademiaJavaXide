package principla;

public class main {
	public static void main(String[] args) {
		int x=10;
		int y=0;
		int res;
		
		try {
			res=calculaDiv(x,y);
			System.out.println("Resultado :" + res);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("No se puede dividir entre 0");
		}
			
	}
	private static int calculaDiv(int x,int y) {
		return x/y;
	}
}
