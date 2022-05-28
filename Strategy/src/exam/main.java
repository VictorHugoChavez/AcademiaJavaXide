package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
	public static void main(String[] args) {
		List<Jugadores> miembros=new ArrayList<>();//Se crea una variable de referencia llamado miembros, apuntando a un objeto de tipo ArrayLists
		miembros.add(new jugador11());//Se agrega a la casilla  0 el objeto de jugador 11 
		miembros.add(new jugador28());//Se agrega a la casilla  1 el objeto de jugador 28
		miembros.add(new jugador29());//Se agrega a la casilla  2 el objeto de jugador 29
		miembros.add(new jugador45());//Se agrega a la casilla  3 el objeto de jugador 45
		realizarJugada(miembros);// se llama a la funcion ralizarJugada donde recibe como parametro los miembros
	}
static void realizarJugada(List<Jugadores> listamiembros) {// se define un metodo de tipo         donde tiene una variable local de tipo List 
	for(Jugadores num: listamiembros) {// realizamos un forech en donde 
		num.mov=getmovimientos();
		System.out.println(num);
		num.jugadas(); 
	}
}
static Estrategia getmovimientos() {
	Estrategia[] arreglo= {new TiroLibre(),new Defensa(),new Ataque(),new Contragolpe()};
	int r=new Random().nextInt(arreglo.length);
	return arreglo[r];
}
}
