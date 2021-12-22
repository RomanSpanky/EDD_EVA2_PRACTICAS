
public class EVA2_6_NODOS {

    public static void main(String[] args) {

        Nodo inicio = new Nodo();
        inicio.datos = 100;
        inicio.referencia = new Nodo();
        inicio.referencia.datos = 100;
        inicio.referencia.referencia = null;
        System.out.println(inicio);
        System.out.println(inicio.referencia);
    }

}

class Nodo {

    int datos;//Datps (Aquí guardamos la información)
    Nodo referencia;//Referencia: Nos permite enlazar nodos y crear cadenas (Listas)
}
