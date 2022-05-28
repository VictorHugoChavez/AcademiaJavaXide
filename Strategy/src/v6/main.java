package v6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		List <Ave> lista = new ArrayList<>();
		lista.add(new Aguila());
		lista.add(new Pinguino());
		lista.add(new Pato());
		ejecutarVuelos(lista);
	}
static void ejecutarVuelos(List<Ave> listaAves) {
	for(Ave ave:listaAves) {
		ave.cv=getCv();
		System.out.println(ave);
		ave.volar();
	}
}

//ES UNA FORMA DE EJEMPLIFICAR QUE DECIDE EK USUARIO FINAL
static ComportamientoVolar getCv() {
	ComportamientoVolar[] arreglo= {
			new Sivolar(),new NoVolar(),new VolarAleatorio()};
	int r=new Random().nextInt(arreglo.length);
	return arreglo[r];
}
	
}
