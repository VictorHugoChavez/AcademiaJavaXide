import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Funcional valor1= (x)->{
			if(x>0)
				return "Valor correcto aceptado";
			return "Valor incorrecto solo pueden ser valores positivos";
		};
		Funcional valor2= (x)->{if(x>0)
			return "Valor correcto aceptado";
		return "Valor incorrecto solo pueden ser valores positivos";};
		Funcional valor3= (x)->{
			if(x>0)
				return "Valor correcto aceptado";
			return "Valor incorrecto solo pueden ser valores positivos";
		};
		
		Funcional valor4= (x)->{
			if(x>0)
				return "Valor correcto aceptado";
			return "Valor incorrecto solo pueden ser valores positivos";
		};

		List<Funcional> cantidades=new ArrayList<>();
		cantidades.add(valor1= (x)->{
			if(x>0)
				return "Valor correcto aceptado";
			return "Valor incorrecto solo pueden ser valores positivos";
		});
		cantidades.add(valor2);
		cantidades.add(valor3);
		cantidades.add(valor4);
		
		
		System.out.println(valor1.aceptar(10035));
		System.out.println(valor2.aceptar(-135));
		System.out.println(valor3.aceptar(184));
		System.out.println(valor4.aceptar(-12));
		
	}

}













