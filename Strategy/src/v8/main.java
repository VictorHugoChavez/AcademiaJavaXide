package v8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
	static Ave ave;
	public static void main(String[] args) {
			List<Ave> lista = new ArrayList<>();
			lista.add(new Aguila());
			lista.add(new Pinguino());
			lista.add(new Pato());
			ejecutarVuelos(lista);
		}
		
		static void ejecutarVuelos(List<Ave> listaAves) {
			for (Ave ave : listaAves) {
				ave.cv = getCv(); /// si va despues va arrojar un error ya que no esta apuntando an objeto 
				System.out.println(ave);
				ave.volar();
			}
		}
		
		//ES UNA FORMA DE EJEMPLIFICAR QUE DECIDE EL USUARIO FINAL
		static ComportamientoVolar getCv() {

			Scanner scanner = new Scanner(System.in);
		    System.out.println("Indica letra comportamiento volar a)NoVolar b)SiVolar c)Aleatorio d)salir");
		    String sLetra = scanner.nextLine();
		    
		    if (sLetra.equals("a"))
		    	return new NoVolar();
		    if (sLetra.equals("c"))
		    	return new VolarAleatorio();
		    if (sLetra.equals("d")) {
		    	System.exit(0);
		    }
	    	return new Sivolar();
					
		}

}