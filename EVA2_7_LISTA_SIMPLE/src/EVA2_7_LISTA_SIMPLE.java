
import com.sun.istack.internal.logging.Logger;

public class EVA2_7_LISTA_SIMPLE {

    public static void main(String[] args) {

        //Crear una lista
        Lista miLista = new Lista();//Creo una lista vacía
        /*int[] miArreglo = new int[1000000];
            for (int i = 0; i < miArreglo.length; i++) {
                    miArreglo[i] = (int) (Math.random() * 1000);
                
            }
            for (int i = 0; i < 1000000; i++) {
                miLista.add(new Nodo(1));
            }*/
        miLista.add(100);//0
        miLista.add(200);//1
        miLista.add(300);//2
        miLista.add(400);//3
        miLista.add(500);//4
        System.out.println("Conteo: " + miLista.length());
        miLista.printList();
        miLista.insertAt(4,(9999));
        System.out.println("\nDespués de insertar al inicio");
        miLista.printList();
        System.out.println("Conteo: " + miLista.length());
        System.out.println("\nDespués de borrar");
        miLista.deleteAt(4);
        miLista.printList();
        System.out.println("Conteo: " + miLista.length());
        miLista.add(77777777);
        System.out.println("\nDespués de agregar");
        miLista.printList();
        System.out.println("Conteo: " + miLista.length());

        for (int i = miLista.length() - 1; i >= 0; i--) {
            try {
                System.out.print(miLista.get(i) + " - ");
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

        /*System.out.println("Cantidad de nodos: " + miLista.length());
        try{
        System.out.println("Posicion " + miLista.get(10));
        }   catch (Exception ex){
               ex.printStackTrace();//Imprime el error
               
        
        }
        //Seguir con el programa
        System.out.println("El programa continúa");*/
    }

}
