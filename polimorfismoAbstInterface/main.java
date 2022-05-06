package polimorfismoAbstInterface;

import java.util.ArrayList;
import java.util.List;

public class main {/*EL PROGRAMA PRINCIPAL NO TUVO ALGUNA MODIFICACION EN EL MAIN, SOLO TUVO LA MODIFICACION EN 
AL DEFINIR LA INTERFAZ, DONDE SE DEFINIO EL METODO Y AL IMPLEMENTAR LAS DICHO METODO A LAS CLASES
QUE LO REQUERIAN*/

	public static void main(String[] args) {
		List<operacion> calculos=new ArrayList<>(); // se crea un la varaiable de referencia de tipo de operacion
		// y le asignamos el nombre, se crea el objeto de tipo ArrayList
		calculos.add(new resistenciaSerie(5,10,16,20));// agrega a la lista llamada calculos,dandole por asignacion el valor 0, ademas cada vez que se agrega  se creara el objeto de la clase 
		calculos.add(new resistenciaParalelo(7,10,16,2));//agrega a la lista llamada calculos,dandole por asignacion el valor 1, ademas cada vez que se agrega  se creara el objeto de la clase 
		calculos.add(new capaciotresSerie(10,5,2,16));//agrega a la lista llamada calculos,dandole por asignacion el valor 2, ademas cada vez que se agrega  se creara el objeto de la clase 
		calculos.add(new resistenciaParaleoSerie(3,10,16,20));//agrega a la lista llamada calculos,dandole por asignacion el valor 3, ademas cada vez que se agrega  se creara el objeto de la clase 
		calculos.add(new capacitorParaleoSerie(16,20,12,2));//agrega a la lista llamada calculos,dandole por asignacion el valor 4, ademas cada vez que se agrega  se creara el objeto de la clase 
		calculos.add(new capacitoresParalelo(16,16,12,10));//agrega a la lista llamada calculos,dandole por asignacion el valor 05, ademas cada vez que se agrega  se creara el objeto de la clase 
		
		for(operacion o : calculos ) {// se realiza un forEach, es la forma simplificada del for donde se declaraba
			//el valor de inicio , el limte y el incremento
			realizaOperacion(o);//se llama a la funcion de realizaroperacion de mi clase estatica de esta clase, 
			// para que funcione se debe enviar un valor de tipo operacion, por lo que el for recorrera todos los valores 
		}
	}
	
	private static void realizaOperacion(operacion x) { // este metodo es estatico por lo que le pertence solo a esta clase
		
		double res = x.calulaTotal();//este es de valor double
		System.out.println(x);//imprime lo que tenga x , el for realiza recorre cada una de las variables por lo accedera a las clases y ver la informacion que tienes
		System.out.println(res);// imprime el resultado de cada una de las clases
		System.out.println("-----------------------------------------------------------------------------------");
	}

}
