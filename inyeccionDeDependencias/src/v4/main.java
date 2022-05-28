package v4;

public class main {

	public static void main(String[] args) {
		Becario becario1 = inyector.getBecario("Patrobas");// este es mi variable de refrencia que le indica que relaice el metodo
		// de la clase inyector su metodo getBecario pasando un parametro
		becario1.encenderPc();
		
		Becario becario2 = inyector.getBecario("Andronico");
		becario2.setMyPc(new PcLinux("Ubuntu 18"));
		becario2.encenderPc();
	}

}
