package alumno;

public class alumno {
		String nombre;
		int boleta,semestre;
		 int contador;

		public alumno(String nombre, int boleta, int semestre) {

			System.out.println(contador);
			this.nombre = nombre;
			this.boleta = boleta;
			this.semestre = semestre;
			System.out.println("*******************");
			contador++;

		}
		
		
		

		 public int getContador() {
			return contador;
		}

		@Override
		public String toString() {
			return "alumno [nombre=" + nombre + ", boleta=" + boleta + ", semestre=" + semestre + "]";
		}
		
		
}	
