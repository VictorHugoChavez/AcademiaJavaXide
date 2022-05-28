package v3;

public class PcWindows implements PC{

	private String version;

	public PcWindows(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender "+ version);
		
	}

}
