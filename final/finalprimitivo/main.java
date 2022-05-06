public class main {
    public static void main(String[] args) {
        finalprimitivo calculo=new finalprimitivo("Circulo",2.6446);
        System.out.println(calculo.pi);// se imprime el valor de mi constante
        System.out.println(("El area del "+ calculo.nombre+" es de "+(calculo.pi)*(Math.pow(calculo.radio, 2)))); // calculamos el area del circulo con la constante
    }
}
