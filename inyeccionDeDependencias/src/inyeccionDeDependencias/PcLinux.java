package inyeccionDeDependencias;

public class PcLinux {
	private String version;

	public PcLinux(String version) {
		this.version = version;
	}
	
	public void encender() {
		System.out.println("Encender Pc:"+version);
	}
	
}
