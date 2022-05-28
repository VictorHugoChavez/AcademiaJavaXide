package v2;

public class main {

	public static void main(String[] args) {
		Becario becario1 = new Becario("Patrobas");
		inyector.inyectarPc(becario1);
		
		becario1.encenderPc();
		
		Becario becario2 = new Becario("Andronico");
		inyector.inyectarPc(becario2);
		
		becario2.encenderPc();
	}

}
