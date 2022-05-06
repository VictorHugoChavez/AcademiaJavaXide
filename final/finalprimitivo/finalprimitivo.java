public class finalprimitivo {
    final double pi=3.141616; //cuando utilizamos finall en una variable primitiva significa
    //que no puedes cambiar el valor ya que es considerado como un cosntante dentro de esta clase
    String nombre;
    double radio;
   // pi=254.21;// no podemos ahcer la modificacion de estas variable ya es una constante y al dejarlo nos daria un error diciendo que es final
    public finalprimitivo(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

}
