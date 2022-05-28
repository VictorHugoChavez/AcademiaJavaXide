package ejercicioSingleton;

//VARIABLES DE REFERENCIA 3 TIPOS, SOLO APLICA A OBJETOS ES DECIR NO A LOS PRIMITIVOS

public class cuentaGitHub {
	private String usuario;//Se declaran los atributos de las clases   //VARIABLE DE REFERENCIA DE INSTANCIA DE CLASE
	private int cliente;//Se declaran los atributos de las clases // VARIABLE DE REFERENCIA INTSNACIA DE CLASE
	private static cuentaGitHub CuentaGitHub;// VARIABLE DE REFERENCIA DE CLASE
	
	private cuentaGitHub(String usuario,int cliente){// el constructor se hace privado
		//usuario y cliente son de variable de referencia local
		
		this.usuario=usuario;
		this.cliente=cliente;
	}
	
	static public cuentaGitHub getInstance() { // se crea el metodo statico para que sea de la clase 
		if(CuentaGitHub==null) { // se dice si la cuenta es vacia
			System.out.println("Se a relizado la conexion satisfecha a la cuenta");
			CuentaGitHub = new cuentaGitHub("victor",321454);
			return CuentaGitHub;
		}
		return CuentaGitHub;
	}

	@Override
	public String toString() { // se genera el toString para ver que hay en memoria
		return "cuentaGitHub [usuario=" + usuario + ", cliente=" + cliente + "]";
	}
	
}
