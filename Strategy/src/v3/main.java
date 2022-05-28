package v3;

public class main {

	public static void main(String[] args) {
		Aguila ave1=new Aguila();
		ave1.volar();
		System.out.println("-------------Pat0-------");
		Pato ave2= new Pato();
		ave2.volar();
		ave2.cv=new Sivolar();
		ave2.volar();
		ave2.cv=new VolarAleatorio();
		ave2.volar();
		System.out.println("-------------s-------");
		Pinguino ave3=new Pinguino();
		ave3.volar();

	}
// se prgrama una interfaz y no implementacion
}
