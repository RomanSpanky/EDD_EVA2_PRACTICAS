
public class EVA2_15_CLASE_ABSTRACTA {

    public static void main(String[] args) {
        Prueba prueba = new Prueba() {
        };
        prueba.algo();
    }

}

abstract class Prueba {//Abstracto, falta implementación, es únicamente el 

    abstract public void algo();

}
