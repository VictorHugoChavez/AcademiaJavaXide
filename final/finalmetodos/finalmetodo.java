package finalmetodos;

public /*final*/ class finalmetodo {//si la clase es definido como final, nosotros no podemois heredar nada, ni atributos y metodos
    //por lo que no se podra  hacer herencia
    double tiempo,metros;

    public finalmetodo(double tiempo, double metros) {
        this.tiempo = tiempo;
        this.metros = metros;
    }

    final void velocidadformula(){ //este metodfo nadie lo puede sobreescribir cuando se hereda
        System.out.println("El calculo de la velocidad esta defino por metros/segundos y el resultado es :");
        System.out.println(tiempo/metros);
    }
}
