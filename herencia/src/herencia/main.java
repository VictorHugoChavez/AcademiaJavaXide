package herencia;

public class main {
	public static void main (String[] args) {
		pato pato1 = new pato("Donald",10);
		System.out.println(pato1);
		pato1.volar();
		
		agulia agulia1 = new agulia("Real",5);
		System.out.println(agulia1);
		agulia1.volar();
		
		ave ave1 = new ave("Ave",12);
		System.out.println(ave1);
		ave1.volar();
	
		paloma pal1=new paloma("Paloma",3);
		System.out.println(pal1);
		pal1.volar();
	}
}
