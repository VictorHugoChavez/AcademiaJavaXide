package herenciaMultiple;

import java.util.ArrayList;
import java.util.List;

public class main { // la finalidad de esta practica fue entender el tema de herencia multiple aplicandio al mundo real 
	// en dodne para hacer herencia multiple se requiriuo las interfaces de calculoVoltaje,Corrinet, puedo añadir mas interfaces 
	//y crear otros metodos difernentes para calcular ya sea temperatura, reosnancia, etc.

	public static void main(String[] args) {
		List<Operacion> listaOperacion = new ArrayList<>();
		listaOperacion.add(new cpacitoresParalelo(5145.1565,236.548,37645.995,28453.99)); //0   // cada uno realizara una operacion difernete para calcular la resistencia y capacitancia que yo le especifique  
		listaOperacion.add(new resitenciaSerieParalelo(863.6941,35458.154,3241.894,34214.96)); //1
		listaOperacion.add(new ResistenciaParalelo(8.21356,446.5,2.574464,894.975656)); //2
		listaOperacion.add(new resistenciasSerie(889.98,98.972,3.564,925.4545)); //3
		
		for(Operacion o : listaOperacion) {
			if (o instanceof claculoVoltaje) { //cada vez que "o" apunte a calculoVoltaje llamara la funcion y se ejecuta de la clase 
				double res = ((claculoVoltaje)o).CalculoVoltaje(28.25); //envia un numero  de tipo double cada vez que se cumpla el instanceof
				System.out.println(res);//imprime el resultado 
			}
			if (o instanceof calculoCorriente) {
				double res = ((calculoCorriente)o).calculoC(25.871);
				System.out.println(res);
			}
			realizaOperacion(o);
		}	
	}

	private static void realizaOperacion(Operacion o) {
		double res = o.ejecuta();
		System.out.println(res);
		System.out.println(o);
		System.out.println("-------------------------");
	}

}
