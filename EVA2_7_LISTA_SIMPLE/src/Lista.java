
public class Lista {//Lista simplemente enlazada (Linked list)

    private Nodo inicio;//Acceso a mi lista, punto de partida
    private Nodo fin;
    private int tama;//Contador de nodos

    public Lista() {
        inicio = null;//Cuando la lista está vacía
        fin = null;
        tama = 0;
    }

    //Agregar nodos
    public void add(int valor) {//O(1)
        Nodo nuevo = new Nodo(valor);
        //¿Hay elementos en la lista?
        if (inicio == null) {//Lista vacia
            inicio = nuevo;//Conectamos el primer nodo a la lista
            fin = nuevo;

        } else {//Lista con nodos
            //Hay que movernos al final usando temp hasta llegar al final
            /*Nodo temp = inicio;//Aquí empezamos
            //while
            while (temp.getSiguiente() != null) {//Mientras temp.siguiente ! = null, nos moveremos
                temp = temp.getSiguiente();//Mover temp al siguiente nodo
            }
            temp.setSiguiente(nuevo);//Conectamos al final de la lista al nuevo nodo*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tama++;
    }

    //Imprimir la lista
    public void printList() {
        Nodo temp = inicio;//Aquí empezamos
        //While
        while (temp.getSiguiente() != null) {//Mientras temp ! = null, nos moveremos
            System.out.print(temp.getDato() + " - ");
            temp = temp.getSiguiente();//Mover temp al siguiente nodo

        }
    }

    //Borrar la lista
    public void clear() {
        inicio = null;
        fin = null;
        tama = 0;
    }

    //Contar los nodos:
    public int length() {//O(1)
        /*int iCont = 0;//O(N)
        Nodo temp = inicio;//Aquí empezamos
        //While
        while (temp != null) {//Mientras temp ! = null, nos moveremos
            iCont++;
            temp = temp.getSiguiente();//Mover temp al siguiente nodo

        }*/
        //return iCont;
        return tama;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    //Recuperar un valor de la lista:
    public int get(int pos) throws Exception {
        //Verificación
        if (isEmpty()) {//Lista vacía
            throw new Exception("No hay valores almacenados en la lista");
        } else {//Posición que no exista: Negativa o que nos pasemos
            //Pos tiene que estar entre cero y N-1
            if ((pos < 0) || (pos >= length())) {
                throw new Exception("El valor " + pos + " no es una posición válida en la lista");
            }
        }

        Nodo temp = inicio;
        for (int i = 0; i < pos; i++) {
            //Movernos
            temp = temp.getSiguiente();//Mover temp al siguiente nodo

        }

        return temp.getDato();
    }

    private void insertAtBeginning(int pos, int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setSiguiente(inicio);//Primero conectamos el nuevo nodo a la lista
        inicio = nuevo;                     //Conectamos la lista al nuevo nodo

    }

    public void deleteAt(int pos) { //O(N)
        int iTamaLista = length();//Obtener el tamaño de la lista
        //Validar
        if (iTamaLista == 1) {
            clear();
        }
        if (pos == 0) {//Borrar un nodo al inicio
            inicio = inicio.getSiguiente();

        } else {//Cualquier otro caso
            //Movernos al nodo
            Nodo temp = inicio;
            for (int i = 0; i < (pos - 1); i++) {
                //Movernos
                temp = temp.getSiguiente();//Mover temp al siguiente nodo

            }
            //Falta reconectar
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            if (pos == (iTamaLista - 1))//Verifica si es el último nodo de la lista
            {
                fin = temp;
            }
            tama++;
        }
    }

    public void insertAt(int pos, Nodo nuevo) { //O(N)
        if (pos == 0) {
            inicio = inicio.getSiguiente();

        } else {//Cualquier otro caso
            //Movernos al nodo
            Nodo temp = inicio;
            for (int i = 0; i < (pos - 1); i++) {
                //Movernos
                temp = temp.getSiguiente();//Mover temp al siguiente nodo

            }
            //Falta reconectar
            temp.setSiguiente(temp.getSiguiente().getSiguiente());

        }
        tama++;

    }

}
