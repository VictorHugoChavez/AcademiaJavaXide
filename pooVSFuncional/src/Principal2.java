import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Principal2 {

	public static void main(String[] args) {
		
		Map<String, String> capitalCities = new HashMap<>();
		
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");

	    capitalCities.replaceAll((x,y) -> x+":"+y);
	    
	    capitalCities.forEach((x,y)-> System.out.println(x +" &&& " + y));
	    
	}

}
