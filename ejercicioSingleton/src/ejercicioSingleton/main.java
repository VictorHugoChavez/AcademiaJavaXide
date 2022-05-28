package ejercicioSingleton;

public class main {

	public static void main(String[] args) {
		//VARIABLES DE REFERENCIA LOCAL 
		cuentaGitHub usuario1=cuentaGitHub.getInstance();
		cuentaGitHub usuario2=cuentaGitHub.getInstance();
		cuentaGitHub usuario3=cuentaGitHub.getInstance();
		cuentaGitHub usuario4=cuentaGitHub.getInstance();
		System.out.println(cuentaGitHub.getInstance());
		

	}

}
