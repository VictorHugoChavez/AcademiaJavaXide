package poo.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class funvional {
	
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
	
	List<Mica> ventaMicaList=new ArrayList<>();
	ventaMicaList.add(mica01);
	ventaMicaList.add(mica02);
	ventaMicaList.add(mica03);
	ventaMicaList.add(mica04);
	ventaMicaList.add(mica05);
	ventaMicaList.add(mica06);
	ventaMicaList.add(mica07);
	ventaMicaList.add(mica08);
	
	Map<String, Long> micasDetCantidad= ventaMicaList.stream().collect(Collectors.groupingBy(x->x.getUnidadHor()+ "/" + x.getUnidadVer(),Collectors.summarizingLong(Mica::getCantidadVendida)));
}
}