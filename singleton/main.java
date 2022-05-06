package singleton;

public class main {

	public static void main(String[] args) {
		CuentaAdminstrador gerente=CuentaAdminstrador.getInstance();
		//la variable de referencia  realiza la funcion  de CuentaAdmistrador
		//y en este caso realiza lo que contega el metodo getInstance
		System.out.println(CuentaAdminstrador.contador);
		CuentaAdminstrador gerente2=CuentaAdminstrador.getInstance();
		//la variable de referencia realiza la funcion de cuantaAdminstrador 
		//y pasa por la condicion de ese metodo
		System.out.println(CuentaAdminstrador.contador);// Sirve para comprobar cuantas veces se creado el objeto,
		//lo hace atraves del constructor
		System.out.println(gerente==gerente2);
		//comparo si gerente y gerente2 estan apuntando al mismo objeto, si es cierto
		//regresara un true pero si no un false
		System.out.println(gerente);//imprime los valores del objeto que apunta gerente
		System.out.println(gerente2);//imprime los valores del objeto que apunta gerente2
		// pero en este caso ya paso por las validicion y se comprobo 
		//ya que el singleton hace esa funcion de no crear mas objetos en memoria
		//y el sistema sea mas eficiente

	}

}
