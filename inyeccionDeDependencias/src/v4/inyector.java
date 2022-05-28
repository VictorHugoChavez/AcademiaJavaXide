package v4;


public class inyector {
	static void inyectarPc(Becario bec) {//Este es el segundo donde realiza le metodo
		//de tipo Becario 
		
		//bec.myPc = new PcWindows("Windows XP");
		//la inyeccion es a traves de una variable de referencia
		//bec.myPc = new PcLinux("Ubuntu 18");
		bec.setMyPc(new PcLinux("Ubunto 18"));	//tercero reasigna por los setters
	}
	static Becario getBecario(String nombre) {
		PC Linux=new PcLinux("Ubuntu 18");
		PC windows=new PcWindows("WINDOWS XP");
		return new Becario(nombre,windows);
	}
}
