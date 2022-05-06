package final3en1;

public class estudiante {
    final StringBuilder nombre;//no puede cambiar nombre, lo que se puede haces es hacer append para agregar
    final int boleta; // es una constante por lo que no pude ser cambiado
    final int grado;// es una constante por lo que no pude ser cambiado


    public estudiante(StringBuilder nombre, int boleta, int grado) {
        this.nombre = nombre;
        this.boleta = boleta;
        this.grado = grado;
    }
    final void escuela(){
        System.out.println("Los alumnos pertencen a la escuela Wilfrido Massieu");
    }
}
