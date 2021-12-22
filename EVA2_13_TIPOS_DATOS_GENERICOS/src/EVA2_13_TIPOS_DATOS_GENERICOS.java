
public class EVA2_13_TIPOS_DATOS_GENERICOS {

    public static void main(String[] args) {

        Prueba<Integer> prueba = new Prueba();
        prueba.setValor(25);
        System.out.println("Valor: " + prueba.getValor());
    }

}

class Prueba<T> { //La clase reemplaza "T" por el tipo de dato deseado
    //Crear plantilla o molde

    private T valor;

    public Prueba() {

    }

    public Prueba(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

}
