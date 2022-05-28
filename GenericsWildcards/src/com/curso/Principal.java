package com.curso;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Object> listaObjects = new ArrayList<>();
		listaObjects.add(new Object());
		listaObjects.add("Hello");
		listaObjects.add(new Figura(5.9));
		listaObjects.add(new Circulo(5.9));
		imprimirObjetos(listaObjects);
		//imprimirFiguras(listaObjects); //NO SE PUEDE
		insertarFiguras(listaObjects);
		
		List<String> listaString = new ArrayList<>();
		listaString.add("Hello");
		listaString.add("World");
		imprimirObjetos(listaString);
		//imprimirFiguras(listaString); //NO SE PUEDE
		//insertarFiguras(listaString); //NO SE PUEDE
		
		List<Circulo> listaCirculo = new ArrayList<>();
		listaCirculo.add(new Circulo(4.0));
		listaCirculo.add(new Circulo(2.0));
		imprimirObjetos(listaCirculo);
		imprimirFiguras(listaCirculo);
		//insertarFiguras(listaCirculo); //NO SE PUEDE

		List<Cuadrado> listaCuadrado = new ArrayList<>();
		listaCuadrado.add(new Cuadrado(4.0));
		listaCuadrado.add(new Cuadrado(2.0));
		imprimirObjetos(listaCuadrado);
		imprimirFiguras(listaCuadrado);
		//insertarFiguras(listaCuadrado); //NO SE PUEDE

		List<Triangulo> listaTriangulo = new ArrayList<>();
		listaTriangulo.add(new Triangulo(4.0));
		listaTriangulo.add(new Triangulo(2.0));
		imprimirObjetos(listaTriangulo);
		imprimirFiguras(listaTriangulo);
		//insertarFiguras(listaTriangulo); //NO SE PUEDE

		List<Figura> listaFigura = new ArrayList<>();
		listaFigura.add(new Circulo(4.0));
		listaFigura.add(new Cuadrado(4.0));
		listaFigura.add(new Triangulo(4.0));
		listaFigura.add(new Figura(4.0));
		imprimirObjetos(listaFigura);
		imprimirFiguras(listaFigura);
		insertarFiguras(listaFigura);

	}
	
	static void imprimirObjetos(List<?> lista) {
		//lista.add(new Circulo(4.0)); //NO SE PUEDE AÑADIR
		for (Object o: lista) {
			//System.out.println("ImprimirObjeto: "+ o);
		}
	}
		
	static void imprimirFiguras(List<? extends Figura> lista) {
		//lista.add(new Figura(4.0)); //NO SE PUEDE AÑADIR
		for(Figura fig:lista) {
			//System.out.println("ImprimirFigura: "+ fig +": "+fig.getArea());
		}
	}
	
	static void insertarFiguras(List<? super Figura> lista) {
		lista.add(new Figura(999.0));
		lista.add(new Triangulo(999.0));
		//lista.add("Pato"); //NO SE PUEDE
		//lista.add(new Object()); //NO SE PUEDE
		for (Object o: lista) {
			System.out.println("ImprimirInsertar: "+o);
			if ( o instanceof String) 
				((String) o).length();
			if ( o instanceof Triangulo) {
				System.out.println("Soy un triangulo ");
				((Triangulo) o).getArea();
			}
		}
	}

}

class Figura{
	private double area;
	public Figura(double area) {
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
				" [area=" + area + "]";
	}
}

class Circulo extends Figura{
	public Circulo(double area) {
		super(area);
	}
}
class Cuadrado extends Figura{
	public Cuadrado(double area) {
		super(area);
	}
}
class Triangulo extends Figura{
	public Triangulo(double area) {
		super(area);
	}
}
