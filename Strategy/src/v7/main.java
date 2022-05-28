package v7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
	static Ave ave;
	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
		    System.out.println("Indica letra Ave a)Aguila b)Pato c)Pinguino d)salir");
		    String sAve = scanner.nextLine();
		    
		    if (sAve.equals("a"))
		    	ave = new Aguila();
		    if (sAve.equals("b"))
		    	ave = new Pato();
		    if (sAve.equals("c"))
		    	ave = new Pinguino();
		    if (sAve.equals("d")) {
		    	System.exit(0);
		    }
			
			ave.cv = getCv();
		    System.out.print(ave+ ": ");
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