package v2;

public class inyector {
	static void inyectarPc(Becario bec) {
		//bec.myPc = new PcWindows("Windows XP");
		//la inyeccion es a traves de una variable de referencia
		bec.myPc = new PcLinux("Ubuntu 18");
	}
}
