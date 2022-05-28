package v8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerArchivo {
	
	public static void main(String... args) {
		
		File file = new File("E://archivo.txt");
		
		try {
			leerArchivo(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void leerArchivo(File file) throws FileNotFoundException {
		FileReader fr = new FileReader(file);
	}

}
