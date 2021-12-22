
public class Lista {

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

    //Contar los nodos
    public int length() {//O(1)
        return tama;
    }

    //Borrar la lista
    public void clear() {
        inicio = null;
        fin = null;
        tama--;
    }

    //Saber si está vacía
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
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

    private void insertAtBeginning(Nodo nuevo) {
        nuevo.setSiguiente(inicio); //Conectar nuevo nodo
        inicio = nuevo; //Conectar nuevo nodo a inicio

    }

    public void insertAt(int pos, int valor) {//O(N)
        Nodo nuevo = new Nodo(valor);
        //Insertar al inicio
        if (pos == 0) {
            insertAtBeginning(nuevo);
        } else { //Cualquier otro caso
            Nodo temp = inicio;
            for (int i = 0; i < pos - 1; i++) { //Mover a la siguiente posición de inserción
                temp = temp.getSiguiente(); //Mover
            }
            nuevo.setSiguiente(temp.getSiguiente()); //Reconectar
            temp.setSiguiente(nuevo);
        }
        tama++;
    }

    public void deleteAt(int pos) { //O(N)
        int iTamaLista = length(); //Obtener el tamaño de la lista
        //Validar
        if (iTamaLista == 1) {
            clear();
        } else {
            //Situación: Borrar al inicio
            if (pos == 0) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo temp = inicio;
                for (int i = 0; i < (pos - 1); i++) {
                    temp = temp.getSiguiente(); //Mover al siguiente nodo
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente()); //Reconectar
                if (pos == (iTamaLista - 1)) { //Verificar si es el último nodo de la lista
                    fin = temp;
                }
            }
            tama--;
        }
    }
}
