package poo.funcional;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class principal {

	public static void main(String[] args) {
	
		Mica mica01=new Mica("HI","0.0","0.0",5);
		Mica mica02=new Mica("HI","0.5","1.5",10);
		Mica mica03=new Mica("HI","1.5","0.5",4);
		
		Mica mica04=new Mica("HI","0.0","0.0",6);
		Mica mica05=new Mica("HI","0.5","1.5",15);
		Mica mica06=new Mica("HI","1.5","0.5",8);
		
		Mica mica07=new Mica("HI","0.0","0.0",10);
		Mica mica08=new Mica("HI","0.5","1.5",13);
		Mica mica09=new Mica("HI","1.5","0.5",6);
		
		List<Mica> ventaMicalist=new ArrayList<>();
		ventaMicalist.add(mica01);
		ventaMicalist.add(mica02);
		ventaMicalist.add(mica03);
		ventaMicalist.add(mica04);
		ventaMicalist.add(mica05);
		ventaMicalist.add(mica06);
		ventaMicalist.add(mica07);
		ventaMicalist.add(mica08);
		
		Map<String,Long>micasDetCantidad=new HashMap<>();
		
		for(Mica m: ventaMicalist) {
			String medida=m.getUnidadHor()+ "/"+ m.getUnidadVer();
			boolean existe=micasDetCantidad.containsKey(medida);
			if(existe) {
				long acumularCantidad=micasDetCantidad.get(medida)+m.getCantidadVendida();
				micasDetCantidad.replace(medida,acumularCantidad);
			}else {
				micasDetCantidad.put(medida, m.getCantidadVendida());
			}
		}
		for(Map.Entry m:micasDetCantidad.entrySet()) {
			System.out.println("Cantidad Total "+ m.getKey()+ " : "+ m.getValue());
		}
	}

}
