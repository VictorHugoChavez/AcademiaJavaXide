import java.util.*;
import java.util.Iterator;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("Urm");
		list.add("Tx");
		
		// Demo de como funciona con Iterator
//		Iterator itr = list.iterator();
//		
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		UnaryOperator<List<>>
		
		//replaceAll(UnaryOperator)
		list.replaceAll(y -> y+"*");
		
		//sort(Comparator)
		list.sort((u,x) -> u.length()-x.length());
		
		//removeIf(Predicate)
		list.removeIf(q -> q.endsWith("i*"));
		
		//forEach(Consumer)
		list.forEach(x -> System.out.println(x));
		
		//Supplier
		Supplier<List<String>> supplierArray =
				() -> new ArrayList<String>();
				//ArrayList<Integer>::new;
				
		System.out.println(supplierArray);
				
		List<String> listaStrings = supplierArray.get();	
		listaStrings.addAll(list);
		
		System.out.println(listaStrings);
		
		
	}

}
