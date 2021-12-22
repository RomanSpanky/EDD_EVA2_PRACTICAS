
public class EVA2_8_LISTA_DOBLE {

    public static void main(String[] args) {
        ListaDoble listaDoble = new ListaDoble();
        listaDoble.add(100);
        listaDoble.add(200);
        listaDoble.add(300);
        listaDoble.add(400);
        listaDoble.add(500);
        listaDoble.printList();
        System.out.println("\nConteo: " + listaDoble.length());
        //Insertar al inicio
        listaDoble.insertAt(0, 999);
        System.out.println("\n Después de insertar al inicio: ");
        listaDoble.printList();
        System.out.println("\nConteo: " + listaDoble.length());
        System.out.println("\n Después de borrar: ");
        listaDoble.deleteAt(0);
        listaDoble.printList();
        System.out.println("\nConteo: " + listaDoble.length());
        //Insertar en cualquier punto
        System.out.println("\n Después de insertar: ");
        listaDoble.insertAt(4, 999);
        listaDoble.printList();
        System.out.println("\nConteo: " + listaDoble.length());
        System.out.println("\n Después de borrar: ");
        listaDoble.deleteAt(4);
        listaDoble.printList();
        System.out.println("\nConteo: " + listaDoble.length());

    }

}
