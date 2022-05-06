package final3en1;

import java.util.ArrayList;
import java.util.List;

public class maiin {
    public static void main(String[] args) {
        estudiante alumno=new estudiante(new StringBuilder("Victor Hugo Chavez"),2014110239,2);
        final List<estudiante> alumnos=new ArrayList<>();// al declarar este final en el array ya no puede apuntar a otro objeto
        //por lo que al declarar alumnos=new ArrayList<>() nos indicaria que no puede apuntar
        alumno.nombre.append(" Cruz");
        System.out.println(alumno.nombre);
    }
}
