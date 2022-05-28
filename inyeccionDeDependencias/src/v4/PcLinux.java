package v4;

public class PcLinux  implements PC{
	private String version;

	public PcLinux(String version) {
		this.version = version;
	}
	
	public void encender() {
		System.out.println("Encender Pc:"+version);
	}
	
}
